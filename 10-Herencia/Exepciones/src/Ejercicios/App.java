package Ejercicios;
import Entidades.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Arrays vector1 = new Arrays(5);

        vector1.setVector(0, 13);
        vector1.setVector(1, 12);
        vector1.setVector(2, 11);
        vector1.setVector(3, 10);
        vector1.setVector(4, 9);
        vector1.setVector(5, 8);

        System.out.println(vector1.getValue(0));
        System.out.println(vector1.getValue(1));
        System.out.println(vector1.getValue(2));
        System.out.println(vector1.getValue(3));
        System.out.println(vector1.getValue(4));
        System.out.println(vector1.getValue(5));

    }
}
