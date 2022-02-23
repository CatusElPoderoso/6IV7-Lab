  package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

  public class MainActivity extends AppCompatActivity {

      float promedio=0, promedioSemestre=0, calificacion=0,C;
      TextView labelA;
      TextView labelP;
      TextView labelParcial;
      EditText textField;
      int acumulacion=0, parcial=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelA = findViewById(R.id.textViewAcumuladas);
        labelP = findViewById(R.id.textViewPromedio);
        labelParcial = findViewById(R.id.textViewParcial);
        textField=findViewById(R.id.editTextC);
    }
    public void Sumar (View view){
        try {
            acumulacion = acumulacion + 1;
            promedio = (promedio + Float.parseFloat(textField.getText().toString()))/acumulacion;
            labelA.setText(String.valueOf(acumulacion));
            labelP.setText(String.valueOf(promedio));
            textField.setText("");
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), "Ingrese numeros, no letras", Toast.LENGTH_SHORT).show();
        }
    }

    public void siguienteSemestre(View view){
        acumulacion=0;
        labelA.setText(String.valueOf(acumulacion));
        promedioSemestre=promedioSemestre+promedio;
        parcial=parcial+1;
        promedio=0;
        labelP.setText(String.valueOf(promedio));
        labelParcial.setText("Parcial "+parcial);
        if (parcial==4){
            C=promedioSemestre/(parcial-1);
            Toast.makeText(getApplicationContext(), "El promedio semestral es: "+C, Toast.LENGTH_SHORT).show();
        }
    }
}