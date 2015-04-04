/*
 * En la clase Principal invocaremos el Singletone que estara en la clase Configurator
 * El Singletone usado aqui es para que la clase Configurator tenga unicamente un objeto que hara que se conecte
 * a una Base de Datos
 */
package singletone;

/**
 *
 * @author Sinner
 */
public class Principal {
    public static void main(String[] args) {
        Configurator c = Configurator.getConfigurator("url.example", "db_example");
        
        System.err.println("La url de la base de datos es : "+c.getUrl());
        System.err.println("El nombre de la base de datos es : "+c.getBaseDatos());
    }
    
}
