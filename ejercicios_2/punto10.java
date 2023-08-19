/*
 * 10. Digitar una letra e imprima si está en mayúscula o minúscula
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto10 {
    public static void main(String[] args) {

        char letra;

        String input = JOptionPane.showInputDialog("Digite una letra: ");
        letra = input.charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra esta en mayuscula");
        } else if (Character.isLowerCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra esta en minuscula");
        } else {
            JOptionPane.showMessageDialog(null, "No es una letra valida");
        }

    }
}
