package com.Delarbre.Main;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lectura implements Runnable{

        @Override
        public void run() {
            FileReader entrada = null;
            try {
                String linea = "";
                entrada = new FileReader("src/main/java/com/Delarbre/Archivos/Nombres.txt");
                BufferedReader br = new BufferedReader(entrada);
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
