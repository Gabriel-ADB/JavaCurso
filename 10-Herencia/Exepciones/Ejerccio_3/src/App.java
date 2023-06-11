import java.util.Scanner;

import Entidades.DivisionNumero;

public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String aux1 = sc.next();
    String aux2 = sc.next();

    int n1 = 0;
    int n2 = 0;

    try {
      n1 = Integer.parseInt(aux1);
      n2 = Integer.parseInt(aux2);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      System.out.println("Error: No se pudo convertir la cadena a numero  entro.");
    }

    DivisionNumero div1 = new DivisionNumero();

    try {
      div1 = new DivisionNumero(n1, n2);
      div1.setDivision(n1, n2);

    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      System.out.println("Error: No se puede dividir por cero.");
    }

    System.out.println(div1.getResultado());

  }
}
