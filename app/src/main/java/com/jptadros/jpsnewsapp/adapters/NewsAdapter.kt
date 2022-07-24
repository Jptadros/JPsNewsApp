package com.jptadros.jpsnewsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.jptadros.jpsnewsapp.JsontoKotlin.Result
import com.jptadros.jpsnewsapp.R

class NewsAdapter(private val mList: List<Result>?) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
      //  val newsCard: CardView = itemView.findViewById(R.id.cv_news)
        val title: TextView = itemView.findViewById(R.id.tv_article_title)
        val abstract: TextView = itemView.findViewById(R.id.tv_article_details)
        val byline: TextView = itemView.findViewById(R.id.tv_author)
        val publishedDate: TextView = itemView.findViewById(R.id.tv_article_date)


    }
           // create new views
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            // inflates the card_view_design view
            // that is used to hold list item
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.news_item, parent, false)

            return ViewHolder(view)
        }

        // binds the list items to a view
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            val newsItemViewMode = mList?.get(position)

                       // sets the text to the textview from our itemHolder class
            if (newsItemViewMode != null) {
                holder.title.text = newsItemViewMode.title
            }
            if (newsItemViewMode != null) {
                holder.abstract.text = newsItemViewMode.abstract
            }
            if (newsItemViewMode != null) {
                holder.byline.text = newsItemViewMode.byline
            }
            if (newsItemViewMode != null) {
                holder.publishedDate.text = newsItemViewMode.published_date.toString().substring(0, newsItemViewMode.published_date.length - 15);
            }
        //    holder.newsCard.setOnClickListener{}

                    }

        // return the number of the items in the list
        override fun getItemCount(): Int {
            return mList?.size ?: 0

        }

        // Holds the views for adding it to image and text

    }