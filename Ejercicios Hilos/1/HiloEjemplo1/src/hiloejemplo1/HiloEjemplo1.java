package hiloejemplo1;

// La compilación y ejecución del ejemplo anterior muestra la siguiente salida 
// en la que se puede observar que los hilos no se ejecutan en el orden en que 
// se crean.

// Se crea una clase que extiende Thread.
public class HiloEjemplo1 extends Thread
{
    private int c; // Contador de cada hilo.
    private int hilo;

  
    // Dentro de la clase se definen el constructor.
    public HiloEjemplo1(int hilo) 
    {
        this.hilo= hilo;
        System.out.println("CREANDO HILO:" + hilo);    
    }
    
  
    // Metodo run con la funcionalidad que realizará el hilo.
    // La misión del hilo será visualizar un mensaje donde se muestre el número 
    // de hilo que se está ejecutando y el contenido de un contador.
    @Override
    public void run()
    {
        c = 0;
        
        while (c <= 5)
        {
            System.out.println("Hilo:" + hilo + " C = " + c);
        }
    }    
    
    
    // El método main().
    public static void main(String[] args) 
    {
        HiloEjemplo1 h = null;
        
        // Se crearán 3 hilos en un bucle for.
        for(int i = 0; i < 3; i++) 
        {
            // Se utiliza una variable para mostrar el número de hilo que se 
            // ejecuta, esta variable se pasa como argumento al crear el hilo.
            // Es un número que se corresponde con el índice+ 1 del bucle que 
            // crea los hilos.
            h = new HiloEjemplo1(i+1); //crear hilo
            h.start(); //iniciar hilo
        }    
        
        System.out.println("3 HILOS CREADOS ... ");
        
    } // main
    
} // clase
