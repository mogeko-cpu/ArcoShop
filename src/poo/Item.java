package poo;

import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;
import poo.Objetos.Lector;
import poo.Objetos.Persona;
import poo.Objetos.Producto;

public class Item extends javax.swing.JPanel {
    private Persona usuario;
    public Lector leer = new Lector();
    private Producto producto;
    
    public Item() { // es una tarjeta que guarda toda la info de un producto
        initComponents();
    }
    
    public Item(String texto, Producto producto) { // se puede mandar un texto como tal o el producto para despues editar el texto con la info que tiene el objeto producto
        initComponents();
        this.producto = producto;
        this.texto.setFont(new Font("Arial", Font.PLAIN, 15));
        this.texto.setText(texto);
        this.texto.setEditable(false);
    }
    
    public void setUsuario(Persona persona){
        this.usuario = persona;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(204, 204, 204));

        comprar.setBackground(new java.awt.Color(32, 35, 42));
        comprar.setForeground(new java.awt.Color(255, 255, 255));
        comprar.setText("COMPRAR");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(texto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        ArrayList<Producto> lista = leer.getProductos();
        int pos = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == producto.getId()){
                pos = i;
                break;
            }
        }
        lista.remove(pos);
        producto.setComprado(true);
        producto.setComprador(this.usuario);
        lista.add(producto);
        leer.actualizar_productos(lista);
        
        Container componente = this.getParent();
        componente.remove(this);
        componente.revalidate();
        componente.repaint();
    }//GEN-LAST:event_comprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane texto;
    // End of variables declaration//GEN-END:variables
}
