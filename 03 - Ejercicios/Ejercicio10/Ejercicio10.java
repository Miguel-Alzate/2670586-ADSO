import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //División y resto

    int num_1 = 0;
    int num_2 = 0;
    double result_1 = 0;
    double result_2 = 0;


    System.out.println("Ingrese el primer número");
    num_1 = entrada.nextInt();


    System.out.println("Ingrese el segundo número");
    num_2 = entrada.nextInt();

    result_1 = num_1 / num_2;
    result_2 = (num_1 % num_2);
    System.out.println("Esta es la división entre ambos números: "+result_1);
    System.out.println("                                                    ");
    System.out.println("Este es el resto (residuo)  de tu división: "+result_2);



    }
}