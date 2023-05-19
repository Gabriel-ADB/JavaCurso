package Ejercicios;

// @author Gabriel

import Entidades.Espectador;
import Entidades.Pelicula;
import Servicio.ServicioCine;
import java.util.List;



public class EjercicioCine {

    public static void main(String[] args) {
       ServicioCine cine = new ServicioCine("Avatar", 10.0);
        Pelicula pelicula = new Pelicula("Película 1", 120, 18, "Director 1");

        List<Espectador> espectadores = cine.generarEspectadores(30);
        cine.ubicarEspectadores(pelicula, espectadores);

        cine.mostrarSala();
    }
        
    }

