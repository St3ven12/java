/*
 * 17. Digite un numero entre 1 a 12 e imprima el número de días que tiene el mes correspondido

 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto17 {
    public static void main(String[] args) {

        int mes;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes: "));

        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = -1;
                break;
        }

        if (dias == -1) {
            JOptionPane.showMessageDialog(null, "Número de mes inválido");
        } else {
            JOptionPane.showMessageDialog(null, "El mes " + mes + " tiene " + dias + " días.");
        }

    }
}
