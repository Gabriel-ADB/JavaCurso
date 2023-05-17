/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CafeteraService {
    private Scanner sc = new Scanner(System.in);
   
    public void llenar(Cafetera c1){
        c1.setcActual(c1.getcMax());
        System.out.println("La cafetera esta llena!");
    }
    
    public void vaciar(Cafetera c1){
        c1.setcActual(0);
        System.out.println("Se vacio la cafetera!");
    }
    
    public void ServirTaza(Cafetera c1){
        System.out.println("Ingrese tamaño de la taza a servir");
        int taza = sc.nextInt();
        
        if (taza>c1.getcActual())
        {System.out.println("La cantidad de cafe no alcanza, solo se llenara con: "+c1.getcActual()+" cc.");
            c1.setcActual(0);
        }else if (taza == c1.getcActual())
        {System.out.println("se lleno la taza");
        c1.setcActual(0);
            
        }else if (taza<c1.getcActual())
        {System.out.println("Se lleno la taza");
        c1.setcActual(c1.getcActual()-taza);
            
        }
    }
    
    public void agregar(Cafetera c1){
        System.out.println("Cuanto desea agregar?");
        double cafe = sc.nextDouble();
        if (cafe>(c1.getcMax()-c1.getcActual()))
        {System.out.println("el limite de la cafetera es de 1000cc de cafe.");
            
        }else{
            System.out.println("se agrego el cafe");
            c1.setcActual(c1.getcActual()+cafe);
            System.out.println("La cantidad nueva en la cafetera es : "+c1.getcActual());
        }
    }
}
