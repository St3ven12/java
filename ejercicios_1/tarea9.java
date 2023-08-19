import javax.swing.JOptionPane;

public class tarea9 {
    public static void main(String[] args) {
        double nota1 = pedirNota("Ingrese la calificación del primer examen:");
        double nota2 = pedirNota("Ingrese la calificación del segundo examen:");
        double nota3 = pedirNota("Ingrese la calificación del tercer examen:");
        double notaAdicional = pedirNota("Ingrese la nota adicional por el trabajo:");

        double mediaSinTrabajo = calcularMedia(nota1, nota2, nota3);
        double mediaConTrabajo = mediaSinTrabajo + notaAdicional;

        String mensaje = "Media sin trabajo: " + mediaSinTrabajo + "\n";
        mensaje += "Media con trabajo: " + mediaConTrabajo;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static double pedirNota(String mensaje) {
        String entrada = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(entrada);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
