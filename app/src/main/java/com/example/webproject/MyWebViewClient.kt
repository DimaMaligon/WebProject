package com.example.webproject

import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

open class MyWebViewClient : WebViewClient(){
    val mySiteUrl = "m.youtube.com"
    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        if (Uri.parse(url).host == mySiteUrl) {
            return false
        }
        return true
    }
}