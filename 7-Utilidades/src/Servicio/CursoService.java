/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CursoService {
     /*Método cargarAlumnos(): este método le permitirá al usuario ingresar 
    los alumnos que asisten a las clases. Nosotros nos encargaremos de 
    almacenar esta información en un arreglo e iterar con un bucle, solicitando
    en cada repetición que se ingrese el nombre de cada alumno.
    
*/
     private Scanner sc = new Scanner(System.in).useDelimiter("\n");
     
    public  String []  cargarAlumno(){
        String []alumnos=new String[5];
        for (int i = 0; i < alumnos.length; i++)
        {System.out.println("Ingrese nombre del alumno "+(i+1)+":");
            alumnos[i]=sc.next();
        }
        return alumnos;
    }
    
    /*Método crearCurso(): el método crear curso, le pide los valores de los 
    atributos al usuario y después se le asignan a sus respectivos atributos
    para llenar el objeto Curso. En este método invocamos al método 
    cargarAlumnos() para asignarle valor al atributo alumnos
*/
    public void crearCurso(Curso c1){
        System.out.println("Ingrese nombre del curso");
         c1.setNombreCurso(sc.nextLine()); 
        System.out.println("Ingrese cantidad de horas por dia");
        c1.setHorasPorDia(sc.nextInt());
        System.out.println("Ingrese cantidad de dias por semana");
        c1.setHorasPorSemana(sc.nextInt());
        System.out.println("Ingrese turno (Mañana/Tarde)");
        c1.setTurno(sc.next());
        System.out.println("Ingrese valor de hora");
        c1.setPrecioHora(sc.nextDouble());
        System.out.println("Ingrese nombre del Alumno");
        c1.setAlumnos(cargarAlumno());
    }
    /*Método calcularGananciaSemanal(): este método se encarga de calcular 
    la ganancia en una semana por curso. Para ello, se deben multiplicar 
    la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
    y la cantidad de días a la semana que se repite el encuentro.
*/
    public double GananciaSemanal(Curso c1){
        int cantAlumno= c1.getAlumnos().length;
        int cantHoras = c1.getHorasPorDia() * c1.getHorasPorSemana();
        double total = cantAlumno*cantHoras*c1.getPrecioHora();
        return total;
    }

   public void verCurso(Curso c1){
       
       System.out.println("Curso: "+c1.getNombreCurso());
       System.out.println("Horas por dia: "+c1.getHorasPorDia());
       System.out.println("Horas por semana: "+c1.getHorasPorDia());
       System.out.println("Turno: "+c1.getTurno());
       System.out.println("Valor por hora: "+c1.getPrecioHora());
       
       for (int i = 0; i < c1.getAlumnos().length; i++)
       {System.out.println("Alumno "+(i+1)+" : "+c1.getAlumnos()[i]);
       }
       System.out.println("========================");
       System.out.println("Ganancia semanal: "+GananciaSemanal(c1));
   }
    
}
