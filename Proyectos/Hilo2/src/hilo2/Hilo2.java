/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo2;

/**
 *
 * @author dam
 */
public class Hilo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        proceso miHilo;
        proceso segundoHilo;
        
        // Creo un objeto de la clase proceso.
        // Le doy al hilo el nombre de Hilo1.
        miHilo = new proceso("Hilo1");
        segundoHilo = new proceso ("Hilo2");
        
        // Llamo al método start(), heredado de la superClase
        // que se encarga de llamar al método run().
        miHilo.start();
        segundoHilo.start();
    }
    
}
