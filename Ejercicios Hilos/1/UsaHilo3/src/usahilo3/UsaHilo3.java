package usahilo3;

public class UsaHilo3 {

    public static void main(String[] args) {
                
        // Crear un objeto hilo.
        PrimerHilo p = new PrimerHilo(10);       
        
        // Para iniciar su ejecución utilizamos el método start().
        p.start();
                        
        for (int i=0; i<5; i++)
        {
            System.out.println("Fuera del hilo .. ");
        }  
    }
    
}
