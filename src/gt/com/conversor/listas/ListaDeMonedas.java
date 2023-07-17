package gt.com.conversor.listas;

import gt.com.conversor.logica.Elemento;
import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class ListaDeMonedas {
    private ArrayList<Elemento> monedas;
    
    Elemento a1 = new Elemento("quetzal", "quetzales", 1);
    Elemento a2 = new Elemento("peso mexicano", "pesos mexicanos", 2.1363);
    Elemento a3 = new Elemento("libra esterlina", "libras esterlinas", 0.0974);
    Elemento a4 = new Elemento("dolar estadounidense", "dolares estadounidenses", 0.1276);
    Elemento a5 = new Elemento("euro", "euros", 0.1136);
    Elemento a6 = new Elemento("yen", "yenes", 17.6671);
    Elemento a7 = new Elemento("won", "wones", 161.4238);
    
    public ListaDeMonedas(){
        monedas = new ArrayList<>();
        monedas.add(a1);
        monedas.add(a2);
        monedas.add(a3);
        monedas.add(a4);
        monedas.add(a5);
        monedas.add(a6);
        monedas.add(a7);
    }
    
    public Elemento retornarElemento(int indice){
        return monedas.get(indice);
    }
    
    public int getTamaño(){
        return monedas.size();
    }
    
}
