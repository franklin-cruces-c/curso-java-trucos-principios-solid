package org.ejemplo.evita.constructores.con.muchos.parametros;

public class Rectangulo {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private int radioDeEsquina;

    public Rectangulo(int x, int y, int ancho, int alto, int radioDeEsquina) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.radioDeEsquina = radioDeEsquina;
    }
    /*
     * Para simplificar un poco se usa el patron de constructor telescopico
     * se generan constructores mas simples con valores por defecto,
     * valores calculados de tal forma que tendremos constructores
     * con diferente numero de parametros opcionales
     */
    public Rectangulo(int x, int y, int ancho, int alto) {
        this(x,y,ancho,alto,0);
    }
    public Rectangulo(int ancho, int alto) {
       this(0,0,ancho,alto,0);
    }
}
