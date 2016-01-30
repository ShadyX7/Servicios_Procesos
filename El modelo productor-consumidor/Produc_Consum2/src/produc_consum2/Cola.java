package produc_consum2;

/* Declarar los métodos get() y put() de la clase Cola como synchronized, de esta 
manera el productor y consumidor no podrán acceder simultanemamente al objeto 
Cola compartido; es decir el productor no puede cambiar el valor de la cola 
cuando el consumidor esté recogiendo su valor; y el consumidor no puede recoger 
el valor cuando el productor lo esté cambiando */

// La clase Cola que será el objeto compartido entre el productor y el 
// consumidor. 

//El recurso a compartir es la cola con los números.
public class Cola 
{
    // La clase Cola define 2 atributos y dos métodos.
    // En el atributo numero se guarda el número entero    
    private int numero;
    
    // El atributo disponible se utiliza para indicar si hay disponible o no un 
    // número en la cola.
    private boolean disponible = false; // Inicialmente cola vacia
    

    /* Es necesario mantener una coordinación entre el productor y el consumidor, 
    de forma que cuando el productor ponga un número en la cola, avise al 
    consumidor de que la cola está disponible para recoger su valor; y al revés, 
    cuando el consumidor recoja el valor de la cola debe avisar al productor de 
    que la cola ha quedado vacía. A su vez, el consumidor deberá esperar hasta 
    que la cola se llene y el productor esperará hasta que la cola esté 
    nuevamente vacía para poner otro número. */
    
    /* Para mantener esta coordinación usamos los métodos wait(), notify() y notifyAll():
    - wait(): un hilo que llama al método wait() de un cierto objeto queda 
              suspendido hasta que otro hilo llame al método notify() o notifyAll() 
              del mismo objeto.
    
    - notify(): despierta solo a uno de los hilos que realizó una llamada a wait() 
                sobre el mismo objeto notificándole de que ha habido un cambio 
                de estado sobre el objeto. Si varios hilos están esperando el 
                objeto, solo uno de ellos es elegido para ser despertado, la 
                elección es arbitraria.
    
    - notifyAll(): despierta todos los hilos que están esperando el objeto.
    */
    
    //NOTA: Los métodos notify() y wait() pueden ser invocados solo desde dentro 
    // de un método sincronizado o dentro de un bloque o una sentencia sincronizada.
    
    // El método get() tiene que esperar a que la cola se llene, esto se realiza 
    // en el bucle while: mientras la cola esté vacía, es decir disponible es 
    // false (while (!disponible)), espero (wait). Se sale del bucle cuando llega 
    // un valor, en este caso se vuelve a poner disponible a false (porque se va 
    // a devolver quedando la cola vacia de nuevo), se notifica a todos los hilos 
    // que comparten el objeto este hecho y se devuelve el valor.
    public synchronized int get() 
    {
        while (disponible == false)
        {
            try {
                wait();
            } catch (InterruptedException e) 
            { }
        }
        
        disponible = false;
        
        notifyAll();
        
        return numero;
    }
    
    
    /* El método putO tiene que esperar a que la cola se vacíe para poner el 
    valor, entonces espera (wait) mientras haya valor en la cola (while 
    (disponible)). Cuando la cola se vacía, disponible es false, entonces se 
    sale del bucle, se asigna el valor a la cola, se vuelve a poner disponible a 
    true (porque la cola esta llena) y se notifica a todos los hilos que 
    comparten el objeto este hecho. */
    public synchronized void put(int valor) 
    {
        while (disponible == true)
        {
            try {
            wait();
            } catch (InterruptedException e) 
            { }            
        }
        
        numero = valor;
        
        disponible = true;
        
        notifyAll();
    }
}
