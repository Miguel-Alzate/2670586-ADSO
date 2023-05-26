import java.util.Scanner;
public class Ejercicio10{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    float nota_1 = 0;
    float nota_2 = 0;
    float nota_3 = 0;
    float nota_4 = 0;
    float nota_5 = 0;
    float promedio = 0;

    System.out.print("Ingresa la nota para Matematicas: ");
    nota_1 = entrada.nextFloat();
    System.out.print("Ingresa la nota para Español: ");
    nota_2 = entrada.nextFloat();
    System.out.print("Ingresa la nota para Inglés: ");
    nota_3 = entrada.nextFloat();
    System.out.print("Ingresa la nota para Ciencias Naturales: ");
    nota_4 = entrada.nextFloat();
    System.out.print("Ingresa la nota para Deportes: ");
    nota_5 = entrada.nextFloat();

    promedio = (nota_1 + nota_2 + nota_3 + nota_4 + nota_5)/5;

    System.out.println("         ");
    System.out.println("Tu nota de Matematicas es: "+nota_1);
    System.out.println("Tu nota de Español es: "+nota_2);
    System.out.println("Tu nota de Inglés es: "+nota_3);
    System.out.println("Tu nota de Ciencias Naturales es: "+nota_4);
    System.out.println("Tu nota de Deportes es: "+nota_5);
    System.out.println("         ");
    System.out.println("Este es tu Informe: ");

    if(nota_1 > nota_2 & nota_1 > nota_3 & nota_1 > nota_4 & nota_1 > nota_5){
        System.out.println("Asignatura con mejor nota: Matematicas");
    }

    if(nota_2 > nota_1 & nota_2 > nota_3 & nota_2 > nota_4 &nota_2 > nota_5){
        System.out.println("Asignatura con mejor nota: Espanol");
    }

    if(nota_3 > nota_1 & nota_3 > nota_2 & nota_3 > nota_4 & nota_3 > nota_5){
        System.out.println("Asignatura con mejor nota: Ingles");
    }

    if(nota_4 > nota_1 & nota_4 > nota_2 & nota_4 >nota_3 & nota_4 > nota_5){
        System.out.println("Asignatura con mejor nota: Ciencias Naturales");
    }

    if(nota_5 >nota_1 & nota_5 > nota_2 & nota_5 > nota_3 & nota_5 > nota_4){
        System.out.println("Asignatura con mejor nota: Deportes");
    }
 
    if(nota_1 <nota_2 & nota_1 < nota_3 & nota_1 < nota_4 & nota_1 < nota_5){
        System.out.println("Asignatura con peor nota: Matematicas");
    }

    if(nota_2 < nota_1 &nota_2 < nota_3 &nota_2 < nota_4 &nota_2 < nota_5){
        System.out.println("Asignatura con peor nota: Espanol");
    }

    if(nota_3 < nota_1 & nota_3 <nota_2 & nota_3 < nota_4 & nota_3 < nota_5){
        System.out.println("Asignatura con peor nota: Ingles");
    }

    if(nota_4 < nota_1 & nota_4 < nota_3 & nota_4 <nota_2 & nota_4 < nota_5){
        System.out.println("Asignatura con peor nota: Ciencias Naturales");
    }

    if(nota_5 <nota_2 & nota_5 < nota_3 & nota_5 < nota_4 & nota_5 < nota_1){
        System.out.println("Asignatura con peor nota: Deportes");
    }


    System.out.println("Promedio de notas: "+promedio);

    if(promedio <3 & nota_1 < nota_2 & nota_1 < nota_3 & nota_1 < nota_4 & nota_1 < nota_5){
        System.out.println("Debio obtener una nota de:--- en Matematicas para aprobar el periodo");
    }else if(promedio <3 & nota_2 < nota_1 & nota_2 < nota_3 & nota_2 < nota_4 & nota_2 < nota_5){
        System.out.println("Debio obtener una nota de:--- en Español aprobar el periodo");
    }else if(promedio <3 & nota_3 < nota_1 & nota_3 < nota_2 & nota_3 < nota_4 & nota_3 < nota_5){
        System.out.println("Debio obtener una nota de:--- en Inglés aprobar el periodo");
    }else if(promedio <3 & nota_4 < nota_1 & nota_4 < nota_2 & nota_4 < nota_3 & nota_4 < nota_5){
        System.out.println("Debio obtener una nota de:--- en Ciencias Naturales aprobar el periodo");
    }else if(promedio <3 & nota_5 < nota_1 & nota_5 < nota_2 & nota_5 < nota_3 & nota_5 < nota_4){
        System.out.println("Debio obtener una nota de:--- en Deportes aprobar el periodo");
    }
    
   
    
    }
}