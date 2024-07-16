package com.mycompany.sistemaroles.logica;
import java.io.Serializable;
public class Administrador extends Usuario implements Serializable {

    public Administrador() {
    }
    
    public Administrador(String rolAdmin, int id, String usuario, String contrasenia, String nombre, String apellido, String departamento, String profesion, String rol) {
        super(id, usuario, contrasenia, nombre, apellido, departamento, profesion, rol);
       
    }
    
}
