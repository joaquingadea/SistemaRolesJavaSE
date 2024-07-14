package com.mycompany.sistemaroles.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Administrador extends Usuario implements Serializable {
    @Basic
    String rolAdmin;
    
    public Administrador(String rolAdmin, int id, String usuario, String contrasenia, String nombre, String apellido, String departamento, String profesion, String rol) {
        super(id, usuario, contrasenia, nombre, apellido, departamento, profesion, rol);
        this.rolAdmin = rolAdmin;
    }
    
}

//commit: "le puse las annotations a las clases y los atributos y termine de crear la parte de la persistencia, controladora, jpa controllers y la unidad de persistencia, ademas conecte el programa a la base de datos"