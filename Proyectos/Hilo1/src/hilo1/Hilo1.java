/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo1;

/**
 *
 * @author Victor
 */
public class Hilo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro una variable de la clase proceso.
        proceso miHilo;
        
        // Creo un objeto de la clase proceso.
        //Le doy al hilo el nombre de Hilo1.
        miHilo = new proceso("Hilo1");
        
        //Llamo al método start(), heredado de la super clase thread,
        // que se encarga de llamar al metodo run().
        miHilo.start();
        
    }
    
}
