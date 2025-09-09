package org.ejemplo.abusadores.de.la.orientacion.a.objetos.solucion;

public class Supervisor extends Empleado{
    public Supervisor(float salario, float bonus) {
        super(salario, bonus);
    }

    @Override
    public double obtenerSalarioCompleto() {
        return salario + bonus * 0.5;
    }

    @Override
    public double obtenerCoeficienteHorasExtra() {
        return 2;
    }
}
