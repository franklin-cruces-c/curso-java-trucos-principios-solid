package org.ejemplo.codigo.smell.bloaters;

public class Bloaters {

    public void enviarCarta(Empleado empleado) {

        imprimirDireccion(empleado);
        imprimirDireccionSmell(empleado.getNombre(), empleado.getApellidos(), empleado.getDireccion().getCalle(),empleado.getDireccion().getNumero(), empleado.getDireccion().getCiudad(), empleado.getDireccion().getCodigoPostal());
    }

    public void imprimirDireccion(Empleado empleado) {

        imprimir(empleado.getNombre());
        imprimir(empleado.getApellidos());
        imprimir(empleado.getDireccion().getCalle());
        imprimir(String.valueOf(empleado.getDireccion().getNumero()));
        imprimir(empleado.getDireccion().getCiudad());
        imprimir(String.valueOf(empleado.getDireccion().getCodigoPostal()));

    }
    public void imprimirDireccionSmell(String nombre, String apellidos, String calle, int numero, String ciudad, int codigoPostal) {

        imprimir(nombre);
        imprimir(apellidos);
        imprimir(calle);
        imprimir(String.valueOf(numero));
        imprimir(ciudad);
        imprimir(String.valueOf(codigoPostal));

    }

    public void enviarCarta(Empleado empleado, int dia, int mes, int hora, int minutos) {
        imprimirDireccion(empleado);
    }
    public void invitarAReunion(Empleado empleado, int dia, int mes, int hora, int minutos) {
        imprimirDireccion(empleado);
    }

    public void imprimir(String campo) {

    }
}
