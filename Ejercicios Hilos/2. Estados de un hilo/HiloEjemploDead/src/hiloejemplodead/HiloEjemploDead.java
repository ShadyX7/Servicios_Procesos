package hiloejemplodead;


// Es posible matar a un hilo invocando su método stop().
// El método stop() está en desuso y no se debe llamar ya que cuando un
// hilo se detiene, inmediatamente no libera los bloqueos de los objetos.
// que ha bloqueado.
public class HiloEjemploDead extends Thread {

    // Para detener un hilo de manera segura, se puede usar una variable; 
    // En este ejemplo se usa la variable stopHilo que se inicializa con un valor false.
    private boolean stopHilo= false;
    
    
    // Para que termine el bucle del método run() se invoca al método
    // pararHilo() que cambia el valor de la variable a false.
    public void pararHilo () 
    {
        stopHilo = true;    
    }
 
    
    //metodo run
    public void run()
    {
        while (!stopHilo)
        {
            System.out.println("En el Hilo");    
        }
    }    
    
    
    public static void main(String[] args) {
        
        HiloEjemploDead h = new HiloEjemploDead ();
        
        // Cuando se invoca al método startO, el hilo pasa a Runnable.
        h.start ();
        
        for(int i=0; i < 1000000; i++){}//no hago nada
        
        h.pararHilo(); //parar el hilo       
    }
    
}
