import javax.swing.*;
import java.awt.*;

public class Principal{
    public static void main (String [] args){

        Dimension size = new Dimension(720, 480); // Instanciar objeto de tamaño
        JFrame ventana_01 = new JFrame(); // Instanciar objeto ventana

        ventana_01.setTitle("Primer Ventana"); // Titulo de la ventana
        ventana_01.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // Cambiar metodo de cerrar la ventana
        ventana_01.setSize(size); // Establecer tamaño de ventana al abrirse
        ventana_01.setResizable(true); // Activar el redimensionar ventana (true o false)
        ventana_01.setLocation( 720, 480); // Establecer lugar o posicion donde se pondra la ventana
        ventana_01.setLocationRelativeTo(null); //Establecer lugar o posicion de ventana en el medio
        ventana_01.setVisible(true); // Establecer visibilidad de la ventana (true o false)

        JPanel contenedor  = new JPanel(); // Crear contenedor
        contenedor.setBackground( Color.WHITE ); // Cambiar color de fondo a rojo

        JLabel etiqueta_titulo = new JLabel();
        etiqueta_titulo.setText("TITULO");
        etiqueta_titulo.setOpaque(true);
        etiqueta_titulo.setBackground(Color.BLUE);
        
        etiqueta_titulo.setFont(new Font("Tahoma",Font.BOLD, 50));

        JLabel etiqueta_cedula = new JLabel();
        etiqueta_cedula.setText("Cedula:");
        etiqueta_cedula.setFont(new Font("Arial",Font.PLAIN, 20));

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(11);

        JLabel etiqueta_nombre = new JLabel();
        etiqueta_nombre.setText("Nombre:");
        etiqueta_nombre.setFont(new Font("Arial",Font.PLAIN, 20));

        JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(11);

        JLabel etiqueta_apellido = new JLabel();
        etiqueta_apellido.setText("Apellido:");
        etiqueta_apellido.setFont(new Font("Arial",Font.PLAIN, 20));

        JTextField campo_apellido = new JTextField();
        campo_apellido.setColumns(11);

        JButton boton_enviar = new JButton("Enviar");
        boton_enviar.setBackground(Color.GRAY);
        


        

        contenedor.add ( etiqueta_titulo ); // Añadimos la etiqueta al contenedor
        contenedor.add ( etiqueta_cedula );
        contenedor.add ( campo_cedula );
        contenedor.add ( etiqueta_nombre );
        contenedor.add ( campo_nombre );
        contenedor.add ( etiqueta_apellido );
        contenedor.add ( campo_apellido );
        contenedor.add ( boton_enviar );
        ventana_01.add ( contenedor ); // Añadimos el contenedor a la ventana
        ventana_01.revalidate(); // Renderizado de imagen

        //ventana_01.repaint(); // Renderizado de imagen
        //ventana_01.pack(); //Renderizado de imagen y ajusta ventana dependiendo del contenido

        
        
    }
}