package poo.Objetos;

import java.util.ArrayList;

public class Vendedor extends Persona  {
    

    public Vendedor(String nombre, String contraseña) {
        super(nombre, contraseña);
    }
    
    public Vendedor(String nombre, String contraseña, int id) {
        super(nombre, contraseña, id);
    }
    
    @Override
    public String toString() {
        return id + "," + nombre + "," + contraseña + ",vendedor";
    }
}
