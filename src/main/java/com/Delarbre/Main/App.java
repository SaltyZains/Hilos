package com.Delarbre.Main;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Los datos obtenidos a través de los archivos de texto es lo siguiente");
        Lectura lec1 = new Lectura();
        Leer lec2 = new Leer();
        Thread hilo = new Thread(lec1);
        Thread hilo2 = new Thread(lec2);
        hilo.start();
        hilo2.start();
    }
}
