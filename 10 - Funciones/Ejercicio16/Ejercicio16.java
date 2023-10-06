import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese un número entero para contar sus dígitos: ");
        int numero = entrada_numeros.nextInt();

        int cantidadDigitos = contarDigitos(numero);

        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");

    }


    // Función para contar la cantidad de dígitos en un número entero
    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }
}

