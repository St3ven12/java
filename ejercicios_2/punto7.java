/*
 * 7. Digite tres números e imprima el número mayor (yo agregue el menor)
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto7 {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero"));

        int numeroMayor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            numeroMayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            numeroMayor = numero2;
        } else {
            numeroMayor = numero3;
        }

        int numeroMenor;

        if (numero1 <= numero2 && numero1 <= numero3) {
            numeroMenor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            numeroMenor = numero2;
        } else {
            numeroMenor = numero3;
        }

        JOptionPane.showMessageDialog(null,"El numero mayor es: " + numeroMayor + "\nEl numero menor es: " + numeroMenor);

    }
}
