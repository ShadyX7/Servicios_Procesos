
package compartirinf1;

// Para probar el objeto compartido se definen dos clases que extienden Thread.
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
    @Override
    public void run()
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
        
        System.out.println(getName() + "contador vale " + contador.getValor());
    }   
    
} // FIN HILOA
