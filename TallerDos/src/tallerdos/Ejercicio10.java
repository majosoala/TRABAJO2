/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdos;

import java.util.Scanner;

/**Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras,
toneladas
 *
 * @author majos
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el peso a convertir en kilogramos");
        int m=entrada.nextInt();
        int g= m*1000;
        int l= m*2;
        double t=(double) m/1000;
        System.out.printf("La equivalencia de %d kilos en gramos es:%d\n ",m , g);
        System.out.printf("La equivalencia de %d kilos en libras es: %d\n ",m , l);
        System.out.printf("La equivalencia de %d kilos en toneladas es: %.2f\n ",m, t);
        
    }
    
}
