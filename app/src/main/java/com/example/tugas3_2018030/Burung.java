package com.example.tugas3_2018030;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Burung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burung);
    }
    public void kelinci (View view){
        Intent a = new Intent(Burung.this, MainActivity.class);
        startActivity(a);
    }
    public void ikan(View view){
        Intent a = new Intent(Burung.this, ikan.class);
        startActivity(a);
    }
}