
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;

public class PanelListar extends javax.swing.JPanel {
    
    DefaultTableModel  modelo;
    public PanelListar() {
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
        
          // Tamaño de Columnas
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(75);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(135);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(155);
      
 
        
        // Centrar contenido de columnas
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        
        tablaPersonas.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        tablaPersonas.getColumnModel().getColumn(4).setCellRenderer(centerRender);
        
       
        
        // Alto de las filas
        tablaPersonas.setRowHeight(25);
        
    }
    
     public void imprimirTabla(){
        ConsumoAPI consumo = new ConsumoAPI();

        // EndPoint obtener
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
        
        // Convertir texto a arreglo JSON
        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        modelo.setRowCount(0);
        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String cedula = temp.get("cedula").getAsString();
            String nombres = temp.get("nombres").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String email = temp.get("email").getAsString();
            
            Object datos[] = new Object[]{ (i+1), cedula, nombres, telefono, email};
            modelo.addRow(datos);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Cedula", "Nombre", "Telefono", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE PERSONAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
