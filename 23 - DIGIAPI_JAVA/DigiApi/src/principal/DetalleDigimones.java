
package principal;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import utils.ConsumoAPI;


public class DetalleDigimones extends javax.swing.JPanel {
    
    ConsumoAPI consumo;
    String pagina_parseada;
    public DetalleDigimones(int Pagina_actual) {
        this.pagina_parseada = String.valueOf(Pagina_actual);;
        this.consumo = new ConsumoAPI();
        initComponents();
        cargarImagenDigimones();
    }
    
    
    
    public void cargarImagenDigimones() {
        contentPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;  
        gbc.weighty = 1.0;                 

        String endpoint = "https://digi-api.com/api/v1/digimon?page="+pagina_parseada;
        String data = this.consumo.consumoGET(endpoint);

        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray content = dataJson.getAsJsonArray("content");

        for (int i = 0; i < content.size(); i++) {
            JsonObject temp = content.get(i).getAsJsonObject();

            mini_detalle panelsito = new mini_detalle(temp.get("href").getAsString());
            panelsito.setPreferredSize(new Dimension(175, 175));
            panelsito.setMinimumSize(new Dimension(175, 175));
            panelsito.setMaximumSize(new Dimension(175, 175));

            gbc.gridx = i % 3; // Columna
            gbc.gridy = i / 3; // Fila
            gbc.weightx = 0.33; 
            gbc.weighty = 0.5; 
            contentPrincipal.add(panelsito, gbc);
        }

        revalidate();
        repaint();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    // End of variables declaration//GEN-END:variables
}
