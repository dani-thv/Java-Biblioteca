/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Biblioteca {
    // Atributos privados
    private static List<Libro> libros;
    private static List<Usuario> usuarios;
    private static List<Prestamo> prestamos;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Métodos para registrar libros, usuarios y préstamos
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    // Métodos para mostrar información
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.mostrarInfo();
        }
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarInfo();
        }
    }

    // Método para buscar un libro por título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // Método para verificar si un libro está prestado
    public static boolean libroEstaPrestado(Libro libro) {
        if (prestamos != null) {
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getLibro().getIsbn().equals(libro.getIsbn())) {
                    return true;
                }
            }
        }
        return false;
    }
    // Método para establecer la lista de préstamos desde Main
    public static void setPrestamos(List<Prestamo> listaPrestamos) {
        prestamos = listaPrestamos;
    }
}
