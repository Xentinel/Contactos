package com.think.contactos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.think.contactos.pojo.Contacto;

public class DetalleContacto extends AppCompatActivity {
    private ImageView fotoContacto;
    private TextView nombreContacto;
    private TextView telefono;
    private TextView email;
    private Contacto contacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);
        desplegarContacto();
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }
    public void llamar(View v) {
        String tel = telefono.getText().toString();
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+tel)));
    }
    public void enviarEmail(View v) {
        String mail = email.getText().toString();
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mailto:"));
        i.putExtra(Intent.EXTRA_EMAIL,mail);
        i.setType("message/rfc822");
        startActivity(Intent.createChooser(i,"Enviar email"));
    }
    private void desplegarContacto() {
        contacto = (Contacto) getIntent().getSerializableExtra("contacto");
        fotoContacto  = (ImageView)findViewById(R.id.fotoDetalleContacto);
        nombreContacto = (TextView)findViewById(R.id.detNombreContacto);
        email          = (TextView)findViewById(R.id.detEmailContacto);
        telefono       = (TextView)findViewById(R.id.detTelefonoContacto);
        fotoContacto.setImageResource(contacto.getFoto());
        nombreContacto.setText(contacto.getNombre());
        email.setText(contacto.getEmail());
        telefono.setText(contacto.getTelefono());
    }
}
