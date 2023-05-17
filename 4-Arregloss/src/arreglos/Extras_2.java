

package arreglos;

 // @author Gabriel
public class Extras_2 {

   
    public static void main(String[] args) {
       int [] vec1 = {2,3,4,5};
       int [] vec2=  {2,3,4,5};
      int cont=0;
        for (int i = 0; i < vec1.length; i++)
        {if (vec1[i]!=vec2[i])
            {System.out.println("no son iguales, el proceso se detecto en el indice: "+i);
                break;
            }else{
                    cont++;
        }
            if (cont==vec1.length)
        {System.out.println("son iguales");  
        }
       
      
            
        }
       
    }
    

}
