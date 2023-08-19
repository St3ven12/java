/*
 * 2. Digite un número y que imprima si es par o impar.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto2 {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar.");
        }
    }
}
