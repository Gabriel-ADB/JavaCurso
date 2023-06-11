import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Instanciamos scanner
        Scanner sc = new Scanner(System.in);
        // Defino una variable elemento paara rellenar de valores el array.
        int elemento = 10;
        //Instancio el array
        int[] vector = new int[5];

        System.out.println("ingrese un numero:");
        String cadena = "null";
      try {
        cadena = sc.next();
      } catch (InputMismatchException e) {
        System.out.println("Tipo de dato incorrecto");
        System.out.println(e.getMessage());
      }catch(Exception a){
        System.out.println("Ingreso a la segunda exepcion");
      }finally{
        System.out.println("saliendo de la exepcion");
      }


      int cadenaNum = 0;
       try {
         cadenaNum = Integer.parseInt(cadena);
       } catch (NumberFormatException e) {
        System.out.println("No se puede convertir la cadena a entero");
       }catch (Exception a){
        System.out.println("Entro a la segunda exepcion de format");
       }

        //lleno los todos los indices con numeros
        for (int i : vector) {
            i = elemento+1;
        }

        try {
            vector[5]= elemento + 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indice fuera de rango");
        }catch(Exception a){
            System.out.println("Entro a la la segunda de array");
        }

        //divicion de todos los elementos por i

       try {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] / i);
       }
       } catch (ArithmeticException e) {
    System.out.println("no se puede dividir por cero");
    System.out.println(e.getMessage());
       }catch(Exception a){
        System.out.println("Entro a la segunda de aritmetic");
       }

    














    }
}
