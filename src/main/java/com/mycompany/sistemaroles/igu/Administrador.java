package com.mycompany.sistemaroles.igu;

import com.mycompany.sistemaroles.logica.ControladoraLogica;
import com.mycompany.sistemaroles.logica.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {
    //ControladoraLogica control = new ControladoraLogica();
    ControladoraLogica control;
    public Administrador(ControladoraLogica control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblTablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaAdmin);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Administrador de los usuarios:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    } 
    private void cargarTabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
        List<Usuario> listaUsuarios = null;
        listaUsuarios = new ArrayList();
        listaUsuarios = control.traerDatosUs();
        String titulos[] = {"Id","Usuario","Nombre","Apellido","Profesion","Departamento"};
        modeloTabla.setColumnIdentifiers(titulos);
           if(listaUsuarios != null){
               for(Usuario us : listaUsuarios){
                   Object usuariosTabla[] = {us.getId(),us.getUsuario(),us.getNombre(),us.getApellido(),us.getProfesion(),us.getDepartamento()}; 
                   if(us.getRol().equals("Administrador")||us.getRol().equals("usuario")){
                       modeloTabla.addRow(usuariosTabla);
                   }
               }
           }
           else{
               mensaje("Tabla vacia","error","La tabla no tiene datos cargados");
           }
           tblTablaAdmin.setModel(modeloTabla);  
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        List <Usuario> listaUs = new ArrayList();
        listaUs = control.traerDatosUs();
        for(Usuario us : listaUs){
            //int numId = (Integer) us.getId();
            if(us.getId() == (Integer)(tblTablaAdmin.getValueAt(tblTablaAdmin.getSelectedRow(), 0))){
               control.eliminarUsuario(us.getId());
               mensaje("Eliminado","info","Usuario eliminado correctamente");
               break;
            }
        }
        cargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if(tblTablaAdmin.getRowCount()>0){
            if(tblTablaAdmin.getSelectedRow() != -1){
                int id_us = Integer.parseInt(String.valueOf(tblTablaAdmin.getValueAt(tblTablaAdmin.getSelectedRow(),0)));
                
                EdicionUsuarios editUsuario = new EdicionUsuarios(id_us,control);
                editUsuario.setLocationRelativeTo(null);
                editUsuario.setVisible(true);
            }
            else{
                mensaje("Seleccione un usuario","error","No se seleccionó ningun registro");
            }
        }
        else{
            mensaje("Tabla vacía","error","La tabla no tiene ningun usuario para editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //metodos
    
    public void mensaje(String titulo,String tipoMnj,String mensaje){
        if(tipoMnj.equals("info")){
            JOptionPane cartel = new JOptionPane();
            cartel.setMessage(mensaje);
            cartel.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog tit = cartel.createDialog(titulo);
            tit.setAlwaysOnTop(true);
            tit.setVisible(true);
        }
        else if(tipoMnj.equals("error")){
            JOptionPane cartel = new JOptionPane();
            cartel.setMessage(mensaje);
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog tit = cartel.createDialog(titulo);
            tit.setAlwaysOnTop(true);
            tit.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaAdmin;
    // End of variables declaration//GEN-END:variables
}
