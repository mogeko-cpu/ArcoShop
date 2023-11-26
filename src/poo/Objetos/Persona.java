package poo.Objetos;

import java.util.ArrayList;
import java.util.Random;

public abstract class Persona {
    protected Random rd = new Random();
    protected ArrayList<Producto> productos;
    protected String nombre;
    protected String contraseña;
    protected int id;
    
    public Persona(String nombre, String contraseña) {
        this.id = rd.nextInt();
        this.nombre = nombre;
        productos = new ArrayList<>();
        this.contraseña = contraseña;
    }
    
    public Persona(String nombre, String contraseña, int id) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        productos = new ArrayList<>();
    }
    
    // Métodos getter y setter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    protected void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }
    
    public void addProduct(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + contraseña + "";
    }
}
