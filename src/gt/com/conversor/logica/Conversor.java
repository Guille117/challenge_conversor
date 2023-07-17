package gt.com.conversor.logica;

/**
 *
 * @author Gui
 */
public class Conversor {
    private Elemento convertirDe;
    private Elemento convertirA;
    private double cantidad;
    
    private void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public Conversor(Elemento convertirDe, Elemento convertirA, double cantidad){
        this.convertirDe = convertirDe;
        this.convertirA = convertirA;
        setCantidad(cantidad);
    }
    
    private double convertirAValorReferencia(){
        return cantidad/convertirDe.getValorDeReferencia();
    }
    
    public double convertir(){
        return convertirAValorReferencia() * convertirA.getValorDeReferencia();
    }
    
    
}
