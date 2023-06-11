package com.JavaGabetoADB.Main;

import java.util.ArrayList;
import java.util.List;

import com.JavaGabetoADB.Entidades.Edificio;
import com.JavaGabetoADB.Entidades.EdificioOficina;
import com.JavaGabetoADB.Entidades.Polideportivo;

public class EdificioEjercicio {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        List<Edificio> edificioList = new ArrayList<>();

        Edificio poli1 = new Polideportivo(30, 10, 50, "Polideportivo Berazategui", false);
        Edificio poli2 = new Polideportivo(20, 20, 40, "Polideportivo Quilmes", true);
        Edificio poli3 = new Polideportivo(25, 15, 20, "Polideportivo Solano", true);
        edificioList.add(poli1);
        edificioList.add(poli2);
        edificioList.add(poli3);

        Edificio ofi1 = new EdificioOficina(20, 100, 30, 3, 2, 10);
        Edificio ofi2 = new EdificioOficina(10, 110, 20, 4, 3, 15);
        Edificio ofi3 = new EdificioOficina(25, 120, 10, 5, 4, 15);
        edificioList.add(ofi1);
        edificioList.add(ofi2);
        edificioList.add(ofi3);
        
        // Mostrar los polideportivos agrupados y diferenciados por sus nombres
        System.out.println("Polideportivos agrupados y diferenciados por sus nombres:");
        int i = 1;
        for (Edificio edificio : edificioList) {
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println((i++)+" - "+polideportivo.getNombre()+" ,Techado: "+polideportivo.isTechado());
                polideportivo.calcularSup();
                polideportivo.calcularVol();
                System.out.println("==============");
            }
        }

        // Mostrar las oficinas agrupadas y diferenciadas por cantidad de personas total
      int j = 1;
        System.out.println("Oficinas agrupadas y diferenciadas por cantidad de personas total:");
        for (Edificio edificio : edificioList) {
            if (edificio instanceof EdificioOficina) {
                EdificioOficina edificioOficina = (EdificioOficina) edificio;
                System.out.println("Edificio "+j++);
                edificioOficina.cantidadPerson();
                System.out.println("=================");
                edificioOficina.calcularSup();
                System.out.println("=================");
                edificioOficina.calcularVol();
                System.out.println("=================");
            }
        }
                
            
        

    }
}
