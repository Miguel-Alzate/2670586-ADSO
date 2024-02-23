
package principal;

import Utils.BaseDatos;
import Utils.Persona;
import java.sql.Connection;
import java.sql.Statement;

public class PanelEliminar extends javax.swing.JPanel {
    
    BaseDatos baseDatos = new BaseDatos();
        
    Connection conexion = baseDatos.getConexion();
    Statement manipularBD = baseDatos.getManipularBD();
    String accion;
    

    public PanelEliminar() {
        initComponents();
        btn_eliminar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        etqCedula = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        etq_nombre = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Eliminar Persona");

        btn_buscar.setBackground(new java.awt.Color(0, 0, 255));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        etqCedula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqCedula.setText("Cedula");

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        texto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 0, 0));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etqCedula)
                        .addGap(18, 18, 18)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminar))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        String cedula = campoCedula.getText();
        if(baseDatos.buscarPersona(cedula)){
            btn_eliminar.setEnabled(true);
            btn_cancelar.setEnabled(true);
            etq_nombre.setText(cedula);
            texto.setText("¿Seguro que quieres eliminar a la persona con esta cedula?");
            
            
        }else if(cedula.equals("")){
            Alerta ventana = new Alerta("Ingresa un dato.");
        }else{
            Alerta ventana = new Alerta("Esta persona no está registrada.");
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        Alerta ventana = new Alerta("Persona eliminada con éxito");
        String cedula = campoCedula.getText();
        btn_eliminar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        baseDatos.eliminarPersona(cedula);
        etq_nombre.setText("");
        texto.setText("");
        campoCedula.setText("");
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        btn_eliminar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        etq_nombre.setText("");
        texto.setText("");
        campoCedula.setText("");
            
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
