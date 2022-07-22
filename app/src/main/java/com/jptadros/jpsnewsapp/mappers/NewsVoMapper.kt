package com.jptadros.jpsnewsapp.mappers

import com.jptadros.jpsnewsapp.NewsDb.NewsDb


class NewsVoMapper : Mapper<NewsDb, NewsVO> {
    override fun map(model: NewsDb): NewsVO =
        with(model) {
            NewsVO(
                title = title,
                url = url,
                abstract = abstract,
                author  = byline,
                pubDate = published_date.substring(0, published_date.length - 14)

            )
        }
}