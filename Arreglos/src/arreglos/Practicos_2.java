

package arreglos;

 // @author Gabriel
import java.util.Scanner;


public class Practicos_2 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int t = sc.nextInt();
         int[] vector = new int [t];
        System.out.println("Ingrese valor a buscar del 1 al 10");
        int n = sc.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++)
        {vector[i]=(int)(Math.random()*10);
            System.out.println(vector[i]);
            if (n==vector[i])
            {System.out.println("El elemto se encontro en el indice: "+(i+1));
                
            }else{
                cont=cont+1;
            }
            
        }
        if (cont>0){
            System.out.println("El valor no se encontro entre los elementos del vector");
        }
    }

}
