package ejemplojoin;

public class HiloJoin extends Thread {
    private int n;
    
    public HiloJoin(String nom, int n) 
    {
        super(nom);
        this.n= n;
    }
    
    // Visualiza en un bucle for un contador que empieza en 1 hasta un valor n 
    // que recibe el constructor del hilo.
    public void run () 
    {
        
        for(int i=1; i <= n; i++)
        {
            System.out.println(getName() + "· " + i);

            try 
            {
                sleep(1000);
            } catch (InterruptedException ignore) {}
        }
       
        System.out.println("Fin Bucle " + getName());
    }
}
