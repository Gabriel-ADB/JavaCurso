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
public class Practicos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.println("Ingrese grados Celsius o centigrados");
        double g;
        g = c.nextDouble();
        double f = 32 + (9 * g / 5);
        System.out.println("Los grados F son : " + f);
    }

}
