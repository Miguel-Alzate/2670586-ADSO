
package principal;

import Utils.BaseDatos;
import Utils.Persona;
import java.sql.Connection;
import java.sql.Statement;

public class PanelEditar extends javax.swing.JPanel {

    BaseDatos baseDatos = new BaseDatos();
        
    Connection conexion = baseDatos.getConexion();
    Statement manipularBD = baseDatos.getManipularBD();
    String accion;
    
    public PanelEditar() {
        initComponents();
        btn_editar.setEnabled(false);
        campoCedula.enable();
        campoNombres.disable();
        campoApellidos.disable();
        campoTelefono.disable();
        campoDireccion.disable();
        campoCorreo.disable();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        etq_titulo = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();

        label1.setText("label1");

        setBackground(new java.awt.Color(153, 204, 255));

        etq_titulo.setBackground(new java.awt.Color(153, 204, 255));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Editar Persona");

        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });

        etqTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqTelefono.setText("Telefono");

        etqDireccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqDireccion.setText("Direccion");

        etqCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCedula.setText("Cedula");

        etqCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCorreo.setText("Correo");

        btn_buscar.setBackground(new java.awt.Color(0, 0, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqNombres.setText("Nombres");

        etqApellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqApellidos.setText("Apellidos");

        btn_editar.setBackground(new java.awt.Color(204, 0, 0));
        btn_editar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqNombres)
                            .addComponent(etqCedula)
                            .addComponent(etqApellidos)
                            .addComponent(etqTelefono)
                            .addComponent(etqCorreo)
                            .addComponent(etqDireccion))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDireccion))
                .addGap(30, 30, 30)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
            
            String cedula = campoCedula.getText();
            if(baseDatos.buscarPersona(cedula)){
                btn_editar.setEnabled(true);
                campoCedula.disable();
                campoNombres.enable();
                campoApellidos.enable();
                campoTelefono.enable();
                campoDireccion.enable();
                campoCorreo.enable();
            }else if(cedula.equals("")){
                Alerta ventana = new Alerta("Ingresa un dato.");                  
            }else{
                Alerta ventana = new Alerta("Esta persona no está registrada.");  
            }
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
                String cedula = campoCedula.getText();
                String nombres = campoNombres.getText();
                String apellidos = campoApellidos.getText();
                String telefono = campoTelefono.getText();
                String direccion = campoDireccion.getText();
                String correo = campoCorreo.getText();
                
                baseDatos.actualizarPersona(cedula, nombres, apellidos, telefono, direccion, correo);
                
                
                campoCedula.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoDireccion.setText("");
                campoCorreo.setText("");
                
                
                btn_editar.setEnabled(false);
                campoCedula.enable();
                campoNombres.disable();
                campoApellidos.disable();
                campoTelefono.disable();
                campoDireccion.disable();
                campoCorreo.disable();
                AlertaCrear ventana = new AlertaCrear("Persona editada con éxito.");
    }//GEN-LAST:event_btn_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etq_titulo;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
