import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese el valor de n para calcular el enésimo término de Fibonacci: ");
        int n = entrada_numeros.nextInt();

        int resultado = calcularFibonacci(n);

        System.out.println("El enésimo término de Fibonacci para n = " + n + " es: " + resultado);

      
    }


    // Función para calcular el enésimo término de la secuencia de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int primero = 0;
        int segundo = 1;
        int resultado = 0;
        for (int i = 2; i <= n; i++) {
            resultado = primero + segundo;
            primero = segundo;
            segundo = resultado;
        }
        return resultado;
    }
}

