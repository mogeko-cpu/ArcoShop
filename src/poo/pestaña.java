package poo;

import java.awt.Font;
import poo.Objetos.Lector;
import poo.Objetos.Producto;

public class pestaña extends javax.swing.JPanel {
    public Lector leer = new Lector();
    private Producto producto;
    
    public pestaña() {
        initComponents();
    }
    
    public pestaña(String texto, Producto producto) {
        initComponents();
        this.producto = producto;
        this.label.setFont(new Font("Arial", Font.PLAIN, 15));
        this.label.setText(texto);
        this.label.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        label = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(153, 153, 153));

        label.setColumns(20);
        label.setRows(5);
        jScrollPane1.setViewportView(label);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea label;
    // End of variables declaration//GEN-END:variables
}
