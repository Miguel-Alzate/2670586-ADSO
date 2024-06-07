
package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DigiAPI extends javax.swing.JFrame {
    
    int pagina;
    int totalPaginas = 292;
    int paginas_visibles = 7;
    
    public DigiAPI() {
        this.pagina = 1;
        initComponents();
        initAlternComponents();
        cargarDigimones();
        cargarPaginador();
    }

    public void initAlternComponents(){
        setTitle("DIGIMON");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_ventana.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        setResizable(false);
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
        panelPaginador = new javax.swing.JPanel();

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

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_digimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
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
    
    public void cargarDigimones(){
   
        panel_digimones.removeAll();
        DetalleDigimones detalle = new DetalleDigimones(pagina-1);
        detalle.setSize( panel_digimones.getSize() );
        detalle.setPreferredSize( panel_digimones.getPreferredSize() );
        panel_digimones.add(detalle);
        
        revalidate();
        repaint();
    
    }
    
    public void cargarPaginador() {
        int mitad_paginas_visibles = paginas_visibles / 2;

        int pagina_inicial = Math.max(1, pagina - mitad_paginas_visibles);
        int pagina_final = Math.min(totalPaginas, pagina + mitad_paginas_visibles);

        if (pagina_final - pagina_inicial + 1 < paginas_visibles) {
            if (pagina_inicial == 1) {
                pagina_final = Math.min(totalPaginas, pagina_inicial + paginas_visibles - 1);
            } else if (pagina_final == totalPaginas) {
                pagina_inicial = Math.max(1, pagina_final - paginas_visibles + 1);
            }
        }

        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());

        JButton btn_primer_pagina = new JButton("<<");
        btn_primer_pagina.setEnabled(pagina != 1);
        btn_primer_pagina.addActionListener(e -> {
            pagina = 1;
            cargarDigimones();
            cargarPaginador();
        });
        configurarBotonPaginador(btn_primer_pagina);
        panelPaginador.add(btn_primer_pagina);

        JButton btn_pagina_atras = new JButton("<");
        btn_pagina_atras.setEnabled(pagina != 1);
        btn_pagina_atras.addActionListener(e -> {
            pagina = Math.max(1, pagina - 1);
            cargarDigimones();
            cargarPaginador();
        });
        configurarBotonPaginador(btn_pagina_atras);
        panelPaginador.add(btn_pagina_atras);

        for (int i = pagina_inicial; i <= pagina_final; i++) {
            JButton botonPagina = new JButton(String.valueOf(i));
            configurarBotonPaginador(botonPagina);
            if (i == pagina) {
                botonPagina.setBackground(Color.BLUE);
                botonPagina.setForeground(Color.WHITE);
            }

            final int pageNumber = i;
            botonPagina.addActionListener(e -> {
                pagina = pageNumber;
                cargarDigimones();
                cargarPaginador();
            });

            panelPaginador.add(botonPagina);
        }

        JButton btn_pagina_siguiente = new JButton(">");
        btn_pagina_siguiente.setEnabled(pagina != totalPaginas);
        btn_pagina_siguiente.addActionListener(e -> {
            pagina = Math.min(totalPaginas, pagina + 1);
            cargarDigimones();
            cargarPaginador();
        });
        configurarBotonPaginador(btn_pagina_siguiente);
        panelPaginador.add(btn_pagina_siguiente);

        JButton btn_ultima_pagina = new JButton(">>");
        btn_ultima_pagina.setEnabled(pagina != totalPaginas);
        btn_ultima_pagina.addActionListener(e -> {
            pagina = totalPaginas;
            cargarDigimones();
            cargarPaginador();
        });
        configurarBotonPaginador(btn_ultima_pagina);
        panelPaginador.add(btn_ultima_pagina);

        panelPaginador.add(Box.createHorizontalGlue());
        repaint();
        revalidate();
    }

    private void configurarBotonPaginador(JButton boton) {
        boton.setContentAreaFilled(true);
        boton.setFocusPainted(true);
        boton.setBackground(new Color(255, 255, 255));
        boton.setForeground(new Color(0, 0, 0));
        boton.setFont(new Font("Arial", Font.BOLD, 14));
    }
   
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_logo_central;
    private javax.swing.JPanel panelPaginador;
    private javax.swing.JPanel panel_digimones;
    // End of variables declaration//GEN-END:variables
}
