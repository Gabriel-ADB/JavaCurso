/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Practicos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ss = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String frase = ss.nextLine();
        
        System.out.println("Frase en Mayusculas: " + frase.toUpperCase());
        System.out.println("Frase en Minusculas: " + frase.toLowerCase());
    }
    
}
