package hiloejemplointerrup2;

// Quita la línea Thread.sleep(J O); también hay que quitar el bloque try-catch, 
// la interrupción será recogida por el método islnterruptedO, que será true con 
// lo que la ejecución del hilo terminará ya que finaliza el método run().

public class HiloEjemplointerrup2 extends Thread {

    // En el método run() se comprueba en el bucle while si el hilo está 
    // interrumpido, si no lo está se ejecuta el código.
    public void run() 
    {  
        // El método islnterrupted() devuelve true si el hilo ha sido interumpido.
        while (!isInterrupted())
        {    
            System.out.println("En el Hilo");
        }    
  
        System.out.println("FIN HILO");
    }    
     
    
    public void interrumpir()
    {
        // interrupt() envía una petición de interrupción a un hilo.
        interrupt(); 
    }
    
    
    public static void main(String[] args) 
    {
        HiloEjemplointerrup2 h = new HiloEjemplointerrup2();

        h.start();
        
        for(int i=0; i<10000000; i++){} //no hago nada

        h.interrumpir(); 
    }
}
