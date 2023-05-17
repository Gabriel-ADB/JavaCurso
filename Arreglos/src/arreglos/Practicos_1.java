

package arreglos;

 // @author Gabriel
public class Practicos_1 {

   
    public static void main(String[] args) {
       int[] vector = new int[100];
       int j = 100;
        for (int i = 0; i < vector.length; i++)
        {vector[i]=j;
        j--;
            System.out.println(vector[i]);
        }
       
    }

}
