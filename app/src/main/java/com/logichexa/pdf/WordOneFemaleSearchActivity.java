package com.logichexa.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class WordOneFemaleSearchActivity extends AppCompatActivity {
    EditText gettext;
    Button search;
    ProgressBar p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_one_search);
        gettext = findViewById(R.id.gettext);
        search = findViewById(R.id.search);
        p = findViewById(R.id.p);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.setVisibility(View.VISIBLE);
                String keyword;
                keyword = gettext.getText().toString();
                if(keyword.length()<12){
                    Toast.makeText(getApplicationContext(),"ভুল ভোটার নং",Toast.LENGTH_LONG).show();
                    p.setVisibility(View.GONE);
                }
                else {
                    Female810903Activity.searchKeywordInPdf(WordOneFemaleSearchActivity.this, keyword);
                    p.setVisibility(View.GONE);
                }

            }
        });
    }
}