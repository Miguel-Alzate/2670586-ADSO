import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int valor = 1;

        System.out.print("Ingrese un número N: ");
        n = scanner.nextInt();

        int arreglo [][]  = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arreglo[i][j] = valor++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arreglo[i][j] = valor++;
                }
            }
        }

        System.out.println("Cuadricula en ZigZag:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arreglo[i][j]<=9){
                    System.out.print("[0"+ arreglo[i][j]+"]");
                }else{
                    System.out.print("["+ arreglo[i][j]+"]");
                }
            }
            System.out.println();
        }
    }
}