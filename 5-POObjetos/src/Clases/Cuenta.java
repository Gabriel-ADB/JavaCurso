/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Gabriel
 */
public class Cuenta {
  
    private String titular;
    private double saldo;

    public Cuenta() {
        Random rand = new Random();
        this.saldo = rand.nextInt(50001) + 150000; // genera saldo aleatorio en el rango de 150 mil a 200 mil
    }

    public void asignar_titular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular: ");
        this.titular = sc.nextLine();
    }

    public void retirar_dinero(double cantidad) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto a retirar");
        cantidad = sc.nextDouble();
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        if (this.saldo < 0) {
            this.saldo = 0;
        }
    }

    // getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}