package compartirinf2;

/* A menudo los hilos necesitan comunicarse unos con otros, la forma de 
comunicarse consiste usualmente en compartir un objeto. En el siguiente ejemplo 
dos hilos comparten un objeto de la clase Contador. */

/* Una forma de evitar que esto suceda es hacer que las operaciones de 
   incremento y decremento del objeto contador se hagan de forma atómica, 
   es decir, si estamos realizando la suma nos aseguramos de que nadie realice 
   la resta hasta que no terminemos la suma. Esto se puede lograr añadiendo la 
   palabra synchronized a la parte de código que queramos que se ejecute de 
   forma atómica. */

public class CompartirInf2 {

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
        
        // Se debe evitar la sincronización de bloques de código y sustituirlas 
        // siempre que sea posible por la sincronización de métodos.
        
        // HiloA contador vale 400
        // HiloB contador vale 100
    }
    
}
