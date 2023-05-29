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
    float nota_aprobar = 0;
    float nota_necesita1 = 0;
    float nota_necesita2 = 0;
    float nota_necesita3 = 0;
    float nota_necesita4 = 0;
    float nota_necesita5 = 0;

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

    nota_aprobar = 15 - (promedio*5);
    nota_necesita1 = (nota_aprobar / 1)+nota_1;
    nota_necesita2 = (nota_aprobar / 1)+nota_2;
    nota_necesita3 = (nota_aprobar / 1)+nota_3;
    nota_necesita4 = (nota_aprobar / 1)+nota_4;
    nota_necesita5 = (nota_aprobar / 1)+nota_5;
    



    System.out.println("Promedio de notas: "+promedio);

    if(promedio <3 & nota_1 < nota_2 & nota_1 < nota_3 & nota_1 < nota_4 & nota_1 < nota_5){
        System.out.println("Debio obtener una nota de: "+nota_necesita1+"  en Matematicas para aprobar el periodo");
    }else if(promedio <3 & nota_2 < nota_1 & nota_2 < nota_3 & nota_2 < nota_4 & nota_2 < nota_5){
        System.out.println("Debio obtener una nota de: "+nota_necesita2+" en Español aprobar el periodo");
    }else if(promedio <3 & nota_3 < nota_1 & nota_3 < nota_2 & nota_3 < nota_4 & nota_3 < nota_5){
        System.out.println("Debio obtener una nota de: "+nota_necesita3+" en Inglés aprobar el periodo");
    }else if(promedio <3 & nota_4 < nota_1 & nota_4 < nota_2 & nota_4 < nota_3 & nota_4 < nota_5){
        System.out.println("Debio obtener una nota de: "+nota_necesita4+" en Ciencias Naturales aprobar el periodo");
    }else if(promedio <3 & nota_5 < nota_1 & nota_5 < nota_2 & nota_5 < nota_3 & nota_5 < nota_4){
        System.out.println("Debio obtener una nota de: "+nota_necesita5+" en Deportes aprobar el periodo");
    }
    
   
    
    }
}
