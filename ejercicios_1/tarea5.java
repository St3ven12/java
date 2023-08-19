import javax.swing.JOptionPane;

public class tarea5 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        
        String entradaNumero = JOptionPane.showInputDialog("Hola " + nombre + ", ingrese un número:");
        double numero = Double.parseDouble(entradaNumero);
        
        String entradaPotencia = JOptionPane.showInputDialog("Ingrese la potencia a la que desea elevar el número:");
        int potencia = Integer.parseInt(entradaPotencia);
        
        double resultado = Math.pow(numero, potencia);
        
        String mensaje = "Hola " + nombre + ", " + numero + " elevado a la potencia " + potencia + " es: " + resultado;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
