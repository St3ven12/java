import javax.swing.JOptionPane;

public class tarea11 {
    public static void main(String[] args) {
        String informacion = "Piensa en un número. Luego, divídelo entre 8 y suma 12 al resultado. Si el número final es 52, ¡lo adiviné!";
        JOptionPane.showMessageDialog(null, informacion);

        double respuestaCorrecta = 320.0; // El número correcto es 320
        boolean adivinado = false;

        while (!adivinado) {
            double numeroUsuario = pedirNumero("Ingresa tu respuesta:");

            if (numeroUsuario == respuestaCorrecta) {
                JOptionPane.showMessageDialog(null, "¡Correcto! ¡Felicitaciones!");
                adivinado = true;
            } else {
                int opcion = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta. ¿Quieres intentarlo nuevamente?", "Intentar de nuevo", JOptionPane.YES_NO_OPTION);
                if (opcion != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                }
            }
        }
    }

    public static double pedirNumero(String mensaje) {
        String entrada = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(entrada);
    }
}
