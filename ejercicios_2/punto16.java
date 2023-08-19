/*
 * 16. Diseñe un programa que lea la temperatura e imprima el tipo de clima de acuerdo con lo dado.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto16 {
    public static void main(String[] args) {

        double temperatura;

        temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura: "));

        if (temperatura <= 10) {
            JOptionPane.showMessageDialog(null, "Frio");
        } else if (temperatura > 10 && temperatura <= 20) {
            JOptionPane.showMessageDialog(null, "Nublado");
        } else if (temperatura > 20 && temperatura <= 30) {
            JOptionPane.showMessageDialog(null, "Caluroso");
        } else {
            JOptionPane.showMessageDialog(null, "Tropical");
        }

    }
}
