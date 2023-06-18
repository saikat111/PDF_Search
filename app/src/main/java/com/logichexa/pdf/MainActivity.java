package com.logichexa.pdf;


import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing variables for button and text view.


        // adding on click listener for button
      /*  extractPDFBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyword = "১১"; // Replace with your desired keyword
                PdfSearchUtils.searchKeywordInPdf(MainActivity.this, keyword);



            }
        });*/
    }



    public void wordOne(View view) {
        Intent intent = new Intent(MainActivity.this, WordOneActivity.class);
        startActivity(intent);

    }
}