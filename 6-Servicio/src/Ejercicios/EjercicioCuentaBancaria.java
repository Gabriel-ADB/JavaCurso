

package Ejercicios;

 // @author Gabriel
import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;




public class EjercicioCuentaBancaria {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int op;
        
        CuentaBancariaServicio x1 =new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = x1.crearCuenta();
       do{ 
        System.out.println("============================");
        System.out.println("==Bienvenido a Banco java==");
        System.out.println("============MENU=============");
        System.out.println("1-Ingresar dinero");
        System.out.println("2-Retirar dinero");
        System.out.println("3-Extraccion rapida");
        System.out.println("4-Consultar saldo");
        System.out.println("5-Consultar datos");
        System.out.println("6-Salir");
        System.out.println("Elija opcion");
        op=sc.nextInt();
           switch (op)
           {
               case 1:
                   x1.ingresar(cuenta1);
                   break;
               case 2:
                   x1.retirar(cuenta1);
                   break;
               case 3:
                  x1.fastExtrac(cuenta1);
                   break;
               case 4:
                   x1.consultaSaldo(cuenta1);
                   break;
               case 5:
                   x1.consultaDatos(cuenta1);
                   break;
             
           }
       }while   (op!=6);
        System.out.println("Gracias por elejirnos!");
       
       
    }

}
