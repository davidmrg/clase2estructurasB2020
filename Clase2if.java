/*
Ejemplos estructuras de control
 */
package clase2if;

import javax.swing.JOptionPane;

public class Clase2if {

  
    public static void main(String[] args) {
        
        //int num;
        
       // String var = 
        // Parse (Parsing)
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Escribir un número para saber si es par o impar: "));
        
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número ingreaso es par");
        }else if(num < 300){
            JOptionPane.showMessageDialog(null, "El número ingresado no es par y además es menor a 300");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número ingreaso es impar");
        }
        
            
        
    }
    
}
