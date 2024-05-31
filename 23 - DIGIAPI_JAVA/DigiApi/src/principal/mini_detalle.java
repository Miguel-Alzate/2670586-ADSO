
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import utils.ConsumoAPI;

public class mini_detalle extends javax.swing.JPanel {
    
    ConsumoAPI consumo;
    String url_digimon;
    
    public mini_detalle(String url_digimon) {
        this.url_digimon = url_digimon;
        
        this.consumo = new ConsumoAPI();
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        
        contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        contentPrincipal.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                contentPrincipal.setCursor(new Cursor (Cursor.HAND_CURSOR));
                contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                contentPrincipal.setCursor(new Cursor (Cursor.DEFAULT_CURSOR));
                contentPrincipal.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
            }
        
        });
            
        
        
        String data = this.consumo.consumoGET(url_digimon);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        etq_nombre.setText(dataJson.get("name").getAsString());
        JsonArray content = dataJson.getAsJsonArray("images");
        JsonObject img = content.get(0).getAsJsonObject(); 

        String url_imagen = img.get("href").getAsString();

        try {
            String url = url_imagen;
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(192, 196, Image.SCALE_SMOOTH);
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
        etq_img = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        contentPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentPrincipalMouseClicked(evt);
            }
        });

        etq_img.setBackground(new java.awt.Color(255, 255, 255));
        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contentPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentPrincipalMouseClicked
        System.out.println(url_digimon);
        Detalle nuevo = new Detalle(url_digimon);
    }//GEN-LAST:event_contentPrincipalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_nombre;
    // End of variables declaration//GEN-END:variables
}
