package usahilo3;

public class PrimerHilo extends Thread{
    
    private int x;
  
    // Desde el constructor se inicializa una variable. 
    PrimerHilo (int x)
    {
        this.x = x;
    }
    
    
    // En el método runO se escribe la funcionalidad del hilo.
    public void run() 
    {
        for (int i=0; i<x; i++)
        {    
            System.out.println("En el Hilo ... ");        
        }    
    }

}
