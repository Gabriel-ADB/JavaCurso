

package arreglos;

 // @author Gabriel
import java.util.Scanner;


public class Extras_1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño:");
        int t = sc.nextInt();
        
        int[] vec = new int [t];
        
        calculo(vec);
    }
public static void calculo(int[]vec){
    Scanner sc = new Scanner(System.in);
    int suma=0;
    for (int i = 0; i < vec.length; i++)
    {
        System.out.println("Ingrese valor para la coordenada: "+(i+1));
        vec[i]=sc.nextInt();
        suma+=vec[i];
    }
    System.out.println("La suma de los elementos es: "+ suma);
}
}
