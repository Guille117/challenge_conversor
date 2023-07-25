package gt.com.conversor.logica;

/**
 *
 * @author Gui
 */
public class Elemento {
    private final String nombreSingular;
    private final String nombrePlural;
    private double valorDeReferencia;
    
    public Elemento(String nombreSingular, String nombrePlural, double valorDeReferencia){
        this.nombreSingular = nombreSingular;
        this.nombrePlural = nombrePlural;
        this.valorDeReferencia = valorDeReferencia;
    }
    
    public String getNombreSingular(){
        return this.nombreSingular;
    }
    
    public String getNombrePlural(){
        return this.nombrePlural;
    }

    public double getValorDeReferencia() {
        return valorDeReferencia;
    }
    
    
}
