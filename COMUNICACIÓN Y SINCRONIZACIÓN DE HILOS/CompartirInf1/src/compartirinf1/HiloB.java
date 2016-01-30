
package compartirinf1;

// En la clase HiloB se usa el método que decrementa su valor.
public class HiloB extends Thread 
{
    private Contador contador;    
    
    public HiloB(String n , Contador c) 
    {
        setName(n);
        contador = c;    
    }        
    
    
    // En la clase HiloB se usa el método del objeto contador que decrementa en 
    // uno su valor.
    @Override
    public void run()
    {
        for (int j = 0; j < 300; j++)
        {    
            contador.decrementa(); //decrementa el contador
                
            // Se añade un sleep() intencionadamente para probar que un hilo se
            // duerma y mientras el otro haga otra operación con el contador, así 
            // la CPU no realiza de una sola vez todo un hilo y después otro, y  
            // podemos observar mejor el efecto.
            try 
            {
                sleep(100);
            } catch ( InterruptedException e)
            { 
            }
        }    
        
        System.out.println(getName() + "contador vale " + contador.getValor());    
    }    
}
