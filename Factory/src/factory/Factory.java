/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Sinner
 */
public class Factory {

   public static void main(String[] args) {
    int tipo = 0;
    double lado = 13;
 
    Figura figura = FiguraFactory.getFigura(tipo, lado);

    System.out.println("El area de la figura es: " + figura.getArea());
 }
}


