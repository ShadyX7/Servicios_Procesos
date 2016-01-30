package compartirinf4;

// La clase Cuenta, define un atributo saldo y tres métodos.
public class Cuenta {

    private int saldo;

    // El constructor inicia el saldo actual.
    Cuenta (int s) {saldo = s;} //inicializa saldo actual
    
    // Devuelve el valor del saldo.
    int getSaldo() {return saldo;} //devuelve el saldo   
    
    
   // Resta al saldo una cantidad. 
    void restar(int cantidad) //se resta la cantidad al saldo
    {
        saldo = saldo - cantidad;
    }
    
    // Realiza las comprobaciones para hacer la retirada de dinero, es decir que 
    // el saldo actual sea >= que la cantidad que se quiere retirar.
    
    /*
    La operación de retirar dinero, método RetirarDinero() de la clase Cuenta, 
    debería ser atómica e indivisible, es decir, si una persona está retirando 
    dinero, la otra debería ser incapaz de retirarlo hasta que la primera haya 
    realizado la operación. Para ello declaramos el método como synchronized.    
    */    
    
    /*
    Cuando un hilo invoca un método synchronized, trata de tomar el bloqueo del 
    objeto a que pertenezca. Si está libre, lo toma y se ejecuta. Si el bloqueo 
    está tomado por otro hilo se suspende el que invoca hasta que aquel finalice 
    y libere elbloqueo.
    */    
    synchronized void RetirarDinero(int cant, String nom) 
    {
       if (getSaldo() >= cant) {
            System.out.println("SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo()
            + ")" ) ;

            try 
            {
                // sleep() para probar que un hilo se duerma mientras el otro 
                // haga la operaciones.
                 Thread.sleep(500);
            } catch (InterruptedException ex) 
            { }

            restar(cant);

            System.out.println(nom + " retira => " + cant + " ACTUAL(" + getSaldo() 
            + ")" );
       }
       else {
            System.out.println(nom + " No puede retirar dinero, NO HAY SALDO (" 
            + getSaldo() + ")" );
       }
       
       if (getSaldo() < 0)
       {    
            System.out.println("SALDO NEGATIVO => " + getSaldo());
       }
    }//RetirarDinero
}//Cuenta       


