package com.example.pedro.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private textView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    setContentView(R.layout.start);

    textView = (TextView) findViewById(R.id.textViewPrueba);
     
}
