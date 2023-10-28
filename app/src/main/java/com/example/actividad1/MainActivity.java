package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private  int cont =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button agregar = findViewById(R.id.btn_counter);
        TextView counter = findViewById(R.id.txt_view);
        Button reiniciar = findViewById(R.id.btn_reiniciar);

        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont =0;
                counter.setText(""+cont);
            }
        });

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLICKER", "CLICK");
                cont++;
                counter.setText(""+cont);
            }
        });
    }
}