/*
 * Clase Configurator que es un singletone por su constructor que es privado. 
 * y un método estático publico que se encarga de instanciar el objeto la primera vez 
 * y almacenarlo en la variable estática.
 */
package singletone;

/**
 *
 * @author Sinner
 */
public class Configurator {
   private String url;
   private String baseDatos;
   private static Configurator myConfigurator;
   
   /*
        Constructor private Configurator
        parameters url, baseDatos
   */
   private Configurator(String url, String baseDatos){
       this.url=url;
       this.baseDatos=baseDatos;
   }
   
   /*
      Metodo estatico getConfigurator que instancia el objeto por primera vez
   */
   public static Configurator getConfigurator(String url , String baseDatos){
       if(myConfigurator == null){
           myConfigurator = new Configurator(url, baseDatos);
       }
        return myConfigurator;
   }
    
   //----------------------------Getters and Setters------------------------------------
   
   public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
   
   
   
}
