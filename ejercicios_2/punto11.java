/*
 * 11. Diseñe un programa que calcule el índice de masa corporal de una persona
 * 
 * author SDELGADO
 * 
 */

import javax.swing.JOptionPane;

public class punto11 {
    public static void main(String[] args) {

        double peso, altura;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kg: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en metros: "));

        double imc = peso / (altura * altura);

        String diagnostico;

        if (imc < 16) {
            diagnostico = "Criterio de ingreso en hospital";
        } else if (imc >= 16 && imc < 17) {
            diagnostico = "Infra peso";
        } else if (imc >= 17 && imc < 18) {
            diagnostico = "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            diagnostico = "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            diagnostico = "Sobrepeso (obesidad de grado I)";
        } else if (imc >= 30 && imc < 35) {
            diagnostico = "Sobrepeso crónico (obesidad de grado II)";
        } else {
            diagnostico = "Obesidad grave (grado III)";
        }

        JOptionPane.showMessageDialog(null, "Su IMC es: " + imc + "\nDiagnóstico: " + diagnostico);

    }
}
