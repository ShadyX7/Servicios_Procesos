package ejemplo2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
Para los comandos de Windows que no tienen ejecutable es necesario utilizar el 
comando CMD.EXE.
*/
public class Ejemplo2 {


    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        
        // Para hacer un DIR tendrías que escribir en el comando lo siguiente
        String comando= "CMD /C DIR" ;
        
        Process p = null;
        
        try
        {
            // La salida del comando se redirige a nuestro programa Java.
            // Para leer la salida, es decir lo que nos devuelve el método exec() 
            // del Runtime, tenemos que usar el objeto Process.
            p = r.exec(comando);
            
            // La clase Process posee el método getlnputStream() que nos permite 
            // leer el stream de salida del proceso, es decir, podemos leer lo 
            // que el comando que ejecutamos escribió en la consola.
            InputStream is= p.getInputStream();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            
            
            // Para leer la salida usamos el método readLine() de BufferedReader 
            // que nos devuelve una línea de texto.
            String linea;
            
            while((linea = br.readLine()) != null) //lee una línea            
                System.out.println(linea);
            
            br.close () ;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
        // COMPROBACION DE ERROR - O bien - 1 mal
        int exitVal;

        try 
        {
            // El método waitFor() hace que el proceso actual espere hasta que 
            // el subproceso representado por el objeto Process finalice. 
            // Devuelve O si ha finalizado correctamente.
            
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: "+ exitVal);
        }        
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }    
        
    }
    
}
