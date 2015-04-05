/*
 * 
 * Clase Cuadrado que realiza objetos tipos cuadrado e implementa la inteface Figura
 * 
 */
package factory;

/**
 *
 * @author Sinner
 */
public class Cuadrado implements Figura{
    double side;
    
    public Cuadrado(double side){
        this.side=side;
    }
    
    /*
        Metodo llamado de la Interface Figura
    */
    @Override
    public double getArea() {
        return this.side*this.side;
    }
     //--------------- Getters and Setters
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
}
