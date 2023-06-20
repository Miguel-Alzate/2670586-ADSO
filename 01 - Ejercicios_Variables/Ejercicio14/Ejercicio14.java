import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    //Promedio ponderado

    float nota1 = 0;
    float nota2 = 0;
    float nota3 = 0;
    int credito1 = 0;
    int credito2 = 0;
    int credito3 = 0;
    float total = 0;
    float ponderado = 0;

    System.out.println("Ingrese la nota para la materia de Mátematicas: ");
    nota1 = entrada.nextFloat();
    System.out.println("Ingrese el crédito para la materia de Mátematicas (porcentaje del 1 al 100):");
    credito1 = entrada.nextInt();

    System.out.println("Ingrese la nota para la materia de Física: ");
    nota2 = entrada.nextFloat();
    System.out.println("Ingrese el crédito para la materia de Física (porcentaje del 1 al 100):");
    credito2 = entrada.nextInt();

    System.out.println("Ingrese la nota para la materia de Español : ");
    nota3 = entrada.nextFloat();
    System.out.println("Ingrese el crédito para la materia de Español (porcentaje del 1 al 100):");
    credito3 = entrada.nextInt();

    total = nota1*credito1 + nota2*credito2 + nota3*credito3;
    ponderado = total / (credito1 + credito2 + credito3);

    System.out.println("Esta es tu nota ponderada: "+ponderado+" .Espero que hayas aprobado.");


    















    }
}