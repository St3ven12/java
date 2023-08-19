/*
 * 18. Ingresar el nombre, edad, salario y muestra del salario
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto18 {
    public static void main(String[] args) {

        String nombre;
        int edad;
        double salario;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));

        if (edad < 17) {
            JOptionPane.showMessageDialog(null, "Lo siento, no puede trabajar debido a su edad.");
        } else if (edad >= 18 && edad <= 50) {
            salario *= 1.05;
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", su salario ajustado es: " + salario);
        } else if (edad >= 51 && edad <= 60) {
            salario *= 1.10;
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", su salario ajustado es: " + salario);
        } else {
            salario *= 1.15;
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", su salario ajustado es: " + salario);
        }

    }
}
