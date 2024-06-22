/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Carla Daniela
 */
public class Categoria {
    // Atributo privado
    private String nombre;

    // Constructor
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar la información de la categoría
    public String mostrarInfo() {
        return nombre;
    }    
}
