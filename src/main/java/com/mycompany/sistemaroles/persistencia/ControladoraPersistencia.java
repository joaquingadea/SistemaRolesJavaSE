package com.mycompany.sistemaroles.persistencia;
import com.mycompany.sistemaroles.logica.Usuario;
import com.mycompany.sistemaroles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
   
    
    public List<Usuario> traerDatosUs() {
        return usuarioJpa.findUsuarioEntities();
        
    }

    public void cargarDatosUs(Usuario usu) {
        usuarioJpa.create(usu);
    }

    public void eliminarUsuario(int id) {
        try {
            usuarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuarioJpa.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuarioJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
