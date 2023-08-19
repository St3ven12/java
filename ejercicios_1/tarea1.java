 import javax.swing.JOptionPane; 

public class tarea1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Insert your name, teacher: ");
        String name1 = JOptionPane.showInputDialog("insert name the student: ");

        String[] opciones = { "ingles", "español", "matematicas", "sociales" };
        int seleccion = JOptionPane.showOptionDialog(null, "Elije el modulo:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insert the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insert the second number: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Insert the tercer number: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Insert the cuarto number: "));

        int result = 0;
        String operacion;

        switch (seleccion) {
            case 0:
                result = (num1 + num2 + num3 + num4) / 4;
                operacion = "ingles";
                break;
                case 1:
                result = (num1 + num2 + num3 + num4) / 4;
                operacion = "español";
                break;
            case 2:
                result = (num1 + num2 + num3 + num4) / 4;
                operacion = "matematicas";
                break;
            case 3:
                result = (num1 + num2 + num3 + num4) / 4;
                operacion = "sociales";
                break;    


            default:
                JOptionPane.showMessageDialog(null, "Invalid operation", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        JOptionPane.showMessageDialog(null, name + ", " + "el estudiante " +name1 + "\n" + "tiene un porcentaje de: " + result + "\n" +"en el modulo"+ " " +operacion, "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
