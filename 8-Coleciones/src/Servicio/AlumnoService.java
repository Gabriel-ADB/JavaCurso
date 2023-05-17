/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas.
 *
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 * @author Gabriel
 */
public class AlumnoService {

    private ArrayList<Alumno> ListaAlumno = new ArrayList();

    private Scanner sc = new Scanner(System.in);

    public void crearAlumno() {

        do
        {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese nombre");
            String name = sc.next();

            for (int i = 0; i < 3; i++)
            {
                System.out.println("Ingrese nota " + (i + 1) + " del alumno");
                sc.nextLine();
                notas.add(sc.nextInt());
            }
            Alumno a1 = new Alumno(name, notas);
            ListaAlumno.add(a1);

            System.out.println("Desea continuar agregando alumnos? S/N");
        } while (!sc.next().equalsIgnoreCase("n"));
    }

    public void buscar() {
        boolean bandera = false;
        System.out.println("Ingrese nombre del alumno para promemdiar notas");
        String name = sc.next();
        for (Alumno alumno : ListaAlumno)
        {
            if (alumno.getNombre().equals(name))
                
            {double suma = 0;
                for (Integer nota : alumno.getNota())
                {
                    suma+=nota;
                }
                double prom = suma / alumno.getNota().size();
                System.out.println("El promedio de: "+alumno.getNombre()+ " es: "+prom);
                bandera = true;
                break;
            }
        }
        if (!bandera)
        {System.out.println("No se encontro el alumno");
            
        }
    }

    public void mostrar() {
        for (Alumno alumno : ListaAlumno)
        {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.print("Notas: ");
            for (Integer nota : alumno.getNota())
            {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
