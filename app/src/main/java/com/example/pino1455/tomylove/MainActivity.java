package com.example.pino1455.tomylove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (TextView) findViewById(R.id.id_titulo);
        boton1 = (Button) findViewById(R.id.id_boton1);

        }
        public void salto(View view) {
            String  mensaje;
            mensaje = "Te amo pequeñiiiiita!";
            titulo.setText(mensaje);
        }
    }