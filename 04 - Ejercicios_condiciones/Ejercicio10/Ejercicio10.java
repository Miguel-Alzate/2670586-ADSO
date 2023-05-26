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
    
    if(promedio < 3 & nota_1 > nota_2 & nota_1 > nota_3 & nota_1 > nota_4 & nota_1 > nota_5 && nota_2<nota_1 & nota_2<nota_3 & nota_2<nota_4 & nota_2<nota_5) {
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Matemáticas ");
        System.out.println("        --> Asignatura con menor nota: Español");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Debió obtener una nota de  en para aprobar el periodo.");
    }else if(promedio < 3 & nota_2 > nota_1 & nota_2 > nota_3 & nota_2 > nota_4 & nota_2 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Español ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Debió obtener una nota de  en para aprobar el periodo.");
    }else if(promedio < 3 & nota_3 > nota_1 & nota_3 > nota_2 & nota_3 > nota_4 & nota_3 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Inglés ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Debió obtener una nota de  en para aprobar el periodo.");
    }else if(promedio < 3 & nota_4 > nota_1 & nota_4 > nota_2 & nota_4 > nota_3 & nota_4 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Ciencias Naturales ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Debió obtener una nota de  en para aprobar el periodo.");
    }else if(promedio < 3 & nota_5 > nota_1 & nota_5 > nota_2 & nota_5 > nota_3 & nota_5 > nota_4){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Deportes ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Debió obtener una nota de  en para aprobar el periodo.");
    
    
    
    }else if(promedio > 3 & nota_1 > nota_2 & nota_1 > nota_3 & nota_1 > nota_4 & nota_1 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Matemáticas ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Felicidades, aprobaste el periodo.");
    }else if(promedio > 3 & nota_2 > nota_1 & nota_2 > nota_3 & nota_2 > nota_4 & nota_2 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Español ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Felicidades, aprobaste el periodo.");
    }else if(promedio > 3 & nota_3 > nota_1 & nota_3 > nota_2 & nota_3 > nota_4 & nota_3 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Inglés ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Felicidades, aprobaste el periodo.");
    }else if(promedio > 3 & nota_4 > nota_1 & nota_4 > nota_2 & nota_4 > nota_3 & nota_4 > nota_5){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Ciencias Naturales ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Felicidades, aprobaste el periodo.");
    }else if(promedio > 3 & nota_5 > nota_1 & nota_5 > nota_2 & nota_5 > nota_3 & nota_5 > nota_4){
        System.out.println(" ");
        System.out.println("Informe: ");
        System.out.println("        --> Asignatura con mejor nota: Deportes ");
        System.out.println("        --> Asignatura con menor nota: ");
        System.out.println("        --> Promedio de notas: "+promedio);
        System.out.println("        --> Felicidades, aprobaste el periodo.");

    }
    }
}