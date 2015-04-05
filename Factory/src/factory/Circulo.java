/*
 * Clase Circulo que crea objetos Circulos , Implementa la interface Figura
 * 
 * 
 */
package factory;

/**
 *
 * @author Sinner
 */
public class Circulo implements Figura{
    double radius;
    /*
        Constructor de Circulo
    */
    public Circulo(double radius){
        this.radius=radius;
    }
    // Metodo llamado de la interface Figura
    @Override
    public double getArea() {
        return(3.14*this.radius*this.radius);
    }
    /*
    //----------------Getters and Setters
    */
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
