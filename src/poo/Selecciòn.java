package poo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import poo.Objetos.Persona;
import poo.Objetos.Producto;

public class Selecciòn extends javax.swing.JFrame {
    public Persona usuario;
    
    private DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
   
    public void cambio() throws IOException{ // cambia la informacion de la tabla del producto
        DefaultTableModel informacion = new DefaultTableModel();
        for (Producto producto : usuario.getProductos()) {
            if (producto.getTipo() == opciones.getSelectedItem()) {
                String estado;
                if(producto.isComprado()){
                    estado = "comprado";
                } else{
                    estado = "No comprado";
                }
                Object[] datos = {
                    producto.getTipo(),
                    producto.getContacto(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    estado
                };
                Object[] columna = {"nombre", "contacto", "descripcion", "precio", "estado"};
                informacion.addColumn("", columna);
                informacion.addColumn("objeto", datos);
                info.setToolTipText(producto.getDescripcion());
                try {
                    if(!producto.getImagen().equalsIgnoreCase(" ")) imagen.setIcon(new ImageIcon(ImageIO.read(new File(producto.getImagen()))));
                } catch (IOException e){
                    System.out.println("fallo al cargar la imagen");
                }
                
            }
        }
        info.setModel(informacion);
        info.setRowHeight(66);
        info.setAlignmentX(CENTER_ALIGNMENT);
        for (int c = 0; c < info.getColumnCount(); c++) { // recorrer todas las columnas
            Class<?> col_class = info.getColumnClass(c); // obtener la clase de la columna
            info.setDefaultEditor(col_class, null); // eliminar el editor por defecto
        }
    }
    
    public Selecciòn() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Selecciòn(Persona usuario) {
        try {
            this.usuario = usuario;
            initComponents();
            setLocationRelativeTo(null);
            for (Producto producto : usuario.getProductos()) { // rellena un comboBox con todos los producto que vende ese usuario
                modelo.addElement(producto.getTipo());
            }
            
            opciones.setModel(modelo);
            cambio();
        } catch (IOException ex) {
            Logger.getLogger(Selecciòn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setUsuario(Persona usuario) {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Vendedor = new javax.swing.JButton();
        Empleados = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTable();
        compras = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 35, 42));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("By ArcoTangente");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ARCOSHOP");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Images/Sin título-1_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(77, 77, 77))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        Vendedor.setBackground(new java.awt.Color(32, 35, 42));
        Vendedor.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Vendedor.setForeground(new java.awt.Color(255, 255, 255));
        Vendedor.setText("Vendedor");
        Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendedorActionPerformed(evt);
            }
        });

        Empleados.setBackground(new java.awt.Color(32, 35, 42));
        Empleados.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Empleados.setText("Comprador");
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(32, 35, 42));
        Salir.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Cerrar Sesión");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        opciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcionesItemStateChanged(evt);
            }
        });

        info.setBackground(new java.awt.Color(204, 204, 204));
        info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        info.setShowVerticalLines(true);
        jScrollPane1.setViewportView(info);

        compras.setBackground(new java.awt.Color(32, 35, 42));
        compras.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        compras.setForeground(new java.awt.Color(255, 255, 255));
        compras.setText("Compras");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compras, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1201, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendedorActionPerformed
        vender acceso = new vender();
        acceso.setUsuario(usuario);
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VendedorActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        comprar acceso = new comprar(usuario);
        acceso.cargar(0); // sirve para visualizar cada objeto que el usuario puede comprar
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Sesión acceso = new Sesión();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void opcionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcionesItemStateChanged
        try {
            cambio();
        } catch (IOException ex) {
            Logger.getLogger(Selecciòn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opcionesItemStateChanged

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        comprado acceso = new comprado(usuario);
        acceso.cargar(0);
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_comprasActionPerformed

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
            java.util.logging.Logger.getLogger(Selecciòn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecciòn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecciòn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecciòn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selecciòn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Empleados;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Vendedor;
    private javax.swing.JButton compras;
    private javax.swing.JLabel imagen;
    private javax.swing.JTable info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opciones;
    // End of variables declaration//GEN-END:variables
}