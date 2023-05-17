

package subprogramas;

 // @author Gabriel
import java.util.Scanner;


public class Practicos_4 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero");
       int num = sc.nextInt();
       
       boolean logico = primo(num);
        System.out.println(logico);
    }

    public static boolean primo(int n){
   boolean res = false;
   int cont = 0;
   int j = 1;
        for (int i = 1; i <= n; i++)
        {int aux = n%j;
        j++;   
        if(aux==0){
            cont=cont+1;
        }
        }
   
   if (cont<=2){
       res = true;
   }
   
   return res;
    }
}
