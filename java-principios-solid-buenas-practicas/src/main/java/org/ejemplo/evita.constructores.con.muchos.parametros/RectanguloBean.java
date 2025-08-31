package org.ejemplo.evita.constructores.con.muchos.parametros;

public class RectanguloBean {
    private int x=0;
    private int y=0;
    private int ancho=-1;
    private int alto=-1;
    private int radioDeEsquina=0;

    /**
     *  Patron Java Bean para evitar constructores con muchos parametros
     *  y ademas se inicializan los atributos con valores por defecto,
     *  y algunos que requieren valor con un valor que indique que falta
     *  inicializarlos
     * @param ancho
     * @param alto
     */
    public RectanguloBean(int ancho, int alto) {
       this.ancho=ancho;
       this.alto=alto;
    }
    public RectanguloBean() {

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getRadioDeEsquina() {
        return radioDeEsquina;
    }

    public void setRadioDeEsquina(int radioDeEsquina) {
        this.radioDeEsquina = radioDeEsquina;
    }
}
