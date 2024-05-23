
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


public class PokeAPI extends javax.swing.JFrame {

    DefaultTableModel  modelo;
    
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_pokemones = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        etq_nombre_pokemon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_habilidades = new javax.swing.JTable();
        etq_img_pokemon = new javax.swing.JLabel();

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
        etq_nombre_pokemon.setForeground(new java.awt.Color(0, 0, 0));
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
        etq_img_pokemon.setForeground(new java.awt.Color(0, 0, 0));
        etq_img_pokemon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_img_pokemon.setText("the game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_nombre_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(etq_img_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etq_nombre_pokemon)
                        .addGap(38, 38, 38)
                        .addComponent(etq_img_pokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void consumoAPI() {
        String endpoint = "https://pokeapi.co/api/v2/pokemon";
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
                JsonArray results = jsonResponse.getAsJsonArray("results");

                lista_pokemones.removeAll();
                lista_pokemones.setLayout(new java.awt.GridLayout(0, 1)); // Set layout to a single column grid

                for (int i = 0; i < results.size(); i++) {
                    JsonObject pokemon = results.get(i).getAsJsonObject();
                    String pokemonName = pokemon.get("name").getAsString();
                    String pokemonUrl = pokemon.get("url").getAsString();
                    JButton button = new JButton(pokemonName);
                    // Aplicar estilo al botón usando HTML y CSS
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
    private javax.swing.JLabel etq_img_pokemon;
    private javax.swing.JLabel etq_nombre_pokemon;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lista_habilidades;
    private javax.swing.JPanel lista_pokemones;
    // End of variables declaration//GEN-END:variables
}
