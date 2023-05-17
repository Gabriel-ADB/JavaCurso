/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.ParNumeros;

/**
 *
 *
 *
 *
 *
 *
 *
 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
 * del número.
 *
 * @author Gabriel
 */
public class ParNumerosService {

    /* Método mostrarValores que muestra cuáles son los dos números guardados.*/
    public void mostrarValores(ParNumeros par1) {
        System.out.println("El primer numero es: " + par1.getNum1() + " y el segundo es: " + par1.getNum2());
    }

    /*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor*/
    public void devolverMayor(ParNumeros par1) {
       double mayor = Math.max(par1.getNum1(), par1.getNum2());
        System.out.println("El mayor es: "+mayor);
    }

    /*Método calcularPotencia para calcular la potencia del mayor valor de la clase 
* elevado al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia(ParNumeros par1) {
        double n1 = Math.round(par1.getNum1() * 100) / 100;
        double n2 = Math.round(par1.getNum2() * 100) / 100;

        if (par1.getNum1() > par1.getNum2())

        {
            double res = Math.pow(n1, n2);
            System.out.println(res);

        }
        if (par1.getNum2() > par1.getNum1())
        {
            double res = Math.pow(n2, n1);
             System.out.println(res);

        }

    }
    /*Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
 * del número.*/
    public void calculaRaiz(ParNumeros par1){
         double n1 =Math.abs(par1.getNum1());
        double n2 = Math.abs(par1.getNum2());

        if (par1.getNum1() > par1.getNum2())

        {
            
            double res = Math.sqrt(n2);
            System.out.println("La raiz del segundo numero es: "+res);

        }else{
            double res = Math.sqrt(n1);
              System.out.println("La raiz del primer numero es: "+res);
        }
       

    }
}
