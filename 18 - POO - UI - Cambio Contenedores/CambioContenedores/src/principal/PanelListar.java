package principal;

import Utils.BaseDatos;
import Utils.Persona;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PanelListar extends javax.swing.JPanel {

        Persona listaPersonas[];
        DefaultTableModel  modelo;
    public PanelListar(Persona[] listado) {
        
        
        this.listaPersonas = listado;
        initComponents();
        initAlternComponents();
        imprimirTabla();
        
    }

    
     public void initAlternComponents(){
        setVisible(true);
        
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        tablaPersonas.getTableHeader().setResizingAllowed(false);
        
        tablaPersonas.getTableHeader().setFont(new Font("Arial",Font.BOLD,15));
        tablaPersonas.getTableHeader().setForeground(Color.WHITE);
        tablaPersonas.getTableHeader().setOpaque(false);
        tablaPersonas.getTableHeader().setBackground(Color.BLUE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etq_titulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 204, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("Lista de Personas");

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Dirección", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPersonas.setFocusable(false);
        tablaPersonas.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void imprimirTabla(){
        modelo.setRowCount(0);
        for(int i = 0;listaPersonas[i] != null;i++){
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String direccion = listaPersonas[i].getDireccion();
            String correo = listaPersonas[i].getCorreo();
            System.out.println("-> "+documento);
            
            Object dato = new Object[]{documento,nombres,apellidos,telefono,direccion,correo};
            modelo.addRow((Object[]) dato);

         
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables

    
}
