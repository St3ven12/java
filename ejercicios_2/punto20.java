/*
 * 20. Dado tres de un triángulo decir que tipo de triangulo es.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto20 {
    public static void main(String[] args) {

        double lado1, lado2, lado3;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triangulo: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triangulo: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triangulo: "));

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo isosceles");
        } else {
            JOptionPane.showMessageDialog(null, "Es un triangulo escaleno");
        }

    }
}
