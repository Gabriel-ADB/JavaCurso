package com.JavaGabetoADB.Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.JavaGabetoADB.Entidades.Alojamiento;
import com.JavaGabetoADB.Entidades.Camping;
import com.JavaGabetoADB.Entidades.ExtraHotelero;
import com.JavaGabetoADB.Entidades.Hotel;
import com.JavaGabetoADB.Entidades.Hotelx4;
import com.JavaGabetoADB.Entidades.Hotelx5;
import com.JavaGabetoADB.Entidades.Residencia;

public class AlojamientoService {

        Scanner sc = new Scanner(System.in);

        private List<Alojamiento> listaAlojamientos = new LinkedList<>();

        // Creamos los hoteles 4 estrellas con sus datos pasados por parametro
        Hotel hx4_1 = new Hotelx4("Hotel Frufru", "Lamadrid 234", "Quilmes", "Maira Mendoza", 1, 4, 5, 3, 0,
                        "El Buen Comer", 100, "A");
        Hotel hx4_2 = new Hotelx4("Hotel Owen", "Av.Regolleau 2234", "Berazategui", "Francisco Gutierrez", 2, 4, 6, 10,
                        0,
                        "El Historico", 200, "B");
        Hotel hx4_3 = new Hotelx4("Hotel El Faro", "Av.Varela 345", "Ezpeleta", "Martiniano Molina", 4, 3, 7, 1, 0,
                        "La Chacra", 120, "B");
        Hotel hx4_4 = new Hotelx4("Hotel El Rucca", "Calle 12 123", "Solano", "Anibal Fernandez", 2, 2, 4, 5, 0,
                        "Los Gallegos", 170, "B");

        // creamos los hoteles 5 estrallas con sus datos pasados por parametro
        Hotelx5 hx5_1 = new Hotelx5("Hilton hotel", "Av.Santa Fe 1234", "CABA", "Horacio Larreta", 7, 7, 14, 30, 0,
                        "Hilton resto", 300, "A", 10, 5, 5);
        Hotelx5 hx5_2 = new Hotelx5("Hilton hotel", "Av.Santa Fe 1234", "CABA", "Horacio Larreta", 7, 7, 14, 30, 0,
                        "Sheraton resto", 100, "A", 3, 2, 6);
        Hotelx5 hx5_3 = new Hotelx5("Hilton hotel", "Av.Santa Fe 1234", "CABA", "Horacio Larreta", 7, 7, 14, 30, 0,
                        "Alan Faenna resto", 200, "A", 8, 8, 2);

        // Creamos los campings con los datos pasados por parametro

        ExtraHotelero camp1 = new Camping("Camping luz y fuerza", "Av.Otamendi 900", "Quilmes", "Francisco Villordo",
                        true, 1000, 500d, 50, 10, false);
        ExtraHotelero camp2 = new Camping("Camping de los Papeleros", "Av.Sin Nombre 10", "Lomas de Zamora",
                        "Andres Messi", false, 1500, 500d, 75, 15, true);
        ExtraHotelero camp3 = new Camping("Camping De la Union Obrera Metalurgica", "Combate de los pozos 3023",
                        "El Pato", "Edison Cabani", false, 500, 500d, 25, 5, false);

        // Creamos las residencias con los datos pasados por parametro

        ExtraHotelero resi_1 = new Residencia("La Morada", "Av.13 786", "La Plata", "Juan Veron", true, 100, 2000d, 9, false,
                        true);
        ExtraHotelero resi_2 = new Residencia("Mi Casucha", "Pergamino 876", "CABA", "Jose Chatruc", true, 90, 1000d, 20, true,
                        false);
        ExtraHotelero resi_3 = new Residencia("La Vieja Nona", "Nicolas Milazzo 423", "Berazategui",
                        "Gabriel Batistuta", true, 105, 100d, 15, true, false);
        ExtraHotelero resi_4 = new Residencia("Aca se Duerme", "Martin Rodriguez 2900", "Quilmes", "Pity Alvarez",
                        false, 120, 1000d, 7, false, true);

        // Creamos metodo para cargar todos los alojamientos en la lista
        public void listaAlojamientos() {
                listaAlojamientos.add(hx4_1);
                listaAlojamientos.add(hx4_2);
                listaAlojamientos.add(hx4_3);
                listaAlojamientos.add(hx4_4);
                listaAlojamientos.add(hx5_1);
                listaAlojamientos.add(hx5_2);
                listaAlojamientos.add(hx5_3);
                listaAlojamientos.add(camp1);
                listaAlojamientos.add(camp2);
                listaAlojamientos.add(camp3);
                listaAlojamientos.add(resi_1);
                listaAlojamientos.add(resi_2);
                listaAlojamientos.add(resi_3);
                listaAlojamientos.add(resi_4);

        }

        public void mostrarMenu() {
                int opcion;
                do {
                    System.out.println("********** MENÚ **********");
                    System.out.println("1. Mostrar todos los alojamientos");
                    System.out.println("2. Mostrar hoteles de más caro a más barato");
                    System.out.println("3. Mostrar campings con restaurante");
                    System.out.println("4. Mostrar residencias con descuento");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea después de leer el entero
        
                    switch (opcion) {
                        case 1:
                            mostrarTodosLosAlojamientos();
                            break;
                        case 2:
                            mostrarHotelesDeMasCaroAMasBarato();
                            break;
                        case 3:
                            mostrarCampingsConRestaurante();
                            break;
                        case 4:
                            mostrarResidenciasConDescuento();
                            break;
                        case 0:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } while (opcion != 0);
            }
        
            private void mostrarTodosLosAlojamientos() {
                System.out.println("***** Todos los alojamientos *****");
                for (Alojamiento alojamiento : listaAlojamientos) {
                       
                    System.out.println(alojamiento);
                    System.out.println("===============================");
                }
                System.out.println();
            }
        
            private void mostrarHotelesDeMasCaroAMasBarato() {
                System.out.println("***** Hoteles de más caro a más barato *****");
                List<Hotel> hoteles = new ArrayList<>();
                for (Alojamiento alojamiento : listaAlojamientos) {
                    if (alojamiento instanceof Hotel) {
                        hoteles.add((Hotel) alojamiento);
                        System.out.println("===============================");
                    }
                }
                Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitacion).reversed());
                for (Hotel hotel : hoteles) {
                    System.out.println(hotel);
                    System.out.println("===============================");
                }
                System.out.println();
            }
        
            private void mostrarCampingsConRestaurante() {
                System.out.println("***** Campings con restaurante *****");
                for (Alojamiento alojamiento : listaAlojamientos) {
                    if (alojamiento instanceof Camping && ((Camping) alojamiento).isTieneRestaurante()) {
                        System.out.println(alojamiento);
                        System.out.println("===============================");
                    }
                }
                System.out.println();
            }
        
            private void mostrarResidenciasConDescuento() {
                System.out.println("***** Residencias con descuento *****");
                for (Alojamiento alojamiento : listaAlojamientos) {
                    if (alojamiento instanceof Residencia && ((Residencia) alojamiento).isTieneDescuento()) {
                        System.out.println(alojamiento);
                        System.out.println("===============================");
                    }
                }
                System.out.println();
            }

}
