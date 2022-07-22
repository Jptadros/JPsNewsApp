package com.jptadros.jpsnewsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.jptadros.jpsnewsapp.R
import com.jptadros.jpsnewsapp.models.NewsItemViewModel

class NewsAdapter(mList1: FragmentActivity, private val mList: ArrayList<NewsItemViewModel>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

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

            val newsItemViewMode = mList[position]

                       // sets the text to the textview from our itemHolder class
            holder.title.text = newsItemViewMode.title
            holder.abstract.text = newsItemViewMode.abstract
            holder.byline.text = newsItemViewMode.byline
            holder.publishedDate.text = newsItemViewMode.published_date
            holder.newsCard.setOnClickListener{

            }

                    }

        // return the number of the items in the list
        override fun getItemCount(): Int {
            return mList.size
        }

        // Holds the views for adding it to image and text
        class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {




            val title: TextView = itemView.findViewById(R.id.tv_article_title)
            val abstract: TextView = itemView.findViewById(R.id.tv_article_details)
            val byline: TextView = itemView.findViewById(R.id.tv_author)
            val publishedDate: TextView = itemView.findViewById(R.id.tv_article_date)
            val newsCard: CardView = itemView.findViewById(R.id.cv_news)

        }
    }