import java.util.Scanner;

public class Ejercicio04{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);

    double  nota1 = 0;
    double  nota2 = 0;
    double  nota3 = 0;
    double  promedio = 0;

    System.out.print("Digite el resultado de la nota 1: ");
    nota1 = entrada.nextDouble();
    System.out.print("Digite el resultado de la nota 2: ");
    nota2 = entrada.nextDouble();
    System.out.print("Digite el resultado de la nota 3: ");
    nota3 = entrada.nextDouble();

    promedio = (nota1 + nota2 + nota3) / 3;

    if(promedio>=7){
        System.out.println("Aprobaste");
    }else{
        System.out.println("Reprobaste");
    }


    }
}