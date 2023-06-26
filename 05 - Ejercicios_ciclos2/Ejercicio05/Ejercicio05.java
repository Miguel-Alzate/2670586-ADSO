import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int contador_1 = 1;
    int factorial = 1;


    System.out.print("Ingrese numero N: ");
    num = entrada.nextInt();

    System.out.println("Factorial: ");

    while (contador_1 <= num){

        System.out.print(" x "+contador_1);
        factorial = factorial * contador_1;
        
        contador_1 = contador_1 + 1;
        

    }
    

       System.out.print(" = "+factorial);
    

    }
}