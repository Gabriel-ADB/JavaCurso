package arreglos;

// @author Gabriel


public class Extras_6 {

    public static void main(String[] args) {
        int f =20;
        int c =20;
        
       String m [][] = new String[f][c];
       
       String p = "arbolito";
        
       for (int i = 0; i < m.length; i++)
        {m[f][c+i]=""+p.charAt(i);
            
        }
        for (int i = 0; i < m.length; i++)
        {for (int j = 0; j < m.length; j++)
            {System.out.print(""+m[i][j]);
                
            }
            System.out.println("");
        }

    }
   
}
