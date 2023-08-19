/*
 * 3. Digite un número y que muestre si es multiplo de 8.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto3 {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if (numero % 8 == 0) {
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 8");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es múltiplo de 8");
        }

    }
}
