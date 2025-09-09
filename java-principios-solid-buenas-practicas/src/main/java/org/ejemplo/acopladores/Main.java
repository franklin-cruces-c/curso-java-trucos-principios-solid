package org.ejemplo.acopladores;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = Cliente.obtenerClienteX();

     //   String region = cliente.getDireccion().getCiudad().getRegion();
        String region = cliente.getRegion();
    }
}
