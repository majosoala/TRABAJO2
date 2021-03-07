package tallercuatro4;

import java.util.Scanner;

/**
 *
 * @author majos
 */
public class PruebaInventario {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Inventario i=new Inventario();
        System.out.println("INVENTARIO");
        System.out.println("Digite el codigo del producto");
        int cod=entrada.nextInt();
        System.out.println("Digite la marca");entrada.nextLine();
        String marca=entrada.nextLine();
        System.out.println("Digite precio de compra");
        double precio=entrada.nextDouble();
        System.out.println("Digite el porcentaje de utilidad");
        double pdu=entrada.nextDouble();
        i.setCod(cod);
        i.setMarca(marca);
        i.setPrecio(precio);
        i.setPdu(pdu);
        System.out.println("El codigo es: "+ i.getCod() );
        System.out.println("La marca es: "+ i.getMarca() );
        System.out.println("El precio es: "+ i.getPrecio() );
        System.out.println("El porcentaje de utilidad  es: "+ i.getPdu());
        System.out.println("El precio de venta es: "+ i.Pcompra()  );
    }
  
}
    
