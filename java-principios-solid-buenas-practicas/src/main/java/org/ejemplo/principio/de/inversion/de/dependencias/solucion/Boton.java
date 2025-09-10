package org.ejemplo.principio.de.inversion.de.dependencias.solucion;

public class Boton {

    private Accionable accionable;

    public Boton(Accionable accionable) {
        this.accionable = accionable;
    }

    public void pulsar() {
        if (condicion) {
            accionable.encender();
        } else {
            accionable.apagar();
        }
    }
}
