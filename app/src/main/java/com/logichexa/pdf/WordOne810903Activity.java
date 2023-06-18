package com.logichexa.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WordOne810903Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_one810903);
    }

    public void female(View view) {
        Intent intent = new Intent(WordOne810903Activity.this, WordOneFemaleSearchActivity.class);
        startActivity(intent);

    }

    public void male(View view) {
        Intent intent = new Intent(WordOne810903Activity.this, WordOneMaleSearchActivity.class);
        startActivity(intent);

    }
}