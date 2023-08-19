import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuanto dinero tiene pablo? ");
        int pablo = scanner.nextInt(); 

        int jose = pablo*2;
        int miguel = (pablo + jose)/2;
        int total = pablo + jose + miguel;

        System.out.println("El dinero de pablo es: " + pablo);
        System.out.println("El dinero de jose es: " + jose);
        System.out.println("El dinero de miguel es: " + miguel);
        System.out.println("El dinero entre todos equivale a: "+total);
    }
}
