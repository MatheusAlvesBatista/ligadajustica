package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GeloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gelo);
    }
    public void Voltar(View view){
        Intent intent6 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent6);
    }
}
