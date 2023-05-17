/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Alumno;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class AlumnoService {

    private Scanner sc = new Scanner(System.in);

    public Alumno crearAlumno() {
        System.out.println("Ingrese nombre");
        String name = sc.next();
        double nota = Math.random() * 10 + 1;

        return new Alumno(name, nota);
    }

    public Alumno[] crearCurso() {

        Alumno[] curso1 = new Alumno[8];
        for (int i = 0; i < curso1.length; i++)
        {
            curso1[i] = crearAlumno();

        }
        return curso1;
    }

    public double calularProm(Alumno[] curso1) {
        int suma = 0;
        double prome = 0;
        for (Alumno aux : curso1)
        {
            suma += aux.getNota();

        }
        prome = suma / 8;
        System.out.println("El promedio del curso es: " + prome);
        return prome;
    }

    public Alumno[] aprobados(Alumno[] a1, double prom) {
        int cont = 0;
        for (int i = 0; i < a1.length; i++)
        {
            if (a1[i].getNota() > prom)
            {
                cont++;

            }

        }

        Alumno[] eApro = new Alumno[cont];
        int j = 0;
        for (int i = 0; i < a1.length; i++)
        {

            if (a1[i].getNota() > prom)
            {
                Alumno a2 = new Alumno(a1[i].getNombre(), a1[i].getNota());
                eApro[j] = a2;
                j++;
            }

            

        }
        return eApro;
    }

    public void mostrar(Alumno[] q1) {
        for (Alumno aux : q1)
        {
            System.out.println(aux);

        }

    }

}
