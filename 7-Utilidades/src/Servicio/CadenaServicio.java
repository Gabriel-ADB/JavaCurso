/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CadenaServicio {

    private Scanner sc = new Scanner(System.in);

    public void MostrarVocales(Cadena c1) {
        System.out.println("Ingrese frase");
        c1.setFrase(sc.nextLine());
        int cont = 0;
        for (int i = 0; i < c1.getFrase().length(); i++)
        {
            if ((c1.getFrase().charAt(i) == 'a') || (c1.getFrase().charAt(i) == 'e') || (c1.getFrase().charAt(i) == 'i') || (c1.getFrase().charAt(i) == 'o') || (c1.getFrase().charAt(i) == 'u'))
            {
                cont++;
            }

        }
        System.out.println("La frase contiene " + cont + " vocales.");
    }

    public void invertirFrase(Cadena c1) {
        String invertido="";
        for (int i = c1.getFrase().length() - 1; i >= 0; i--)
        {
            invertido += c1.getFrase().charAt(i);
        }
        System.out.println("Frase invertida: " + invertido);
    }

    public void vacesRepetido(Cadena c1) {
        int cont = 0;
        System.out.println("ingrese caracter a buscar");
        char letra = sc.next().charAt(0);
        for (int i = 0; i < c1.getFrase().length(); i++)
        {
            if (letra == c1.getFrase().charAt(i))
            {
                cont++;

            }

        }
        System.out.println("La letra esta " + cont + " veces en la frase.");
        
    }

    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese nueva frase");
        String cadena2 = sc.nextLine();
        
        if (cadena2.length()==c1.getFrase().length())
        {System.out.println("Las frases tienen la misma longitud");}
       
         if (cadena2.length()>c1.getFrase().length())
        {System.out.println("La frase 1 es mas corta q la frase 2");}
            
        if(cadena2.length()<c1.getFrase().length()){
            System.out.println("La frase 2 es mas corta q la frase 1");
            
        }
       
    }

    public void unirFraces(Cadena c1) {
        System.out.println("Ingrese frase nueva");
        String fraseNueva = sc.nextLine();
        System.out.println(c1.getFrase()+" "+fraseNueva);
    }

    public void reemplazar(Cadena c1) {
        System.out.println("Ingrese simbolo para reemplazar las letras A de la frase");
        char simbolo = sc.next().charAt(0);
        String frase = "";
        for (int i = 0; i < c1.getFrase().length(); i++)
        {
            /*frase += c1.getFrase().charAt(i);*/

            if (c1.getFrase().charAt(i) == 'a')
            {
                frase += simbolo;

            }else{
                frase+=c1.getFrase().charAt(i);
            }

        }
        System.out.println(frase);
    }
    
    public void contieneLetra(Cadena c1){
        System.out.println("Ingrese letra a buscar");
         boolean res = false;
         int cont = 0;
         char letra = sc.next().charAt(0);
       
        for (int i = 0; i < c1.getFrase().length(); i++)
        { if (letra == c1.getFrase().charAt(i))
        {
            cont++;
        }
            if (cont > 0)
            {
                res = true;
            }
        }
       
      
        System.out.println(res);
    }

}
