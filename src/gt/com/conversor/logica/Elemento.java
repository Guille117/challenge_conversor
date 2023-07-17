package gt.com.conversor.logica;

/**
 *
 * @author Gui
 */
public class Elemento {
    private final String nombreSingular;
    private final String nombrePlural;
    private double valorDeReferencia;
    
    private void setValorDeReferencia(double valorDeReferencia){
        if(valorDeReferencia > 0){
          this.valorDeReferencia = valorDeReferencia;  
        }else{
            System.out.println("Valor inicial incorrecto!");
        }
    }
    
    public Elemento(String nombreSingular, String nombrePlural, double valorInicial){
        this.nombreSingular = nombreSingular;
        this.nombrePlural = nombrePlural;
        setValorDeReferencia(valorInicial);
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
