import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class tarea6 {
    public static void main(String[] args) {
        String entradaNumero = JOptionPane.showInputDialog("Ingrese un número:");
        double numero = Double.parseDouble(entradaNumero);

        String entradaDecimales = JOptionPane.showInputDialog("Ingrese la cantidad de decimales a los que desea redondear:");
        int decimales = Integer.parseInt(entradaDecimales);

        double numeroRedondeado = redondear(numero, decimales);

        String mensaje = "El número " + numero + " redondeado a " + decimales + " decimales es: " + numeroRedondeado;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static double redondear(double valor, int decimales) {
        if (decimales < 0) throw new IllegalArgumentException("Número inválido de decimales");
        String formato = "0.";
        for (int i = 0; i < decimales; i++) {
            formato += "0";
        }
        DecimalFormat df = new DecimalFormat(formato);
        return Double.parseDouble(df.format(valor));
    }
}
