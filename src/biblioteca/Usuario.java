/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Carla Daniela
 */
public class Usuario {
    // Atributos privados
    private String nombre;
    private String apellido;
    private String idUser; // Se asume que el id_user es un entero según el código Python

    // Constructor
    public Usuario(String nombre, String apellido, String idUser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idUser = idUser;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdUser() {
        return idUser;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }    
    // Método para mostrar la información del libro
    public String mostrarInfo() {
        return "Nombre: " + nombre + "Apellido: " + apellido +"ID:" +idUser;
    }    
}
