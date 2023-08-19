/*
 * 14. Pedir una hora de la forma hora, minutos y segundos, e imprimir la hora en el segundo siguiente
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto14 {
    public static void main(String[] args) {

        int hora, minutos, segundos;

        hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora: "));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos: "));
        segundos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los segundos: "));

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
                minutos = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Hora siguiente: " + hora + ":" + minutos + ":" + segundos);

    }
}
