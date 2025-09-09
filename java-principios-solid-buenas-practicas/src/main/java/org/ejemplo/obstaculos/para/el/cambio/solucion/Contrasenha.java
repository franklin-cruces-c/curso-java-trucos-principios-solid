package org.ejemplo.obstaculos.para.el.cambio.solucion;

public class Contrasenha {
    private String contraseña;

    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    public boolean esContraseñaValida(String contraseña) {
        return false;
    }

    public String generarContraseñaAleatoria() {
        return "";
    }
}
