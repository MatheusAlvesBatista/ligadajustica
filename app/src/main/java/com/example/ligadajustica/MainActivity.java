package com.example.ligadajustica;

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

    public void Flash(View view) {
        Intent intent1 = new Intent(getApplicationContext(), ActivityFlash.class);
        startActivity(intent1);

    }
    public void Gelo(View view){
        Intent intent2 = new Intent(getApplicationContext(), GeloActivity.class);
        startActivity(intent2);
    }
    public void Fogo(View view){
        Intent intent3 = new Intent(getApplicationContext(), FogoActivity.class);
        startActivity(intent3);
    }
    public void Lanterna(View view){
        Intent intent4 = new Intent(getApplicationContext(), LanternaActivity.class);
    }
}