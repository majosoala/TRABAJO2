/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdos;

import java.util.Scanner;

/**
 *
 * @author majos
 */
public class Ejerciciodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su primer entero");
        int num1=entrada.nextInt();
        System.out.println("Digite su segundo entero");
        int num2=entrada.nextInt();
        int suma= num1+num2;
        int resta= num1-num2;
        int producto= num1*num2;
        System.out.printf("la suma de %d + %d es: %d\n ",num1,num2, suma );
        System.out.printf("la diferencia de %d - %d es: %d\n ",num1,num2, resta);
        System.out.printf("el producto de %d * %d es: %d\n ", num1, num2, producto);
    }
    
}
