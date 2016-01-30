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
public class Hilo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Crea un objeto del tipo proceso y dale un nombre.
        proceso miHilo = new proceso("Hilo1");
        
        
        //Crear un objeto de la clase Thread para lanzar la ejecución del nuevo hilo.
        Thread miThread;
        
        //Al constructor de la clase Thread hay que pasarle una referencia del objeto
        // de la clase que implementa la interfaz Runnable.
        
        miThread = new Thread(miHilo);
        
        //se arranca el objeto de la clase Thread
        miThread.start();
        
        //Cuando se ejecute el método start() del thread, éste llamará al método run()
        // definición en la nueva clase.
    }
    
}
