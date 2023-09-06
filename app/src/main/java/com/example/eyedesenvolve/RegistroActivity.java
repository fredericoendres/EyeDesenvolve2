package com.example.eyedesenvolve;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    String[] EVENTOS = {"Eye Desenvolve 2023", "Startup Summit 2023", "Futurecom 2023"};
    String[] GENEROS = {"Masculino", "Feminino", "Outro"};

    AutoCompleteTextView autoCompleteTextViewEvento;
    AutoCompleteTextView autoCompleteTextViewGenero;
    ArrayAdapter<String> adapterEventos;
    ArrayAdapter<String> adapterGeneros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        autoCompleteTextViewEvento = findViewById(R.id.select_evento);
        adapterEventos = new ArrayAdapter<String>(this,R.layout.list_dropdown, EVENTOS);
        autoCompleteTextViewEvento.setAdapter(adapterEventos);

        autoCompleteTextViewGenero = findViewById(R.id.select_genero);
        adapterGeneros = new ArrayAdapter<String>(this, R.layout.list_dropdown, GENEROS);
        autoCompleteTextViewGenero.setAdapter(adapterGeneros);


    }


}