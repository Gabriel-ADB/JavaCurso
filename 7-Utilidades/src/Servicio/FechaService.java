 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**

 * 

* 
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la
* diferencia de años entre una y otra (edad del usuario).

 * @author Gabriel
 */
public class FechaService {
    private Scanner sc = new Scanner(System.in);
    /* *Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
 * Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar 
 * el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);*/
    public Date fechaNac(){
        System.out.println("Ingrese dia, mes y año de su nacimiento");
        int dia = sc.nextInt();
        int mes = sc.nextInt()-1;
        int anio = sc.nextInt()-1900;
        
        return new Date(anio,mes,dia);
    }
    
    /*Método fechaActual que cree un objeto fecha con el día actual. 
* Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();*/
    public Date fechaActual(){
        
        Date fecha = new Date();
        return fecha;
       
    }
    
    public void diferencia(Date fecha1,Date fecha2){
        
     int anios = fecha1.getYear()-fecha2.getYear();
     
        if (fecha1.getYear()>fecha2.getYear())
        {anios--
            
        }
   
    } 
}
