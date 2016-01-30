
package usahilo;

// Hilo de nombre HiloSimple heredando de la clase Thread.
public class HiloSimple extends Thread {
    
  // En el método runO se indican las líneas de código que se ejecutarán 
  // simultáneamente con las otras partes del programa.  
    
  // Cuando se termina la ejecución de ese método, el hilo de ejecución termina
  // también.  
  public void run() {
      
    for (int i=0; i<5; i++)
    {
        System.out.println("En el Hilo ... ");
    } 
    
  }
  
}
