/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class PersonService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String name = sc.next();
        System.out.println("Ingrese edad");
        int age = sc.nextInt();
        System.out.println("ingrese sexo (H/M/O) ");
        String sex = sc.next();
        System.out.println("Ingrese peso");
        double kg = sc.nextDouble();
        System.out.println("Ingrese altura");
        double alt = sc.nextDouble();
        
       return new Persona(name,age,sex,kg,alt);   
    }
    
    public boolean esMayor(Persona p1){
       /* boolean mayor = false;
        if (p1.getEdad()>=18)
        {mayor = true;
            
        }*/
        return p1.getEdad()>=18;
    }
    public  int calcularIMC(Persona p1) {
    double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());
    if (imc < 20) {
        return -1;
    } else if (imc >= 20 && imc <= 25) {
        return 0;
    } else {
        return 1;
    }
}
}
