package compartirinf3;

public class SacarDinero extends Thread
{
    private Cuenta c;
    
    String nom;
    
    
    // Usa la clase Cuenta para retirar el dinero.
    // El constructor recibe una cadena, para dar nombre al hilo; y la cuenta 
    // que será compartida por varias personas.
    public SacarDinero(String n, Cuenta e) 
    {
        super (n);
        this.c = e;
    }
    
    
    // Se realiza un bucle donde se invoca al método RetirarDineroO de la clase 
    // Cuenta varias veces con la cantidad a retirar, en este caso siempre es 
    // 10, y el nombre del hilo.    
    @Override
    public void run()
    {
        for (int x = 1; x <= 4; x++) 
        {
            c.RetirarDinero(10, getName());
        }
    }
}
