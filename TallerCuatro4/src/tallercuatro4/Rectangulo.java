package tallercuatro4;

/**
 *
 * @author majos
 */
public class Rectangulo {
    private double longitud;
    private double ancho;
    
    //constructor
    public Rectangulo () {
        this.longitud=0;
        this.ancho=0;
    }
    
    //metodos (get, set)
    public double getLongitud(){
        return this.longitud;   
    }
    public double getAncho(){
        return this.ancho;
    }
    public void setLongitud(double l){
        this.longitud=l; 
    }
    public void setAncho(double a){
        this.ancho=a;
    }
    
    //met
    public double Area(){
        return(this.ancho*this.longitud);
    }
    public double Perimetro(){
        return((this.ancho+this.longitud)*2);
    }
}
