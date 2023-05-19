import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Horas, minutos y segundos

    int segundos1 = 0;
    int minutos = 0;
    int hora = 0;
    int segundos2 = 0;


    System.out.println("Ingrese los segundos que quiere convertir formato horas, minutos y segundos");
    segundos1 = entrada.nextInt();

    
    minutos = segundos1 /60;
    segundos2 = segundos1 % 60;
    
    
    hora = minutos/60;
    minutos = minutos % 60;

    System.out.println("Esta es la conversión de "+segundos1+" a formato hora, minutos y segundos: "+hora+":"+minutos+":"+segundos2);


    }
}