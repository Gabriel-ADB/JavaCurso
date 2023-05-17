/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Cine {
    private String[][] sala = new String[8][6];
   private Pelicula peli;
   private double valorEntrada;
   private List<Espectador> listaEspectadores;

    public Cine() {
    }

    public Cine(Pelicula peli, double valorEntrada, List<Espectador> listaEspectadores) {
        this.peli = peli;
        this.valorEntrada = valorEntrada;
        this.listaEspectadores = listaEspectadores;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public List<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public void setListaEspectadores(List<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", peli=" + peli + ", valorEntrada=" + valorEntrada + ", listaEspectadores=" + listaEspectadores + '}';
    }

}
