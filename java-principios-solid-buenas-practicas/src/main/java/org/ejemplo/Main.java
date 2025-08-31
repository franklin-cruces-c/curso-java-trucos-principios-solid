package org.ejemplo;

import org.ejemplo.comprueba.la.validez.de.los.parametros.en.tus.metodos.DiaDeLaSemana;
import org.ejemplo.comprueba.la.validez.de.los.parametros.en.tus.metodos.Fecha;
import org.ejemplo.evita.constructores.con.muchos.parametros.Rectangulo;
import org.ejemplo.evita.constructores.con.muchos.parametros.RectanguloBean;
import org.ejemplo.evita.constructores.con.muchos.parametros.RectanguloBuilder;
import org.ejemplo.los.objetos.inmutables.son.mas.seguros.Direccion;
import org.ejemplo.los.objetos.inmutables.son.mas.seguros.Empleado;
import org.ejemplo.los.objetos.inmutables.son.mas.seguros.EmpleadoInmutable;
import org.ejemplo.no.usar.clases.genericas.en.su.forma.raw.Billete;
import org.ejemplo.no.usar.clases.genericas.en.su.forma.raw.Moneda;

import java.math.BigDecimal;
import java.util.ArrayList;

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

        // ***** Objetos Inmutables *****
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


        // ***** No usar clases genéricas en su forma raw *****
        // Esto está permitido por compatibilidad con versiones anteriores
        ArrayList monedas = new ArrayList();
        // Y permite que podamos agregar cualquier tipo de objeto a la coleccion
        monedas.add(new Moneda(1, "euro"));
        monedas.add(new Billete(5, "euro"));
        // Esto genera excepción porque Billete no puede ser casteado a Moneda
        // Exception in thread "main" java.lang.ClassCastException: class org.ejemplo.no.usar.clases.genericas.en.su.forma.raw.Billete cannot be cast to class org.ejemplo.no.usar.clases.genericas.en.su.forma.raw.Moneda (org.ejemplo.no.usar.clases.genericas.en.su.forma.raw.Billete and org.ejemplo.no.usar.clases.genericas.en.su.forma.raw.Moneda are in unnamed module of loader 'app')
        //	at org.ejemplo.Main.main(Main.java:64)
//        for(int i= 0;i < monedas.size();i++){
//            Moneda miMoneda = (Moneda) monedas.get(i);
//            System.out.println("Moneda"+miMoneda.toString());
//        }
        // No debemos usar tipos Raw a menos que estemos
        // trabajando con código antiguo
        // La forma correcta
        ArrayList<Moneda> monedasOk = new ArrayList<>();
        // Y permite que podamos agregar cualquier tipo de objeto a la coleccion
        monedasOk.add(new Moneda(1, "euro"));
        //monedasOk.add(new Billete(5,"euro"));
        monedasOk.add(new Moneda(2, "euro"));
        for (int i = 0; i < monedasOk.size(); i++) {
            Moneda miMoneda = monedasOk.get(i);
            System.out.println("Moneda: " + miMoneda.toString());
        }
        // ***** Comprueba la validez de los parametros en tus métodos *****
        Fecha fecha = new Fecha(5, 10, 1990, DiaDeLaSemana.DOMINGO);
        // este da excepcion por dia incorrecto
        //Exception in thread "main" java.lang.IllegalArgumentException: Día:88 El día debe estar entre 1 y 31
        //	at org.ejemplo.comprueba.la.validez.de.los.parametros.en.tus.metodos.Fecha.setDia(Fecha.java:26)
        //	at org.ejemplo.Main.main(Main.java:86)
        //fecha.setDia(88);
        // Excepcion por dia de la semana null
        //Fecha fecha2 = new Fecha(5,10,1990, null);
        //  Exception in thread "main" java.lang.NullPointerException: Dia de la semana no puede ser null
        //	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
        //	at org.ejemplo.comprueba.la.validez.de.los.parametros.en.tus.metodos.Fecha.<init>(Fecha.java:16)
        //	at org.ejemplo.Main.main(Main.java:91)


        // ***** Evita float y double cuando necesites resultados exactos *****
        // si se necesitan calculos militares, aeronauticos o aplicaciones
        // que trabajan con dinero es mejor evitarlos y sustituirlo
        // por BigDecimal
        System.out.println("Sin BigDecimal 3 * 0.10 = " + 3 * 0.10);
        // 0.30000000000000004 puede parecer insignificante,
        // pero al irse acumulando puede generar problemas graves
        BigDecimal bdString = new BigDecimal("0.1");
        System.out.println("Con BigDecimal 3 * 0.10 = " + bdString.multiply(new BigDecimal(3)));

        BigDecimal bdDouble = new BigDecimal(0.1);
        BigDecimal otroBigDecimal = new BigDecimal("0.10");
        System.out.println("Escala bdString:" + bdString.scale());
        System.out.println("Escala otroBigDecimal:" + otroBigDecimal.scale());
        System.out.println("¿Son iguales? " + bdString.equals(otroBigDecimal));
        // Al crear el BigDecimal a partir de un Double se tiene el mismo problema de imprecision
        System.out.println("Con bdDouble 3 * 0.10 = " + bdDouble.multiply(new BigDecimal(3)));
        // hay que convertir
        double x = 0.10;
        System.out.println("(Con conversion) 3 * 0.10 = " + new BigDecimal(String.valueOf(x)).multiply(BigDecimal.valueOf(3)));
        // BigDecimal es más lento y ocupa más memoria, pero es más preciso

        // ***** Como evitar las NullPointerException *****
        String miString = null;
//        miString.toLowerCase();
//        Exception in thread "main" java.lang.NullPointerException
//        	at org.ejemplo.Main.main(Main.java:123)
        // esto arroja excepcion tambien
//        System.out.println(miString.equals("lunes"));
//        Exception in thread "main" java.lang.NullPointerException
//           at org.ejemplo.Main.main(Main.java:126)
        // Si se invierte funciona
        System.out.println("lunes".equals(miString));
        //recorrer colecciones nulas
        // también da NullPointerException deben estar
        // vacías no nulas
//        ArrayList<String> miLista = null;
//        for (String s : miLista) {
//            System.out.println(s);
//        }
//        Exception in thread "main" java.lang.NullPointerException
//        at org.ejemplo.Main.main(Main.java:136)

    }
}