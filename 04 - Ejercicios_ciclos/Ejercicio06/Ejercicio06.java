import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        int numero;
        int numeroAnterior = 0;
        int numeroActual = 1;
        int siguienteNumero;
        int nNumero = 0;

        System.out.print("Ingresar la posicion del n-esimo Fibonacci: ");
        numero = entrada.nextInt();

        System.out.print("El n-esimo numero Fibonacci es: "+nNumero);

    

        while (numeroActual <= numero) {
            siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
        }
    }
    
    }
