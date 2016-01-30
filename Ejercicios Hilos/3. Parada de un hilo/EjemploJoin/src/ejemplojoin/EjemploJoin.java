package ejemplojoin;


public class EjemploJoin {
   
    public static void main(String[] args) {

        // Se crean 3 hilos, cada uno da un valor diferente a la n, el primero  
        // el valor más pequeño y el tercero el valor más grande.                
        HiloJoin hl = new HiloJoin("Hilol",2);
        HiloJoin h2 = new HiloJoin("Hilo2",5);
        HiloJoin h3 = new HiloJoin("Hilo3",7);

        hl.start();
        h2.start();
        h3.start();
        
        // El método joinO puede lanzar la excepción InterruptedException, por
        // ello se incluye en un bloque try-catch.
        try 
        {
            // El método join() provoca que el hilo que hace la llamada (main) 
            // espere  la finalización de otros hilos.
            
            // Si en el hilo actual escribo h1.join(), el hilo se queda en 
            // espera hasta que muera el hilo sobre el que se realiza el join(), 
            // en este caso hl.
            
            // cada hilo finalice en el orden marcado según la llamada a join().
            hl.join(); 
            h2.join(); 
            h3.join();                       
        } 
        catch ( InterruptedException e) { }        
      
        // Si quitas los join() veras que el texto FINAL DE PROGRAMA no se 
        // mostrará al final.                
        System.out.println("FINAL DE PROGRAMA");
    }
    
}
