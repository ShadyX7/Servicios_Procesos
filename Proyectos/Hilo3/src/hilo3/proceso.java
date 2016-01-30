/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo3;

/**
 *
 * @author Victor
 */
public class proceso implements Runnable {

    //Se crea un nombre del proceso.
    String NombreHilo;

    //Crea el constructor.
    public proceso(String str) {

        //Asigna a la variable el nombre del proceso.
        NombreHilo = str;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Este es el thread: " + NombreHilo);
        }

    }

}
