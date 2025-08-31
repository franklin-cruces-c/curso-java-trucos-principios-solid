package org.ejemplo.los.objetos.inmutables.son.mas.seguros;

/*
 * Clase Empleado convertida en una clase inmutable
 */
// Clase final para que no pueda heredarse y, por tanto, hacer subclases mutables
public final class EmpleadoInmutable {
    //declarar los atributos como final
    private final int id;
    private final String nombre;
    private final Direccion direccion;

    public EmpleadoInmutable(int id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        // Copia defensiva del objeto direccion para evitar
        // que sea modificado desde afuera del objeto empleadoInmutable
        //this.direccion = direccion;
        this.direccion = new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad());
    }

    /*
     * Método que cambia nombre como se trata de clase inmutable
     * en realidad se crea un nuevo objeto con el nuevo nombre
     * y se devuelve el nuevo objeto
     * @param nuevoNombre
     * @return
     */
    public Empleado cambiarNombre(String nuevoNombre) {
        return new Empleado(id, nuevoNombre, direccion);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // En get Direccion tambien devolvemos una copia defensiva
    //    public Direccion getDireccion() {
//        return direccion;
//    }
    public Direccion getDireccion() {
        return new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad());
    }

//    quitar los metodos setter
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setDireccion(Direccion direccion) {
//        this.direccion = direccion;
//    }
}
