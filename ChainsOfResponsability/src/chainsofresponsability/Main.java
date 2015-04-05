/*
 * Clase Principal donde estan los chains para cada uno de los handle que queremos preguntar 
 * 
 * 
 */
package chainsofresponsability;

/**
 *
 * @author Sinner
 */
public class Main {
    public static void main(String[]arg){
        PlanetaInformacion chain = setUpChain();
        chain.Solicitar(PlanetEnum.VENUS);
        chain.Solicitar(PlanetEnum.MERCURIO);
        chain.Solicitar(PlanetEnum.TIERRA);
        chain.Solicitar(PlanetEnum.JUPITER);
    }
    public static PlanetaInformacion setUpChain(){
        PlanetaInformacion mercurioSolicitud = new Mercurio();
        PlanetaInformacion venusSolicitud = new Venus();
        PlanetaInformacion tierraSolicitud = new Tierra();
        
        mercurioSolicitud.setSuccessor(venusSolicitud);
        venusSolicitud.setSuccessor(tierraSolicitud);
        
        return mercurioSolicitud;
    
    }
}
