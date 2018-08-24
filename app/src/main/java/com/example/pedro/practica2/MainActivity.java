package com.example.pedro.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GRETEER = "interfaz en desarrollo"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button)findViewById(R.id.buttonLog);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "inicio sesión correctamente", Toast.LENGTH_SHORT).show()
                        Intent intent = new Intent(MainActivity.this, StartActivity.class);
                        intent.putExtra("greeter", GRETEER);
                        startActivity(intent);

            }
        });
    }


}
