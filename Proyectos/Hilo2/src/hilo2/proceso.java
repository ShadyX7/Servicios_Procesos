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
public class proceso extends Thread{
    
    public proceso(String str){
        super(str);
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Este es el Thread: " + getName());
            
        }
    }
    
}
