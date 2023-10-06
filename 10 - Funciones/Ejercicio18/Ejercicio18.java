import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese un número para invertirlo: ");
        int numero = entrada_numeros.nextInt();

        int numeroInvertido = invertirNumero(numero);

        System.out.println("El número invertido es: " + numeroInvertido);

    }

    // Función para invertir un número
    public static int invertirNumero(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            int digito = numero % 10; // Obtener el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Agregar el dígito al número invertido
            numero = numero / 10; // Eliminar el último dígito
        }
        return numeroInvertido;
    }
}