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
public class Practicos_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numA,numB;
        int opc=6;
        boolean menu=true;
        
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese 2 valores");
        numA=leer.nextInt();
        numB=leer.nextInt();
        
        while(menu==true){
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una Opción:");
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("----------------------------");
                    System.out.println(numA+"+"+numB+" = "+ (numA+numB));
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println(numA+"-"+numB+" = "+ (numA-numB));
                    System.out.println("----------------------------");
                    break;                    
                case 3:
                    System.out.println("----------------------------");
                    System.out.println(numA+"*"+numB+" = "+ (numA*numB));
                    System.out.println("----------------------------");
                    break;
                case 4:
                    double div= numA/numB;
                    System.out.println("----------------------------");
                    System.out.println(numA+"/"+numB+" = " + (numA/numB) );
                    System.out.println("----------------------------");
                    break;
                case 5:
                    int salir;
                    System.out.println("¿Está Seguro que Quiere Salir?");
                    System.out.println("(1) - SI, SALIR");
                    System.out.println("(2) - NO, VOLVER AL MENU");
                    salir=leer.nextInt();
                    if(salir==1){
                        System.out.println("==================");
                        System.out.println("PROGRAMA TERMINADO");
                        System.out.println("==================");
                    menu=false;
                    break;
                    }else{                            
                    break;
                   
                    }
            }
            
        }
    }
}