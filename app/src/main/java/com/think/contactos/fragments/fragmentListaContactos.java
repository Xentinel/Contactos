package com.think.contactos.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.think.contactos.R;
import com.think.contactos.adaptador.contactoAdaptador;
import com.think.contactos.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by xentinel on 04-Aug-16.
 */
public class fragmentListaContactos extends Fragment{
    private ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        //inflamos el layout en el fragment, equivale a setContentView(R.layout.layout_name); en un activity
        View v = inflater.inflate(R.layout.fragment_lista_contactos,container,false);
        inicializarContactos();
        rvContactos = (RecyclerView)v.findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false);
        rvContactos.setLayoutManager(llm);
        contactoAdaptador adaptador = new contactoAdaptador(contactos,getActivity());
        rvContactos.setAdapter(adaptador);
        return v;
    }
    private void inicializarContactos() {
        contactos = new ArrayList<>();
        contactos.add(new Contacto("Jayden ","5551234233","jayden@james.com",R.drawable.jjass));
        contactos.add(new Contacto("Jayden Jaymes","5512416345","jayden@james.com",R.drawable.jjbkni));
        contactos.add(new Contacto("Jayden michele jaymes","1252353345","jayden@james.com",R.drawable.jjbw));
        contactos.add(new Contacto("Choa","5512345678","jayden@james.com",R.drawable.jjredress));
    }
}
