package com.think.contactos.pojo;

import java.io.Serializable;

/**
 * Created by xentinel on 21/07/16.
 */
public class Contacto implements Serializable {
    private String nombre,telefono,email;
    private int foto;
    public Contacto(String nombre, String telefono, String email, int foto) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
