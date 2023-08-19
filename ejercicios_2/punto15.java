/*
 * 15. En </u>coltisTechnology se hace un descuento del 20% de descuento a los
 *     clientes cuya compra supere los 300.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto15 {
    public static void main(String[] args) {

        double valorCompra, descuento, totalPagar;

        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la compra: "));

        if (valorCompra > 300) {
            descuento = valorCompra * 0.20;
            totalPagar = valorCompra - descuento;

            JOptionPane.showMessageDialog(null, "El descuento es de: " + descuento + "\nEl total a pagar es: " + totalPagar);
        } else {
            JOptionPane.showMessageDialog(null, "No aplica descuento.\nEl total a pagar es: " + valorCompra);
        }

    }
}
