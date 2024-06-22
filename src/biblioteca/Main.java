/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import Ventanas.Login;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carla Daniela
 */
public class Main {
    public static List<Usuario> listaUsuarios = new ArrayList<>();
    public static List<Libro> listaLibros = new ArrayList<>();
    public static List<Prestamo> listaPrestamos = new ArrayList<>();

    public static void main(String[] args) {
        // Registrar usuarios
        listaUsuarios.add(new Usuario("Juan", "Perez", "001"));
        listaUsuarios.add(new Usuario("Maria", "Gonzalez", "002"));
        listaUsuarios.add(new Usuario("Pedro", "Martinez", "003"));
        listaUsuarios.add(new Usuario("Ana", "Lopez", "004"));
        listaUsuarios.add(new Usuario("Carlos", "Garcia", "005"));
        listaUsuarios.add(new Usuario("Luisa", "Rodriguez", "006"));
        listaUsuarios.add(new Usuario("Javier", "Sanchez", "007"));
        listaUsuarios.add(new Usuario("Laura", "Diaz", "008"));
        listaUsuarios.add(new Usuario("Miguel", "Hernandez", "009"));
        listaUsuarios.add(new Usuario("Sofia", "Torres", "010"));

        // Registrar libros
        Autor autor1 = new Autor("Gabriel", "García Márquez");
        Autor autor2 = new Autor("Mario", "Vargas Llosa");
        Autor autor3 = new Autor("Julio", "Cortázar");
        Autor autor4 = new Autor("Laura", "Restrepo");
        Autor autor5 = new Autor("Fernando", "Vallejo");
        Autor autor6 = new Autor("Héctor", "Abad Faciolince");
        Autor autor7 = new Autor("Isabel", "Allende");
        Autor autor8 = new Autor("Jorge", "Isaac");
        Autor autor9 = new Autor("Jorge", "Franco");
        Autor autor10 = new Autor("Alvaro", "Mutis");

        Categoria categoria1 = new Categoria("Literatura latinoamericana");
        Categoria categoria2 = new Categoria("Novela");
        Categoria categoria3 = new Categoria("Cuentos");

        listaLibros.add(new Libro("Cien años de soledad", "9780307476463", autor1, categoria1));
        listaLibros.add(new Libro("La ciudad y los perros", "9788466312587", autor2, categoria2));
        listaLibros.add(new Libro("Rayuela", "9788437615431", autor3, categoria2));
        listaLibros.add(new Libro("Delirio", "9789587043190", autor4, categoria2));
        listaLibros.add(new Libro("La virgen de los sicarios", "9788483102497", autor5, categoria2));
        listaLibros.add(new Libro("La Oculta", "9789584258846", autor6, categoria2));
        listaLibros.add(new Libro("La casa de los espíritus", "9788401423694", autor7, categoria1));
        listaLibros.add(new Libro("María", "9789507310010", autor8, categoria2));
        listaLibros.add(new Libro("Rosario Tijeras", "9789584202658", autor9, categoria2));
        listaLibros.add(new Libro("La nieve del almirante", "9788433912618", autor10, categoria3));

        // Realizar préstamos (ejemplo)
        listaPrestamos.add(new Prestamo(listaLibros.get(0), "2024-06-21", "2024-07-05"));
        
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}

