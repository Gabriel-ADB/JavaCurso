/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;


import Entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author Gabriel
 */
public class ComparadorPais {
    public static Comparator<Pais> paisAlfa = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
         return t.getNombrePais().compareTo(t1.getNombrePais());
        }
    };
}
