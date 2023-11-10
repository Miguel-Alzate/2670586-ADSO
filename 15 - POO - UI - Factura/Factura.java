import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factura extends JFrame{

    public Factura (){
        initComponents();
    }

    public void initComponents(){
        setTitle("Factura");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder
        (20, 20, 20, 20));
        contenedor.setBackground(new Color(255, 255, 255));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("DATOS CLIENTE");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 15));
        etq_titulo.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_titulo, restricciones);

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA:");
        etq_cedula.setFont(new Font("Arial", Font.BOLD, 10));
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 0;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(1,0,2,0);
        contenedor.add(etq_cedula,restricciones);

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(10);
        campo_cedula.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(1,0,0,6);
        contenedor.add(campo_cedula, restricciones);
        restricciones.insets = new Insets(0,0,0,0);


        JButton btn_boton = new JButton();
        btn_boton.setText("ENVIAR");
        restricciones.gridx = 5;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,1,0,0);
        contenedor.add(btn_boton, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_nombre = new JLabel();
        etq_nombre.setText("NOMBRES:");
        etq_nombre.setFont(new Font("Arial", Font.BOLD, 10));
        etq_nombre.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(1,0,2,0);
        contenedor.add(etq_nombre,restricciones);

        JTextField campo_nombres = new JTextField();
        campo_nombres.setColumns(10);
        campo_nombres.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(1,0,0,6);
        contenedor.add(campo_nombres, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION:");
        etq_direccion.setFont(new Font("Arial", Font.BOLD, 10));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(1,0,2,0);
        contenedor.add(etq_direccion,restricciones);

        JTextField campo_direccion = new JTextField();
        campo_direccion.setColumns(10);
        campo_direccion.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(1,0,0,6);
        contenedor.add(campo_direccion, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_titulo2 = new JLabel();
        etq_titulo2.setText("DATOS VENDEDOR");
        etq_titulo2.setFont(new Font("Arial", Font.BOLD, 15));
        etq_titulo2.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(1,0,2,0);
        contenedor.add(etq_titulo2, restricciones);

        JLabel etq_cedula2 = new JLabel();
        etq_cedula2.setText("CEDULA:");
        etq_cedula2.setFont(new Font("Arial", Font.BOLD, 10));
        etq_cedula2.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 0;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(1,0,2,0);
        contenedor.add(etq_cedula2,restricciones);

        JTextField campo_cedula2 = new JTextField();
        campo_cedula2.setColumns(10);
        campo_cedula2.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,0,0,0);
        contenedor.add(campo_cedula2, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton button2 = new JButton();
        button2.setText("ENVIAR");
        button2.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 5;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,0,0,0);
        contenedor.add(button2, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_nombre2 = new JLabel();
        etq_nombre2.setText("NOMBRES:");
        etq_nombre2.setFont(new Font("Arial", Font.BOLD, 10));
        etq_nombre2.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 15;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(1,0,2,0);
        contenedor.add(etq_nombre2,restricciones);

        JTextField campo_nombres_vendedor = new JTextField();
        campo_nombres_vendedor.setColumns(10);
        campo_nombres_vendedor.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(1,0,0,6);
        contenedor.add(campo_nombres_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_titulo3 = new JLabel();
        etq_titulo3.setText("LISTA PRODUCTOS FACTURADOS:");
        etq_titulo3.setFont(new Font("Arial", Font.BOLD, 15));
        etq_titulo3.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(4,0,3,0);
        contenedor.add(etq_titulo3, restricciones);

        JLabel etq_nombre3 = new JLabel();
        etq_nombre3.setText("ID");
        etq_nombre3.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombre3.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_nombre3,restricciones);

        JTextField C_blanco1 = new JTextField();
        C_blanco1.setColumns(10);
        C_blanco1.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,0,0,0);
        contenedor.add(C_blanco1, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel etq_nombre4 = new JLabel();
        etq_nombre4.setText("NOMBRES");
        etq_nombre4.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombre4.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(etq_nombre4,restricciones);

        JTextField C_blanco2 = new JTextField();
        C_blanco2.setColumns(10);
        C_blanco2.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,0,0,0);
        contenedor.add(C_blanco2, restricciones);
        restricciones.insets = new Insets(0,0,0,0);


        JLabel etq_nombre5 = new JLabel();
        etq_nombre5.setText("CANTIDAD");
        etq_nombre5.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombre5.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 2;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,130,0,0);
        contenedor.add(etq_nombre5,restricciones);


        JTextField C_blanco3 = new JTextField();
        C_blanco3.setColumns(10);
        C_blanco3.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 2;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,130,0,0);
        contenedor.add(C_blanco3, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JButton button3 = new JButton();
        button3.setText("ADD");
        restricciones.gridx = 5;
        restricciones.gridy = 9;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.insets = new Insets(0,0,0,0);
        contenedor.add(button3, restricciones);
        restricciones.insets = new Insets(0,0,0,0);


        JLabel campo_grande = new JLabel();
        JScrollPane scroll = new JScrollPane(campo_grande);
        campo_grande.setFont (new Font ("Arial", Font.BOLD, 18));
        campo_grande.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 90;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones);



        add(contenedor);
        setVisible(true);
        revalidate();
    }


} 