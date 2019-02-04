package com.example.lenovo.portalberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Radio_three extends AppCompatActivity implements View.OnClickListener {

    Button next,previous,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_three);

        menu = (Button) findViewById(R.id.button_home);
        next = (Button) findViewById(R.id.button_next);
        previous = (Button) findViewById(R.id.button_prev);
        WebView web = (WebView) findViewById(R.id.Website);
        web.loadUrl("http://hardrockfm.com/streaming/hardrockjakarta.php");
        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onClick(View v) {

        if (menu == v)
        {
            Intent in = new Intent(this,RadioDashboard.class);
            startActivityForResult(in,0);
        }
        if (next == v)
        {

            Intent in2 = new Intent(this,Radio_four.class);
            startActivityForResult(in2,0);
        }
        if (previous == v)
        {

            Intent in3 = new Intent(this,Radio_two.class);
            startActivityForResult(in3,0);
        }
    }
}
