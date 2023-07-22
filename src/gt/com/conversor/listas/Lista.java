
package gt.com.conversor.listas;

import gt.com.conversor.logica.Elemento;
import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class Lista {
    private ArrayList<Elemento> lis;
    private String nombre;
    
    public Lista(String nombre){
        lis = new ArrayList();
        this.nombre = nombre;
    }
    
    public void agregar(Elemento a1){
        lis.add(a1);
    }
    
    public int getTamaño(){
        return lis.size();
    }
    
    public Elemento getElemento(int i){
        return lis.get(i);
    }
    
    public String getNombreLista(){
        return this.nombre;
    }
    
}
