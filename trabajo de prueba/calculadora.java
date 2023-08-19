/**
 *
 * @author Stiven Delgado
 */

import java.util.Scanner;

public class calculadora {

    public static void limpiarConsola(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        limpiarConsola();
        
        System.out.print("Ingresa tu nombre: ");
        String nom1 = scanner.nextLine();

        limpiarConsola();
        
        System.out.println("");
        
        System.out.print("Hola "+nom1);
        System.out.println(", bienvenido a la calculadora");
        
        System.out.println("");
        
        boolean continuar; //variable
        
        do {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
    
            System.out.println("");    
            
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("  ");    
    
            System.out.println("Seleccione la operación:");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. x");
            System.out.println("4. /");
            System.out.println("5. %");
            
            System.out.println("");
            
            int choice = scanner.nextInt();
    
            double result = performOperation(num1, num2, choice);
    
            if (Double.isNaN(result)) {
                System.out.println("Operación inválida.");
            } else {
                System.out.println("El resultado es: " + result);
            }
            
            System.out.println("");    
            
            System.out.println("¿Desea hacer otra operación? (si/no)");
            
            System.out.println("");    
            
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("si");
            
        } 
        
        while (continuar);
        
        
        System.out.println("");

        limpiarConsola();
        
        System.out.print("Chao "+nom1);
        System.out.println(", Gracias por usar nuestro servicio");
        
        System.out.println("\n\n\n\n\n\n");
        
        scanner.close();
    }

    public static double performOperation(double num1, double num2, int choice) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 5: 
                return num1 * num2 /100;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }
}
