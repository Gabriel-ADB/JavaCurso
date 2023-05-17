/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ServicioMascota {

    private Scanner sc = new Scanner(System.in);

    private Random ran = new Random();

    private String[] nombres =
    {
        "Gabriel", "jose", "Martin", "Marcela", "Romina", "Iara"
    };
    private String[] apellidos =
    {
        "Moreira", "Perez", "Martinez", "Scioli", "Rucauf", "Vidal"
    };
    private String[] nombrePerro =
    {
        "Chiquito", "Grande", "Negro", "Lola", "Titan", "Vaquita", "Sultan", "Betun"
    };
    private String[] razas =
    {
        "Caniche", "Chiguagua", "Doberman", "Pitbull", "Gran danes", "Bulldog", "Labrador"
    };
    private String[] tamanios =
    {
        "Grande", "Mediano", "Chico"
    };

    private ArrayList<Perro> listaPerrosAdoptados = new ArrayList<>();
    private ArrayList<Perro> listaPerros = new ArrayList<>();
    private ArrayList<Persona> listaPersona = new ArrayList<>();

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public void crearObjetos(int cantidad) {
        for (int i = 0; i < cantidad; i++)
        {
            Perro perro = new Perro(nombrePerro[ran.nextInt(nombrePerro.length)], razas[ran.nextInt(razas.length)], (i * 2), tamanios[ran.nextInt(tamanios.length)]);
            Persona persona = new Persona(nombres[ran.nextInt(nombres.length)], apellidos[ran.nextInt(apellidos.length)], 33000000 + ran.nextInt(1000000), 18 + (i * 3));

            listaPerros.add(perro);
            listaPersona.add(persona);
        }
    }

    public void elijeMascota() {
        System.out.println("Elija perro a adoptar de la siguente lista de mascotas: ");
        int i = 1;
        int op;
        String op1;
        for (Perro aux : listaPerros)
        {
            System.out.println(i + "- " + aux.getNombre());
            i++;

        }
        op = sc.nextInt()-1;
        
        System.out.println("La mascota a adoptar es : "+listaPerros.get(op));
        System.out.println("Esta seguro de adoptar la mascota? (Si/No)");
        op1 = sc.next();
        
        if (op1.equalsIgnoreCase("Si"))
        {System.out.println("La mascota se adopto con exito! "+listaPerros.get(op).getNombre()+" se siente feliz!");
        listaPersona.get(op).setPerro(listaPerros.get(op));
        listaPerrosAdoptados.add(listaPerros.remove(op));
            
        }else if (op1.equalsIgnoreCase("No"))
        {System.out.println("Ahhh ok, mejor adopta ua planta!");
            
        }else{
            System.out.println("Opcion ingresada no valida, eres un irresponsable!");
        }
        System.out.println("=====================");
    }
    
    public void personaElije(){
        for (Persona aux : listaPersona)
        {System.out.println(aux.getNombre()+" "+aux.getApellido());
        elijeMascota();
            
        }
    }
    
    public void mostrar(){
        for (Persona aux : listaPersona)
        {System.out.println(aux.toString());
            
        }
    }

}
