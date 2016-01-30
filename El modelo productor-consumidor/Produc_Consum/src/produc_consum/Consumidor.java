package produc_consum;

// Los numeros serán consumidos por el consumidor.

/* La clase Consumidor es muy similar a la clase Productor, solo que en lugar de 
poner un número en el objeto Cola lo recoge llamando al método getO. En este 
caso no se ha puesto pausa, con esto hacemos que el consumidor sea más rápido 
que el productor */
public class Consumidor extends Thread
{
    private Cola cola ;
    private int n;
    
    
    public Consumidor(Cola c, int n)
    {            
        cola = c;
        this.n = n;    
    }    
    
    
    @Override
    public void run() 
    {
        int valor = 0;
        
        for (int i = 0; i < 5; i++) 
        {
            valor = cola.get(); //recoge el número
            
            System.out.println(i + " => Consumidor : " + n + ", consume: " + 
            valor);        
        }    
    }        
}
