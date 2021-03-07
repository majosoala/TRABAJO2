package tallercuatro4;

import java.util.Scanner;

/**
 *
 * @author majos
 */
public class Pruebarectanguo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rectangulo r= new Rectangulo();
        System.out.println("RECTANGULO");
        System.out.println("Digite ancho");
        double ancho=entrada.nextDouble();
        System.out.println("Digite longitud");
        double longitud=entrada.nextDouble();
        r.setAncho(ancho);
        r.setLongitud(longitud);
        System.out.println("El ancho es: "+r.getAncho() );
        System.out.println("La longitud es: "+ r.getLongitud() );
        System.out.println("El area es: "+r.Area());
        System.out.println("El perimetro es: "+r.Perimetro());
        
   
    }
    
}
