package com.example.mamdouh.site;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imgLogo = (ImageButton)findViewById(R.id.imgLogo);

        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home();
            }
        });
        Button btnHome = (Button)findViewById(R.id.btnHome);
        Button btnApp = (Button)findViewById(R.id.btnApps);
        Button btnLucky = (Button)findViewById(R.id.btnLucky);
        Button btnVideos = (Button)findViewById(R.id.btnVideos);


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            {
              home();

            }
        });

        btnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apps();
            }
        });

        btnLucky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lucky();
            }
        });

        btnVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videos();
            }
        });
    }

    protected void home (){
        WebView wvPage;
        wvPage = (WebView) findViewById(R.id.wvPage);
        String url = "http://www.androidsupport.co.in";
        wvPage.getSettings().setJavaScriptEnabled(true);
        wvPage.setWebViewClient(new WebViewClient());
        wvPage.loadUrl(url);

    }

    protected void apps (){
        WebView wvPage;
        wvPage = (WebView)findViewById(R.id.wvPage);
        wvPage.loadUrl("http://www.androidsupport.co.in/android-app.html");
        wvPage.getSettings().setJavaScriptEnabled(true);
        wvPage.setWebViewClient(new WebViewClient());
    }

    protected void Lucky(){
        WebView wvPage;
        wvPage = (WebView)findViewById(R.id.wvPage);
        wvPage.loadUrl("http://www.androidsupport.co.in/lucky-winners1.html");
        wvPage.setWebViewClient(new WebViewClient());
        wvPage.getSettings().setJavaScriptEnabled(true);
    }


    protected void videos (){
    WebView wvPages;
    wvPages = (WebView)findViewById(R.id.wvPage);
    wvPages.loadUrl("http://www.androidsupport.co.in/videos1.html");
    wvPages.setWebViewClient(new WebViewClient());
    //wvPages.getSettings().setJavaScriptEnabled(true);
    }

}

