/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes
 * métodos:
 *
 *
 *
 *
 *
 * Método menorQue recibe como parámetro una Persona y una edad. Retorna true si
 * la persona es menor que la edad consultada o false en caso contrario.
 *
 * Método mostrarPersona que muestra la información de la persona deseada.
 *
 * @author Gabriel
 */
public class PersonaService {

    private Scanner sc = new Scanner(System.in);

    /*Método crearPersona que pida al usuario Nombre y fecha de nacimiento de 
* la persona a crear. Retornar el objeto Persona creado.*/

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese nombre");
        p1.setNombre(sc.nextLine());
        System.out.println("Ingrese dia de naciemiento");
        int dia = sc.nextInt();
        System.out.println("Ingrese mes de naciemiento");
        int mes = sc.nextInt();
        System.out.println("Ingrese año de naciemiento");
        int anio = sc.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setFechaNacimiento(fecha);

        return p1;
    }

    /*Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
* fecha de nacimiento y la fecha actual.*/
    public void calcularEdad(Persona p1) {
        Date actual = new Date();
        int edad = actual.getYear() - p1.getFechaNacimiento().getYear();
        if (p1.getFechaNacimiento().getMonth() > actual.getMonth())
        {
            edad--;

        } else if (p1.getFechaNacimiento().getMonth() == actual.getMonth() && p1.getFechaNacimiento().getDate() > actual.getDate())
        {
            edad--;

        }
        System.out.println("La edad es: " + edad);
    }

    /*Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
* la persona es menor que la edad consultada o false en caso contrario.*/

    public boolean menorQue(Persona p1, int edad
    ) {
        
        boolean menor = false;
        Date actual = new Date();
        int age=actual.getYear() - p1.getFechaNacimiento().getYear();
        if (p1.getFechaNacimiento().getMonth() > actual.getMonth())
        {
            age--;

        } else if (p1.getFechaNacimiento().getMonth() == actual.getMonth() && p1.getFechaNacimiento().getDate() > actual.getDate())
        {
            age--;

        }
        if (age<edad)
        {
            menor = true;

        }
        return menor;
    }
    public void mostrar(Persona p1){
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Fecha de Nacimiento: "+p1.getFechaNacimiento());
        
    }
    
}

