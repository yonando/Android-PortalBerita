package com.example.lenovo.portalberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RadioDashboard extends AppCompatActivity implements View.OnClickListener {

    private Button radio1;
    private Button radio2;
    private Button radio3;
    private Button radio4;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_dasboard);
        radio1  = (Button) findViewById(R.id.radio1);
        radio2 = (Button) findViewById(R.id.radio2);
        radio3 = (Button) findViewById(R.id.radio3);
        radio4 = (Button) findViewById(R.id.radio4);
        home = (Button) findViewById(R.id.buttonHome);
    }

    @Override
    public void onClick(View v) {
        if(v == radio1 ){
            Intent intent = new Intent(this, Radio_one.class );
            startActivityForResult(intent,0);
        }if(v == radio2 ){
            Intent intent = new Intent(this, Radio_two.class );
            startActivityForResult(intent,0);
        }if(v == radio3 ){
            Intent intent = new Intent(this, Radio_three.class );
            startActivityForResult(intent,0);
        }if(v == radio4 ){
            Intent intent = new Intent(this, Radio_four.class );
            startActivityForResult(intent,0);
        }if(v == home ){
            Intent intent = new Intent(this, DashboardActivity.class );
            startActivityForResult(intent,0);
        }

    }
}
