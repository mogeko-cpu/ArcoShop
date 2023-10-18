/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Objetos;

/**
 *
 * @author megam
 */
public class Usuario {

    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    // Métodos getter y setter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Otros métodos de la clase, si es necesario
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", contraseña=" + contraseña + "]";
    }

    // Puedes agregar otros métodos y funcionalidades según tus necesidades
}
