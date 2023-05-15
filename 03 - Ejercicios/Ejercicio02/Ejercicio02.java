import java.util.Scanner;
public class Ejercicio02{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

        //Conversión de temperatura

        int grados;
        int conv;
        

        System.out.println("Ingrese el grado que quiere convertir de Celsius a Fahrenheit.");
        grados = entrada.nextInt();

        conv = grados * 9/5 + 32;
        System.out.println("Esta es la conversión a Fahrenheit: "+conv);

    }
}
