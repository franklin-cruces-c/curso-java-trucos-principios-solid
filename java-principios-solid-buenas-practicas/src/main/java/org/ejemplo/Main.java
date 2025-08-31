package org.ejemplo;

import org.ejemplo.evita.constructores.con.muchos.parametros.Rectangulo;
import org.ejemplo.evita.constructores.con.muchos.parametros.RectanguloBean;
import org.ejemplo.evita.constructores.con.muchos.parametros.RectanguloBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ***** Constructor con muchos parametros ****
        Rectangulo rectangulo = new Rectangulo(1,3,7,5,9);
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
        RectanguloBuilder rectanguloBuilder = new RectanguloBuilder.Builder(200,100)
                .x(5).y(5).build();

        // *****


    }
}