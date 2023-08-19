/*
 * 19. Comprobar si un carácter es un dígito, una letra mayúscula o una letra minúscula
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto19 {
    public static void main(String[] args) {

        char caracter;

        String input = JOptionPane.showInputDialog("Ingrese un carácter: ");
        caracter = input.charAt(0);

        if (caracter >= 48 && caracter <= 57) {
            JOptionPane.showMessageDialog(null, "Es un dígito");
        } else if (caracter >= 65 && caracter <= 90) {
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
        } else if (caracter >= 97 && caracter <= 122) {
            JOptionPane.showMessageDialog(null, "Es una letra minúscula");
        } else {
            JOptionPane.showMessageDialog(null, "No es un dígito ni una letra");
        }

    }
}
