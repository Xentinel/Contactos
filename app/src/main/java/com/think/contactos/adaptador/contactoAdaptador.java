package com.think.contactos.adaptador;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.think.contactos.pojo.Contacto;
import com.think.contactos.DetalleContacto;
import com.think.contactos.R;

import java.util.ArrayList;

/**
 * Created by xentinel on 21/07/16.
 */
public class contactoAdaptador extends RecyclerView.Adapter<contactoAdaptador.contactoViewHolder> {
    private ArrayList<Contacto> listaContactos;
    Activity activity;
    public contactoAdaptador(ArrayList<Contacto> listaContactos,Activity activity) {
        this.listaContactos = listaContactos;
        this.activity = activity;
    }

    @Override
    public contactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_contacto,parent,false);
        return new contactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(contactoViewHolder holder, int position) {
        final Contacto contacto = listaContactos.get(position);
        holder.foto.setImageResource(contacto.getFoto());
        holder.telefonoContacto.setText(contacto.getTelefono());
        holder.nombreContacto.setText(contacto.getNombre());

        holder.likeContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Like a "+contacto.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetalleContacto.class);
                i.putExtra("contacto",contacto);
                view.getContext().startActivity(i);
            }
        });
        holder.telefonoContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetalleContacto.class);
                i.putExtra("contacto",contacto);
                view.getContext().startActivity(i);
            }
        });
        holder.nombreContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DetalleContacto.class);
                i.putExtra("contacto",contacto);
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    public static class contactoViewHolder extends RecyclerView.ViewHolder {
        private ImageView foto;
        private TextView nombreContacto,telefonoContacto;
        private ImageButton likeContact;
        public contactoViewHolder(View itemView) {
            super(itemView);
            foto            = (ImageView) itemView.findViewById(R.id.cvFotoContacto);
            nombreContacto  = (TextView) itemView.findViewById(R.id.cvNombreContacto);
            telefonoContacto= (TextView) itemView.findViewById(R.id.cvTelefonoContacto);
            likeContact     = (ImageButton) itemView.findViewById(R.id.cvContactoLike);
        }
    }
}
