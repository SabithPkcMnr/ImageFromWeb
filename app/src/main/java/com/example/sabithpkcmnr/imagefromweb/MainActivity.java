package com.example.sabithpkcmnr.imagefromweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web = (WebView) findViewById(R.id.webView1);
        web.loadUrl("https://upload.wikimedia.org/wikipedia/commons/1/16/HDRI_Sample_Scene_Balls_(JPEG-HDR).jpg");
    }
}
