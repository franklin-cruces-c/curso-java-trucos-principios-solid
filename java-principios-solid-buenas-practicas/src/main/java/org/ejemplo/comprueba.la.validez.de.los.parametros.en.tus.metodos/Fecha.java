package org.ejemplo.comprueba.la.validez.de.los.parametros.en.tus.metodos;

import java.util.Objects;

public class Fecha {
    int dia;
    int mes;
    int año;
    DiaDeLaSemana diaDeLaSemana;

    public Fecha(int dia, int mes, int año, DiaDeLaSemana diaDeLaSemana) {

        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.diaDeLaSemana = Objects.requireNonNull(diaDeLaSemana,"Dia de la semana no puede ser null");
    }

    /**
     * Establece el día del mes
     * @param dia es el día del mes. Este debe estar comprendido entre 1 y 31
     * @throws IllegalArgumentException si dia es menor que 1 o mayor que 31
     */
    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Día:" + dia + " El día debe estar entre 1 y 31");
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDiaDeLaSemana(DiaDeLaSemana diaDeLaSemana) {
        this.diaDeLaSemana = diaDeLaSemana;
    }
}
