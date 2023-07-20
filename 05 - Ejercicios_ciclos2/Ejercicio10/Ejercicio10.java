import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = entrada.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int numero = (i + j) % num + 1;
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}