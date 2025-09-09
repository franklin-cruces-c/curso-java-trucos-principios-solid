package org.ejemplo.abusadores.de.la.orientacion.a.objetos.solucion;

public class Trabajador extends Empleado{

    public Trabajador(float salario, float bonus) {
        super(salario, bonus);
    }

    @Override
    public double obtenerSalarioCompleto() {
        return salario;
    }

    @Override
    public double obtenerCoeficienteHorasExtra() {
        return 1.5;
    }
}
