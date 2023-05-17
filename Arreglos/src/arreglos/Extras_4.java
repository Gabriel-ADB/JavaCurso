package arreglos;

import java.util.Random;
import java.text.DecimalFormat;
// @author Gabriel

public class Extras_4 {

    public static void main(String[] args) {
        Random r = new Random();
        DecimalFormat df = new DecimalFormat();
        double[][] m = new double[10][5];
        double suma = 0;
        int cont =0;
        int contn =0;

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                m[i][j] = (r.nextInt(9) + 1);

            }

        }

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (j == 0)
                {
                    suma += m[i][j] * .1;

                }
                if (j == 1)
                {
                    suma += m[i][j] * .15;

                }
                if (j == 2)
                {
                    suma += m[i][j] * .25;

                }
                if (j == 3)
                {
                    suma += m[i][j] * .5;

                }
                if (j == 4)
                {
                    m[i][j] = suma;
                    
                }
                
                 
                System.out.print("[" + m[i][j] + "]");
                
            }
          
            System.out.println("");
             if (suma>7)
                {cont++;
                    
                }else{
                    contn++;
                }
            suma=0;
        }
        System.out.println("Aprobados: "+cont);
        System.out.println("Desaprobados: "+contn);
    }

}
