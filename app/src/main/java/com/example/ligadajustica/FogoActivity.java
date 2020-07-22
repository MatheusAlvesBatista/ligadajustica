package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fogo);
    }
    public void Voltar(View view){
        Intent intent5 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent5);
    }
}
