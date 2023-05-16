import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Horas, minutos y segundos

    int segundos = 0;
    int minutos = 0;
    double hora = 0;


    System.out.println("Ingrese los segundos que quiere convertir a minutos y horas");
    segundos = entrada.nextInt();


    minutos = segundos/60;
    hora = minutos/60;

    System.out.println("Esta es la conversión de "+segundos+" segundos a minutos: "+minutos);
    System.out.println("Esta es la conversión de "+segundos+" segundos a horas: "+hora);
    System.out.println("Esta es la conversión de "+segundos+" segundos a segundos???: "+segundos);


    }
}