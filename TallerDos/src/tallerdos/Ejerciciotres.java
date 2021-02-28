
package tallerdos;
import java.util.Scanner;
/**
 *
 * @author majos
 */
public class Ejerciciotres {

    /**
     * @param args the command line arguments
     /*Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas*/
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su primer decimal");
        float num1=entrada.nextFloat();
        System.out.println("Digite su segundo decimal");
        float num2=entrada.nextFloat();
        System.out.println("Digite su tercer decimal");
        float num3=entrada.nextFloat();
        float suma= num1+num2+num3;
        float prom= suma/3;
        float prod= num1*num2*num3;
        float coc= num1/num2/num3;
        float mod= ( num1 % num2 % num3);
        System.out.printf("la suma de %.2f + %.2f + %.2f es: %.2f\n ",num1,num2,num3, suma );
        System.out.printf("el promedio de %.2f + %.2f + %.2f /3 es: %.2f\n ",num1,num2,num3, prom);
        System.out.printf("el producto de %.2f * %.2f * %.2f es: %.2f\n ",num1,num2,num3, prod);
        System.out.printf("el cociente de %.2f / %.2f / %.2f es: %.2f\n ",num1,num2,num3, coc);
        System.out.printf("el modulo de %.2f , %.2f , %.2f es: %.2f\n ",num1,num2,num3, mod);
    }
    
}
