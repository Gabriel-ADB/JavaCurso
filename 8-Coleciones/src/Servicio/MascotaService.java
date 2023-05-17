/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MascotaService {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> mascotas = new ArrayList<>();

    

    public void crearMascota() {

        System.out.println("Ingrese raza");
        String raza = sc.next();

        String creada = raza + "";
        mascotas.add(creada);

    }

    public void cargarMascot() {

        String op = "";
        do
        {
            crearMascota();
            System.out.println("Desea continuar? Si/No");

            op = sc.next();
        } while (!op.equals("No"));
        mostrar();

    }

    public void mostrar() {

        System.out.println("Las mascotas ingresadas son las siguientes: ");
        for (String aux : mascotas)
        {
            System.out.println(aux);

        }
    }
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
    public void eliminarMascota() {
        boolean bandera= false;
        System.out.println("Ingrese mascota a eliminar: ");
        String buscar = sc.next();
       Iterator<String> iterador = mascotas.iterator();
       
       while(iterador.hasNext()){
           if (iterador.next().equalsIgnoreCase(buscar))
           {iterador.remove();
           bandera =true;
               System.out.println("Se elimino la mascota");
           }
       }
        if (bandera==false)
        {
           System.out.println("Fallo al eliminar mascota");
               
           
            
        }
        
       
    }

}
