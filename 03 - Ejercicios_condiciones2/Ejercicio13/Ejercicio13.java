import java.util.Scanner;
public class Ejercicio13{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in); 

    int num = 0;


    System.out.print("Ingresa un número señor usuario: ");
    num = entrada.nextInt();

    if(num % 2 == 0 && num % 3 == 0 && num % 5 == 0){
        System.out.println("Señor usuario, el número " +num+ " ES divisible por 2, 3 y 5 al mismo tiempo.");
    }else{
        System.out.println("Señor usuario, el número " +num+ " NO es divisible por 2, 3 y 5 al mismo tiempo.");
    }


    }
}