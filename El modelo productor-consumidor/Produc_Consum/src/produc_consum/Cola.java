package produc_consum;

// la clase Cola que será el objeto compartido entre el productor y el 
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
    
    // El método get() devuelve el entero de la cola si está disponible 
    // (disponible = true) y antes pone la variable a false indicando cola vacía; 
    // si el número no está en la cola ( disponible = false) devuelve -1.
    public int get() 
    {
        if (disponible) // Hay numero en la cola
        {    
            disponible = false; // Se pone cola vacía
            
            return numero; // Se devuelve
        }    

        return -1; // No hay numero disponible, cola vacia
    }
    
    
    // El método put() guarda un entero en el atributo numero y hace que este 
    // esté disponible en la cola para que pueda ser consumido poniendo el valor 
    // true en disponible (cola llena).
    public void put(int valor) 
    {
        numero = valor; //coloca valor en la cola
        disponible = true; //disponible para consumir, cola llena
    }
}
