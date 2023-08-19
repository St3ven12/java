/*
 * 1. Digite un número y que imprima si es positivo o negativo.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto1 {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        }

    }
}
