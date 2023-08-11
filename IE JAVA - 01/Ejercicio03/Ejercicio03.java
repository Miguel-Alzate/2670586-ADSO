import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = teclado.nextInt();

        int arreglo [] = new int[tamaño];

        System.out.print("Ingrese la cantidad de bombas: ");
        int num_bombas = teclado.nextInt();

        for (int i = 0; i < num_bombas; i++) {
            int pos_bombas = (int) (Math.random() * tamaño);
            while (arreglo[pos_bombas] == 1) {
                pos_bombas = (pos_bombas + 1) % tamaño;
            }
            arreglo[pos_bombas] = 1;
        }

        int[] area_afectada_bombas = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i] == 1) {
                area_afectada_bombas[i] = 1;
                if (i > 0) area_afectada_bombas[i - 1] = 2;
                if (i < tamaño - 1) area_afectada_bombas[i + 1] = 2;
            }
        }
        System.out.println("Área afectada:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(area_afectada_bombas[i] + " ");
        }

    
    }
}





