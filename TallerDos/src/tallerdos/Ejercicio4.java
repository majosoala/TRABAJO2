
package tallerdos;
import java.util.Scanner;
/**
 *Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y
área. Imprima los resultados (con dos números decimales)
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el radio");
        double rd=entrada.nextFloat();
        double ar= Math.PI * Math.pow (rd,2);
        double lng= 2* Math.PI * rd;
        System.out.printf("el area de de la circunferencia es: %.2f  \n", ar);
        System.out.printf("la longitud de la circunferencia es: %.2f \n", lng);
        
            
        
    }
    
}
