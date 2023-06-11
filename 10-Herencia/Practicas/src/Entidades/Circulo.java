package Entidades;

import Interfaces.CalculosFormas;

public class Circulo implements CalculosFormas {
   protected double radio;
   protected double diametro;

public Circulo(double radio) {
    this.radio = radio;
    this.diametro = radio + 2;
}

public double getRadio() {
    return radio;
}

public void setRadio(double radio) {
    this.radio = radio;
}

public double getDiametro() {
    return diametro;
}

public void setDiametro(double diametro) {
    this.diametro = diametro;
}

@Override
public void calcularArea() {
    double area1= pi * Math.pow(radio, 2);
    System.out.println("El area del circulo es: "+area1);
}

@Override
public void calcularPerimetro() {
    double perimetro = pi *(radio+2);

    System.out.println("El perimetro del circulo es : "+ perimetro);
}

    

    
    
}
