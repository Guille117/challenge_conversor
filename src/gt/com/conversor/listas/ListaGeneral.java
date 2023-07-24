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
    m1.agregar(new Elemento("peso mexicano", "pesos mexicanos", 2.1668));
    m1.agregar(new Elemento("libra esterlina", "libras esterlinas", 0.0992));
    m1.agregar( new Elemento("dólar estadounidense", "dólares estadounidenses", 0.1275));
    m1.agregar(new Elemento("euro", "euros", 0.1145));
    m1.agregar(new Elemento("yen", "yenes", 18.0823));
    m1.agregar(new Elemento("won", "wones", 164.0845));
        
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
        
        return d1;
    }
    
    private static Lista tiempos(){
        Lista t1 = new Lista("tiempo");
        
        t1.agregar(new Elemento("segundo", "segundos", 86400));
        t1.agregar(new Elemento("minuto", "minutos", 3600));
        t1.agregar(new Elemento("hora", "horas", 24));
        t1.agregar(new Elemento("día", "días", 1));
        t1.agregar(new Elemento("semana", "semanas",0.142857));
        t1.agregar(new Elemento("mes", "meses",0.0328767));
        t1.agregar(new Elemento("año", "años",0.00273973));
        
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
         l1.agregar(new Elemento("kilómetro cúbico", "kilómetros cúbicos", 0.000000000001));
        return l1;
    }
    
    private static Lista masas(){
        Lista m1 = new Lista("masa");
        
        m1.agregar(new Elemento("miligramo", "miligramos", 1000));
        m1.agregar(new Elemento("gramo", "gramos", 1));
        m1.agregar(new Elemento("libra", "libras", 0.00220462));
        m1.agregar(new Elemento("onza", "onzas", 0.035274));
        m1.agregar(new Elemento("kilogramo", "kilogramos", 0.001));
        m1.agregar(new Elemento("tonelada", "toneladas", 1e-6));
        m1.agregar(new Elemento("quintal", "quintales", 1e-5));
        
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
