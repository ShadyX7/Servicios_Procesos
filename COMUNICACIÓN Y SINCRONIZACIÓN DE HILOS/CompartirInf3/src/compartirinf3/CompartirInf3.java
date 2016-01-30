package compartirinf3;

public class CompartirInf3 {
  
    /* Imagina la situación que dos personas comparten una cuenta y pueden sacar 
       dinero de ella en cualquier momento; antes de retirar dinero se comprueba
       siempre si existe saldo. La cuenta tiene 50€, una de las personas quiere 
       retirar 40 y la otra 30. La primera llega al cajero, revisa el saldo, 
       comprueba que hay dinero y se prepara para retirar el dinero, pero antes 
       de retirarlo llega la otra persona a otro cajero, comprueba el saldo que 
       todavía muestra los 50€ y también se dispone a retirar el dinero. 
       Las dos personas retiran el dinero, pero entonces el saldo actual será 
       ahora de -20. */

    // Se crea el método main().     
    public static void main(String[] args) 
    {
        // Primero se define un objeto de la clase Cuenta y se le asigna un 
        // saldo inicial de 40. 
        Cuenta c = new Cuenta(40);
        
        
        // Se crean dos objetos de la clase SacarDinero, imaginemos que son las 
        // dos personas que comparten la cuenta.        
        SacarDinero hl = new SacarDinero("Ana", c);
        SacarDinero h2 = new SacarDinero("Juan", c);
        
        
        // Se inician los hilos.            
        hl.start();
        h2.start();  
        
        
        /* Observamos que se ha permitido retirar saldo cuando este era 0.
        SE VA A RETIRAR SALDO (ACTUAL ES: 40)
        SE VA A RETIRAR SALDO (ACTUAL ES: 40)
        Ana retira => 10 ACTUAL(30)
        Juan retira => 10 ACTUAL(30)
        SE VA A RETIRAR SALDO (ACTUAL ES: 30)
        SE VA A RETIRAR SALDO (ACTUAL ES: 30)
        Juan retira => 10 ACTUAL(10)
        Ana retira => 10 ACTUAL(10)
        SE VA A RETIRAR SALDO (ACTUAL ES: 10)
        SE VA A RETIRAR SALDO (ACTUAL ES: 10)
        Juan retira => 10 ACTUAL(-10)
        Ana retira => 10 ACTUAL(-10)
        SALDO NEGATIVO => -10
        Ana No puede retirar dinero, NO HAY SALDO (-10)
        SALDO NEGATIVO => -10
        SALDO NEGATIVO => -10
        Juan No puede retirar dinero, NO HAY SALDO (-10)
        SALDO NEGATIVO => -10       
        */
    }
    
}
