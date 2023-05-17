/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;

import Entidades.Carta;
import java.util.Comparator;


/**
 *
 * @author Gabriel
 */
public class Comparador {
    public static Comparator<Carta> comparaCarta = new Comparator<Carta>() {
        @Override
        public int compare(Carta t, Carta t1) {
            return t1.getPalo().compareTo(t.getPalo());
        }
    };
            
            
    
}
