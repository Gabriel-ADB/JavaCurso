package Entidades;


import java.util.Random;

public class Revolver {

    private int posActual;

    private int posAgua;

    public Revolver() {
    }
    

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

    public void llenarRevolver() {
        Random ran = new Random();

        this.posActual = ran.nextInt(6 - 1)+1;
        this.posAgua = ran.nextInt(6 - 1)+1;

    }

    public boolean mojar() {
        return posActual == posAgua;
    }

    public void siguenteChorro() {
        if (posActual==6)
        {posActual=1;
            
        }else{
            posActual++;
        }
    }

    public void tooString() {
        System.out.println("La posicion del tambor es: "+posActual);
        System.out.println("La posicion del agua es: "+posAgua);
    }
}
