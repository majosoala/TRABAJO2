/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdos;

import java.util.Scanner;

/**Juan conoce el precio de compra y de venta de unos de los productos de su tienda y requiere conocer cuál es su % de
utilidad. Desarrolle un programa en java que lo ayude con ese cálculo.
 *
 * @author majos
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca en cuanto compró articulo");
        double c=entrada.nextDouble();
        System.out.println("Introduzca en cuanto vendió articulo");
        double v=entrada.nextDouble();
        double vn= v-c;
        double p=(vn/v)*100;
        System.out.printf("El porcentaje de utilidad es: %.2f", p);
        
        
    }
    
}
