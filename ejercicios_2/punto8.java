/*
 * 8. Digite dos números, los sume y muestre el resultado, que la suma de los dos sea igual a 86
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto8 {
    public static void main(String[] args) {
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));

        int suma = numero1 + numero2;
        int resultado = 86;

        if (suma == 86){
            JOptionPane.showMessageDialog(null, "El resultado es igual a: "+resultado+", Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "El resultado no es igual a: "+resultado+", Fallaste");
        }
    }
}
