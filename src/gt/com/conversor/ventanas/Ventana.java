package gt.com.conversor.ventanas;


import gt.com.conversor.listas.ListaGeneral;
import gt.com.conversor.logica.Elemento;
import gt.com.conversor.logica.Conversor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    

        private static JPanel panel1 = new JPanel();
    
    private void iniciarComponentes(){
        
        ListaGeneral listas = new ListaGeneral();
        
        
        
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
        
        
        
        JButton btn1 = new JButton();
        styleBoton(btn1, 50, 350, 100, 40, "moneda");
        btn1.addActionListener(eventoBoton(btn1, itemsInicio, itemsFinal, 0, listas));
        panel1.add(btn1);
        
        JButton btn2 = new JButton();
        styleBoton(btn2, 155, 350, 100, 40, "liquido");
        btn2.addActionListener(eventoBoton(btn2, itemsInicio, itemsFinal, 3, listas));
        panel1.add(btn2);
        
        JButton btn3 = new JButton();
        styleBoton(btn3, 260, 350, 100, 40, "tiempo");
        btn3.addActionListener(eventoBoton(btn3, itemsInicio, itemsFinal, 2, listas));
        panel1.add(btn3);
        
        JButton btn4 = new JButton();
        styleBoton(btn4, 370, 350, 100, 40, "distancia");
        btn4.addActionListener(eventoBoton(btn4, itemsInicio, itemsFinal, 1, listas));
        panel1.add(btn4);
        
        JButton btn5 = new JButton();
        styleBoton(btn5, 480, 350, 100, 40, "peso");
        btn5.addActionListener(eventoBoton(btn5, itemsInicio, itemsFinal, 4, listas));
        panel1.add(btn5);
        
//        ButtonGroup botones = new ButtonGroup();
//        botones.add(btn1);
//        botones.add(btn2);
//        botones.add(btn3);
//        botones.add(btn4);
//        botones.add(btn5);
        
        
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
    
    
    private ActionListener eventoBoton(JButton btn, JComboBox jcb1, JComboBox jcb2, int indice, ListaGeneral lista){
        
        ActionListener evento = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                jcb1.removeAllItems();          // limpiar items de combo box
                jcb2.removeAllItems();
                
                for(int i=0; i<lista.getLista(indice).getTamaño(); i++){
                    jcb1.addItem(lista.getLista(indice).getElemento(i).getNombreSingular());
                    jcb2.addItem(lista.getLista(indice).getElemento(i).getNombreSingular());
                }
            }
            
        };
        
        return evento;
    }
    
    private void styleBoton(JButton btn, int x, int y, int a, int h, String texto){
        btn.setBounds(x, y, a, h);
        btn.setText(texto);
}
    
    
}

