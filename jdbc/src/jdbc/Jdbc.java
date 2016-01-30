/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import com.mysql.jdbc.Statement;

/**
 *
 * @author dam
 */
public class Jdbc {
    private static Object con;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        try{
            
            System.out.println("Intento conectarme a la base de datos...");
            Class.forName("com.mysql.jdbc.Driver");
        }
        
        
        Statement estado = con.createStatement();
        ResulSet resultado = estado.executeQuery("SELECT * FROM agenda BY id ASC");
        
        System.out.println("ID \t Telefono");
        
    }
    
}
