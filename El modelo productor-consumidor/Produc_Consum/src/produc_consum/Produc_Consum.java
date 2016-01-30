package produc_consum;

/*
Un problema típico de sincronización es el que representa el modelo 
ProductorConsumidor.

Se produce cuando uno o más hilos producen datos a procesar y otros hilos los
consumen. El problema surge cuando el productor produce datos más rápido que el 
consumidor los consuma, dando lugar a que el consumidor se salte algún dato. 

Igualmente el consumidor puede consumir más rápido que el productor produce, 
entonces el consumidor puede recoger varias veces el mismo dato o puede no tener 
datos que recoger o puede detenerse, etc.

Por ejemplo, imaginemos una aplicación donde un hilo (el productor) escribe 
datos en un fichero mientras que un segundo hilo (el consumidor) lee los datos 
del mismo fichero; en este caso los hilos comparten un mismo recurso (el 
fichero) y deben sincronizarse para realizar su tarea correctamente.
*/

public class Produc_Consum {

    // Usa las clases para crear 3 objetos.
    public static void main(String[] args) 
    {
        Cola cola = new Cola();
           
        // Al constructor de las clases Productor y Consumidor le pasamos el 
        // objeto compartido de la clase Cola y un número entero que lo identifique.
        Productor p = new Productor(cola, 1);
        Consumidor c = new Consumidor(cola, 1);
        
        p.start();
        c.start();   
        
        // Se produce la siguiente salida, en la que se puede observar que el 
        // consumidor va más rápido que el productor (al que se le puso un 
        // sleep()) y no consume todos los números cuando se producen; el 
        // numerito de la izquierda de cada fila representa la iteración.
        
        /*
        0 => Productor : 1 , produce : 0
        0 => Consumidor : 1, consume: 0
        1 => Consumidor : 1, consume: -1
        2 => Consumidor : 1, consume: -1
        3 => Consumidor : 1, consume: -1
        4 => Consumidor : 1, consume: -1
        1 => Productor : 1 , produce : 1
        2 => Productor : 1 , produce : 2
        3 => Productor : 1 , produce : 3
        4 => Productor : 1 , produce : 4 */      
        
        /* En la iteración 0, el productor produce un 0 e inmediatamente el 
        consumidor lo consume, la cola se queda vacía. En la iteración 1 el 
        consumidor consume -1 que indica que la cola está vacía porque la 
        iteración 1 del productor no se ha producido. En la iteración 2 pasa lo 
        mismo, el consumidor toma -1 porque el productor aún no ha dejado valor 
        en la cola. Y así sucesivamente. */        
    }
    
}
