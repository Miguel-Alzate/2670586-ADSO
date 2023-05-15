import java.util.Scanner;
public class Ejercicio06{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    //Cálculo de promedio
    
    float num_1;
    float num_2;
    float num_3;
    float num_4;
    float num_5;
    float prom;

    System.out.println("Promedio de notas, ingresa tu 1° nota");
    num_1 = entrada.nextFloat();
    System.out.println("Ingresa tu 2° nota");
    num_2 = entrada.nextFloat();
    System.out.println("Ingresa tu 3° nota");
    num_3 = entrada.nextFloat();
    System.out.println("Ingresa tu 4° nota");
    num_4 = entrada.nextFloat();
    System.out.println("Ingresa tu 5° nota");
    num_5 = entrada.nextFloat();

    prom = (num_1 + num_2 + num_3 + num_4 + num_5) / 5;

    System.out.println("Este es el promedio de tus notas: "+prom);

    }
}