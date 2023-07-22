package gt.com.conversor.listas;

import gt.com.conversor.logica.Elemento;
import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class ListaGeneral {
    
    private static Lista monedas(){
        Lista m1 = new Lista("divisas");
        
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
        Lista d1 = new Lista("distancia");
            
       d1.agregar(new Elemento("milímetro", "milímetros", 1000));
       d1.agregar(new Elemento("centímetro", "centímetros", 100));
       d1.agregar(new Elemento("pulgada", "pulgadas", 39.3701));
       d1.agregar(new Elemento("pie", "pies", 3.28084));
       d1.agregar(new Elemento("yarda", "yardas", 1.09361));
       d1.agregar(new Elemento("metro", "metros", 1));
       d1.agregar(new Elemento("kilómetro", "kilometros", 0.001));
        d1.agregar(new Elemento("milla náutica", "millas náuticas", 0.000539957));
        
        return d1;
    }
    
    private static Lista tiempos(){
        Lista t1 = new Lista("tiempo");
        
        t1.agregar(new Elemento("segundo", "segundos", 3600));
        t1.agregar(new Elemento("minuto", "minutos", 60));
        t1.agregar(new Elemento("hora", "horas", 1));
        t1.agregar(new Elemento("día", "días", 0.041666666667));
        t1.agregar(new Elemento("semana", "semanas",0.005952380952));
        t1.agregar(new Elemento("mes", "meses",0.001368954631));
        
        return t1;
    }
    
    private static Lista liquidos(){
        Lista l1 = new Lista("liquidos");
        
         l1.agregar(new Elemento("litro", "litros", 1));
        l1.agregar(new Elemento("mililitro", "mililitros", 1000));
        l1.agregar(new Elemento("galón imperial", "galones imperiales", 0.219969));
        l1.agregar(new Elemento("onza imperial", "onzas imperiales", 35.1951));
         l1.agregar(new Elemento("centímetro cúbico", "centímetros cúbicos", 1000));
        l1.agregar(new Elemento("metro cúbico", "metros cúbicos", 0.001));
         l1.agregar(new Elemento("kilometro cúbico", "kilometros cúbicos", 0.000000000001));
        return l1;
    }
    
    private static Lista masas(){
        Lista m1 = new Lista("masa");
        
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
