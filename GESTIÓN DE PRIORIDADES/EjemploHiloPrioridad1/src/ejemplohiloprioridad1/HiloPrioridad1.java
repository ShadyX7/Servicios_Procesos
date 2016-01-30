package ejemplohiloprioridad1;

// Se crea una clase que extiende Thread.
public class HiloPrioridad1 extends Thread
{
    private float c = 0;
    private boolean stopHilo = false;
        
    // Se define un método para finalizar el hilo.    
    public void pararHilo()
    {        
        stopHilo = true;
    }

    
    // La variable contador será incrementada.
    @Override
    public void run() 
    {                    
        while (!stopHilo) 
        { 
            // El contador del hilo al que se le ha asignado mayor prioridad 
            // contará más deprisa que el de menos prioridad.
            c++;
        }
    }        
    
    // Se define un método para obtener el valor de la variable.
    public float getContador()
    {
        return c;
    }        
}
