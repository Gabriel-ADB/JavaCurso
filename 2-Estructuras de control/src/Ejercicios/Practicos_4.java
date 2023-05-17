/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Practicos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese frase");

        String frase = sc.nextLine();
        
       String letra = frase.substring(0,1);
        System.out.println(letra);

        if (letra.equals("a")) {
            System.out.println("la frase es correcta");
        } else {
            System.out.println("la frase es incorrecta");
        }
    }

}
