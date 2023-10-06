import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese un número entero para calcular la suma de sus dígitos: ");
        int numero = entrada_numeros.nextInt();

        int suma = sumaDigitos(numero);

        System.out.println("La suma de los dígitos del número " + numero + " es: " + suma);


    }

    // Función para calcular la suma de los dígitos de un número entero
    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10; // Obtener el último dígito y sumarlo
            numero = numero / 10; // Eliminar el último dígito
        }
        return suma;
    }
}