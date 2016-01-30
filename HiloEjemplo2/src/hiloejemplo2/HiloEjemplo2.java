package hiloejemplo2;

public class HiloEjemplo2 extends Thread 
{

    @Override
    public void run() {
        System.out.println("Dentro del Hilo:" + this.getName() +  // Devuelve el nombre del hilo.
                ", Prioridad: " + this.getPriority() +            // Devuelve la prioridad del hilo.
                ", ID: " + this . getId() ); 
    } 
    
    
    public static void main(String[] args) 
    {
        HiloEjemplo2 h = null;
        
        for (int i = 0; i < 3; i++) {
             h = new HiloEjemplo2(); //crear hilo
             
             h.setName("HILO " + i); //damos nombre al hilo
             h.setPriority(i + 1); //damos prioridad
             
             h.start(); //iniciar hilo

             // toString() devuelve un string que representa al hilo.
             // Thread[nombre del hilo, la prioridad, grupo de hilos}
             System.out.println("Informacion del " +
             h.getName() + ": " + h.toString());
        }
        
        System.out.println("3 HILOS CREADOS ... ");
        
    } // main.
    
} // clase.
