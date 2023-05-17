package arreglos;

// @author Gabriel
import java.util.Scanner;

public class Practicos_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del cuadrado");
        int t = sc.nextInt();
        int[][] m = new int[t][t];

        for (int i = 0; i < m.length; i++)
        {for (int j = 0; j < m.length; j++)
            {System.out.println("Ingrese valor para la posicion: "+(i+1)+"-"+(j+1));
                m[i][j]=sc.nextInt();
            }
            
        }
        int fila = 0;
        int col = 0;
        int cont = 0;
        int d2 = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m.length; j++)
            {
                
                fila += m[i][j];
                col += m[j][i];
            }
            if (esIgual(fila,col))
            {cont++;
                if (cont==3)
                {System.out.println("Es magica");
                    imprime(m);
                }else{
                    fila=0;
                    col=0;
                }
            }else{
                System.out.println("No es magica");
                imprime(m);
                return;
            }

        }

    }
    public static boolean esIgual(int fil,int col){
        return fil==col;
    }
    
public static void imprime(int[][]m){
     for (int i = 0; i < m.length; i++)
        {for (int j = 0; j < m.length; j++)
            {System.out.print("["+m[i][j]+"]");
                
            }
            System.out.println("");
        }
}
}
