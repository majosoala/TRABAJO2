/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdos;

import java.util.Scanner;

/** Desarrolle un programa en java que calcule el índice de masa corporal BMI el cual está dado por la formula (pesoenKg
/ alturaenmetros*alturaenmetros)

 *
 * @author majos
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el peso ");
        double peso=entrada.nextFloat();
        System.out.println("Digite su altura en metros ");
        double h=entrada.nextDouble();
        double bmi=peso/(h*h);
        System.out.printf("Su indice de masa corporal es: %.2f \n", bmi);
      
        
    }
    
}
