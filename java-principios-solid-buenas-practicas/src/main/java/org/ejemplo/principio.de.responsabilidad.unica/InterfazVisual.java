package org.ejemplo.principio.de.responsabilidad.unica;

public class InterfazVisual {

    public void dibujarBoton() {
        Rectangulo borde = new Rectangulo(25, 25, 200, 200);
        borde.dibujar();
    }
}
