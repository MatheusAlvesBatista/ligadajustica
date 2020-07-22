package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LanternaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanterna);
    }
    public void Voltar(View view){
        Intent intent7 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent7);
    }
}
