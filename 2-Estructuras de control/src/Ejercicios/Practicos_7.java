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
public class Practicos_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;

        do {
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            cadena = scanner.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() != 5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O') {
                incorrectas++;
                System.out.println("La cadena ingresada no cumple con el formato requerido.");
            } else {
                correctas++;
                System.out.println("La cadena ingresada cumple con el formato requerido.");
            }

        } while (true);

        System.out.println("\rInforme:");
        System.out.println("Cadenas correctas recibidas: " + correctas);
        System.out.println("Cadenas incorrectas recibidas: " + incorrectas);
    }
} 
    
    