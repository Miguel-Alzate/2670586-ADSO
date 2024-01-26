
package principal;


public class PresentacionV2 extends javax.swing.JFrame {

    
    public PresentacionV2() {
        initComponents();
        setVisible(true);
        
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PRUEBAA = new javax.swing.JLabel();
        ContenedorTitulo = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        ContenedorPrincipal = new javax.swing.JPanel();
        etq_tabla = new javax.swing.JLabel();
        campo_tabla = new javax.swing.JTextField();
        etq_multiplos = new javax.swing.JLabel();
        campo_multiplos = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        boton_iniciar = new javax.swing.JButton();
        respuesta = new java.awt.ScrollPane();
        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();
        test = new javax.swing.JLabel();

        PRUEBAA.setText("23232323");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presentacion_V2");
        setResizable(false);

        ContenedorTitulo.setBackground(new java.awt.Color(102, 153, 255));
        ContenedorTitulo.setForeground(new java.awt.Color(51, 51, 255));

        etq_titulo.setBackground(new java.awt.Color(0, 153, 255));
        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("TABLA DE MULTIPLICAR");

        javax.swing.GroupLayout ContenedorTituloLayout = new javax.swing.GroupLayout(ContenedorTitulo);
        ContenedorTitulo.setLayout(ContenedorTituloLayout);
        ContenedorTituloLayout.setHorizontalGroup(
            ContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContenedorTituloLayout.setVerticalGroup(
            ContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorTituloLayout.createSequentialGroup()
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ContenedorPrincipal.setBackground(new java.awt.Color(51, 204, 255));

        etq_tabla.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_tabla.setForeground(new java.awt.Color(0, 0, 0));
        etq_tabla.setText("Tabla");

        campo_tabla.setBackground(new java.awt.Color(255, 255, 255));
        campo_tabla.setForeground(new java.awt.Color(0, 0, 0));

        etq_multiplos.setBackground(new java.awt.Color(0, 0, 0));
        etq_multiplos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_multiplos.setForeground(new java.awt.Color(0, 0, 0));
        etq_multiplos.setText("Multiplos");

        campo_multiplos.setBackground(new java.awt.Color(255, 255, 255));
        campo_multiplos.setForeground(new java.awt.Color(0, 0, 0));

        boton_iniciar.setBackground(new java.awt.Color(0, 204, 204));
        boton_iniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        boton_iniciar.setText("CREAR");
        boton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniciarActionPerformed(evt);
            }
        });

        respuesta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");
        respuesta.add(jLabel1);

        label2.setText("label2");
        respuesta.add(label2);

        label1.setText("label1");
        respuesta.add(label1);

        test.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        test.setForeground(new java.awt.Color(0, 0, 0));
        test.setText("----");

        javax.swing.GroupLayout ContenedorPrincipalLayout = new javax.swing.GroupLayout(ContenedorPrincipal);
        ContenedorPrincipal.setLayout(ContenedorPrincipalLayout);
        ContenedorPrincipalLayout.setHorizontalGroup(
            ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador)
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addGroup(ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(etq_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(etq_multiplos)
                        .addGap(28, 28, 28)
                        .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(boton_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(test)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenedorPrincipalLayout.setVerticalGroup(
            ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_tabla)
                    .addComponent(etq_multiplos)
                    .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(test)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        respuesta.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniciarActionPerformed
        int tabla = Integer.valueOf(campo_tabla.getText());
        int multiplos = Integer.valueOf(campo_multiplos.getText());
    
       
        String html = "<html>";
        for(int i = 1; i==multiplos; i++){
            html += tabla+" x "+i+" = "+tabla*i;
        }
        html += "</html>";
        test.setText(html);
          
               
              
    }//GEN-LAST:event_boton_iniciarActionPerformed

   
    public void initAlternComponents(){
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorPrincipal;
    private javax.swing.JPanel ContenedorTitulo;
    private javax.swing.JLabel PRUEBAA;
    private javax.swing.JButton boton_iniciar;
    private javax.swing.JTextField campo_multiplos;
    private javax.swing.JTextField campo_tabla;
    private javax.swing.JLabel etq_multiplos;
    private javax.swing.JLabel etq_tabla;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.ScrollPane respuesta;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
