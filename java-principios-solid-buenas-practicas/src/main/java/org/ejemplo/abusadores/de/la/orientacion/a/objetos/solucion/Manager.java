package org.ejemplo.abusadores.de.la.orientacion.a.objetos.solucion;

public class Manager extends Empleado{
    public Manager(float salario, float bonus) {
        super(salario, bonus);
    }

    @Override
    public double obtenerSalarioCompleto() {
        return salario + bonus * 0.75;
    }

    @Override
    public double obtenerCoeficienteHorasExtra() {
        return 2.5;
    }
}
