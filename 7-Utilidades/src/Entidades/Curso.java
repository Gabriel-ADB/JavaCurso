/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;



/**
 *Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán:
 * nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o 
 * tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo 
 * String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
 * @author Gabriel
 */
public class Curso {
   
    private String nombreCurso;
    private int horasPorDia;
    private int horasPorSemana;
    private String turno;
    private double precioHora;
    private String [] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasPorDia, int horasPorSemana, String turno, double precioHora) {
        this.nombreCurso = nombreCurso;
        this.horasPorDia = horasPorDia;
        this.horasPorSemana = horasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(int horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
   
}
