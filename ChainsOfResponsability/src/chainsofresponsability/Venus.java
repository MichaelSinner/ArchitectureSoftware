/*
 * Segunda clase (Venus) a la que va la Cadena de Responsabilidad y preguntamos si es posible vivir en ella 
 * delegara al siguiete objeto (planeta) si no es la informacion que buscamos
 */
package chainsofresponsability;

/**
 *
 * @author Sinner
 */
public class Venus extends PlanetaInformacion{

    @Override
    public void Solicitar(PlanetEnum request) {
        if(request==PlanetEnum.VENUS){
            System.out.println("La solicitud de Venus obtiene la informacion de "+request+".");
            System.out.println("Informacion : Venus es muy toxico. \n");
        } else {
            System.out.println("La solicitud de Venus no obtiene la informacion de "+request+".");
            if(successor!=null){
                successor.Solicitar(request);
            }
        }        
    }
    
}
