package hiloejemplointerrup;


// Ejemplo que usa interrupciones para detener el hilo.
public class HiloEjemplointerrup extends Thread 
{
    // En el método run() se comprueba en el bucle while si el hilo está 
    // interrumpido, si no lo está se ejecuta el código.
    public void run() {
        try 
        {
            // El método islnterrupted() devuelve true si el hilo ha sido interumpido.
            while (!isInterrupted())
            {    
                System . out.println("En el Hilo");
            
                // Se pone a dormir; detener un hilo un número de milisegundos.
                Thread.sleep(10);
            }    
        }
        catch (InterruptedException e) 
        {
            System.out.println("HA OCURRIDO UNA EXCEPCIÓN");       
        }    
        
        System.out.println("FIN HILO");
    }    
     
    
    public void interrumpir()
    {
        // interrupt() envía una petición de interrupción a un hilo.
        // Si el hilo se encuentra bloqueado por una llamada a sleep() o wait() 
        // se lanza una excepción lnterruptedException.
        interrupt(); // lanza una interrupción que es recogida por el manejador (catch).
    }
    
    
    public static void main(String[] args) 
    {
        HiloEjemplointerrup h = new HiloEjemplointerrup();

        h.start();
        
        for(int i=0; i<10000000; i++){} //no hago nada

        h.interrumpir();      
    }
    
}
