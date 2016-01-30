package compartirinf2;

public class HiloA extends Thread 
{
   private Contador contador;    
    
    public HiloA(String n , Contador c) 
    {
        setName(n);
        contador = c;    
    }        
    
    
    // En la clase HiloA se usa el método del objeto contador que incrementa en 
    // uno su valor.
    
    // Java utiliza los bloques synchronized para implementar las regiones críticas.
    @Override
    public void run()
    {
        
        /* El bloque synchronized lleva entre paréntesis la referencia al objeto 
        contador. Cada vez que un hilo intenta acceder a un bloque sincronizado 
        le pregunta a ese objeto si no hay algún otro hilo que ya le tenga 
        bloqueado. Es decir, le pregunta si no hay otro hilo ejecutando algun 
        bloque sincronizado con ese objeto. Si está tomado por otro hilo, 
        entonces el hilo actual se suspende y se pone en espera hasta que se 
        libere el bloqueo. Si está libre, el hilo actual bloquea el objeto y
        ejecuta el bloque; el siguiente hilo que intente ejecutar un bloque 
        sincronizado con ese objeto, será puesto en espera. El bloqueo del 
        objeto se libera cuando el hilo que lo tiene tomado sale del bloque 
        porque termina la ejecución, ejecuta un retum o lanza una excepción.        
        */        
        
        synchronized (contador) 
        {
            for (int j = 0; j < 300; j++)
            {    
                contador.incrementa(); //incrementa el contador

                // Se añade un sleep() intencionadamente para probar que un hilo se
                // duerma y mientras el otro haga otra operación con el contador, así 
                // la CPU no realiza de una sola vez todo un hilo y después otro, y  
                // podemos observar mejor el efecto
                try 
                {
                    sleep(100);
                } catch ( InterruptedException e)
                { 
                }
            }    
        
            System.out.println(getName() + " contador vale " + contador.getValor());
        }
    }   
        
}
