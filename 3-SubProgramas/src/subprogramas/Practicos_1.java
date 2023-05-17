package subprogramas;

// @author Gabriel
import java.util.Scanner;

public class Practicos_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos valores");
        System.out.println("Primer valor :");
        int num1 = sc.nextInt();
        ;
        System.out.println("Segundo valor :");
        int num2 = sc.nextInt();

        System.out.println("Que operacico desea realizar?");
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-dividir");
        System.out.println("4-multiplicar");
        System.out.println("Elija opcion: ");

        int op = sc.nextInt();

        switch (op)
        {
            case 1:
                System.out.println("La suma de los numeros es : " + sumar(num1, num2));
                break;

            case 2:
                System.out.println("La resta de los numeros es : " + restar(num1, num2));
                break;

            case 3:
                System.out.println("La division de los numeros es : " + div(num1, num2));
                break;

            case 4:
                System.out.println("La multiplicacion de los numeros es : " + mul(num1, num2));
                break;

        }
    }

    public static int sumar(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public static int restar(int n1, int n2) {
        int res = n1 - n2;
        return res;
    }

    public static double div(double n1, double n2) {
        double res = n1 / n2;
        return res;
    }

    public static int mul(int n1, int n2) {
        int res = n1 * n2;
        return res;
    }
}
