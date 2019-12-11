package com.example.polahidupsehat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class detail extends AppCompatActivity {

    TextView judul;
    Intent intent;
    String status;
    RelativeLayout rl_detail;
    WebView webView,webViewIsi;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        intent = getIntent();
        status = intent.getStringExtra("status");

        judul = findViewById(R.id.tv_detail_judul);
        webViewIsi = findViewById(R.id.wv_isi);
        rl_detail = findViewById(R.id.rll_detail);
        webView = findViewById(R.id.wv_youtube);

        webViewIsi.setBackgroundColor(Color.parseColor("#8DB1A7A7"));

        switch (status){
            case "definisi":
                judul.setText(R.string.tv_judul_definisi);
                webViewIsi.loadUrl("file:///android_asset/definisi.html");
                webView.setVisibility(View.GONE);
                break;
            case "gizi":
                judul.setText(R.string.tv_judul_gizi);
                webViewIsi.loadUrl("file:///android_asset/gizi.html");
                webView.setVisibility(View.GONE);
                break;
            case "pola":
                judul.setText(R.string.tv_judul_pola);
                webViewIsi.loadUrl("file:///android_asset/pola.html");
                webView.setVisibility(View.GONE);
                break;
            case "olahraga":
                rl_detail.setBackground(ContextCompat.getDrawable(this, R.drawable.background_olahraga));
                judul.setText(R.string.tv_judul_olahraga);
                webViewIsi.loadUrl("file:///android_asset/olahraga.html");
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://www.youtube.com/embed/ZbxBUsmQ2Zg");
                break;
            case "berfikir":
                rl_detail.setBackground(ContextCompat.getDrawable(this, R.drawable.background_berfikir));
                judul.setText(R.string.tv_judul_berfikir);
                webViewIsi.loadUrl("file:///android_asset/berfikir.html");
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://www.youtube.com/embed/t50-xqxWSZ0");
                break;

        }
    }
}
