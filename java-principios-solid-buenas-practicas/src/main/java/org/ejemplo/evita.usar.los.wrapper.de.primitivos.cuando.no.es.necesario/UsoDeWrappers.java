package org.ejemplo.evita.usar.los.wrapper.de.primitivos.cuando.no.es.necesario;

public class UsoDeWrappers {

    private static long[] numeros = new long[10_000_000];

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (long) i;
        }
        
        System.out.println("Finalizado");
        Thread.sleep(30000);

    }
}
