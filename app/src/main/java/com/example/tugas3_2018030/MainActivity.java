package com.example.tugas3_2018030;

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
    public void ikan(View view){
        Intent a = new Intent(MainActivity.this, ikan.class);
        startActivity(a);
    }
    public void Burung (View view){
        Intent a = new Intent(MainActivity.this, Burung.class);
        startActivity(a);
    }
}