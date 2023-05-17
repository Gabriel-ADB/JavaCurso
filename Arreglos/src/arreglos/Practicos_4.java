

package arreglos;

 // @author Gabriel
public class Practicos_4 {

   
    public static void main(String[] args) {
       int [][] matriz = new int [4][4];
       
        for (int i = 0; i < matriz.length; i++)
        {for (int j = 0; j < matriz.length; j++)
            {matriz[i][j]=(int)(Math.random()*10);
                
            }
            
        }
        System.out.println("matriz original");
        for (int i = 0; i < matriz.length; i++)
        {for (int j = 0; j < matriz.length; j++)
            {System.out.print("["+matriz[i][j]+"]");
                
            }
            
            System.out.println("");
        }
        System.out.println("=====================");
         System.out.println("matriz transpuesta");
            for (int j = 0; j < matriz.length; j++)
            {for (int k = 0; k < matriz.length; k++)
                {System.out.print("["+matriz[k][j]+"]");
                    
                }
                System.out.println("");
            }
        
    }

}
