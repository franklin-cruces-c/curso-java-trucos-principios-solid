package org.ejemplo.abusadores.de.la.orientacion.a.objetos;

public class Empleado {

    private TipoDeEmpleado tipoDeEmpleado;
    private float salario;
    private float bonus;

    public Empleado(TipoDeEmpleado tipoDeEmpleado, float salario, float bonus) {
        this.tipoDeEmpleado = tipoDeEmpleado;
        this.salario = salario;
        this.bonus = bonus;
    }

    public double obtenerSalarioCompleto() {
        switch (tipoDeEmpleado) {
            case TRABAJADOR:
                return salario;
            case SUPERVISOR:
                return salario + bonus * 0.5;
            case MANAGER:
                return salario + bonus * 0.75;
            default:
                return salario;
        }
    }

    public double obtenerCoeficienteHorasExtra() {
        switch (tipoDeEmpleado) {
            case TRABAJADOR:
                return 1.5;
            case SUPERVISOR:
                return 2;
            case MANAGER:
                return 2.5;
            default:
                return 1.5;
        }
    }
}
