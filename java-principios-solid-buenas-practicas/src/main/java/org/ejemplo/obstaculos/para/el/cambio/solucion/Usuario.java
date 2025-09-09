package org.ejemplo.obstaculos.para.el.cambio.solucion;

import org.ejemplo.obstaculos.para.el.cambio.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String email;
    private Contrasenha contraseña;
    private List<Elemento> listaDeDeseos;

    public Usuario(String nombre, String email, Contrasenha contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.listaDeDeseos = new ArrayList<>();
    }

    public void añadirElementoAListaDeDeseos(Elemento elemento) {
        listaDeDeseos.add(elemento);
    }


    public void cambiarEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    public boolean esEmailValido(String email) {
        return false;
    }
}
