import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero de hasta 6 dígitos: ");
        int numero = scanner.nextInt();

        boolean esPalindromo = true;
        String numeroStr = Integer.toString(numero);
        int longitud = numeroStr.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El número es un palíndromo");
        } else {
            System.out.println("El número NO es un palíndromo");
        }
    }
}