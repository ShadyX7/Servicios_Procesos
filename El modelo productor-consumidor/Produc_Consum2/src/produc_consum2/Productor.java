package produc_consum2;

// En el ejemplo, el productor produce números y los coloca en una cola.

/* El productor genera números de 0 a 5 en un bucle for, y los pone en el objeto 
Cola mediante el método putO; después se visualiza y se hace una pausa con 
sleep(), durante este tiempo el hilo está en el estado Not Runnable (no 
ejecutable) */
public class Productor extends Thread 
{
    private Cola cola;
    private int n;   
    
    
    public Productor(Cola c, int n)
    {
        cola = c;
        this.n = n;    
    }
    
    
    @Override
    public void run() 
    {
        for (int i = 0; i < 5; i++) 
        {                    
            cola.put(i); //pone el número
            
            System.out.println(i + " => Productor : " + n + " , produce : " + i);
            
            try 
            {
                sleep(100);
            } catch (InterruptedException e) 
            { }                        
        }
    }    
}

