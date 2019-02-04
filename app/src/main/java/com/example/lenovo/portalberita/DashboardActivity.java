package com.example.lenovo.portalberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button radio;
    private Button news;

    private Button mlogoutBtn;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        radio = (Button) findViewById(R.id.imageRadio);
        news = (Button) findViewById(R.id.imageNews);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mlogoutBtn = (Button) findViewById(R.id.logoutbtn);


        mlogoutBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startSignOut();
                startActivity(new Intent(DashboardActivity.this, LoginActivity.class));
            }
        });


    }
    private void startSignOut(){
       FirebaseAuth.getInstance().signOut();

    }

    @Override
    public void onClick(View v) {
        if (v == radio){
            Intent intent = new Intent(this,RadioDashboard.class);
            startActivityForResult(intent,0);
        }if (v == news){
            Intent intent = new Intent(this,MainActivity.class);
            startActivityForResult(intent,0);
        }
    }
}
