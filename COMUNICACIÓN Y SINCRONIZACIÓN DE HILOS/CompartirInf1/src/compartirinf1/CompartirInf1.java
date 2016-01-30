package compartirinf1;

/* A menudo los hilos necesitan comunicarse unos con otros, la forma de 
comunicarse consiste usualmente en compartir un objeto. En el siguiente ejemplo 
dos hilos comparten un objeto de la clase Contador. */
public class CompartirInf1 {

    // Se crea el método main().
    public static void main(String[] args) {

        // Primero se define un objeto de la clase Contador y se le asigna el 
        // valor inicial de 100.
        Contador cont = new Contador(100);
        
        
        // Se crean los dos hilos pasándoles dos parámetros: un nombre y el 
        // objeto Contador.
        HiloA a = new HiloA("HiloA", cont);
        HiloB b = new HiloB("Hil0B", cont);
        
        
        // Se inicia la ejecución de los hilos.
        a.start () ;
        b.start () ;
        
        // Nos puede dar la impresión de que al ejecutar los hilos, el valor del 
        // contador en el hilo A debería ser 400, ya que empieza en 100 y le 
        // suma 300; y en B, 100 ya que se resta 300; pero no es así. 
        
        // Al ejecutar el programa los valores de salida pueden no ser los 
        // esperados y variará de una ejecución a otra.        
        
        //Hil0Bcontador vale 98
        //HiloAcontador vale 98
    }
    
}
