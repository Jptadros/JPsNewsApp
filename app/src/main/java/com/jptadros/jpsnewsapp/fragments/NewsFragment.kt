package com.jptadros.jpsnewsapp.fragments

import android.os.Bundle
import android.util.Log
import com.jptadros.jpsnewsapp.Constants
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jptadros.jpsnewsapp.R
import com.jptadros.jpsnewsapp.JsontoKotlin.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.jptadros.jpsnewsapp.JsontoKotlin.NewsData
import com.jptadros.jpsnewsapp.JsontoKotlin.Result
import com.jptadros.jpsnewsapp.adapters.NewsAdapter
import kotlinx.android.synthetic.main.news_fragment.*

class NewsFragment : Fragment() {


      private val url = Constants.BASE_URL
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.news_fragment, container, false)
        getMyData()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }


    private fun getMyData() {
               val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(url)
            .build()
            .create(ApiInterface::class.java)
       // Toast.makeText(activity, "$retrofitBuilder", Toast.LENGTH_SHORT).show()

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<NewsData>{
            override fun onResponse(call: Call<NewsData>, response: Response<NewsData>) {
                val responseBody = response.body()?.results!!

                val recyclerview = rv_news
                recyclerview.layoutManager = LinearLayoutManager(activity)
                val adapter = NewsAdapter(responseBody)

               // Toast.makeText(activity, "$responseBody", Toast.LENGTH_SHORT).show()
                recyclerview.adapter = adapter

                Log.e("ResponseBody", "${response.body()}")
             //   newsText.text = responseBody.get(1).title.toString()

                            }

            override fun onFailure(call: Call<NewsData>, t: Throwable) {
                Log.e("Failed", t.message.toString())
            }
        }
        )
                   }



}
