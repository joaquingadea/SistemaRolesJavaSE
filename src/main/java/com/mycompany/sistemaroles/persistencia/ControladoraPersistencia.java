package com.mycompany.sistemaroles.persistencia;
import com.mycompany.sistemaroles.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
   
    
    public List<Usuario> traerDatosUs() {
        return usuarioJpa.findUsuarioEntities();
        
    }
}
