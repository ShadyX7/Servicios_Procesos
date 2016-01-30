package usahilo;


// Crea un hilo de nombre HiloSimple 
public class UsaHilo {

    public static void main(String[] args) 
    {
        // Usar el hilo creo la clase UsaHilo.
        HiloSimple hs = new HiloSimple();        
        hs.start();
                        
        for (int i=0; i<5; i++)
        {
            System.out.println("Fuera del hilo .. ");
        }    
    }
    
}
