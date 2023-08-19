/*
 * 5. Digite tres números e imprima si todos los números son iguales, todos los 
 *    numeros son diferentes o Ninguno de los dos es igual o diferente.
 *    (Yo agregue la opcion de mostrar cual es el numero diferente de los 3)
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto5 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número"));

        if (numero1 == numero2 && numero2 == numero3) {
            JOptionPane.showMessageDialog(null, "Todos los números son iguales.");
        } else if (numero1 != numero2 && numero2 != numero3 && numero1 != numero3) {
            JOptionPane.showMessageDialog(null, "Todos los números son diferentes.");
        } else if (numero1 == numero2 && numero2 != numero3) {
            JOptionPane.showMessageDialog(null, "El numero " + numero3 + " es diferente");
        } else if (numero1 == numero3 && numero1 != numero2) {
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es diferente");
        } else if (numero2 == numero3 && numero2 != numero1) {
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es diferente");
        } else {
            JOptionPane.showMessageDialog(null, "Invalido");
        }
    }
}
