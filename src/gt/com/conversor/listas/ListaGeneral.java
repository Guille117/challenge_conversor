package gt.com.conversor.listas;

import gt.com.conversor.logica.Elemento;
import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class ListaGeneral {
    
    private static Lista monedas(){
        Lista m1 = new Lista();
        
    m1.agregar(new Elemento("quetzal", "quetzales", 1));
    m1.agregar(new Elemento("peso mexicano", "pesos mexicanos", 2.1363));
    m1.agregar(new Elemento("libra esterlina", "libras esterlinas", 0.0974));
    m1.agregar( new Elemento("dolar estadounidense", "dolares estadounidenses", 0.1276));
    m1.agregar(new Elemento("euro", "euros", 0.1136));
    m1.agregar(new Elemento("yen", "yenes", 17.6671));
    m1.agregar(new Elemento("won", "wones", 161.4238));
        
        return m1;
    }
    
    private static Lista distancias(){
        Lista d1 = new Lista();
            
       d1.agregar(new Elemento("milímetro", "milímetros", 0.001));
        d1.agregar(new Elemento("centímetro", "centímetros", 0.01));
        d1.agregar(new Elemento("decímetro", "decímetros", 0.1));
        d1.agregar(new Elemento("metro", "metros", 1));
        d1.agregar(new Elemento("decámetro", "decámetros", 10));
        d1.agregar(new Elemento("hectómetro", "hectómetros", 100));
        d1.agregar(new Elemento("kilómetro", "kilómetros", 1000));
        
        return d1;
    }
    
    private static Lista tiempos(){
        Lista t1 = new Lista();
        
        t1.agregar(new Elemento("segundo", "segundos", 0.01667));
        t1.agregar(new Elemento("minuto", "minutos", 1));
        t1.agregar(new Elemento("hora", "horas", 60));
        t1.agregar(new Elemento("dia", "dias", 1440));
        t1.agregar(new Elemento("semana", "semanas",10080));
        
        return t1;
    }
    
    private static Lista liquidos(){
        Lista l1 = new Lista();
        
         l1.agregar(new Elemento("litro", "litros", 1));
        l1.agregar(new Elemento("mililitro", "mililitros", 1000));
        l1.agregar(new Elemento("centilitro", "centilitros", 100));
        l1.agregar(new Elemento("decilitro", "decilitros", 10));
        l1.agregar(new Elemento("decalitro", "decalitros", 0.1));
        l1.agregar(new Elemento("hectolitro", "hectolitros", 0.01));
        l1.agregar(new Elemento("kilolitro", "kilolitros", 0.001));
        
        return l1;
    }
    
    private static Lista masas(){
        Lista m1 = new Lista();
        
        m1.agregar(new Elemento("miligramo", "miligramos", 0.001));
        m1.agregar(new Elemento("centigramo", "centigramos", 0.01));
        m1.agregar(new Elemento("decigramo", "decigramos", 0.1));
        m1.agregar(new Elemento("gramo", "gramos", 1));
        m1.agregar(new Elemento("decagramo", "decagramos", 10));
        m1.agregar(new Elemento("hectogramo", "hectogramos", 100));
        m1.agregar(new Elemento("kilogramo", "kilogramos", 1000));
        
        return m1;
    }
    
    private ArrayList<Lista> lisGeneral;

    public ListaGeneral() {
        lisGeneral = new ArrayList();
        
        lisGeneral.add(monedas());
        lisGeneral.add(distancias());
        lisGeneral.add(tiempos());
        lisGeneral.add(liquidos());
        lisGeneral.add(masas());
    }
    
    public Lista getLista(int i){
        return lisGeneral.get(i);
    }
    

    
    
}
