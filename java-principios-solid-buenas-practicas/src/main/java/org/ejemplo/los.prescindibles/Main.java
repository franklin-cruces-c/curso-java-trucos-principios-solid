package org.ejemplo.los.prescindibles;

public class Main {
    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Coleccion coleccionOrdenada = coleccion.ordenar();


       //// #####################################

   //     Coleccion miColeccionOrdenada = Utils.ordenarColeccion(coleccion);
// se quitan referencias al metodo que no se volverá a utilizar
        Coleccion miColeccionOrdenada = coleccion.ordenar();
    }
}


