/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class ServicioCine {

      private String peliculaEnReproduccion;
    private double precioEntrada;
    private String[][] sala;

    public ServicioCine(String peliculaEnReproduccion, double precioEntrada) {
        this.peliculaEnReproduccion = peliculaEnReproduccion;
        this.precioEntrada = precioEntrada;
        this.sala = new String[8][6];
        inicializarSala();
    }

    private void inicializarSala() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = " ";
            }
        }
    }

    public String getPeliculaEnReproduccion() {
        return peliculaEnReproduccion;
    }

    public void setPeliculaEnReproduccion(String peliculaEnReproduccion) {
        this.peliculaEnReproduccion = peliculaEnReproduccion;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public List<Espectador> generarEspectadores(int cantidad) {
        List<Espectador> espectadores = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Espectador " + (i + 1);
            int edad = random.nextInt(50) + 10; // Edad entre 10 y 59 años
            double dineroDisponible = random.nextDouble() * 50.0; // Dinero disponible entre 0 y 50

            espectadores.add(new Espectador(nombre, edad, dineroDisponible));
        }

        return espectadores;
    }

    public void ubicarEspectadores(Pelicula pelicula, List<Espectador> espectadores) {
        Random random = new Random();

        for (Espectador espectador : espectadores) {
            if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDineroDisponible() >= precioEntrada) {
                boolean asientoOcupado = true;
                while (asientoOcupado) {
                    int fila = random.nextInt(8);
                    int columna = random.nextInt(6);

                    if (sala[fila][columna].equals(" ")) {
                        sala[fila][columna] = "X";
                        asientoOcupado = false;
                    }
                }
            }
        }
    }

    public void mostrarSala() {
        System.out.println("Sala de Cine - Película: " + peliculaEnReproduccion);
        System.out.println("===============================================");
        System.out.println("  A B C D E F");
        for (int i = sala.length - 1; i >= 0; i--) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================================");
    }
    
}
