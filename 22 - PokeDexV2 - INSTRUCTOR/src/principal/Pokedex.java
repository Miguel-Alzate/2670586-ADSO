package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    
    int [] lista_numeros = new int[]{1,2,3,4,5,6,7};
    
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 1;
        
        initComponents();
        initAlternComponents();
        cargarPokemones();
        

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new javax.swing.BoxLayout(panelBotones, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        
     
    }
    
    public void cargarPokemones(){
        panelBotones.removeAll();
        int offset = (pagina*20)-20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
        String data = this.consumo.consumoGET(endpoint);
        
     
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        
        panelBotones.setLayout(new GridLayout(0, 1)); 
        
        for (int i=0; i<results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();
            
            JButton btn = new JButton( temp.get("name").getAsString() );
            btn.setContentAreaFilled(true);
            btn.setFocusPainted(true);
            btn.setBackground(new Color(255, 255, 255));
            btn.setForeground(new Color(0, 0, 0));
            btn.setFont(new Font("Arial", Font.BOLD, 14));
            panelBotones.add(btn);
            
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: "+ temp.get("name").getAsString());
                    System.out.println("Url: "+temp.get("url").getAsString());
                    
                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon( temp );
                    detalle.setSize( panelDetalle.getSize() );
                    detalle.setPreferredSize( panelDetalle.getPreferredSize() );
                    panelDetalle.add(detalle);
                    
                    revalidate();
                    repaint();
                }
            });
        }
        
        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon( results.get(0).getAsJsonObject() );
        detalle.setSize( panelDetalle.getSize() );
        detalle.setPreferredSize( panelDetalle.getPreferredSize() );
        panelDetalle.add(detalle);
        
        revalidate();
        repaint();
        cargarPaginador();
    }
    
    
   public void cargarPaginador() {
    int totalPaginas = 66;
    int startPage = Math.max(1, pagina - 3);
    int endPage = Math.min(totalPaginas, pagina + 3);

    for (int i = 0; i < lista_numeros.length; i++) {
        lista_numeros[i] = startPage + i;
        if (lista_numeros[i] > totalPaginas) {
            lista_numeros[i] = -1;
        }
    }

    panelPaginador.removeAll();
    panelPaginador.add(Box.createHorizontalGlue());

    JButton btn_primer_pagina = new JButton("<<");
    btn_primer_pagina.setEnabled(pagina != 1);
    btn_primer_pagina.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pagina = 1;
            cargarPokemones();
        }
    });
    btn_primer_pagina.setContentAreaFilled(true);
    btn_primer_pagina.setFocusPainted(true);
    btn_primer_pagina.setBackground(new Color(255, 255, 255));
    btn_primer_pagina.setForeground(new Color(0, 0, 0));
    btn_primer_pagina.setFont(new Font("Arial", Font.BOLD, 14));
    panelPaginador.add(btn_primer_pagina);

    JButton btn_pagina_atras = new JButton("<");
    btn_pagina_atras.setEnabled(pagina != 1);
    btn_pagina_atras.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pagina = Math.max(1, pagina - 1);
            cargarPokemones();
        }
    });
    btn_pagina_atras.setContentAreaFilled(true);
    btn_pagina_atras.setFocusPainted(true);
    btn_pagina_atras.setBackground(new Color(255, 255, 255));
    btn_pagina_atras.setForeground(new Color(0, 0, 0));
    btn_pagina_atras.setFont(new Font("Arial", Font.BOLD, 14));
    panelPaginador.add(btn_pagina_atras);

    for (int i = 0; i < lista_numeros.length; i++) {
        if (lista_numeros[i] == -1) {
            continue;
        }
        JButton botones = new JButton(String.valueOf(lista_numeros[i]));
        botones.setContentAreaFilled(true);
        botones.setFocusPainted(true);
        botones.setBackground(new Color(255, 255, 255));
        botones.setForeground(new Color(0, 0, 0));
        botones.setFont(new Font("Arial", Font.BOLD, 14));
        panelPaginador.add(botones);
        if (lista_numeros[i] == pagina) {
            botones.setBackground(Color.BLUE);
            botones.setForeground(Color.WHITE);
        }

        final int pageNumber = lista_numeros[i];

        botones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = pageNumber;
                cargarPokemones();
            }
        });
    }

    JButton btn_pagina_siguiente = new JButton(">");
    btn_pagina_siguiente.setEnabled(pagina != totalPaginas);
    btn_pagina_siguiente.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pagina = Math.min(totalPaginas, pagina + 1);
            cargarPokemones();
        }
    });
    btn_pagina_siguiente.setContentAreaFilled(true);
    btn_pagina_siguiente.setFocusPainted(true);
    btn_pagina_siguiente.setBackground(new Color(255, 255, 255));
    btn_pagina_siguiente.setForeground(new Color(0, 0, 0));
    btn_pagina_siguiente.setFont(new Font("Arial", Font.BOLD, 14));
    panelPaginador.add(btn_pagina_siguiente);

    JButton btn_ultima_pagina = new JButton(">>");
    btn_ultima_pagina.setEnabled(pagina != totalPaginas);
    btn_ultima_pagina.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pagina = totalPaginas;
            cargarPokemones();
        }
    });
    btn_ultima_pagina.setContentAreaFilled(true);
    btn_ultima_pagina.setFocusPainted(true);
    btn_ultima_pagina.setBackground(new Color(255, 255, 255));
    btn_ultima_pagina.setForeground(new Color(0, 0, 0));
    btn_ultima_pagina.setFont(new Font("Arial", Font.BOLD, 14));
    panelPaginador.add(btn_ultima_pagina);

    panelPaginador.add(Box.createHorizontalGlue());
    repaint();
    revalidate();
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
