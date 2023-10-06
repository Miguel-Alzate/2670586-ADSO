import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        int entrada = 0;
        int arreglo[] = new int[10];

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

        boolean ordenadoAscendente = estaOrdenadoAscendente(arreglo);

        if (ordenadoAscendente) {
            System.out.println("El arreglo está ordenado de forma ascendente.");
        } else {
            System.out.println("El arreglo no está ordenado de forma ascendente.");
        }

     
    }

    // Función para verificar si un arreglo está ordenado de forma ascendente
    public static boolean estaOrdenadoAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                return false;
            }
        }
        return true;
    }
}