/*
 * Tercera clase (tierra) a la que va la Cadena de Responsabilidad y preguntamos si es posible vivir en ella 
 * delegara al siguiete objeto (planeta) si no es la informacion que buscamos
 * and open the template in the editor.
 */
package chainsofresponsability;

/**
 *
 * @author Sinner
 */
public class Tierra extends PlanetaInformacion{

    @Override
    public void Solicitar(PlanetEnum request) {
        if(request==PlanetEnum.TIERRA){
            System.out.println("La solicitud de Tierra obtiene la informacion de "+request+".");
            System.out.println("Informacion : Tierra es un planeta perfecto. \n");
        } else {
            System.out.println("La solicitud de Tierra no obtiene la informacion de "+request+".");
            if(successor!=null){
                successor.Solicitar(request);
            }
        }
        
    }
    
}
