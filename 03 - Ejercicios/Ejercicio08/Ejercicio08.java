import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    String cadena_1;
    String cadena_2;

    System.out.println("Ingrese la primera cadena de texto");
    cadena_1 = entrada.nextLine();

    System.out.println("                                    ");
    
    System.out.println("Ingrese la segunda cadena de texto");
    cadena_2 = entrada.nextLine();

    System.out.println("                                    ");
    System.out.println("Este es tu texto: ");
    System.out.println(cadena_1+" "+cadena_2);

    }
}