import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero señor usuario: ");
        int numero_1 = teclado.nextInt();

        System.out.print("Ingrese otro numero: ");
        int numero_2 = teclado.nextInt();

        System.out.print("Ingrese ootro numero: ");
        int numero_3 = teclado.nextInt();

        int mcm = 1;
        int divisor = 2;

        while (numero_1 > 1 || numero_2 > 1 || numero_3 > 1) {
            if (numero_1 % divisor == 0 || numero_2 % divisor == 0 || numero_3 % divisor == 0) {
                if (numero_1 % divisor == 0) {
                    numero_1 = numero_1 / divisor;
                }
                if (numero_2 % divisor == 0) {
                    numero_2 = numero_2 / divisor;
                }
                if (numero_3 % divisor == 0) {
                    numero_3 = numero_3 / divisor;
                }
                mcm = mcm * divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("El MCM de los tres número es: " + mcm);






        
    }
}