/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Raices;

/**
 *
 * @author Gabriel
 */
public class RaicesServicio {
    public double getDiscriminante(Raices r1){
       return (Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC();
    }
    
    public void verDiscriminante(Raices r1){
        double res = (Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC();
        System.out.println(res);
    }
    
   public boolean tieneRaices(Raices r1){
    return getDiscriminante(r1) >0;
}
   public void verTieneRacies(Raices r1){
       System.out.println(tieneRaices(r1));
   }  
   public void verTieneRaiz(Raices r1){
       System.out.println(tieneRaiz(r1));
   }  
   public boolean tieneRaiz(Raices r1){
    return getDiscriminante(r1) == 0;
}
   
    public void obtenerRaices(Raices r1){
      
        if (tieneRaices(r1))
        {
         double x1 = (-r1.getB()+Math.sqrt(Math.pow(r1.getB(),2)-4*r1.getA()*r1.getC()))/(2*r1.getA());
          double x2 = (-r1.getB()-Math.sqrt(Math.pow(r1.getB(),2)-4*r1.getA()*r1.getC()))/(2*r1.getA());
            System.out.println("La ecuacion tiene 2 soluciones "+x1+" y "+x2+".");
        }else{
            System.out.println("No tiene raices.");
        }
    }
    public void obtenerRaiz(Raices r1){
        if (tieneRaiz(r1))
        {double x1 = (-r1.getB()+Math.sqrt(Math.pow(r1.getB(),2)-4*r1.getA()*r1.getC()))/(2*r1.getA());
            System.out.println("La ecuacion tiene una unica solucion: "+x1);
        }
    }
    public void calcular(Raices r1){
        if (tieneRaices(r1))
        {obtenerRaices(r1);
            System.out.println("(-±√(("+r1.getB()+"^2)-(4*"+r1.getA()+"*"+r1.getC()+")))/(2*"+r1.getA()+")");
            System.out.println("(-±√(("+r1.getB()+"^2)+(4*"+r1.getA()+"*"+r1.getC()+")))/(2*"+r1.getA()+")");
        }else if (tieneRaiz(r1))
        {obtenerRaiz(r1);
            System.out.println("(-±√(("+r1.getB()+"^2)-(4*"+r1.getA()+"*"+r1.getC()+")))/(2*"+r1.getA()+")");
        }else{
            System.out.println("no tiene raiz real.");
        }
    }
}
