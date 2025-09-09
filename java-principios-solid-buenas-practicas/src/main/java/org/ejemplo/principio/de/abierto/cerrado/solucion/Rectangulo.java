package org.ejemplo.principio.de.abierto.cerrado.solucion;

public class Rectangulo implements Forma {

    private double x;
    private double y;

    private double ancho;
    private double alto;

    public Rectangulo(double x, double y, double ancho, double alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * alto + 2 * ancho;
    }
}
