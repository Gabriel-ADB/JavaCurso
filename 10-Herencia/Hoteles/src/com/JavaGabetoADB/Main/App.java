package com.JavaGabetoADB.Main;

import com.JavaGabetoADB.Servicio.AlojamientoService;

public class App {
    public static void main(String[] args) throws Exception {
     
        AlojamientoService menuService = new AlojamientoService();

        menuService.listaAlojamientos();
        menuService.mostrarMenu();


    }
}
