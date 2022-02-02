package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);

        WebView yahooView = (WebView) findViewById(R.id.webViewYahoo);
        yahooView.loadUrl("https://www.Yahoo.com/");
    }
}