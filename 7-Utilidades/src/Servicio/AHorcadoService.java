/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 *
 *
 *
 *
 *
 *
 *
 * Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 *
 * Método juego(): el método juego se encargará de llamar todos los métodos
 * previamente mencionados e informará cuando el usuario descubra toda la
 * palabra o se quede sin intentos. Este método se llamará en el main.
 *
 * @author Gabriel
 */
public class AHorcadoService {

    private Scanner sc = new Scanner(System.in);

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
 * máxima. Con la palabra del usuario, pone la longitud de la palabra, 
 * como la longitud del vector. Después ingresa la palabra en el vector,
 * letra por letra, quedando cada letra de la palabra en un índice del vector.
 * Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el 
 * usuario.*/
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra secreta:");
        String secreta = sc.nextLine();

        Ahorcado j1 = new Ahorcado();

        j1.setpSecreta(secreta.toCharArray());

        System.out.println("Ingrese numero de intentos maximos:");

        j1.setJugadaMax(sc.nextInt());

        return j1;

    }

    /*Método longitud(): muestra la longitud de la palabra que se debe encontrar.
* Nota: buscar como se usa el vector.length.*/
    public void longitud(Ahorcado j1) {
        System.out.println("Cantidad de caracteres de la palabra: " + j1.getpSecreta().length);
    }

    /*Método buscar(letra):  este método recibe una letra dada por el usuario y 
* busca si la letra ingresada es parte de la palabra o no. También informará 
* si la letra estaba o no.*/
    public void buscar(Ahorcado j1) {
        System.out.println("Ingrese letra");
       
        char letra = sc.next().charAt(0);
         j1.setLetraB(letra);
        boolean bandera = false;
        int contOk = 0;
        int contF = 3;
        for (int i = 0; i < j1.getpSecreta().length; i++)
        {
            if (j1.getpSecreta()[i] == j1.getLetraB())
            {
                bandera = true;

            }

        }
        if (bandera)
        {
            System.out.println("La letra se encontro en la palabra");
         
        } else
        {contF--;
            System.out.println("La letra no se encontro en la palabra");
        }
        j1.setLetraOk(contOk);
        j1.setJugadaMax(contF);
    }

    /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
* muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
* además deberá devolver true si la letra estaba y false si la letra no estaba,
* ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
* oportunidades.*/
    public boolean encontradas(Ahorcado j1) {
        
       
        int cont = 0;
        boolean resultado = false;

        for (int i = 0; i < j1.getpSecreta().length; i++)
        {
            if (j1.getpSecreta()[i] == j1.getLetraB())
            {
                cont++;
            }

        }
        int faltantes = j1.getpSecreta().length - cont;
        if (cont > 0)
        {
            System.out.println("Se encontranron " + cont + " letras iguales, te faltan: " + faltantes);

        }
        return resultado;
    }

  

    /*Método intentos(): para mostrar cuántas oportunidades le queda al jugador.*/

    public void intentos(Ahorcado j1, int erradas) {
        int restulado = j1.getJugadaMax() - erradas;

        j1.setJugadaMax(restulado);
        System.out.println(j1.getJugadaMax());
    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos
 * previamente mencionados e informará cuando el usuario descubra toda la
 * palabra o se quede sin intentos. Este método se llamará en el main.*/
    public void juego() {
        Ahorcado j2 = crearJuego();
        do{
        longitud(j2);
        buscar(j2);
        encontradas(j2);
        int cont = 0;
        if (encontradas(j2))
        {
            System.out.println("Se encontro la letra");
        } else
        {

            cont++;
            System.out.println("No se encontro la letra");
        }
        intentos(j2,cont);
        }while(j2.getJugadaMax()==0 || j2.getLetraOk()==j2.getpSecreta().length);
   }
   
   /* public void mostrar(Ahorcado j1){
        System.out.println(j1.getpSecreta());
        System.out.println(j1.getJugadaMax());
        System.out.println(j1.getLetraOk());
    }*/
        
    }
    

