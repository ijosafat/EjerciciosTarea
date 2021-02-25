/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Myke
 */
import javax.swing.*;

public class EjercicioContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nNum, mayor = 0, menor = 0;
        nNum = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos numeros desea agregar"));
        while (nNum <= 0) {
            nNum = Integer.parseInt(JOptionPane.showInputDialog("Error, el numero debe de ser mayor a 0\n"
                    + "Digite cuantos numeros desea agregar"));
        }
        int[] num = new int[nNum];
        int cont = 0, i = 1;
        int pares = 0;
        while (cont < nNum) {
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + i));
            while (num[cont] <= 0) {
                num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Error, el numero debe de ser mayor a 0\n"
                        + "Ingrese el numero " + i));
            }
            if (num[cont] > mayor) {
                mayor = num[cont];
            }
            if (menor == 0) {
                menor = num[cont];
            } else {
                if (num[cont] < menor) {
                    menor = num[cont];
                }
            }
            if (num[cont] % 2 == 0) {
                pares++;
            }
            cont++;
            i++;
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es " + mayor
                + "\nEl numero menor es " + menor + "\nEl numero de pares es " + pares);
        System.exit(0);
    
}   
}
