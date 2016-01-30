
package personasjdbc;

import java.util.List;

import jdbc.Persona;
import jdbc.PersonasJDBC;

public class PersonasJDBCTest
{

    public static void main(String[] args) 
    {        
	PersonasJDBC per = new PersonasJDBC();
        
        //Prueba del metodo insert
        //per.insert("Alberto", "Juarez");

        
        //Prueba del metodo update
        //per.update(1, "Nombre3", "Apellido3");
        
        //Prueba del metodo delete
        //per.delete(1);

        //Prueba del metodo select
        //Uso de un objeto persona para encapsular la informacion
        //de un registro de base de datos      
        
        List<Persona> personas = per.select();
        
        for(Persona persona : personas){
                System.out.print(" Persona Id:" + persona.getId_persona());
                System.out.print(" Nombre:" + persona.getNombre());
                System.out.print(" Apellido:" + persona.getApellido());
                System.out.println();
        
        }
                
    }
}
