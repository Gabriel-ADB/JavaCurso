import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random numRandom = new Random();
        int aleatorio = numRandom.nextInt(5 - 1);
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;

        do {
            System.out.println("Adivina el numero:");
            try {
                int numIngresado = sc.nextInt();
                cont++;

                if (numIngresado == aleatorio) {
                    bandera = true;
                    System.out.println("Adivinaste!");
                    System.out.println("El numero es: " + aleatorio);
                    System.out.println("En " + cont + " intentos!");
                } else if (numIngresado < aleatorio) {
                    System.out.println("Es mas alto!!!");
                    System.out.println("Prueba de nuevo.");
                } else {
                    System.out.println("Es mas bajo!!!");
                    System.out.println("Prueba de nuevo.");
                }
            } catch (InputMismatchException e) {
                cont++;
                String entradaErroea = sc.next();
                System.out.println("La entrada es invalida \"" + entradaErroea + "\". Debe ingresar un numero.");
            }

        } while (!bandera);
        sc.close();
    }

  

}
