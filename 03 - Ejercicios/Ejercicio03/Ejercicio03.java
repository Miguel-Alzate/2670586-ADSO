import java.util.Scanner;
public class Ejercicio03{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    //Intercambio de variables (con auxiliar)

    int num_1 = 0;
    int num_2 = 0;
    int aux = 0;

        System.out.println("Ingrese el primer número");
        num_1 = entrada.nextInt();

        System.out.println("Ahora, ingrese el segundo número");
        num_2 = entrada.nextInt();

        aux = num_2;
        num_2 = num_1;

        System.out.println("                                       ");
        System.out.println("El valor del primer número era: "+aux);
        System.out.println("Y el valor del segundo número era: "+ num_2);
        System.out.println("                                       ");
        System.out.println("Era así, ¿verdad?...");



    }
} 