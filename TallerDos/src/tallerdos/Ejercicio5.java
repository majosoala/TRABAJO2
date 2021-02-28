package tallerdos;
import java.util.Scanner;

/**Escriba un programa en Java que lea un carácter e imprima su correspondiente valor numérico (utilizar la conversión
de tipos).
 *
 * @author majos
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el caracter ");
        char ct=entrada.next().charAt(0);
        int asciiValue = ct;
        System.out.printf("El valor numerico de ct: %d ", asciiValue);
    }
    
}
