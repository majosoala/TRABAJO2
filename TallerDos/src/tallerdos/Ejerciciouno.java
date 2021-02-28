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
public class Ejerciciouno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su primer entero");
        int num1=entrada.nextInt();
        System.out.println("Digite su segundo entero");
        int num2=entrada.nextInt();
        System.out.printf("num1 = %d\n", num1 );
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1) );
        System.out.printf("num1=%.2f\n",(double) num1 );
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1) );
    }
    
}
