package produc_consum2;

/* La salida deseada es la siguiente: en cada iteración el productor produce un 
número (llena la cola) e inmediatamente el consumidor Jo consume (la vacía):

O=>Productorl : produce: o
O=>Consumidorl: consume: o
l=>Productorl : produce: 1
l=>Consumidorl: consume: 1
2=>Productorl : produce: 2
2=>Consumidorl: consume: 2
3=>Productorl : produce: 3
3=>Consumidorl: consume: 3
4=>Productorl : produce: 4
4=>Consumidorl: consume: 4
*/

// Para obtener esta salida es necesario que los hilos estén sincronizados.

public class Produc_Consum2 {
    
   // Usa las clases para crear 3 objetos.
    public static void main(String[] args) 
    {
        Cola cola = new Cola();
           
        // Al constructor de las clases Productor y Consumidor le pasamos el 
        // objeto compartido de la clase Cola y un número entero que lo identifique.
        Productor p = new Productor(cola, 1);
        Consumidor c = new Consumidor(cola, 1);
        
        p.start();
        c.start();           
        
        // NOTA: La ejecución del ejemplo no siempre muestra la salida esperada, 
        // aunque las iteraciones sí aparecen correctamente.        
    }
    
}
