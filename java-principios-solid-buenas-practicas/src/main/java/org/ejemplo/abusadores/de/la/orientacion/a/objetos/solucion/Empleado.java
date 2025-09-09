package org.ejemplo.abusadores.de.la.orientacion.a.objetos.solucion;

import org.ejemplo.abusadores.de.la.orientacion.a.objetos.TipoDeEmpleado;

public abstract class Empleado {

   // private TipoDeEmpleado tipoDeEmpleado;
    protected float salario;
    protected float bonus;

    public Empleado(float salario, float bonus) {
        this.salario = salario;
        this.bonus = bonus;
    }

    public abstract double obtenerSalarioCompleto();

    public abstract double obtenerCoeficienteHorasExtra();
}
