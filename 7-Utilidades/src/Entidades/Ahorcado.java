/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
 * contener como atributos, un vector con la palabra a buscar, la cantidad de 
 * letras encontradas y la cantidad jugadas máximas que puede realizar el 
 * usuario. 
 * @author Gabriel
 */
public class Ahorcado {
    private char [] pSecreta;
    private int letraOk;
    private int jugadaMax;
    private char letraB;

    public Ahorcado(char[] pSecreta, int letraOk, int jugadaMax, char letraB) {
        this.pSecreta = pSecreta;
        this.letraOk = letraOk;
        this.jugadaMax = jugadaMax;
        this.letraB = letraB;
    }

    public char[] getpSecreta() {
        return pSecreta;
    }

    public void setpSecreta(char[] pSecreta) {
        this.pSecreta = pSecreta;
    }

    public int getLetraOk() {
        return letraOk;
    }

    public void setLetraOk(int letraOk) {
        this.letraOk = letraOk;
    }

    public int getJugadaMax() {
        return jugadaMax;
    }

    public void setJugadaMax(int jugadaMax) {
        this.jugadaMax = jugadaMax;
    }

    public char getLetraB() {
        return letraB;
    }

    public void setLetraB(char letraB) {
        this.letraB = letraB;
    }

    public Ahorcado() {
    }

   
   
   
     
        
    }
    
    


