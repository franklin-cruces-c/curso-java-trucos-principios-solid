package org.ejemplo.principio.de.inversion.de.dependencias;

public class Boton {

    private Lampara lampara;

    public Boton(Lampara lampara) {
        this.lampara = lampara;
    }

    public void pulsar() {
//        if (condicion) {
//            lampara.encender();
//        } else {
//            lampara.apagar();
//        }
    }
}
