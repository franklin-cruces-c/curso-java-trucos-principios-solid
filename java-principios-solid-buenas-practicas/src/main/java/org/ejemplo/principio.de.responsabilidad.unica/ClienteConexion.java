package org.ejemplo.principio.de.responsabilidad.unica;

public interface ClienteConexion {

    void abrirConexion();
    void enviarDatos();
    void recibirDatos();
    void cerrarConexion();
}
