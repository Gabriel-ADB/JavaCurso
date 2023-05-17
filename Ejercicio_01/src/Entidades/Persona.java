/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private List<Perro> listaPerro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long dni, List<Perro> listaPerro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.listaPerro = listaPerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public List<Perro> getListaPerro() {
        return listaPerro;
    }

    public void setListaPerro(List<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", listaPerro=" + listaPerro + '}';
    }

    
}   
