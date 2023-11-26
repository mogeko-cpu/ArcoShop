package poo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import poo.Objetos.Lector;
import poo.Objetos.Persona;
import poo.Objetos.Producto;

public class vender extends javax.swing.JFrame {
    public Lector leer;
    public Persona usuario;
    private File imagen;
    private ArrayList<Producto> lista;
    private Random rd = new Random();
    private String rutaImagen = " ";

    public vender() {
        initComponents();
        leer = new Lector();
        setLocationRelativeTo(null);
    }
    
    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Agregar_Registro = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Nombre1 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        Nombre4 = new javax.swing.JLabel();
        Nombre5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Publicar = new javax.swing.JButton();
        Publicar1 = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(32, 35, 42));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ARCOSHOP");

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("By ArcoTangente");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Sin título-1_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(89, 89, 89))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Agregar_Registro.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Agregar_Registro.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Agregar_Registro.setText("Vendedor");

        jButton3.setBackground(new java.awt.Color(32, 35, 42));
        jButton3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Nombre1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        Nombre1.setText("TIPO DE ARTICULO:");

        Nombre2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(255, 255, 255));
        Nombre2.setText("NOMBRE DEL VENDEDOR:");

        Nombre3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Nombre3.setForeground(new java.awt.Color(255, 255, 255));
        Nombre3.setText("NÚMERO DE CONTACTO:");

        Nombre4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Nombre4.setForeground(new java.awt.Color(255, 255, 255));
        Nombre4.setText("DESCRIPCIÓN:");

        Nombre5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Nombre5.setForeground(new java.awt.Color(255, 255, 255));
        Nombre5.setText("VALOR DEL PRODUCTO:");

        Publicar.setBackground(new java.awt.Color(32, 35, 42));
        Publicar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Publicar.setForeground(new java.awt.Color(255, 255, 255));
        Publicar.setText("PUBLICAR");
        Publicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicarActionPerformed(evt);
            }
        });

        Publicar1.setBackground(new java.awt.Color(32, 35, 42));
        Publicar1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Publicar1.setForeground(new java.awt.Color(255, 255, 255));
        Publicar1.setText("AGREGAR IMÀGEN");
        Publicar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Publicar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Publicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Agregar_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Publicar1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre2)
                            .addComponent(Nombre5)
                            .addComponent(Nombre4)
                            .addComponent(Nombre1)
                            .addComponent(Nombre3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensaje))
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Agregar_Registro)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nombre2)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Publicar1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Publicar)
                    .addComponent(mensaje))
                .addGap(21, 21, 21)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Selecciòn acceso = new Selecciòn(usuario);
        //acceso.setUsuario(usuario);
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicarActionPerformed
        String vendedor = jTextField2.getText(), contacto = jTextField3.getText(), tipo = jTextField4.getText(), descripcion = jTextField5.getText(), precio = jTextField6.getText();
        if (vendedor.equalsIgnoreCase("") || contacto.equalsIgnoreCase("") || tipo.equalsIgnoreCase("") || descripcion.equalsIgnoreCase("") || precio.equalsIgnoreCase("")){
            mensaje.setText("algunos campos estan vacios");
        } else if (contacto.matches("[a-zA-Z]*") || precio.matches("[a-zA-Z]*")){
            mensaje.setText("se han colocado letras en campos que no admiten letras");  
        }else{
            Producto new_producto = new Producto(usuario,Integer.parseInt(contacto),tipo,descripcion,Double.parseDouble(precio));
            new_producto.addVendedor(new_producto);
            new_producto.setImagen(rutaImagen);
            lista = leer.getProductos();
            lista.add(new_producto);
            leer.actualizar_productos(lista);
            Selecciòn acceso = new Selecciòn(usuario);
            //acceso.setUsuario(usuario);
            acceso.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_PublicarActionPerformed

    private void Publicar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Publicar1ActionPerformed
        int resultado;
        escoger select = new escoger();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("jpg", "png", "gif", "JPG", "PNG","GIF");
        select.escogedor.setFileFilter(filtro);
        resultado = select.escogedor.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            imagen = select.escogedor.getSelectedFile();
            try {
                String direccion = imagen.getAbsolutePath(), nuevoNombre = "producto"+ rd.nextInt(1, 10000);
                String rutaDestino = "src/imagenes-productos/";
                File archivoDestino = new File(rutaDestino + nuevoNombre);
                
                try {
                    //intentar copiar y luego eliminar el original
                    Path origen = Paths.get(imagen.toURI());
                    Path destino = Paths.get(archivoDestino.toURI());
                    Files.copy(origen, destino);
                    rutaImagen = archivoDestino.getAbsolutePath();
                    System.out.println("Archivo guardado con éxito en " + archivoDestino.getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                System.out.println("hubo un error");
            }
        }
    }//GEN-LAST:event_Publicar1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar_Registro;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JLabel Nombre4;
    private javax.swing.JLabel Nombre5;
    private javax.swing.JButton Publicar;
    private javax.swing.JButton Publicar1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
}
