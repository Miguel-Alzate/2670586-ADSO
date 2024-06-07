
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import utils.ConsumoAPI;


public class Detalle extends javax.swing.JFrame {
    
    ConsumoAPI consumo;
    String url_digimon;
    
    public Detalle(String url_digimon) {
        this.url_digimon = url_digimon;
        this.consumo = new ConsumoAPI();
        System.out.println(url_digimon);
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setTitle("Detalle");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_ventana.png")) );
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        String data = this.consumo.consumoGET(url_digimon);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        etq_nombre.setText(dataJson.get("name").getAsString());
        etq_id.setText(dataJson.get("id").getAsString());
        
        JsonArray content = dataJson.getAsJsonArray("images");
        JsonObject img = content.get(0).getAsJsonObject(); 
        String url_imagen = img.get("href").getAsString();
        
        try {
            String url = url_imagen;
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(235, 244, Image.SCALE_SMOOTH);
            etq_img.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(mini_detalle.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        llenarTabla(tabla_nivel, dataJson.getAsJsonArray("levels"), "level");
        llenarTabla(tabla_atributos, dataJson.getAsJsonArray("attributes"), "attribute");
        llenarTabla(tabla_tipos, dataJson.getAsJsonArray("types"), "type");
        
        JsonArray fields = dataJson.getAsJsonArray("fields");
        if (fields != null) {
            for (int i = 0; i < fields.size(); i++) {
                JsonObject field = fields.get(i).getAsJsonObject();
                String fieldName = field.get("field").getAsString();
                String fieldImageURL = field.get("image").getAsString();
                añadir_campos(panel_campos, fieldName, fieldImageURL);
            }
        }

        revalidate();
        repaint();
        
    }
    
    private void llenarTabla(javax.swing.JTable table, JsonArray jsonArray, String key) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        if (jsonArray != null && jsonArray.size() > 0) {
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
                model.addRow(new Object[]{jsonObject.get(key).getAsString()});
            }
        } else {
            model.addRow(new Object[]{"N/A"});
        }
    }
    
    private void añadir_campos(JPanel panel, String fieldName, String imageURL) {
        try {
            URL imgUrl = new URL(imageURL);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(60, 60, Image.SCALE_SMOOTH); 
            JLabel imgLabel = new JLabel(new ImageIcon(imagen));
            JLabel nameLabel = new JLabel(fieldName, JLabel.CENTER);
            
            JPanel fieldPanel = new JPanel();
            fieldPanel.setLayout(new javax.swing.BoxLayout(fieldPanel, javax.swing.BoxLayout.Y_AXIS));
            fieldPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Adds margin around the panel
            
            fieldPanel.add(imgLabel);
            fieldPanel.add(nameLabel);
            panel.add(fieldPanel);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Detalle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etq_id = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_nivel = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_atributos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_tipos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        panel_campos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_id.setText("jLabel1");

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("jLabel1");

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tabla_nivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "NIVEL"
            }
        ));
        jScrollPane1.setViewportView(tabla_nivel);

        tabla_atributos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ATRIBUTOS"
            }
        ));
        jScrollPane2.setViewportView(tabla_atributos);

        tabla_tipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "TIPOS"
            }
        ));
        jScrollPane3.setViewportView(tabla_tipos);

        panel_campos.setBackground(new java.awt.Color(255, 255, 255));
        panel_campos.setLayout(new javax.swing.BoxLayout(panel_campos, javax.swing.BoxLayout.X_AXIS));
        jScrollPane4.setViewportView(panel_campos);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(etq_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etq_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_id;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panel_campos;
    private javax.swing.JTable tabla_atributos;
    private javax.swing.JTable tabla_nivel;
    private javax.swing.JTable tabla_tipos;
    // End of variables declaration//GEN-END:variables
}
