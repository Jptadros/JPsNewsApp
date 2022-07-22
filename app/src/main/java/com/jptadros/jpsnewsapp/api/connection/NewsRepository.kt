package com.jptadros.jpsnewsapp.api.connection

import com.jptadros.jpsnewsapp.NewsDb.NewsDatabase
import com.jptadros.jpsnewsapp.NewsDb.NewsDb
import com.jptadros.jpsnewsapp.mappers.Mapper
import com.jptadros.jpsnewsapp.models.DocsItem
import com.jptadros.jpsnewsapp.models.NewsResultModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



interface NewsRepository {
    fun getNews(
        forceUpdate: Boolean,
        section: String,
        resultListener: ResultListener<List<NewsDb>>)
}

internal class NewsRepositoryImpl(
    private val api: NyTimesApi,
    private val newsMapper: Mapper<DocsItem?, NewsDb>,
    private val database: NewsDatabase,
    private val executors: Executors
) : NewsRepository {

    override fun getNews(
        forceUpdate: Boolean,
        section: String,
        resultListener: ResultListener<List<NewsDb>>
    ) {
        if (forceUpdate) {
            getFromRemote(section, resultListener)
        } else {
            executors.background.execute {
                val dbNews: List<NewsDb> = database.newsDao().getAll()

                if (dbNews.isNotEmpty()) {
                    resultListener.onSuccess(dbNews)
                } else {
                    getFromRemote (section, resultListener)
                }
            }
        }
    }

    private fun getFromRemote( section: String, resultListener: ResultListener<List<NewsDb>>) =
        api.getProperties("news_desk:($section)")
            .enqueue(object : Callback<NewsResultModel> {
                override fun onResponse(
                    call: Call<NewsResultModel>,
                    response: Response<NewsResultModel>
                ) {
                    val results = response.body()?.response?.docs
                    if (response.isSuccessful && !results.isNullOrEmpty()) {
                        val news = results.map(newsMapper::map)
                        resultListener.onSuccess(news)

                        executors.background.execute{database.newsDao().insertAll(news)}
                    }
                }

                override fun onFailure(call: Call<NewsResultModel>, t: Throwable) {
                    resultListener.onError(t)
                }

            })

}