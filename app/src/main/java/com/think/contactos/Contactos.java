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
        contactos.add(new Contacto("Jayden ","5551234233","jayden@james.com",R.drawable.aziani_jayden_jaymes_0008));
        contactos.add(new Contacto("Jayden Jaymes","5512416345","jayden@james.com",R.drawable.aziani_jayden_jaymes_0236));
        contactos.add(new Contacto("Jayden michele jaymes","1252353345","jayden@james.com",R.drawable.aziani_jayden_jaymes_0532));
        contactos.add(new Contacto("Choa","5512345678","jayden@james.com",R.drawable.aziani_jayden_jaymes_0640));
        contactos.add(new Contacto("Andrea La rau","5551234657","jayden@james.com",R.drawable.img_3733));
        contactos.add(new Contacto("Samantha Saint","5551234895","jayden@james.com",R.drawable.img_3913));
        contactos.add(new Contacto("Vanessa","5551234845","jayden@james.com",R.drawable.img_4161));
        contactos.add(new Contacto("Georgina","5551234435","jayden@james.com",R.drawable.img_4492));
        contactos.add(new Contacto("Ann Code","5551234234","jayden@james.com",R.drawable.img_4729));
        contactos.add(new Contacto("Arlette Solis","5551234346","jayden@james.com",R.drawable.jjstock));
    }
}
