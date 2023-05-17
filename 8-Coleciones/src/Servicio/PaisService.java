/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Comparadores.ComparadorPais;
import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Scanner;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author Gabriel
 */
public class PaisService {

    private Scanner sc = new Scanner(System.in);
    HashSet<Pais> paises = new HashSet();

    public void crearPais() {
        String op = null;
        do
        {
            System.out.println("Ingrese pais");
            String name = sc.next();

            Pais nPais = new Pais(name);

            if (paises.contains(nPais))
            {
                System.out.println("El pais ya se encuentra en el conjunto.");

            } else
            {
                paises.add(nPais);
                System.out.println("El pais se agrego con exito!");
            }

            System.out.println("Desea seguir agregando paises? s/n");
            op = sc.next();

        } while (!op.equalsIgnoreCase("n"));
        System.out.println("La lista de paises es: ");
        for (Pais aux : paises)
        {
            System.out.println(aux.getNombrePais());

        }
    }

    public void ordenAlfa() {
        ArrayList<Pais> listaPais = new ArrayList<Pais>(paises);
        Collections.sort(listaPais, ComparadorPais.paisAlfa);
        System.out.println("Los paises ordenados alfabeticamente son: ");
        for (Pais aux : listaPais)
        {
            System.out.println("- " + aux.getNombrePais());

        }

    }

    public void eliminarPais() {
        System.out.println("Ingrese pais a eliminar de la lista");
        String elim = sc.next();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext())
        {
            Pais aux = it.next();
            if (aux.getNombrePais().equals(elim))

            {
                it.remove();
            }

        }
    }

}
