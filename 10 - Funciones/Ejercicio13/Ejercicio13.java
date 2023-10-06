import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        int arreglo[] = new int[10];
        int entrada = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa el número "+(i+1));
            entrada = entrada_numeros.nextInt();
            arreglo[i] = entrada;
        }

        System.out.print("Arreglo original: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println(" ");

        ordenarArregloAscendente(arreglo);

        System.out.print("Arreglo ordenado en orden ascendente: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println(" ");

       
    }

    // Función para ordenar un arreglo en orden ascendente
    public static void ordenarArregloAscendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}