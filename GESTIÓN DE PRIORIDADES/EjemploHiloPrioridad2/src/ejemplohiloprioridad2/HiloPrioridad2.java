package ejemplohiloprioridad2;


public class HiloPrioridad2 extends Thread {

    HiloPrioridad2(String nom) 
    {
        this.setName(nom);
    }
    
    
    @Override
    public void run() 
    {
        System.out.println("Ejecutando [" + getName() + "]");
        
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("\t(" + getName() + ": " + i + ")");
        }    
        
    }
      
}
