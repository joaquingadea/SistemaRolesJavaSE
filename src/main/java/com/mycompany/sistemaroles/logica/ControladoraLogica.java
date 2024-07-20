package com.mycompany.sistemaroles.logica;
import com.mycompany.sistemaroles.persistencia.ControladoraPersistencia;
import java.util.List;
public class ControladoraLogica {
    ControladoraPersistencia control = new ControladoraPersistencia();
    public List<Usuario> traerDatosUs() {
        return control.traerDatosUs();
    }

    public void cargarDatosUs(Usuario usu) {
        control.cargarDatosUs(usu);
    }

    public void eliminarUsuario(int id) {
        //funcionalidad eliminar usuario
    }
   
}
