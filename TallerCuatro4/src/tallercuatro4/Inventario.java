package tallercuatro4;

/**
 *
 * @author majos
 */
public class Inventario {
    private int cod;
    private String marca;
    private double precio;
    private double pdu;
    
    //constructor
    public Inventario(){
        this.cod=0;
        this.marca="";
        this.precio=0;
        this.pdu=0;
    }
    
    //metodos (get,set)
    public int getCod(){
        return this.cod;
    }
    public String getMarca(){
        return this.marca;
    }
    public double getPrecio(){
        return this.precio;
    }
    public double getPdu(){
        return this.pdu;
    }
    public void setCod (int cod){
        this.cod=cod;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setPdu(double pdu){
        this.pdu=pdu;
    }
    // met
    public double Pcompra(){
        return(this.precio+(this.pdu*this.precio));
    }
}
