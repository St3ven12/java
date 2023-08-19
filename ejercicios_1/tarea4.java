import javax.swing.JOptionPane;

public class tarea4 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingrese un número para calcular su raiz cuadrada:");
        double num1 = Double.parseDouble(entrada);
        
        double raizCuadrada = Math.sqrt(num1);
        
        String mensaje = "La raíz cuadrada de " + num1 + " es: " + raizCuadrada;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
