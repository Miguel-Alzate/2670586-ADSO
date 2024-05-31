
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.GridLayout;
import utils.ConsumoAPI;


public class DetalleDigimones extends javax.swing.JPanel {
    
    ConsumoAPI consumo;
    
    public DetalleDigimones(int Pagina_actual) {
        this.consumo = new ConsumoAPI();
        initComponents();
        cargarImagenDigimones();
    }
    
    
    
    public void cargarImagenDigimones(){
        contentPrincipal.setLayout(new GridLayout(2, 3)); 
        
        String endpoint = "https://digi-api.com/api/v1/digimon?page=0";
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray content = dataJson.getAsJsonArray("content");
       

        for (int i=0; i<content.size(); i++) {
            JsonObject temp = content.get(i).getAsJsonObject();
            
            mini_detalle panelsito = new mini_detalle( temp.get("href").getAsString() );
            
            
           contentPrincipal.add(panelsito);
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
