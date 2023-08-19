/*
 * 13. Ingresar una nota de 0 al 10 y mostrar si es, insuficiente, suficiente, bien,
 *     notable o sobresaliente
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto13 {
    public static void main(String[] args) {

        double nota;

        nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota (0 al 10): "));

        if (nota < 2 ) {
            JOptionPane.showMessageDialog(null, "Ya matese");
        } else if (nota < 4) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota < 6) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (nota < 8) {
            JOptionPane.showMessageDialog(null, "Bien");
        } else if (nota < 9) {
            JOptionPane.showMessageDialog(null, "Notable");
        } else {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }

    }
}
