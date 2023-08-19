/*
 * 6. Digite tres números e imprima si están en orden creciente, en orden decreciente o
 *    no aumenta ni disminuye el orden (yo puse la opcion de que pueden ser iguales)
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto6 {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero"));

        if (numero1 < numero2 && numero2 < numero3) {
            JOptionPane.showMessageDialog(null, "Los numeros estan en orden creciente");
        } else if (numero1 == numero2 && numero2 == numero3) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        } else if (numero1 > numero2 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null, "Los numeros están en orden decreciente");
        } else {
            JOptionPane.showMessageDialog(null, "No aumenta ni disminuye en orden");
        }
    }
}
