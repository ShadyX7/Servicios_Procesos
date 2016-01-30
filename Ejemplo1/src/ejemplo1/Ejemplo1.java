/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author dam
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Runtime r = Runtime.getRuntime();
        
        //Para hacer un DIR tendrías que escribir en el comando lo siguiente
        String comando = "CMD /C DIR";
        
        Process p = null;
        
        try{
            
        p = r.exec(comando);
        InputStream is = p.getInputStream();
        
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            
            while((linea = br.readLine()) != null)
                System.out.println(linea);
            
            br.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        int exitVal;
        
        try{
            
            
        }
    }
    
}
