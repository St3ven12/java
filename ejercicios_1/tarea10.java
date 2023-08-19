import javax.swing.JOptionPane;

public class tarea10 {
    public static void main(String[] args) {
        double sueldo = pedirValor("Ingrese su sueldo:");
        double gasto1 = pedirValor("Ingrese el primer gasto:");
        double gasto2 = pedirValor("Ingrese el segundo gasto:");
        double gasto3 = pedirValor("Ingrese el tercer gasto:");

        double saldoFinal = calcularSaldoFinal(sueldo, gasto1, gasto2, gasto3);

        String mensaje = "Su saldo final es: " + saldoFinal;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static double pedirValor(String mensaje) {
        String entrada = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(entrada);
    }

    public static double calcularSaldoFinal(double sueldo, double... gastos) {
        double totalGastos = 0;
        for (double gasto : gastos) {
            totalGastos += gasto;
        }
        return sueldo - totalGastos;
    }
}
