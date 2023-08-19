/*
 * 12. . Digitar dos números y decir si es múltiplo del otro.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto12 {
    public static void main(String[] args) {

        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        if (n1 % n2 == 0) {
            JOptionPane.showMessageDialog(null, n1 + " es multiplo de " + n2);
        } else if (n2 % n1 == 0) {
            JOptionPane.showMessageDialog(null, n2 + " es multiplo de " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "Los numeros no son multiplos entre si");
        }

    }
}
