package org.ejemplo.acopladores.solucion;

public class Tienda {

    //.................................................

    public static double calcularPrecioFinalBaldosas(Rect baldosa, Rect habitacion, double precioUnidad) {

        double areaBaldosa = baldosa.getArea();

        double areaHabitacion = habitacion.getArea();

        double numeroDeBaldosas = Math.ceil(areaHabitacion / areaBaldosa);

        return numeroDeBaldosas * precioUnidad;

    }
}
