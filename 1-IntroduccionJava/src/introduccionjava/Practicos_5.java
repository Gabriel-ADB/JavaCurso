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
public class Practicos_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner num = new Scanner(System.in);
    
    int num1;
    
        System.out.println("ingrese numero entero");
        
        num1 = num.nextInt();
        int doble = num1 * 2;
    int triple = num1 * 3;
    double raiz = Math.sqrt(num1);
    
        System.out.println("El doble de " + num1 + " es : " + doble);
         System.out.println("El triple de " + num1 + " es : " + triple);
          System.out.println("La raiz cuadrade de " + num1 + " es : " + raiz);
       
        }
    
}
