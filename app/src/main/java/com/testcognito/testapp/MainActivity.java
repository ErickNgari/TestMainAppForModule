package com.testcognito.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launch(View view){
        Intent intent = new Intent(MainActivity.this, com.testcognito.testappmodule.ScrollingActivity.class);
        startActivity(intent);
    }
}