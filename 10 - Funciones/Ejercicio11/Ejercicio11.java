import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int numero = entrada_numeros.nextInt();

        int factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }

    // Función para calcular el factorial de un número
    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}