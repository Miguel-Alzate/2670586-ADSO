import java.util.Scanner;

public class Ejercicio06{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    int edad =  0;

    System.out.print("Ingresa tu edad señor usuario: ");
    edad = entrada.nextInt();

    if(edad >=18){
        System.out.println("Señor usuario, puedes votar");
    }else{
        System.out.println("Señor usuario, no puedes votar");
    }


    }
}