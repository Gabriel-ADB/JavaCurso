/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Baraja {

    private Scanner sc = new Scanner(System.in);
    private LinkedList<Carta> barajaLLena = new LinkedList<>();
    private LinkedList<Carta> monton = new LinkedList<>();

    public void llenarBaraja() {

        String[] palo =
        {
            "Espada", "Basto", "Copa", "Oro"
        };
        for (int j = 0; j < 4; j++)
        {
            for (int i = 1; i <= 12; i++)
            {
                if (i == 8 || i == 9)
                {

                } else
                {
                    barajaLLena.add(new Carta(i, palo[j]));
                }
            }

        }

    }

    public void mostrar() {
        for (Carta carta : barajaLLena)
        {
            System.out.println(carta);

        }
    }

    public void barajar() {
        Collections.shuffle(barajaLLena);
    }

    public void siguenteCarta() {
        if (barajaLLena.size()==1)
        {
            System.out.println("No queda mas cartas en el monton");
        }
        System.out.println(barajaLLena.getFirst());
        
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan "+barajaLLena.size()+" en el monton.");
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas queres rey?");
        int cartasPedidas = sc.nextInt();
        
        for (int i = 0; i < cartasPedidas; i++)
        {monton.add(barajaLLena.remove(i));
            
        }
    }
    public void cartasMonton(){
        if (monton.isEmpty())
        {System.out.println("No se ah dado ninguna carta rey!");
            
        }else{
            System.out.println("La cantidad de cartas dadas es "
                    +monton.size()+" y son las siguentes:");
            for (Carta aux : monton)
            {System.out.println(aux);
                
            }
        }
    }

}
