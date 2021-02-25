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
public class EjercicioNotas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String leer;
        double Nota;
        leer = JOptionPane.showInputDialog("Ingrese la nota del alumno");
            Nota = Double.parseDouble(leer);
           if(Nota>=7)
               JOptionPane.showMessageDialog(null,"El alumno aprobo");
           else
           {
               JOptionPane.showMessageDialog(null, "El alumno esta reprobado");
               if(Nota>=6.5 && Nota <=6.99)
                   JOptionPane.showMessageDialog(null, "Tiene posibilidad de examen");
               
           }
           
    }
}
