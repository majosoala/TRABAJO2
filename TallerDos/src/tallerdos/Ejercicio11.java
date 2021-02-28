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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("INTRODUZCA UN numero de 0 a 1000 --> ");
                    int num= entrada.nextInt();
                    if (num<1000 && num>100){
                        System.out.printf("Unidad %d\n  ", num%10);
                        num=num/10;
                        System.out.printf("Decena %d\n ", num%10);
                        System.out.printf("Unidad %d\n   ", num/10);
                        
                        }else if (num<100 && num>9){
                            System.out.printf("Unidad %d\n   ", num%10);
                            num=num/10;
                            System.out.printf("Decena %d\n   ", num%10);
                            
                        }else if (num<10 && num>0){
                            System.out.printf("Unidad %d\n   ", num%10);
                         
                        }else{ System.out.print("Numero fuera de rango");}
                    
    }
    
}
