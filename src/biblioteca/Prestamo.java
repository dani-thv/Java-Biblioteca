/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Carla Daniela
 */
public class Prestamo {
    // Atributos privados
    private Libro libro;
    private String fechaPrestamo;
    private String fechaDevolucion;

    // Constructor
    public Prestamo(Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters
    public Libro getLibro() {
        return libro;
    }


    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    // Setters
    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    // Método para mostrar la información del préstamo
    public String mostrarInfo() {
        return "Préstamo: " + fechaPrestamo + " - " + fechaDevolucion+"\nInformación del libro:"+ libro.mostrarInfo();
    }    
}
