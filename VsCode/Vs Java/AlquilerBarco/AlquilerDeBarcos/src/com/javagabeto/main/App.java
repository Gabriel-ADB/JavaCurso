package com.javagabeto.main;

import com.javagabeto.servicio.AlquilerService;

public class App {
    public static void main(String[] args) throws Exception {
        AlquilerService service = new AlquilerService();
        service.ejecMenu();
    }
}
