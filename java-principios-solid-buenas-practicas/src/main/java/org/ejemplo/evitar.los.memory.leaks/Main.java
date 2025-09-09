package org.ejemplo.evitar.los.memory.leaks;

import java.util.HashMap;

public class Main {
    public static void main(String [] args) throws InterruptedException {
        /*
         * Se debe tener implementados los metodos
         * equals y hashcode al trabajar con Maps
         * ya que si se utilizan como clave, se generan
         * instancias nuevas al agregarse al map
         * en lugar de sobreescribir
         */
        HashMap<PerroConEquals,Integer> mapEquals = new HashMap<>();
        for(int i= 0 ; i<1000;i++){
            mapEquals.put(new PerroConEquals("caniche"),i);
        }
        //Thread.sleep(100000);
        System.out.println("Finaliza PerroEquals");
        HashMap<Perro,Integer> map = new HashMap<>();
        for(int i= 0 ; i<1000;i++){
            map.put(new Perro("caniche"),i);
        }
        Thread.sleep(100000);
System.out.println("Finaliza Perro");
        Thread.sleep(10000);
        System.out.println("Un numero aleatorio" + ClaseConVariableEstaticaPesada.NUMEROS_ALEATORIOS.get(5));
        System.gc();
        Thread.sleep(50000);

        Thread.sleep(10000);
        System.out.println("2x3 :" + ClaseConVariableEstaticaPesada.multiplica(2,3));
        System.gc();
        Thread.sleep(50000);



    }
}
