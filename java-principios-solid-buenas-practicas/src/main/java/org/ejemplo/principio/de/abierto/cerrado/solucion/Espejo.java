package org.ejemplo.principio.de.abierto.cerrado.solucion;


import org.ejemplo.principio.de.abierto.cerrado.Material;


public class Espejo {

    private static final double PRECIO_M2_MATERIAL_ESPEJO = 721;
    private Forma forma;

    private Material materialMarco;

    public Espejo(Forma forma, Material materialMarco) {
        this.forma = forma;
        this.materialMarco = materialMarco;
    }

    public double calcularPrecioEspejo() {
        return calcularPrecioMarco() + calcularPrecioInterior();
    }

    private double calcularPrecioMarco() {
        return forma.calcularPerimetro() * materialMarco.obtenerPrecioLineal();
    }

    private double calcularPrecioInterior() {
        return forma.calcularArea() * PRECIO_M2_MATERIAL_ESPEJO;
    }
}
