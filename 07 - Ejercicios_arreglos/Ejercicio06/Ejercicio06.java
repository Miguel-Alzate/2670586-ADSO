import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        
        int arregloOriginal[] = new int[numero];

      
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = i + 1;
        }

        
        System.out.print("Arreglo original: {");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.print(arregloOriginal[i]);
            if (i < arregloOriginal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        int[] arregloPrimos = new int[numero];
        int[] arregloNoPrimos = new int[numero];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int i = 0; i < arregloOriginal.length; i++) {
            int numeroActual = arregloOriginal[i];
            int divisor = 2;
            int limite = numeroActual / 2;
            int contadorDivisores = 0;

            while (divisor <= limite && contadorDivisores == 0) {
                if (numeroActual % divisor == 0) {
                    contadorDivisores++;
                }
                divisor++;
            }

            if (contadorDivisores == 0) {
                arregloPrimos[contadorPrimos] = numeroActual;
                contadorPrimos++;
            } else {
                arregloNoPrimos[contadorNoPrimos] = numeroActual;
                contadorNoPrimos++;
            }
        }

        System.out.print("Arreglo Primos: {");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(arregloPrimos[i]);
            if (i < contadorPrimos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Arreglo No Primos: {");
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.print(arregloNoPrimos[i]);
            if (i < contadorNoPrimos - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
            

