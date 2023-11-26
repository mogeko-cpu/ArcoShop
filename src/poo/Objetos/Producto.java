package poo.Objetos;

import java.util.Random;

public class Producto {
    private Random rd = new Random();
    private int id;
    private Persona vendedor;
    private int contacto;
    private String tipo;
    private String descripcion;
    private double precio;
    private String imagen = " ";
    private boolean comprado;
    private Persona comprador;

    public Producto(Persona vendedor, int contacto, String tipo, String descripcion, double precio) {
        this.id = rd.nextInt();
        this.vendedor = vendedor;
        this.contacto = contacto;
        this.tipo = tipo;
        this.comprado = false;
        this.descripcion = descripcion;
        this.precio = precio;
        //vendedor.addProduct(this);
    }
    
    
    
    public Producto(int id,Persona vendedor, int contacto, String tipo, String descripcion, double precio) {
        this.id = id;
        this.vendedor = vendedor;
        this.contacto = contacto;
        this.tipo = tipo;
        this.comprado = false;
        this.descripcion = descripcion;
        this.precio = precio;
        //vendedor.addProduct(this);
    }

    public Producto(int id,Persona vendedor, int contacto, String tipo, String descripcion, double precio,Persona comprador) {
        this.id = id;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.contacto = contacto;
        this.tipo = tipo;
        this.comprado = true;
        this.descripcion = descripcion;
        this.precio = precio;
        //vendedor.addProduct(this);
    }
    
    public void addVendedor(Producto producto){
        this.vendedor.addProduct(producto);
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public int getId() {
        return id;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public int getContacto() {
        return contacto;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        String prueba;
        if (comprador == null) {
            prueba = " ";
        } else {
            prueba = ""+ comprador.getId();
        }
        return id + "," + 
                vendedor.getId() + "," + 
                contacto + "," + tipo + "," + 
                descripcion + "," + precio + "," + imagen + "," + prueba;
    }  
}