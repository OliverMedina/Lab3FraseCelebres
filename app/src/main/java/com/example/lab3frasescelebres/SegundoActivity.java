package com.example.lab3frasescelebres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private ImageView personaje;

    private TextView autor;

    private TextView frase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Intent intent = getIntent();
        int valor = intent.getIntExtra("pasarNumero", 0);


        personaje = findViewById(R.id.imageView);
        autor = findViewById(R.id.text_autor);
        frase = findViewById(R.id.text_frase);


        if (valor == 1) {
            personaje.setImageResource(R.drawable.charles);

            autor.setText(R.string.autor1);

            frase.setText(R.string.frase1);
        } else if (valor ==2) {
            personaje.setImageResource(R.drawable.karl);

            autor.setText(R.string.autor2);

            frase.setText(R.string.frase2);
        } else if (valor ==3) {
            personaje.setImageResource(R.drawable.stephen);

            autor.setText(R.string.autor3);

            frase.setText(R.string.frase3);
        }
    }

    public void regresar(View view){
        Intent intent = new Intent(SegundoActivity.this, MainActivity.class);
        startActivity(intent);
    }
}