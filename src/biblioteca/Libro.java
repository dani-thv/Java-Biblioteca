/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Carla Daniela
 */
public class Libro {
    // Atributos privados
    private String titulo;
    private String isbn;
    private Autor autor;
    private Categoria categoria;

    // Constructor
    public Libro(String titulo, String isbn, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.categoria = categoria;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método para mostrar la información del libro
    public String mostrarInfo() {
        return "Título: " + titulo + "\nISBN: " + isbn + "\nAutor: " + autor.mostrarInfo() + "\nCategoría: " + categoria.mostrarInfo();
}    
}
