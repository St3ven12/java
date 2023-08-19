import javax.swing.JOptionPane;

public class tarea7 {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String entradaMin = JOptionPane.showInputDialog("Ingrese el valor mínimo del rango:");
            int minimo = Integer.parseInt(entradaMin);

            String entradaMax = JOptionPane.showInputDialog("Ingrese el valor máximo del rango:");
            int maximo = Integer.parseInt(entradaMax);

            int numeroAleatorio = generarNumeroAleatorio(minimo, maximo);

            String mensaje = "Número aleatorio entre " + minimo + " y " + maximo + ": " + numeroAleatorio;

            int opcion = JOptionPane.showConfirmDialog(null, mensaje + "\n¿Desea generar otro número?", "Generar otro número", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    public static int generarNumeroAleatorio(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("El valor mínimo debe ser menor o igual al valor máximo");
        }
        return min + (int) (Math.random() * (max - min + 1));
    }
}
