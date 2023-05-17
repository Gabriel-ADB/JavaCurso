

package Ejercicios;

 // @author Gabriel
import Clases.Cuenta;


public class EjercicioCuenta {

   
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.asignar_titular();
        System.out.println("El saldo inicial es: " + miCuenta.getSaldo());
        miCuenta.retirar_dinero(50000);
        System.out.println("El saldo después del retiro es: " + miCuenta.getSaldo());
    }

}
