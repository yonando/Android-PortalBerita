package com.example.lenovo.portalberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Radio_four extends AppCompatActivity implements View.OnClickListener {
Button previous,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_four);
        menu = (Button) findViewById(R.id.button_home);
        previous = (Button) findViewById(R.id.button_prev);
        WebView web = (WebView) findViewById(R.id.Website);
        web.loadUrl("https://elshinta.com/live/radio");
        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onClick(View v) {
      if (menu == v)
      {

          Intent in = new Intent(this,RadioDashboard.class);
          startActivityForResult(in,0);
      }
        Intent in2 = new Intent(this,Radio_three.class);
      startActivityForResult(in2,0);
    }
}
