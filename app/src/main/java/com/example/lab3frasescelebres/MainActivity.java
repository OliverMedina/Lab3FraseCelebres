package com.example.lab3frasescelebres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void activity2(View view) {
        Intent act2 = new Intent(this, SegundoActivity.class);
        act2.putExtra("pasarNumero", num);
        startActivity(act2);
    }

    public void numeroAleatorio(View view){
        Random random = new Random();
        num = random.nextInt(2+1)+1;
        TextView label = findViewById(R.id.num_aleatorio);
        label.setText(String.valueOf(num));
    }
}