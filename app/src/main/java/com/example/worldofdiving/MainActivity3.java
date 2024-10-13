package com.example.worldofdiving;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void openMain1(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void openMain4(View view) {
        startActivity(new Intent(this,MainActivity4.class));
    }
}