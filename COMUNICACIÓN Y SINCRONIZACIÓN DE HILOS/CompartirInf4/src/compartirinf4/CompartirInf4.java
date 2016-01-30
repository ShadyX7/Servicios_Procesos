package compartirinf4;

public class CompartirInf4 {
  
    /* Imagina la situación que dos personas comparten una cuenta y pueden sacar 
       dinero de ella en cualquier momento; antes de retirar dinero se comprueba
       siempre si existe saldo. La cuenta tiene 50€, una de las personas quiere 
       retirar 40 y la otra 30. La primera llega al cajero, revisa el saldo, 
       comprueba que hay dinero y se prepara para retirar el dinero, pero antes 
       de retirarlo llega la otra persona a otro cajero, comprueba el saldo que 
       todavía muestra los 50€ y también se dispone a retirar el dinero. 
    */
    
    
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
        
        /*
        SE VA A RETIRAR SALDO (ACTUAL ES: 40)
        Ana retira => 10 ACTUAL(30)
        SE VA A RETIRAR SALDO (ACTUAL ES: 30)
        Juan retira => 10 ACTUAL(20)
        SE VA A RETIRAR SALDO (ACTUAL ES: 20)
        Ana retira => 10 ACTUAL(10)
        SE VA A RETIRAR SALDO (ACTUAL ES: 10)
        Juan retira => 10 ACTUAL(0)
        Ana No puede retirar dinero, NO HAY SALDO (0)
        Ana No puede retirar dinero, NO HAY SALDO (0)
        Juan No puede retirar dinero, NO HAY SALDO (0)
        Juan No puede retirar dinero, NO HAY SALDO (0) */       
    }
    
}

