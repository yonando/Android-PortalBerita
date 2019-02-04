package com.example.lenovo.portalberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Radio_one extends AppCompatActivity implements View.OnClickListener{

    Button next,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_one);

        next = (Button) findViewById(R.id.button_next);

        menu = (Button) findViewById(R.id.button_prev);
        WebView web = (WebView) findViewById(R.id.Website);
        web.loadUrl("http://www.987genfm.com/streaming");
        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onClick(View v) {
        if(next == v){
            Intent in = new Intent(this,Radio_two.class);
            startActivityForResult(in,0);


        }
        if (menu == v)
        {
            Intent in2 = new Intent(this,RadioDashboard.class);
            startActivityForResult(in2,0);
        }





    }
}
