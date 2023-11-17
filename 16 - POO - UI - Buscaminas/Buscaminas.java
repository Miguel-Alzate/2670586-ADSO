import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Buscaminas extends JFrame{

    public Buscaminas(){
        initComponents();
    }

    public void initComponents(){
        setTitle("BuscaMinas");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") )); // Imagen de la ventana
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(235,235,235));
        contenedor.setLayout(new GridBagLayout());

        GridBagConstraints restricciones = new GridBagConstraints(); // Layout

        JLabel etq_etiqueta_1 = new JLabel();
        etq_etiqueta_1.setText("020");
        etq_etiqueta_1.setBackground(Color.BLACK);
        etq_etiqueta_1.setOpaque(true);
        etq_etiqueta_1.setFont(new Font("Arial", Font.BOLD, 30));
        etq_etiqueta_1.setForeground(Color.RED);
        etq_etiqueta_1.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 2;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_etiqueta_1, restricciones);

        // ImageIcon para la imagen
        ImageIcon imagenHappy = new ImageIcon(ClassLoader.getSystemResource("imagenes/icono_happy.png"));
        Image img = imagenHappy.getImage();
        Image nuevaImagen = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Ajusta el tamaño a 30x30
        ImageIcon imagenRedimensionada = new ImageIcon(nuevaImagen);
        JButton imagenButton = new JButton(imagenRedimensionada);
        imagenButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Sin borde alrededor de la imagen
        restricciones.gridx = 3;
        restricciones.gridy = 0;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(imagenButton,restricciones);

        JLabel etq_etiqueta_2 = new JLabel();
        etq_etiqueta_2.setText("000");
        etq_etiqueta_2.setBackground(Color.BLACK);
        etq_etiqueta_2.setOpaque(true);
        etq_etiqueta_2.setFont(new Font("Arial", Font.BOLD, 30));
        etq_etiqueta_2.setForeground(Color.RED);
        etq_etiqueta_2.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 6;
        restricciones.gridy = 0;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 2;
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_etiqueta_2, restricciones);


        //Botones
        for (int i = 0; i < 81; i++) {
            JButton boton = new JButton();
            boton.setPreferredSize(new Dimension(30, 30)); // Tamaño del botón ajustado
            restricciones.gridx = i % 9;  // Columna en la cuadrícula
            restricciones.gridy = i / 9 + 2;  // Fila en la cuadrícula
            restricciones.gridwidth = 1;
            restricciones.gridheight = 1;
            restricciones.weightx = 1;
            restricciones.weighty = 5;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.insets = new Insets(0, 0, 0, 0);
            contenedor.add(boton, restricciones);
        }
        
        add(contenedor);
        setVisible(true);
        revalidate();
    }
}