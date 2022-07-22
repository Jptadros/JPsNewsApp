package com.jptadros.jpsnewsapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jptadros.jpsnewsapp.R
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jptadros.jpsnewsapp.adapters.NewsAdapter

class NewsFragment : Fragment() {
    private lateinit var adapter: NewsAdapter
    private lateinit var layout: View
    private lateinit var recyclerView: RecyclerView
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.news_fragment, container, false)
        adapter = NewsAdapter(requireActivity(), arrayListOf())
        recyclerView = layout.findViewById(R.id.rv_news)
        recyclerView.addItemDecoration(DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL))
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()

        return view
    }

}