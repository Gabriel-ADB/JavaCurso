/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Gabriel
 */
public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePagina;

    public Libro() {

    }

    public Libro(String Titulo, String Autor, int ISBN, int NumeroDePagina) {
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.NumeroDePagina = NumeroDePagina;
        this.Titulo = Titulo;

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDePagina() {
        return NumeroDePagina;
    }

    public void setNumeroDePagina(int NumeroDePagina) {
        this.NumeroDePagina = NumeroDePagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePagina=" + NumeroDePagina + '}';
    }



}
