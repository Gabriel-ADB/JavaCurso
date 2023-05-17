package subprogramas;

// @author Gabriel
import java.util.Scanner;

public class Practicos_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que moneda quiere cambiar?");
        System.out.println("1-Dolar");
        System.out.println("2-Euro");
        System.out.println("3-Yen");
        int moneda = sc.nextInt();
        System.out.println("Ingrese cantidad a cambiar:");
        int cant = sc.nextInt();

        cambio(moneda, cant);
    }

    public static void cambio(int moneda, int cant) {
        
        switch (moneda)
        {
            case 1:
                System.out.println("El cambio es: "+cant* 1.28611+" Dolar");
                break;
            case 2:
                System.out.println("El cambio es: "+cant* 0.86+" Euro");
                break;
            case 3:
                System.out.println("El cambio es: "+cant* 129.852+" Yen");
                break;

        }
    }
}
