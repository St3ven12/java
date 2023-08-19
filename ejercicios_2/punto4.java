/*
 * 4. Digite un número y que imprima cuantas cifras tiene.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto4 {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        int cantidadCifras = contarCifras(numero);

        JOptionPane.showMessageDialog(null, "El numero tiene " + cantidadCifras + " cifras");
    }

    public static int contarCifras(int numero) {

        if (numero == 0) {
            return 1;
        }

        int cifras = 0;

        while (numero != 0) {
            numero /= 10;
            cifras++;
        }
        
        return cifras;
    }
}

