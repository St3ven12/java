/*
 * 21. Realizar un programa para saber tu signo zodiacal.
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto21 {
    public static void main(String[] args) {

        int dia, mes;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de su nacimiento: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de su nacimiento (1 - 12): "));

        String signo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        } else {
            JOptionPane.showMessageDialog(null, "Fecha de nacimiento invalida");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es: " + signo);

    }
}
