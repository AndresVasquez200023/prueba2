package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {




    private TextView resultado;
    private EditText valor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultado = findViewById(R.id.resultado);



        Button sofButton = findViewById(R.id.softw);
        sofButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int soft = Integer.parseInt(resultado.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("resultado", soft);
                startActivity(intent);
            }
        });
    }
}