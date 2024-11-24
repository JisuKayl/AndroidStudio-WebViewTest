package com.example.webview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class NextActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);

        webView = findViewById(R.id.webView);

        String url = getIntent().getStringExtra("url");
        webView.loadUrl(url);
    }
}
