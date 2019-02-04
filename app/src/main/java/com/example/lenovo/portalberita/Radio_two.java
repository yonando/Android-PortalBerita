package com.example.lenovo.portalberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Radio_two extends AppCompatActivity implements View.OnClickListener {
    private WebView web;
Button next,previous,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_two);


        next = (Button) findViewById(R.id.button_next);

        menu = (Button) findViewById(R.id.button_home);

        previous = (Button) findViewById(R.id.button_prev);
        web = (WebView) findViewById(R.id.Website);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://pasfmpati.com/1/");
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
        if (next == v)
        {

            Intent in = new Intent(this,Radio_three.class);
            startActivityForResult(in,0);
        }
        if (previous == v)
        {

            Intent in3 = new Intent(this,Radio_one.class);
            startActivityForResult(in3,0);
        }
    }
}
