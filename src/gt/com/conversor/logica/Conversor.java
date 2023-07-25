package gt.com.conversor.logica;

/**
 *
 * @author Gui
 */
public class Conversor {                                    
    private Elemento convertirDe;               // recibe dos atributos de tipo Elemento que serán la unidad de partida y la unidad final
    private Elemento convertirA;
    private double cantidad;                        // recibe tambien la cantidad a convertir
    
    public Conversor(Elemento convertirDe, Elemento convertirA, double cantidad){
        this.convertirDe = convertirDe;
        this.convertirA = convertirA;
        this.cantidad = cantidad;
    }
    
    private double convertirAValorReferencia(){                             //  convertimos la cantidad a la unidad de referencia
        return cantidad/convertirDe.getValorDeReferencia();
    }
    
    public double convertir(){                                                  // determinamos la cantidad a la unidad final
        return convertirAValorReferencia() * convertirA.getValorDeReferencia();
    }
    
    
}
