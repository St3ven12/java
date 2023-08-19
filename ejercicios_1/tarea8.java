import javax.swing.JOptionPane;

public class tarea8 {
    public static void main(String[] args) {
        String entradaBase = JOptionPane.showInputDialog("Ingrese la base del triángulo:");
        double base = Double.parseDouble(entradaBase);

        String entradaAltura = JOptionPane.showInputDialog("Ingrese la altura del triángulo:");
        double altura = Double.parseDouble(entradaAltura);

        double area = calcularAreaTriangulo(base, altura);

        String mensaje = "El área del triángulo es: " + area;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
