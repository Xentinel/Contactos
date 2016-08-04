package com.think.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.think.contactos.adaptador.contactoAdaptador;
import com.think.contactos.pojo.Contacto;

import java.util.ArrayList;

public class Contactos extends AppCompatActivity {
    private ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
        inicializarContactos();
        rvContactos = (RecyclerView)findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvContactos.setLayoutManager(llm);
        contactoAdaptador adaptador = new contactoAdaptador(contactos,this);
        rvContactos.setAdapter(adaptador);
    }
    private void inicializarContactos() {
        contactos = new ArrayList<>();
        contactos.add(new Contacto("Jayden ","5551234233","jayden@james.com",R.drawable.jjass));
        contactos.add(new Contacto("Jayden Jaymes","5512416345","jayden@james.com",R.drawable.jjbkni));
        contactos.add(new Contacto("Jayden michele jaymes","1252353345","jayden@james.com",R.drawable.jjbw));
        contactos.add(new Contacto("Choa","5512345678","jayden@james.com",R.drawable.jjredress));
    }
}
