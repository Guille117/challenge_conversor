package gt.com.conversor.ventanas;

import gt.com.conversor.logica.Elemento;
import gt.com.conversor.listas.ListaDeMonedas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Gui
 */
public class Ventana  extends javax.swing.JFrame{

    private Iterable<Elemento> monedas;
    public  Ventana(){                                                                              // contructor de ventana
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Conversor");
        
        iniciarComponentes();
        
    }
    
    private void iniciarComponentes(){
        JPanel panel1 = new JPanel();
        //panel1.setBackground(Color.red);
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
       
         String deTitulo = "divisas";
         
         JLabel titulo = new JLabel();
         titulo.setText("Conversor de " + deTitulo);
         titulo.setFont(new Font("Georgia", Font.BOLD, 35));
         titulo.setBounds(200, 20, 450, 50);
         panel1.add(titulo);
         
        
        
        // 
        JComboBox itemsInicio = new JComboBox();
        styleComboBox(itemsInicio, 80, 110, 240, 25);
        itemsInicio.addItem("Dolar estadounidense");
        panel1.add(itemsInicio);
        
        
        // 
        JTextField cantidad = new JTextField();
        cantidad.setBounds(340, 110, 120, 30);
        panel1.add(cantidad);
        
          // 
        JComboBox itemsFinal = new JComboBox();
        styleComboBox(itemsFinal, 480, 110, 240, 25);
        panel1.add(itemsFinal);
        
        // 
        JLabel etiqueta1 = new JLabel("Convetir de");
        styleLabel(etiqueta1, 145, 140, 100, 30);
        panel1.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("Cantidad");
        styleLabel(etiqueta2, 360, 140, 100, 30);
        panel1.add(etiqueta2);
        
        JLabel etiqueta3 = new JLabel("Convertir a");
        styleLabel(etiqueta3, 560, 140, 100, 30);
        panel1.add(etiqueta3);
        
        JLabel resultado = new JLabel();
        resultado.setText("8 quetzales equivale a 1 dolar");
        resultado.setBounds(150, 230, 650, 60);
        resultado.setFont(new Font("Segoe Print", Font.ITALIC, 30));
        panel1.add(resultado);
        

        ListaDeMonedas listaMonedas = new ListaDeMonedas();
        for(int i=0; i < listaMonedas.getTamaño(); i++){
            itemsInicio.addItem(listaMonedas.retornarElemento(i).getNombreSingular());
        }
    }
    
    private void styleComboBox(JComboBox a1, int x, int y, int a, int h){
        a1.setFont(new Font("Segoe Print", Font.ITALIC, 18));
        a1.setBounds(x, y, a, h);
        
    }
    
    private void styleLabel(JLabel etiqueta, int x, int y, int a, int h){
        etiqueta.setBounds(x, y, a, h);
        etiqueta.setFont(new Font("Georgia", Font.ITALIC, 18));
        etiqueta.setForeground(Color.ORANGE);
        
        
        
        
    }
    
}
