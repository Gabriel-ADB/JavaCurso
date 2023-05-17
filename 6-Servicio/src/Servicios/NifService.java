/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Nif;
import java.util.Scanner;




/**
 *
 * @author Gabriel
 */
public class NifService {
  private static char [] Letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
  private Scanner sc = new Scanner(System.in);  
    private Nif n1;

    public Nif getN1() {
        return n1;
    }

    public void setN1(Nif n1) {
        this.n1 = n1;
    }
    
    public void CrearNif(){
        System.out.println("Ingrese numero de dni");
        long dni = sc.nextLong();
        int resto = (int)(dni%23);
        char letra = Letras[resto];
        this.n1= new Nif(dni,letra);
    }
     public void mostrar() {
        long dni = this.n1.getDni();
        char letra = this.n1.getLetra();
        String nifCompleto = String.format("%08d-%c", dni, letra);
        System.out.println(nifCompleto);
        long res = this.n1.getDni()%23;
         System.out.println(res);
    }
}
