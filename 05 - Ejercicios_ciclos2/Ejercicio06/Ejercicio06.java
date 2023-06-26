import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int contador_1 = 1;
    int factorial = 1;
    int num_m = 0;

    System.out.print("Ingrese numero N: ");
    num = entrada.nextInt();
    System.out.print("Ingrese numero M: ");
    num_m = entrada.nextInt();

    while (num <= num_m){

        System.out.println("Factorial de "+num+ " ("+num+ "!): ");

            while (contador_1 <= num){

                System.out.print(" x "+contador_1);
                
                factorial = factorial * contador_1;
               
                contador_1 = contador_1 + 1;

            }
            System.out.println(" = "+factorial);
            System.out.println("  ");
        num = num + 1;
        contador_1 = 1;
        factorial = 1;
        
    
    
        

    }
    



    }
}