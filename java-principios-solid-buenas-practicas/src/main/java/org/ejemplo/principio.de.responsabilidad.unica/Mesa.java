package org.ejemplo.principio.de.responsabilidad.unica;

public class Mesa {

    private Rectangulo tablero;
    private Material material;

    public Mesa(Rectangulo tablero, Material material) {
        this.tablero = tablero;
        this.material = material;
    }

    public double obtenerPrecioTablero() {
        return tablero.calcularArea() * material.obtenerPrecioMetroCuadrado();
    }
}
