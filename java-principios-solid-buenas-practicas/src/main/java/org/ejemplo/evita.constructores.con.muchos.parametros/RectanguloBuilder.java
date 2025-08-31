package org.ejemplo.evita.constructores.con.muchos.parametros;

public class RectanguloBuilder {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private int radioDeEsquina;
    /*
     *  Patron Builder
     */

    RectanguloBuilder(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
        this.ancho = builder.ancho;
        this.alto = builder.alto;
        this.radioDeEsquina = builder.radioDeEsquina;
    }

    public static class Builder {
        private int x = 0;
        private int y = 0;
        private int ancho;
        private int alto;
        private int radioDeEsquina = 0;

        public Builder(int ancho, int alto) {
            this.ancho = ancho;
            this.alto = alto;
        }

        public RectanguloBuilder build() {
            return new RectanguloBuilder(this);
        }

        public Builder x(int valor) {
            x = valor;
            return this;
        }

        public Builder y(int valor) {
            y = valor;
            return this;
        }

        public Builder ancho(int valor) {
            ancho = valor;
            return this;
        }

        public Builder alto(int valor) {
            alto = valor;
            return this;
        }

        public Builder radioDeEsquina(int valor) {
            radioDeEsquina = valor;
            return this;
        }
    }
}
