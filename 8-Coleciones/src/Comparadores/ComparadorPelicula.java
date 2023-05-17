/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;



import Entidades.Pelicula;
import java.util.Comparator;




/**
 *
 * @author Gabriel
 */
public class ComparadorPelicula {
   
    public static Comparator<Pelicula> mayorMenorDurac = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
        return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
   
    public static Comparator<Pelicula> porTituloAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
         return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> porDirecAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
         return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
