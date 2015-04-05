/*
 * Primera clase (Mercurio) a la que va la Cadena de Responsabilidad y preguntamos si es posible vivir en ella 
 * delegara al siguiete objeto (planeta) si no es la informacion que buscamos
 * 
 */
package chainsofresponsability;

/**
 *
 * @author Sinner
 */
public class Mercurio extends PlanetaInformacion{

    @Override
    public void Solicitar(PlanetEnum request) {
        if(request==PlanetEnum.MERCURIO){
            System.out.println("La solicitud de MERCURIO obtiene la informacion de "+request+".");
            System.out.println("Informacion : Mercurio es muy caliente. \n");
        } else {
            System.out.println("La solicitud de MERCURIO no obtiene la informacion de "+request+".");
            if(successor!=null){
                successor.Solicitar(request);
            }
        }
    }
    
}
