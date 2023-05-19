import java.util.Scanner;
public class Ejercicio09{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Par o impar


    int num;

    System.out.println("Ingrese el valor del número que quiere determinar si es par o impar: ");
    num = entrada.nextInt();

    if (num % 2 == 0)
    {
        System.out.println("El número que ingresaste es par");
    } 
    else 
    {
        System.out.println("El número que ingresaste es impar");
    }
    }
}