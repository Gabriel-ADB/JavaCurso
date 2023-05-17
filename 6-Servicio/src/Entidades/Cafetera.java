/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Gabriel
 */
public class Cafetera {
    private double cMax=1000;
    private double cActual=0;

    public Cafetera() {
    }

    public Cafetera(double cMax, double cActual) {
        this.cMax = cMax;
        this.cActual = cActual;
    }

    public double getcMax() {
        return cMax;
    }

    public void setcMax(double cMax) {
        this.cMax = cMax;
    }

    public double getcActual() {
        return cActual;
    }

    public void setcActual(double cActual) {
        this.cActual = cActual;
    }
    
}
