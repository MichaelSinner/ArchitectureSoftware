/*
 * Clase Abstracta PlanetaManipulado con su metodo abstracto de solicitud de Acceso o manipulacion
 * 
 * 
 */
package chainsofresponsability;

/**
 *
 * @author Sinner
 */
public abstract class PlanetaInformacion {
    PlanetaInformacion successor;
    
    public void setSuccessor(PlanetaInformacion succesor){
        this.successor=succesor;
    }
    public abstract void Solicitar(PlanetEnum request);

    
}
