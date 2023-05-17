

package arreglos;

 // @author Gabriel
import java.util.Scanner;


public class Practicos_3 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
       String[] vector = new String [9];
        System.out.println("ingrese cadena de entre 1 y 5 digitos");
        
         int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < vector.length; i++)
        {vector[i]=sc.nextLine();
       
        
            switch (vector[i].length())
            {
                case 1:
                    cont1 = cont1 +1;
                    break;
             case 2:
                    cont2 = cont2 +1;
                    break;        
             case 3:
                    cont3 = cont3 +1;
                    break;
             case 4:
                    cont4 = cont4 +1;
                    break;
             case 5:
                    cont5 = cont5 +1;
                    break;        
            }
        
            
        }
        System.out.println("con 1 digito: "+cont1);
        System.out.println("con 2 digito: "+cont2);
        System.out.println("con 3 digito: "+cont3);
        System.out.println("con 4 digito: "+cont4);
        System.out.println("con 5 digito: "+cont5);
    }

}
