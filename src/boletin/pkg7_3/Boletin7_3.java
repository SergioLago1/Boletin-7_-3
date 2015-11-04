/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7_3;

/**
 *
 * @author slagogonzalez
 */
public class Boletin7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
       Signos n=new Signos();
       numero=n.setNumero();
       n.comparar(numero);
    }
    
}
