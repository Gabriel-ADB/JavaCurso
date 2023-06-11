package Entidades;

public class Arrays {
    private int[] vector;

    public Arrays(int size){
        vector = new int[size];
    }

    public void setVector(int size, int value){
    try {
        vector[size] = value;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error indice fuera de rango!");
    }
    }

    public int getValue(int indice){
        try {
            return vector[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error indice fuera de rango");
           return -1;
        }
    }

}
