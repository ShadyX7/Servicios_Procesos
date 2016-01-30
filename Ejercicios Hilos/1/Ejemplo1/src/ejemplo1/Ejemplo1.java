
package ejemplo1;


public class Ejemplo1 {

    public static void main(String[] args) {
        // Tiempo de ejecucion del programa
        Runtime r = Runtime.getRuntime ();
        
        String comando= "NOTEPAD";
        
        Process p;

        try 
        {
            // Exec devuelve un objeto Process.
            p = r.exec( comando);
        } 
        catch (Exception e) 
        {
            System.out.println("Erro r en: "+comando);                
            e.printStackTrace();
        }
    
    }
}
