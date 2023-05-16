import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);


    int precio = 0;
    int desc = 0;
    double result = 0;

    System.out.println("Ingrese el precio del producto:");
    precio = entrada.nextInt();

    System.out.println("Ingrese el descuento que quiera (de 1% a 100%)");
    desc = entrada.nextInt();

    result = precio * desc / 100;
    result = precio - result;
    System.out.println("Este es el precio de tu producto con el descuento aplicado: "+result);
    }
}