package com.example.pedro.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlogin = (Button) findViewById(R.id.buttonLog);
        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                String usuario = ((EditText)findViewById(R.id.editTextUsr))get.Text().toString();
                String password = ((EditText)findViewById(R.id.editTextPass))get.Text().toString();
                if (usuario.equals("admin") && password.equals("123")){

                    Intent nuevoForm = new Intent(MainActivity.this, inicio.class);
                    startActivity(nuevoForm);
                }else{
                    Toast.makeText(getApplicationContext(), "la contrasena no coincide",Toast.LENGTH_LONG).show();
                }}
        });


        }


}
