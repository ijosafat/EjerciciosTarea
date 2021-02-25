/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostarea;

/**
 *
 * @author Myke
 */
import javax.swing.*;
public class EjercicioTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String aux;
        int bolita;
        double compra, descuento=0, monto;
        //se lee el total de compra
        aux=JOptionPane.showInputDialog("Ingrese el total de la compra: ");
        compra=Double.parseDouble(aux);
        //se lee el color
        aux=JOptionPane.showInputDialog("Ingrese el color de la bolita :\nSi es Roja: 1"
        +"\nSi es Verde: 2\nSi es Blanca: 3");
        bolita=Integer.parseInt(aux);
        switch(bolita)
        {
            case 1:
            {
                descuento = compra*0.10;
                monto = compra-descuento;
            }
            break;
            case 2:
            {
                descuento = compra*0.05;
                monto = compra-descuento;
            }
            break;
            case 3:
                monto=compra;
                break;
            default:
                monto = compra;
                break;
                
        }
        JOptionPane.showMessageDialog(null, "El cliente habia consumido $: "+ compra +
                "\nPero saco una bolita de color: " + bolita +"\nPor lo que se aplico un descuento de $:"+
                descuento+"\nAhora el total a pagar es de $: "+ monto);
    }
}
