package Entidades;

public class DivisionNumero {
    private int dividendo;
    private int divisor;
    private double resultado;

   public DivisionNumero(int numDividendo, int numDivisor) {
        dividendo = numDividendo;
        divisor = numDivisor;
        resultado = dividendo / divisor;
    }

    public double setDivision(int nuevoDividendo, int nuevoDivisor) {
        dividendo = nuevoDividendo;
        divisor = nuevoDivisor;
        resultado = dividendo / divisor;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public DivisionNumero() {
    }
    
}
