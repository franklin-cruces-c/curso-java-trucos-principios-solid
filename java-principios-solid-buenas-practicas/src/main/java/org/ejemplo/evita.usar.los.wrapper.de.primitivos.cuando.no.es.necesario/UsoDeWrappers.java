package org.ejemplo.evita.usar.los.wrapper.de.primitivos.cuando.no.es.necesario;

public class UsoDeWrappers {
    /*
     * Si trabajamos con colecciones muy grandes es mejor
     * utilizar primitivos en lugar de los wrapper
     * ya que requieren más memoria y se demoran más tiempo
     * en el procesamiento
     */
    private static Long[] numeros = new Long[10_000_000];

    public static void main(String[] args) throws InterruptedException {
        long antes = System.currentTimeMillis();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (long) i;
        }
        long ahora = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: "+ (ahora-antes));
        System.out.println("Finalizado");
        Thread.sleep(30000);

    }
}
