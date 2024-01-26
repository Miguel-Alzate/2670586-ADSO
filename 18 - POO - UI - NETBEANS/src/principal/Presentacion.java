
package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Presentacion extends JFrame{
        
    public Presentacion(){
        initComponents();
    }
    public void initComponents(){
        setTitle("Presentacion");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        
        JLabel titulo = new JLabel();
        titulo.setText("FORMULARIO");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        contenedor.add(titulo);
        
        JTextField campo_nombre = new JTextField();
        contenedor.add(campo_nombre);
        
        JButton btn_iniciar = new JButton();
        btn_iniciar.setText("INICIAR");
        contenedor.add(btn_iniciar);
        
        JLabel etq_respuesta = new JLabel();
        contenedor.add(etq_respuesta);
        
        
        //Eventos

       btn_iniciar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
              
               campo_nombre.setText("");
            }
       });
        
        
        
        add(contenedor);
        setVisible(true);
        revalidate();
    }
    //Metodos
   
}
