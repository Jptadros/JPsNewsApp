 package com.jptadros.jpsnewsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.jptadros.jpsnewsapp.R

 class AboutUsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_us, container, false)
    }
     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         val myWebView: WebView = view.findViewById(R.id.WebView1)
         myWebView.webViewClient = object : WebViewClient() {
             override fun shouldOverrideUrlLoading(
                 view: WebView,
                 url: String
             ): Boolean {
                 view.loadUrl(url)
                 return true
             }
         }

         myWebView.loadUrl("https://google.com")
         myWebView.settings.javaScriptEnabled = true
         myWebView.settings.allowContentAccess = true
         myWebView.settings.domStorageEnabled = true
         myWebView.settings.useWideViewPort = true

     }
 }
