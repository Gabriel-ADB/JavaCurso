package Ejercicios;

// @author Gabriel
import Clases.Libro;
import java.util.Scanner;

public class Libro1 {

    public static void main(String[] args) {
        System.out.println("Ingrese Titulo, Autor, ISBN y cantidad de paginas:");
        
        Scanner sc = new Scanner(System.in);
        

        Libro l2 = new Libro(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());

        System.out.println(l2.toString());
    }

}
