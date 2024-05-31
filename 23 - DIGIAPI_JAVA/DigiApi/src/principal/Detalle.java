
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
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        String data = this.consumo.consumoGET(url_digimon);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        etq_nombre.setText(dataJson.get("name").getAsString());
        etq_id.setText(dataJson.get("id").getAsString());
        
        JsonArray content = dataJson.getAsJsonArray("images");
        JsonObject img = content.get(0).getAsJsonObject(); 
        String url_imagen = img.get("href").getAsString();
        
        JsonArray levels = dataJson.getAsJsonArray("levels");
        JsonObject lvl = levels.get(0).getAsJsonObject(); 
        etq_level_1.setText(lvl.get("level").getAsString());
        
        JsonArray atr = dataJson.getAsJsonArray("attributes");
        JsonObject atributos = atr.get(0).getAsJsonObject(); 
        etq_attribute_1.setText(atributos.get("attribute").getAsString());
        
        JsonArray typ = dataJson.getAsJsonArray("types");
        JsonObject type = typ.get(0).getAsJsonObject(); 
        etq_type_1.setText(type.get("type").getAsString());

       

        try {
            String url = url_imagen;
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(235, 244, Image.SCALE_SMOOTH);
            etq_img.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(mini_detalle.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        revalidate();
        repaint();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etq_id = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        etq_img = new javax.swing.JLabel();
        etq_titulo_level = new javax.swing.JLabel();
        etq_titulo_attribute = new javax.swing.JLabel();
        etq_titulo_type = new javax.swing.JLabel();
        etq_level_1 = new javax.swing.JLabel();
        etq_attribute_1 = new javax.swing.JLabel();
        etq_type_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_id.setText("jLabel1");

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("jLabel1");

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_titulo_level.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        etq_titulo_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_level.setText("Level");

        etq_titulo_attribute.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        etq_titulo_attribute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_attribute.setText("Attribute");

        etq_titulo_type.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        etq_titulo_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo_type.setText("Type");

        etq_level_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_level_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_level_1.setText("jLabel1");

        etq_attribute_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_attribute_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_attribute_1.setText("jLabel1");

        etq_type_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_type_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_type_1.setText("jLabel1");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_titulo_level, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_level_1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(etq_titulo_attribute, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(etq_attribute_1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)))
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etq_titulo_type, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etq_type_1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_id, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etq_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_titulo_attribute)
                    .addComponent(etq_titulo_type)
                    .addComponent(etq_titulo_level))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_level_1)
                    .addComponent(etq_attribute_1)
                    .addComponent(etq_type_1))
                .addContainerGap(75, Short.MAX_VALUE))
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
    private javax.swing.JLabel etq_attribute_1;
    private javax.swing.JLabel etq_id;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_level_1;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_titulo_attribute;
    private javax.swing.JLabel etq_titulo_level;
    private javax.swing.JLabel etq_titulo_type;
    private javax.swing.JLabel etq_type_1;
    // End of variables declaration//GEN-END:variables
}
