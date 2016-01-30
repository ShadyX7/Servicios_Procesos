package compartirinf2;

// El constructor asigna un valor inicial al contador.
// Esta clase define un atributo contador y tres métodos.
public class Contador 
{
    private int c = 0; //atributo contador
    
    Contador (int c) { this.c = c;}
    
    // Incrementa una unidad el valor del contador.    
    public void incrementa() {c = c + 1;}

    // Decrementa una unidad el valor del contador.        
    public void decrementa() {c = c - 1;}

    // Coger el valor del contador.            
    public int getValor()    {return c;}     
    
} // CONTADOR
