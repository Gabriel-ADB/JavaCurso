package com.javagabeto.servicio;

import java.time.LocalDate;
import java.util.Scanner;

import com.javagabeto.entidades.Alquiler;
import com.javagabeto.entidades.BarcoMotor;
import com.javagabeto.entidades.Velero;
import com.javagabeto.entidades.Yate;

public class AlquilerService {
    private Scanner sc;

    public AlquilerService() {
        sc = new Scanner(System.in);
    }

    public void ejecMenu(){
        System.out.println("Este es el sistema de alquiler de barcos by Gabeto!");

        System.out.println("Ingrese nombre y apellido del cliente: ");
        String name = sc.nextLine();

        System.out.println("Dni cliente: ");
        String dni = sc.nextLine();

        System.out.println("Fecha de alquiler (formato AAAA/MM/DD): ");
        LocalDate fechaIni = LocalDate.parse(sc.nextLine());

        System.out.println("Fecha de devolucion (formato AAAA/MM/DD): ");
        LocalDate fechaFin = LocalDate.parse(sc.nextLine());

        System.err.println("Posicion del amarre: ");
        int posicion = sc.nextInt();
        System.out.println("Ingrese el tipo de barco especial:");
        System.out.println("1. Velero");
        System.out.println("2. Barco a motor");
        System.out.println("3. Yate");
        System.out.print("Ingrese el número correspondiente: ");
        int tipoBarcoEspecial = sc.nextInt();

        switch (tipoBarcoEspecial) {
            case 1:
                Velero velero1 = crearVelero();
                Alquiler alquilerVelero = new Alquiler(name, dni, fechaIni, fechaFin,
                        posicion, velero1);
                System.out.println("Precio final del alquiler del velero: $" + alquilerVelero.calcularPrecioFinal());
                break;
            case 2:
                BarcoMotor barcoMotor = crearBarcoMotor();
                Alquiler alquilerBarcoMotor = new Alquiler(name, dni, fechaIni,
                        fechaFin, posicion, barcoMotor);
                System.out.println(
                        "Precio final del alquiler del barco a motor: $" + alquilerBarcoMotor.calcularPrecioFinal());
                break;
            case 3:
                Yate yate = crearYate();
                Alquiler alquilerYate = new Alquiler(name, dni, fechaIni, fechaFin,
                posicion, yate);
                System.out.println("Precio final del alquiler del yate: $" + alquilerYate.calcularPrecioFinal());
                break;
            default:
                System.out.println("Opción inválida");
        }

    }
    private BarcoMotor crearBarcoMotor() {
        System.out.print("Ingrese la matrícula del barco a motor: ");
        String matricula = sc.next();
        System.out.print("Ingrese la eslora del barco a motor: ");
        double eslora = sc.nextDouble();
        System.out.print("Ingrese el año de fabricación del barco a motor: ");
        int anioFabricacionBarcoMotor = sc.nextInt();
        System.out.print("Ingrese la potencia en CV del barco a motor: ");
        int potenciaCV = sc.nextInt();
        return new BarcoMotor(matricula, eslora, anioFabricacionBarcoMotor, potenciaCV);
    }

    private Yate crearYate() {
        System.out.print("Ingrese la matrícula del yate: ");
        String matricula = sc.next();
        System.out.print("Ingrese la eslora del yate: ");
        double eslora = sc.nextDouble();
        System.out.print("Ingrese el año de fabricación del yate: ");
        int anioFabricacionYate = sc.nextInt();
        System.out.print("Ingrese la potencia en CV del yate: ");
        int potenciaCV = sc.nextInt();
        System.out.print("Ingrese el número de camarotes del yate: ");
        int numCamarotes = sc.nextInt();
        return new Yate(matricula, eslora, anioFabricacionYate, potenciaCV, numCamarotes);
    }
    private Velero crearVelero() {
        System.out.print("Ingrese la matrícula del velero: ");
        String matricula = sc.next();
        System.out.print("Ingrese la eslora del velero: ");
        double eslora = sc.nextDouble();
        System.out.print("Ingrese el año de fabricación del velero: ");
        int anioFabricacionVelero = sc.nextInt();
        System.out.print("Ingrese el número de mástiles del velero: ");
        int numMastiles = sc.nextInt();
        return new Velero(matricula, eslora, anioFabricacionVelero, numMastiles);
    }
    
}
