package org.ejemplo;

import org.ejemplo.evita.constructores.con.muchos.parametros.Rectangulo;
import org.ejemplo.evita.constructores.con.muchos.parametros.RectanguloBean;
import org.ejemplo.evita.constructores.con.muchos.parametros.RectanguloBuilder;
import org.ejemplo.los.objetos.inmutables.son.mas.seguros.Direccion;
import org.ejemplo.los.objetos.inmutables.son.mas.seguros.Empleado;
import org.ejemplo.los.objetos.inmutables.son.mas.seguros.EmpleadoInmutable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ***** Constructor con muchos parametros ****
        Rectangulo rectangulo = new Rectangulo(1, 3, 7, 5, 9);
        // Patron Bean
        RectanguloBean rectanguloBean = new RectanguloBean();
        // Tiene el problema de que hay un estado intermedio
        // en cual no hay valores seteados
        // podria traer problemas en entornos multihilo muy dificil de depurar
        rectanguloBean.setAlto(100);
        rectanguloBean.setAncho(200);
        // Patron Builder contruimos el objeto
        // con los parametros obligatorios
        // y con los parametros opcionales que queramos enviar
        RectanguloBuilder rectanguloBuilder = new RectanguloBuilder.Builder(200, 100)
                .x(5).y(5).build();

        // ***** Objetos Inmutables
        // A pesar del costo adicional que tienen
        // crearemos clases inmutables para evitar
        // que sean modificados por fuera de la misma clase u objeto
        // perdiendo el control sobre ellos

        Direccion direccion = new Direccion("Mayor", "25", "Córdoba");

        Empleado empleado = new Empleado(12345, "Ana Garcia", direccion);
        System.out.println("La direccion del empleado es:" + empleado.getDireccion());

        EmpleadoInmutable empleadoInmutable = new EmpleadoInmutable(12345, "Ana Garcia", direccion);
        System.out.println("La direccion del empleado Immutable es:" + empleadoInmutable.getDireccion());
        direccion.setNumero("26");
        Direccion nuevaDireccion = empleado.getDireccion();
        nuevaDireccion.setCalle("Nueva Calle");
        Direccion nuevaDireccionInmutable = empleadoInmutable.getDireccion();
        nuevaDireccionInmutable.setCalle("Nueva Calle");

        System.out.println("(Después de modificar direccion) La direccion del empleado es:" + empleado.getDireccion());
        System.out.println("(Después de modificar direccion) La direccion del empleado Immutable es:" + empleadoInmutable.getDireccion());

    }
}