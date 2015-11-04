/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Signos {
    public int setNumero(){
    int numero;
    return(Integer.parseInt(JOptionPane.showInputDialog("Teclear numero ")));
    }
    
    public void comparar(int numero){
    
    if(numero>0) { 
          JOptionPane.showMessageDialog(null,"Positivo");  
        }
    else if(numero<0){
    JOptionPane.showMessageDialog(null,"Negativo");
        }
    
    else if(numero==0){
        JOptionPane.showMessageDialog(null, "0");
        }
     
    }
    
}
