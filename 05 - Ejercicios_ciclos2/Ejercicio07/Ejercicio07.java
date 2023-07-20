import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero impar: ");
        int num = entrada.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número ingresado no es impar.");
        }
        
        for (int i = 1; i <= num; i += 2) {
            int espacios = (num - i) / 2;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        
        for (int i = num - 2; i >= 1; i -= 2) {
            int espacios = (num - i) / 2;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}