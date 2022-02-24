package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView promedioparcial,titulo;
    EditText uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez;
    float promedio=0, sumatoria=0,x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uno= findViewById(R.id.editTextTextPersonName);
        dos= findViewById(R.id.editTextTextPersonName2);
        tres= findViewById(R.id.editTextTextPersonName3);
        cuatro= findViewById(R.id.editTextTextPersonName4);
        cinco=findViewById(R.id.editTextTextPersonName5);
        seis=findViewById(R.id.editTextTextPersonName6);
        siete=findViewById(R.id.editTextTextPersonName7);
        ocho=findViewById(R.id.editTextTextPersonName8);
        nueve=findViewById(R.id.editTextTextPersonName9);
        diez=findViewById(R.id.editTextTextPersonName10);
        promedioparcial =findViewById(R.id.textViewR);
        titulo=findViewById(R.id.titulo);
    }
    public void Siguiente(View view){
        try {

            sumatoria = (Float.parseFloat(uno.getText().toString())) + (Float.parseFloat(dos.getText().toString())) + (Float.parseFloat(tres.getText().toString())) + (Float.parseFloat(cuatro.getText().toString())) + (Float.parseFloat(cinco.getText().toString())) + (Float.parseFloat(seis.getText().toString())) + (Float.parseFloat(siete.getText().toString())) + (Float.parseFloat(ocho.getText().toString())) + (Float.parseFloat(nueve.getText().toString())) + (Float.parseFloat(diez.getText().toString()));
            promedioparcial.setText(String.valueOf(sumatoria / 10));
            uno.setText("");dos.setText("");tres.setText("");cuatro.setText("");cinco.setText("");seis.setText("");siete.setText("");ocho.setText("");nueve.setText("");diez.setText("");
            x++;
            if (x<4){
            titulo.setText("Parcial "+x);
            promedio=promedio+(sumatoria/10);
            }else {Toast.makeText(getApplicationContext(), "El promedio semestral es: "+promedio/3, Toast.LENGTH_LONG).show(); }
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), "Ingrese los datos de forma correcta", Toast.LENGTH_LONG).show();
        }
    }

}