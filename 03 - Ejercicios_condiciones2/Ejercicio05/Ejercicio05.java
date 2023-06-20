import java.util.Scanner;

public class Ejercicio05{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    int año = 0;

    System.out.print("Ingresa el año que quieres saber si es bisiesto: ");
    año = entrada.nextInt();

    if(año % 4 == 0){
        System.out.println("El año "+año+" es bisiesto");
    }else{
        System.out.println("El año "+año+" no es bisiesto");
    }

    }
}