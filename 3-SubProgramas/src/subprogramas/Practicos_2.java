package subprogramas;

// @author Gabriel
import java.util.Scanner;

public class Practicos_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;

        do
        {
            ed();
            System.out.println("Desea continuar?");
            op = sc.nextLine();

        } while (op.equals("si"));

        System.out.println("=================");
        System.out.println("Fin del programa.");
        System.out.println("=================");

    }

    public static boolean ed() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        String name = sc.nextLine();
        System.out.println("Ingrese edad:");
        int age = sc.nextInt();
        boolean logico = false;
        if (age > 18)
        {
            System.out.println(name + " con " + age + " de edad es mayor.");
            logico = true;
        } else
        {

            System.out.println(name + " con " + age + " de edad es menor.");
        }

        return logico;
      
    }    
          
}
