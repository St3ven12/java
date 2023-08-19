/*
 * 9. Digite su edad e imprima si es mayor de edad o menor
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto9 {
    public static void main(String[] args) {

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Usted es menor de edad");
        }

    }
}
