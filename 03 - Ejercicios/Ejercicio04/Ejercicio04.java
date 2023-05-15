import java.util.Scanner;
public class Ejercicio04{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    //Intercambio de variables (sin auxiliar)

    int num_1;
    int num_2;

        System.out.println("Ingrese el primer número");
        num_1 = entrada.nextInt();

        System.out.println("Ahora, ingrese el segundo número");
        num_2 = entrada.nextInt();
        System.out.println("                                       ");
        System.out.println("El valor del primer número era: "+num_2);
        System.out.println("Y el valor del segundo número era: "+num_1);
        System.out.println("                                       ");
        System.out.println("Era así, ¿verdad?...");
        System.out.println("                                       ");
        System.out.println("Eres muy malo recordando.");
    }
}