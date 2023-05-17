/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CuentaBancariaServicio {
    private Scanner sc = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese Numero de cuenta");
        int nc = sc.nextInt();
        System.out.println("ingrese dni");
        long dni = sc.nextLong();
        System.out.println("ingrese saldo");
        double saldo = sc.nextDouble();
        
        return new CuentaBancaria(nc,dni,saldo);
    }
    
    public void ingresar(CuentaBancaria c1){
        System.out.println("Ingrese monto a ingresar");
        c1.setSaldoActual(sc.nextDouble()+c1.getSaldoActual());
        System.out.println("Su nuevo saldo es: "+c1.getSaldoActual());
    }
    
    public void retirar(CuentaBancaria c1){
        System.out.println("Ingrese monto a retirar");
        if (c1.getSaldoActual()<sc.nextDouble())
        {System.out.println("Saldo insuficiente, se retirarar de su ceunta: "+c1.getSaldoActual());
            c1.setSaldoActual(0);
        }else{
        c1.setSaldoActual(sc.nextDouble()-c1.getSaldoActual());
        System.out.println("Su nuevo saldo es: "+c1.getSaldoActual());
        }
    }
    
    public void fastExtrac(CuentaBancaria c1){
        double sald = c1.getSaldoActual()*0.2;
        System.out.println("limite de retiro: "+sald);
        System.out.println("Ingrese monto a retirar");
        
        if (sc.nextDouble()<=sald)
        {c1.setSaldoActual(c1.getSaldoActual()-sald);
            System.out.println("se retiro: "+sald+" de su cuenta. Su nuevo saldo es: "+c1.getSaldoActual());
            
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-sald);
            System.out.println("El monto ingresado supera el saldo limite a retirar, se retiraran solo: "+sald+" de su cuenta");
            System.out.println("Su nuevo saldo es: "+c1.getSaldoActual());
        }
    }        
       
    public void consultaSaldo(CuentaBancaria c1){
        System.out.println("Su saldo es: "+c1.getSaldoActual());
    }    
    
    public void consultaDatos(CuentaBancaria c1){
        System.out.println("Numero de cuenta: "+c1.getNumeroCliente());
        System.out.println("Numero de dni: "+c1.getDniCliente());
        System.out.println("Saldo actual: "+c1.getSaldoActual());
        
    }
    
}
