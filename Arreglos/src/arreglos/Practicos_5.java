package arreglos;

// @author Gabriel
import java.util.Scanner;

public class Practicos_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese valores");
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                matriz[i][j] = sc.nextInt();  
            }
            
        }
        for (int i = 0; i < matriz.length; i++)
        {for (int j = 0; j < matriz.length; j++)
            { System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println("");
        }
        
        System.out.println("--------------------------");
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print("[" + matriz[j][i] + "]");

            }
            System.out.println("");
        }
        System.out.println("-------------------------");
        System.out.println("Matriz transpuesta negativa");
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print("[" + -matriz[j][i] + "]");

            }
            System.out.println("");
        }
        boolean log = false;
        
        for (int i = 0; i < matriz.length; i++)
        {for (int j = 0; j < matriz.length; j++)
            {if(matriz[i][j]==-matriz[j][i]){
               log=true;
            }
                
            }
            
        }
        if (log){
            System.out.println("La matriz  es antimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }

    }
}
