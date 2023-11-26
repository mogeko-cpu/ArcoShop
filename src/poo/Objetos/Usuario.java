package poo.Objetos;

public class Usuario extends Persona  {

    public Usuario(String nombre, String contraseña) {
        super(nombre, contraseña);
    }
    
    public Usuario(String nombre, String contraseña, int id) {
        super(nombre, contraseña, id);
    }
    
    @Override
    public String toString() {
        return id + "," + nombre + "," + contraseña + ",usuario";
    }
}
