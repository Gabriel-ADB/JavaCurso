package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    private Scanner sc = new Scanner(System.in);

    private List<Jugador> listaJugadores;

    private Revolver r;

    public Juego() {
    }

    public Juego(List<Jugador> listaJugadores, Revolver r) {
        this.listaJugadores = listaJugadores;
        this.r = r;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", r=" + r + '}';
    }

    public void llenarJuego(ArrayList<Jugador> lista, Revolver r) {
        this.listaJugadores = lista;
        this.r = r;
    }

    public void ronda() {
        Random ran = new Random();

        int turnoJugador = ran.nextInt(listaJugadores.size());

        while (true)
        {
            Jugador j1 = listaJugadores.get(turnoJugador);
            System.out.println("La posicion del tambor es: " + r.getPosActual());
            System.out.println(j1.getNombre() + " es tu turno! Preciona ENTER para disparar!");
              
            sc.nextLine();

          

            if (j1.disparo(r))
            {
                System.out.println("PUMMMM!!!... " + j1.getNombre() + " Perdiste!");
                System.out.println("La bala esta en: " + r.getPosAgua());
                j1.setMojado(true);
                break;
            } else
            {
                System.out.println("Clanck!!... Estuvo cerca! Te salvaste!");

                turnoJugador++;
                if (turnoJugador == listaJugadores.size())
                {
                    turnoJugador = 0;
                }
            }
            System.out.println("============");
            System.out.println("Proximo turno!");
            if (j1.isMojado())
            {
                System.out.println("El jugador " + j1.getNombre() + " perdió.");
                System.out.println("El juego termino!");
                System.out.println("La posicion del tambor es: " + r.getPosActual());
                System.out.println("La bala esta en: " + r.getPosAgua());
                break;
            }

            
        }

    }
}
