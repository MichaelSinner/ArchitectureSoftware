/*
 * 
 * Factory de Figuras
 * 
 */
package factory;

/**
 *
 * @author Sinner
 */

public class FiguraFactory {
    public final static int CUADRADO = 0;
    public final static int CIRCULO = 1;
 
    public static Figura getFigura(int tipo, double lado) {
        switch (tipo) {
        case CUADRADO:
        return new Cuadrado(lado);
        case CIRCULO:
        return new Circulo(lado);
    }  
    return null;
 }
}