/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Arrays;

/**
 *
 *
 *
 * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo
 * B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 *
 * @author Gabriel
 */
public class ArregloService {

    /*Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.*/
    public void iniciaA(double[] Arr) {
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = Math.random() * 100 + 1;

        }

    }

    /*Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.*/
    public void mostrar(double[] Arr) {
        System.out.println(Arrays.toString(Arr));
    }

    /*Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.*/
    public void ordenar(double[] arre) {
        Arrays.sort(arre);
        for (int i = 0; i < arre.length / 2; i++) {
            double temp = arre[i];
            arre[i] = arre[arre.length - 1 - i];
            arre[arre.length - 1 - i] = temp;
    }
    }
    /*Método inicializarB copia los primeros 10 números del arreglo A en el arreglo
 * B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
    public void iniciaB(double []arre, double[] arre1){
        for (int i = 0; i < 10; i++)
        {arre1[i]=arre[i];
            
        }
        for (int i = 10; i < 20; i++)
        {arre1[i]=0.5;
            
        }
    }
}
