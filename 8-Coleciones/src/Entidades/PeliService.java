/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Comparadores.ComparadorPelicula;
import static Comparadores.ComparadorPelicula.mayorMenorDurac;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación:
 *
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
 * usuario si quiere crear otra Pelicula o no. Después de ese bucle realizaremos
 * las siguientes acciones:
 *
 * @author Gabriel
 */
public class PeliService {

    ArrayList<Pelicula> pelis = new ArrayList<>();

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPeli() {
        String op = null;
        do
        {
            System.out.println("Ingrese titulo");
            String titu = sc.next();
            System.out.println("Ingrese director");
            String direc = sc.next();
            System.out.println("Ingrese duracion");
            int durac = sc.nextInt();

            Pelicula p1 = new Pelicula(titu, direc, durac);

            pelis.add(p1);
            System.out.println("Desea continuar? s/n");
            op = sc.next();
        } while (!op.equalsIgnoreCase("n"));
    }
    
    /*• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
    
    public void verPelis(){
        System.out.println("Las peliculas son: ");
        int i = 1;
        for (Pelicula peli : pelis)
        {System.out.println(i+" - "+peli.getTitulo());
            
        }
    }
    
    public void verPelisLargas(){
        System.out.println("Las peliculas de duracion de mas de 1 hora son: ");
        for (Pelicula peli : pelis)
        {if (peli.getDuracion()>=60)
            {System.out.println("Pelicula: "+peli.getTitulo()+" Duracion: "+peli.getDuracion());
                
            }
            
        }
    }
    public void mayorMenor(){
            Collections.sort(pelis, ComparadorPelicula.mayorMenorDurac);
            System.out.println("Peliculas de menor a mayor: ");
            for (Pelicula peli : pelis)
        {
            System.out.println("Titulo : "+peli.getTitulo()+" Duracion: "+peli.getDuracion()+" minutos.");
            
        }
    }
    public void menorMayor(){
         Collections.sort(pelis, Collections.reverseOrder(mayorMenorDurac));
         System.out.println("Peliculas de Mayor a menor");
          for (Pelicula peli : pelis)
        {
            System.out.println("Titulo : "+peli.getTitulo()+" Duracion: "+peli.getDuracion()+" minutos.");
            
        }
    }
    
    public void porDirector(){
        Collections.sort(pelis, ComparadorPelicula.porDirecAlfa);
        System.out.println("Peliculas ordenadas por Director");
        for (Pelicula peli : pelis)
        {System.out.println("Director:"+peli.getDirector()+" , Titulo: "+peli.getTitulo());
            
        }
    }
 public void porTitulo(){
        Collections.sort(pelis, ComparadorPelicula.porTituloAlfa);
        System.out.println("Peliculas ordenadas por titulo");
        for (Pelicula peli : pelis)
        {System.out.println("Titulo: "+peli.getTitulo()+" , Director "+peli.getDirector());
            
        }
    }
    
}
