import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int altura = 0;

        System.out.print("Ingrese la altura de la pirámide: ");
        altura = entrada.nextInt();

        for (int i = 1; i <= altura; i+i+1) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}