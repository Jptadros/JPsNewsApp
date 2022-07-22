package com.jptadros.jpsnewsapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import com.jptadros.jpsnewsapp.Constants
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jptadros.jpsnewsapp.R
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jptadros.jpsnewsapp.JsontoKotlin.ApiInterface
import com.jptadros.jpsnewsapp.JsontoKotlin.Result
import com.jptadros.jpsnewsapp.adapters.NewsAdapter
import com.jptadros.jpsnewsapp.models.NewsItemViewModel
import kotlinx.android.synthetic.main.news_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import android.util.Log
import android.widget.Toast

class NewsFragment : Fragment() {
val url = Constants.BASE_URL
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getMyData()
var view = inflater.inflate(R.layout.news_fragment, container, false)
        return view
    }

    private fun getMyData(){
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(url)
            .build()
            .create(ApiInterface::class.java)
        Toast.makeText(activity, "$retrofitBuilder", Toast.LENGTH_SHORT).show()

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<Result>?> {
            override fun onResponse(call: Call<List<Result>?>, response: Response<List<Result>?>) {
                val responseBody = response.body()!!

                val myStringBuilder = StringBuilder()
                for(myData in responseBody){

                    myStringBuilder.append(myData.abstract)
                    newsText.text = myData.abstract
                }

            }

            override fun onFailure(call: Call<List<Result>?>, t: Throwable) {

            }
        })




    }

}