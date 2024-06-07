
package principal;

import java.awt.Image;
import javax.swing.ImageIcon;

public class DigiAPI extends javax.swing.JFrame {
    
    int pagina;
    
    public DigiAPI() {
        this.pagina = 1;
        initComponents();
        initAlternComponents();
        cargarDigimones();
    }

    public void initAlternComponents(){
        setTitle("DIGIMON");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_ventana.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        Image icono_central = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digilogo.png"));
        icono_central = icono_central.getScaledInstance(200, 95, Image.SCALE_SMOOTH);
        etq_logo_central.setIcon(new ImageIcon(icono_central));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etq_logo_central = new javax.swing.JLabel();
        panel_digimones = new javax.swing.JPanel();
        panel_paginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etq_logo_central.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_logo_central.setToolTipText("");

        javax.swing.GroupLayout panel_digimonesLayout = new javax.swing.GroupLayout(panel_digimones);
        panel_digimones.setLayout(panel_digimonesLayout);
        panel_digimonesLayout.setHorizontalGroup(
            panel_digimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        panel_digimonesLayout.setVerticalGroup(
            panel_digimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_paginadorLayout = new javax.swing.GroupLayout(panel_paginador);
        panel_paginador.setLayout(panel_paginadorLayout);
        panel_paginadorLayout.setHorizontalGroup(
            panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_paginadorLayout.setVerticalGroup(
            panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_digimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_paginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_logo_central, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_logo_central, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_digimones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_paginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
    
    public void cargarDigimones(){
   
        panel_digimones.removeAll();
        DetalleDigimones detalle = new DetalleDigimones(pagina);
        detalle.setSize( panel_digimones.getSize() );
        detalle.setPreferredSize( panel_digimones.getPreferredSize() );
        panel_digimones.add(detalle);
        
        revalidate();
        repaint();
    
    }
   
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_logo_central;
    private javax.swing.JPanel panel_digimones;
    private javax.swing.JPanel panel_paginador;
    // End of variables declaration//GEN-END:variables
}
