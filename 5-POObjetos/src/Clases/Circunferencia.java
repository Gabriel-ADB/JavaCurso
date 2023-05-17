/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Circunferencia {
    
   private double radio;
   public double area;
   public double perimetro;
        
   
   
   public Circunferencia(){
       
   }
   public void inicializar(){
       Scanner r = new Scanner(System.in);
       System.out.println("Ingrese el radio");
       this.radio = r.nextDouble();
   }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   public Circunferencia(double radio){
      
       this.radio = radio;
   }
    public void Area(){
        this.area = Math.PI*this.radio*this.radio;
        
    }
    public void Perimetro(){
    this.perimetro = 2*Math.PI*this.radio;
    }
}
