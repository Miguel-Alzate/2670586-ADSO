import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamaño = 0;
        int num_aleatorio = 0;
        int contador = 1;

        System.out.println("Ingresa el tamaño del arreglo");
        tamaño = teclado.nextInt();

        int arreglo[] = new int[tamaño];
        int arreglo_sinrepetir[] = new int[tamaño];
        boolean repetido;

        for (int i = 0; i < arreglo.length; i++) {
            num_aleatorio = (int) Math.floor(Math.random() * 100 + 1);
            arreglo[i] = num_aleatorio;
            System.out.println("Dato aleatorio " + contador + ": " + arreglo[i]);
            contador++;
        }

        int indice = 0;
        for (int i = 0; i < arreglo.length; i++) {
            repetido = false;
            for (int j = 0; j < indice; j++) {
                if (arreglo[i] == arreglo_sinrepetir[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                arreglo_sinrepetir[indice] = arreglo[i];
                indice++;
            }
        }

        System.out.println("Datos sin repetir:");
        for (int i = 0; i < indice; i++) {
            System.out.println(arreglo_sinrepetir[i]);
        }
    }
}