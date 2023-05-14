package com.example.webproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.webproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var webView = binding.webview
        webView.webViewClient = MyWebViewClient()
        webView.loadUrl("https://www.youtube.com/")

        var webSettings = binding.webview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true

    }
}