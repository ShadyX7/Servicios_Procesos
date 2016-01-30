package ejemplohiloprioridad1;

// En el lenguaje de programación Java, cada hilo tiene una prioridad. 
public class EjemploHiloPrioridad1 {

    // Se definen 3 objetos de la clase HiloPrioridadl, a cada uno se le asigna 
    // una prioridad. 
    public static void main(String[] args) {
        
        // Por defecto, un hilo hereda la prioridad del hilo padre que lo crea.   
        HiloPrioridad1 h1 = new HiloPrioridad1();
        HiloPrioridad1 h2 = new HiloPrioridad1();
        HiloPrioridad1 h3 = new HiloPrioridad1();        

        
        // La prioridad se puede aumentar o disminuir mediante el método setPriority().
        
        // La prioridad no es más que un valor entero entre 1 y 10, siendo el 
        // valor 1 la mínima prioridad, MIN_PRIORITY. 
        // valor 10 la máxima, MAX_PRIORITY. 
        // valor 5 la normal, NORM_PRIORITY.        
        h1.setPriority(Thread.NORM_PRIORITY);
        h2.setPriority(Thread.MAX_PRIORITY);
        h3.setPriority(Thread.MIN_PRIORITY);
        
        // Si dos o más hilos están listos para ejecutarse y tienen la misma 
        // prioridad, la máquina virtual va cediendo control de forma cíclica (round-robin ).
        
        // El hilo de mayor prioridad sigue funcionando hasta que:
        // - Cede el control.
        // - Deja de ser ejecutable (ya sea por muerte o por entrar en el estado de bloqueo).
        // - Un hilo de mayor prioridad se convierte en ejecutable (porque se 
        // encontraba dormido o su operación de E/S ha finalizado o alguien lo 
        // desbloquea.
      
        
        // El planificador elige el hilo que debe ejecutarse en función de la 
        // prioridad asignada.
        // Si dos o más hilos están listos para ejecutarse y tienen la misma 
        // prioridad, la máquina virtual va cediendo control de forma cíclica 
        // (round-robin ).
        h1.start();
        h2.start();
        h3.start();        
        
        try 
        {
            Thread.sleep(10000);
        } 
        catch (Exception e) 
        {
            h1.pararHilo();
            h2.pararHilo();
            h3.pararHilo();
        }
    
        // Compila y ejecuta. Al finalizar cada hilo se muestran los valores del contador.
        
        // En sistemas Windows, puedes ejecutar varias veces el ejemplo y casi 
        // siempre los valores del contador dependerán de la prioridad asignada 
        // al hilo, pero no siempre ocurre esto.
        
        // El mismo ejemplo si lo ejecutas en un sistema Linux (Ubuntu) se 
        // observa que los valores de los contadores no dependen de la prioridad 
        // asignada al hilo.
        System.out.println("h2 (Prioridad Maxima): "+ h2.getContador());
        System.out.println("h1 (Prioridad Normal): "+ h1.getContador());
        System.out.println("h3 (Prioridad Minima): "+ h3.getContador());                       
    }
}