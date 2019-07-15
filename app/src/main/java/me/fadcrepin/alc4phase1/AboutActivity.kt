package me.fadcrepin.alc4phase1

import android.net.http.SslError
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient

import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.content_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = getString(R.string.About_Alc)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        webview.loadUrl("https://andela.com/alc/")
        val webSettings = webview.settings;
        webSettings.javaScriptEnabled = true

        webview!!.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()
            }
        }
    }

}
