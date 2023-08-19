import javax.swing.JOptionPane;

public class tarea3 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingrese el número total de horas:");
        int totalHoras = Integer.parseInt(entrada);
        
        int semanas = totalHoras / 168; // 1 semana = 7 días = 7 * 24 horas
        int horasRestantes = totalHoras % 168;
        
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;
        
        String resultado = "El calculo es:"+" \n" + "Semanas: " + semanas + "\n" + "Días: " + dias + "\n" + "Horas: " + horas;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
