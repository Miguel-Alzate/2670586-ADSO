
package principal;

import javax.swing.table.DefaultTableModel;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import javax.swing.ImageIcon;

public class PokeAPI extends javax.swing.JFrame {

    DefaultTableModel  modelo;
    String anteriorEndPoint;
    String siguienteEndPoint;
    int paginaActual = 1;
    String texto = "Numero de página: ";
    String aux;
    int pagina_temp = 1;
    JsonObject URL_actual_pokemon;
    int contador_imagenes = 1;
  
    public PokeAPI() {
        initComponents();
        initAlternComponents();
        consumoAPI();
    }
    
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")));
        
        Image icono_izquierda = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_atras.png"));
        icono_izquierda = icono_izquierda.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        etq_atras.setIcon(new ImageIcon(icono_izquierda));
        etq_atras.setBorderPainted(false);
        etq_atras.setContentAreaFilled(false);
        
        Image icono_derecha = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_siguiente.png"));
        icono_derecha = icono_derecha.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        etq_adelante.setIcon(new ImageIcon(icono_derecha));
        etq_adelante.setBorderPainted(false); 
        etq_adelante.setContentAreaFilled(false);
        
        modelo = (DefaultTableModel) lista_habilidades.getModel();
        
        lista_habilidades.getTableHeader().setReorderingAllowed(false);
        lista_habilidades.getTableHeader().setResizingAllowed(false);
       
        lista_habilidades.getColumnModel().getColumn(0).setPreferredWidth(50);
        lista_habilidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        lista_habilidades.getColumnModel().getColumn(2).setPreferredWidth(250);
             
        repaint();
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista_pokemones = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_nombre_pokemon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_habilidades = new javax.swing.JTable();
        etq_img_pokemon = new javax.swing.JLabel();
        panel_paginador = new javax.swing.JPanel();
        btn_atras_total = new javax.swing.JButton();
        btn_adelante_total = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_adelante = new javax.swing.JButton();
        etq_num_pagina = new javax.swing.JLabel();
        etq_atras = new javax.swing.JButton();
        etq_adelante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lista_pokemonesLayout = new javax.swing.GroupLayout(lista_pokemones);
        lista_pokemones.setLayout(lista_pokemonesLayout);
        lista_pokemonesLayout.setHorizontalGroup(
            lista_pokemonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        lista_pokemonesLayout.setVerticalGroup(
            lista_pokemonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(lista_pokemones);

        etq_titulo.setBackground(new java.awt.Color(255, 255, 255));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 37)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 0, 0));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("POKEDEX");

        etq_nombre_pokemon.setBackground(new java.awt.Color(255, 255, 255));
        etq_nombre_pokemon.setFont(new java.awt.Font("Arial", 1, 31)); // NOI18N
        etq_nombre_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre_pokemon.setText("Hola!");

        lista_habilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Habilidad", "Url"
            }
        ));
        jScrollPane2.setViewportView(lista_habilidades);

        etq_img_pokemon.setBackground(new java.awt.Color(255, 255, 255));
        etq_img_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_img_pokemon.setText("the game");

        panel_paginador.setBackground(new java.awt.Color(204, 204, 204));

        btn_atras_total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_atras_total.setText("<<");
        btn_atras_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atras_totalActionPerformed(evt);
            }
        });

        btn_adelante_total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_adelante_total.setText(">>");
        btn_adelante_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adelante_totalActionPerformed(evt);
            }
        });

        btn_atras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_atras.setText("<");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_adelante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_adelante.setText(">");
        btn_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adelanteActionPerformed(evt);
            }
        });

        etq_num_pagina.setBackground(new java.awt.Color(255, 255, 255));
        etq_num_pagina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout panel_paginadorLayout = new javax.swing.GroupLayout(panel_paginador);
        panel_paginador.setLayout(panel_paginadorLayout);
        panel_paginadorLayout.setHorizontalGroup(
            panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paginadorLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btn_atras_total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(etq_num_pagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_adelante_total)
                .addGap(57, 57, 57))
        );
        panel_paginadorLayout.setVerticalGroup(
            panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_paginadorLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panel_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adelante_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_num_pagina))
                .addGap(14, 14, 14))
        );

        etq_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etq_atrasActionPerformed(evt);
            }
        });

        etq_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etq_adelanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_paginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(etq_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(etq_img_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(etq_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(etq_nombre_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_nombre_pokemon)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(etq_img_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(etq_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(etq_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_paginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        cambiarPagina(-1);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_atras_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atras_totalActionPerformed
        cambiarPagina(-1);
    }//GEN-LAST:event_btn_atras_totalActionPerformed

    private void btn_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adelanteActionPerformed
        cambiarPagina(1);
    }//GEN-LAST:event_btn_adelanteActionPerformed

    private void btn_adelante_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adelante_totalActionPerformed
        cambiarPagina(1);
    }//GEN-LAST:event_btn_adelante_totalActionPerformed

    private void etq_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etq_atrasActionPerformed
        contador_imagenes --;
        if(contador_imagenes == 1){
            try {
                JsonObject sprites = URL_actual_pokemon.getAsJsonObject("sprites");
                String imgUrl = sprites.get("other").getAsJsonObject()
                                .getAsJsonObject("official-artwork")
                                .get("front_default").getAsString();

                Image image = ImageIO.read(new URL(imgUrl));

                Image resizedImage = image.getScaledInstance(272, 254, Image.SCALE_SMOOTH);
                etq_img_pokemon.setIcon(new ImageIcon(resizedImage));
                etq_img_pokemon.setText("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(contador_imagenes == 2){
            
            System.out.println("url:" +URL_actual_pokemon);
            try {
                JsonObject sprites = URL_actual_pokemon.getAsJsonObject("sprites");
                  String imgUrl = sprites.get("other").getAsJsonObject()
                                .getAsJsonObject("official-artwork")
                                .get("front_shiny").getAsString();

                Image image = ImageIO.read(new URL(imgUrl));

                Image resizedImage = image.getScaledInstance(260, 245, Image.SCALE_SMOOTH);
                etq_img_pokemon.setIcon(new ImageIcon(resizedImage));
                etq_img_pokemon.setText("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         
        if(contador_imagenes == 1){
            etq_atras.setEnabled(false);
        }
        
        if(contador_imagenes != 1){
            etq_atras.setEnabled(true);
        }
        
        etq_adelante.setEnabled(true);
        
    }//GEN-LAST:event_etq_atrasActionPerformed

    private void etq_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etq_adelanteActionPerformed
        contador_imagenes ++;
        if(contador_imagenes == 2){
            try {
                JsonObject sprites = URL_actual_pokemon.getAsJsonObject("sprites");
                String imgUrl = sprites.get("other").getAsJsonObject()
                                .getAsJsonObject("official-artwork")
                                .get("front_shiny").getAsString();

                Image image = ImageIO.read(new URL(imgUrl));

                Image resizedImage = image.getScaledInstance(272, 254, Image.SCALE_SMOOTH);
                etq_img_pokemon.setIcon(new ImageIcon(resizedImage));
                etq_img_pokemon.setText("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(contador_imagenes == 3){
            
            System.out.println("url:" +URL_actual_pokemon);
            try {
                JsonObject sprites = URL_actual_pokemon.getAsJsonObject("sprites");
                String imgUrl = sprites.get("other").getAsJsonObject()
                                .getAsJsonObject("home")
                                .get("front_default").getAsString();

                Image image = ImageIO.read(new URL(imgUrl));

                Image resizedImage = image.getScaledInstance(260, 245, Image.SCALE_SMOOTH);
                etq_img_pokemon.setIcon(new ImageIcon(resizedImage));
                etq_img_pokemon.setText("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         
        if(contador_imagenes == 3){
            etq_adelante.setEnabled(false);
        }
        
        if(contador_imagenes != 3){
            etq_adelante.setEnabled(true);
        }
        
        etq_atras.setEnabled(true);
    }//GEN-LAST:event_etq_adelanteActionPerformed
    
    public void cambiarPagina(int numero) {
    String texto = "Número de página: ";
    
  
    paginaActual += numero;
    pagina_temp += numero;

  
    aux = texto + pagina_temp;
    etq_num_pagina.setText(aux);
    
  
    btn_atras.setEnabled(paginaActual != 1);
    btn_atras_total.setEnabled(paginaActual != 1);
    btn_adelante.setEnabled(paginaActual != 67);
    btn_adelante_total.setEnabled(paginaActual != 67);
    
    
    if (numero == -1 && anteriorEndPoint != null) {
        consumirPaginaActual(anteriorEndPoint);
    } else if (numero == 1 && siguienteEndPoint != null) {
        consumirPaginaActual(siguienteEndPoint);
    }
    }
    
    public void consumirPaginaActual(String endpoint) {
    try {
        URL url = new URL(endpoint);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
            
            
            anteriorEndPoint = jsonResponse.has("previous") && !jsonResponse.get("previous").isJsonNull()
                                ? jsonResponse.get("previous").getAsString() : null;
            
           
            siguienteEndPoint = jsonResponse.has("next") && !jsonResponse.get("next").isJsonNull()
                                ? jsonResponse.get("next").getAsString() : null;

            lista_pokemones.removeAll(); 
            lista_pokemones.setLayout(new GridLayout(0, 1)); 

            JsonArray results = jsonResponse.getAsJsonArray("results");
            for (int i = 0; i < results.size(); i++) {
                JsonObject pokemon = results.get(i).getAsJsonObject();
                String pokemonName = pokemon.get("name").getAsString();
                String pokemonUrl = pokemon.get("url").getAsString();
                JButton button = new JButton(pokemonName);
                button.setContentAreaFilled(false);
                button.setFocusPainted(true);
                button.setBackground(new Color(255, 255, 255));
                button.setForeground(new Color(0, 0, 0));
                button.setFont(new Font("Arial", Font.BOLD, 14));
                button.addActionListener(e -> cargarDetalle(pokemonUrl));
                lista_pokemones.add(button);
            }

            lista_pokemones.revalidate();
            lista_pokemones.repaint();
        } else {
            System.out.println("GET request not worked");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    public void consumoAPI() {
    String endpoint = "https://pokeapi.co/api/v2/pokemon";
    try 
    {
        URL url = new URL(endpoint);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
    
            
            }
            in.close();

            JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
            
            
            anteriorEndPoint = jsonResponse.has("previous") && !jsonResponse.get("previous").isJsonNull()
                                ? jsonResponse.get("previous").getAsString() : null;
            
          
            siguienteEndPoint = jsonResponse.has("next") && !jsonResponse.get("next").isJsonNull()
                                ? jsonResponse.get("next").getAsString() : null;

            JsonArray results = jsonResponse.getAsJsonArray("results");
                       
            lista_pokemones.removeAll(); 
            lista_pokemones.setLayout(new GridLayout(0, 1)); 

            for (int i = 0; i < results.size(); i++) {
                JsonObject pokemon = results.get(i).getAsJsonObject();
                String pokemonName = pokemon.get("name").getAsString();
                String pokemonUrl = pokemon.get("url").getAsString();
                JButton button = new JButton(pokemonName);
                button.setContentAreaFilled(false);
                button.setFocusPainted(true);
                button.setBackground(new Color(255, 255, 255));
                button.setForeground(new Color(0, 0, 0));
                button.setFont(new Font("Arial", Font.BOLD, 14));
                button.addActionListener(e -> cargarDetalle(pokemonUrl));
                lista_pokemones.add(button);
            }

            lista_pokemones.revalidate();
            lista_pokemones.repaint();

            aux = texto + pagina_temp;
            etq_num_pagina.setText(aux);
            btn_atras.setEnabled(false);
            btn_atras_total.setEnabled(false);

        } else {
            System.out.println("GET request not worked");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public void cargarDetalle(String endpoint) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                JsonObject data = JsonParser.parseString(response.toString()).getAsJsonObject();
                contador_imagenes = 1;
                etq_adelante.setEnabled(true);
                etq_atras.setEnabled(false);
                URL_actual_pokemon = data;
                etq_nombre_pokemon.setText(data.get("name").getAsString().toUpperCase());


                JsonObject sprites = data.getAsJsonObject("sprites");
                String imgUrl = sprites.get("other").getAsJsonObject()
                                .getAsJsonObject("official-artwork")
                                .get("front_default").getAsString();

                Image image = ImageIO.read(new URL(imgUrl));

                Image resizedImage = image.getScaledInstance(272, 254, Image.SCALE_SMOOTH);
                etq_img_pokemon.setIcon(new ImageIcon(resizedImage));
                etq_img_pokemon.setText("");

                modelo.setRowCount(0);
                JsonArray abilities = data.getAsJsonArray("abilities");
                for (int i = 0; i < abilities.size(); i++) {
                    JsonObject ability = abilities.get(i).getAsJsonObject().getAsJsonObject("ability");
                    modelo.addRow(new Object[]{i + 1, ability.get("name").getAsString(), ability.get("url").getAsString()});
                }
            } else {
                System.out.println("GET request not worked");
            }
        } catch (Exception e) {
            e.printStackTrace();
            etq_img_pokemon.setIcon(null);
            etq_img_pokemon.setText("Image Load Error");
        }
    }
    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adelante;
    private javax.swing.JButton btn_adelante_total;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_atras_total;
    private javax.swing.JButton etq_adelante;
    private javax.swing.JButton etq_atras;
    private javax.swing.JLabel etq_img_pokemon;
    private javax.swing.JLabel etq_nombre_pokemon;
    private javax.swing.JLabel etq_num_pagina;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lista_habilidades;
    private javax.swing.JPanel lista_pokemones;
    private javax.swing.JPanel panel_paginador;
    // End of variables declaration//GEN-END:variables
}
