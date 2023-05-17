

package arreglos;

 // @author Gabriel
public class Extras_5 {

   
    public static void main(String[] args) {
       int [][] m = new int [3][4];
       int suma = 0;
        for (int i = 0; i < 3; i++)
        {for (int j = 0; j < 4; j++)
            {m[i][j]=(int)(Math.random()*10);
                suma+=m[i][j];
                System.out.print("["+m[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("----------------");
        System.out.println("La suma de todos los elementos de la matriz es: "+ suma);
    }

}
