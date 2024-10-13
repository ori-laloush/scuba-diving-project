package com.example.worldofdiving;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMain2(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void openMain3(View view) {
        startActivity(new Intent(this,MainActivity3.class));
    }
}