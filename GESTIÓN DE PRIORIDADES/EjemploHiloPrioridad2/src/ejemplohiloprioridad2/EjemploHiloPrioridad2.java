package ejemplohiloprioridad2;


public class EjemploHiloPrioridad2 {

    public static void main(String[] args) {
        
        // Se asignan diferentes prioridades a cada uno de los hilos.
        HiloPrioridad2 h1 = new HiloPrioridad2("Uno");
        HiloPrioridad2 h2 = new HiloPrioridad2("Dos");
        HiloPrioridad2 h3 = new HiloPrioridad2("Tres");
        HiloPrioridad2 h4 = new HiloPrioridad2("Cuatro");
        HiloPrioridad2 h5 = new HiloPrioridad2("Cinco");
        
        
        // Asignamos prioridad
        h1.setPriority(Thread.MIN_PRIORITY);
        h2.setPriority(3);
        
        h3.setPriority(Thread.NORM_PRIORITY);
        h4.setPriority(7);
        
        h5.setPriority(Thread.MAX_PRIORITY);
       
        
        // Se ejecutan los hilos.
        // En la ejecución se puede observar que no siempre el hilo con más  
        // prioridad es el que antes se ejecuta.                
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
        
        // Cuando un hilo entra en ejecución y no cede voluntariamente el control 
        // para que puedan ejecutarse otros hilos, se dice que es un "hilo 
        // egoísta". Algunos sistemas operativos, como Windows, combaten estas 
        // situaciones con una estrategia de planificación por división de tiempos
        // (time-slicing o tiempo compartido), que opera con hilos de igual 
        // prioridad que compiten por la CPU. En estas condiciones el sistema 
        // operativo divide el tiempo de proceso de la CPU en espacios de tiempo 
        // y asigna el tiempo de proceso a los hilos dependiendo de su prioridad. 
        // Así se impide que uno de ellos se apropie del sistema durante un 
        // intervalo de tiempo prolongado.
        
        // A la hora de programar hilos con prioridades hemos de tener en cuenta 
        // que el comportamiento no está garantizado y dependerá de la plataforma 
        // en la que se ejecuten los programas. En la práctica casi nunca hay que 
        // establecer a mano las prioridades.        
    }    
}
