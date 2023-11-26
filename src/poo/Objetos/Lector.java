package poo.Objetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

// clase que lee todos los archivos de informacion (productos y usuarios)
public class Lector {
    private ArrayList<Persona> usuarios = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();

    public Lector() {
        leer_archivo_usuarios();
        leer_archivo_productos();
    }

    public ArrayList<Persona> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public ArrayList<Producto> getProductosLibres() {
        ArrayList<Producto> libres = new ArrayList<>();
        for(Producto producto:productos){
            if (!producto.isComprado()){
                libres.add(producto);
            }
        }
        return libres;
    }
    
    public ArrayList<Producto> getProductosCompradosPersona(int id) {// manda todos los productos que ha comprado una persona
        ArrayList<Producto> libres = new ArrayList<>();
        for(Producto producto:productos){
            if (producto.isComprado() && producto.getComprador().getId() == id){
                libres.add(producto);
            }
        } 
        return libres;
    }
    
    public Persona buscar_usuario(String nombre, String contraseña){
        for(Persona usuario:usuarios){
            if (usuario.getNombre().equalsIgnoreCase(nombre) && usuario.getContraseña().equalsIgnoreCase(contraseña)){
                return usuario;
            }
        }
        return null;
    }
    
    public boolean esta_usuario_nombre(String nombre){
        for(Persona usuario:usuarios){
            if (usuario.getNombre().contains(nombre)){
                return true;
            }
        }
        return false;
    }
    
    public boolean esta_producto_nombre(String nombre){
        for(Producto producto:productos){
            if (producto.getTipo().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    
   public Persona getPersonaPorID(int id){
       for(Persona usuario:usuarios){
            if (usuario.getId() == id){
                return usuario;
            }
        }
       return null;
   }
   
   public Producto getProductoPorID(int id){
       for(Producto producto:productos){
            if (producto.getId() == id){
                return producto;
            }
        }
       return null;
   }
    
    public void actualizar_usuarios(ArrayList<Persona> usuarios){ // guarda todos  los cambios de usuarios hacia el archivo usuarios
        try {
            //List<String> lines =  Files.readAllLines(Paths.get("usuarios.txt"));
            ArrayList<String> guardar = new ArrayList();
            for (Persona usuario:usuarios){
                guardar.add(usuario.toString());
            }
            Files.write(Paths.get("usuarios.txt"), guardar);
            System.out.println("actualido");
        } catch (IOException ex) {
            System.out.println("No se encontro archivo");
        }
    }
    
    public void actualizar_productos(ArrayList<Producto> nuevos){
        try {
            ArrayList<String> guardar = new ArrayList();
            for (Producto producto:nuevos){
                guardar.add(producto.toString());
            }
            Files.write(Paths.get("productos.txt"), guardar);
            System.out.println("actualido");
        } catch (IOException ex) {
            System.out.println("No se encontro archivo");
        }
    }

    public void leer_archivo_usuarios() {
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("usuarios" + ".txt"));
                String line = null; //definición de line
                while ((line = br.readLine()) != null) {
                    String temp[] = line.split(",");
                    Persona new_persona;
                    if (temp[3].equalsIgnoreCase("vendedor")){
                        new_persona = new Vendedor(temp[1],temp[2],Integer.parseInt(temp[0]));
                    } else {
                        new_persona = new Usuario(temp[1],temp[2],Integer.parseInt(temp[0]));
                    }
                    usuarios.add(new_persona);
                }
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = true;
            }
        }
        //System.out.println(usuarios);
    }
    
    public void leer_archivo_productos() {
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("productos" + ".txt"));
                String line = null; //definición de line
                while ((line = br.readLine()) != null) {
                    String temp[] = line.split(",");
                    Producto new_producto;
                    Persona vendedor = getPersonaPorID(Integer.parseInt(temp[1]));
                    if (temp[7].contains(" ")){
                        new_producto = new Producto(Integer.parseInt(temp[0]), vendedor, Integer.parseInt(temp[2]), temp[3], temp[4], Double.parseDouble(temp[5]));
                    } else {
                        new_producto = new Producto(Integer.parseInt(temp[0]), vendedor, Integer.parseInt(temp[2]), temp[3],temp[4], Double.parseDouble(temp[5]),
                                               getPersonaPorID(Integer.parseInt(temp[7])));
                    
                    }
                    if (!temp[6].equalsIgnoreCase(" ")){
                        new_producto.setImagen(temp[6]);
                    }
                    vendedor.addProduct(new_producto);
                    productos.add(new_producto); 
                }
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = true;
            }
        }
        //System.out.println(productos);
    }
}