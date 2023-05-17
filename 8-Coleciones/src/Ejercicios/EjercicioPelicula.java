package Ejercicios;

// @author Gabriel
import Entidades.PeliService;

public class EjercicioPelicula {

    public static void main(String[] args) {
        PeliService sv = new PeliService();

        sv.crearPeli();
        sv.verPelis();
        System.out.println("--------------");
        sv.verPelisLargas();
        System.out.println("--------------");
        sv.mayorMenor();
        System.out.println("--------------");
        sv.menorMayor();
        System.out.println("--------------");
        sv.porTitulo();
        System.out.println("--------------");
        sv.porDirector();
    }

}
