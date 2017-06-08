package com.example.yls.demo0401_tbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
        private WebView txWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPermission();
        txWebView = (WebView) findViewById(R.id.tx_webview);
        txWebView.getSettings().setJavaScriptEnabled(true);
        txWebView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView webView String s){
                webView.loadUrl(s);
                return true;
            }
        });
        txWebView.setWebViewClient(new WebViewClient());
        txWebView.loadUrl("http://baidu.com");

    }

    private void getPermission() {
    }


}
