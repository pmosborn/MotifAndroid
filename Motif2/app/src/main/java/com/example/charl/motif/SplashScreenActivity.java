package com.example.charl.motif;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    public void openFindGalleryActivity(View view){
        Intent intent = new Intent(this,FindGalleryActivity.class);
        startActivity(intent);
    }
}
