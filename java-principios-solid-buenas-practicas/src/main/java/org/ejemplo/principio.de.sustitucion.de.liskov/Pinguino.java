package org.ejemplo.principio.de.sustitucion.de.liskov;

public class Pinguino implements Ave {

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los pinguinos no pueden volar");
    }

    @Override
    public void comer() {

    }

    @Override
    public void piar() {

    }
}
