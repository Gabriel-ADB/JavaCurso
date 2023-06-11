package Main;

import java.util.Scanner;

import Entidades.Circulo;
import Entidades.Rectctangulo;

public class Geometria {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(3);

        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        Rectctangulo rectangulo1 = new Rectctangulo(3, 5);

        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();

    }

}
