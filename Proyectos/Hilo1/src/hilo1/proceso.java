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
public class proceso extends Thread {
    
    public proceso(String str){
        super(str);
        
    }
    
    //redifinicion del metodo run()
    
    //este es el método que se va a ejecutar a la hora de 
    //iniciar tu proceso.
    
    //run define la actividad principal del thread(hilo)
    public void run(){
        
        for (int i = 0; i < 10; i++) {
            
        
        
        //Saca por pantalla el nombre del proceso.
        // getName es el metodo que te permite mostrar el nombre de este
        // proceso
        System.out.println("Este es el thread: " + this.getName());
        }
        
    }
    
}
