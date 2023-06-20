import java.util.Scanner;
public class Ejercicio09{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

   double salario = 0;
   int horas = 0;
   int tarifaxhora = 0;
   double valorextras = 0;
   double horaextra = 0;

    System.out.print("Ingresa las horas trabajadas: ");
    horas = entrada.nextInt();

    System.out.print("Ingresa las horas EXTRAS trabajadas: ");
    horaextra = entrada.nextInt();
    
    System.out.print("Ingresa tarifa por hora trabajada: ");
    tarifaxhora = entrada.nextInt();

    salario = horas * tarifaxhora;
    valorextras = tarifaxhora * 1.5;
    horaextra = horaextra * valorextras;

    if(horas +  horaextra > 40 ){
        System.out.println("Este es tu salario: $"+salario+", este es el valor por horas extras: $"+valorextras+" y este es el valor total de horas extras: "+horaextra);
    }else if(horas <=40){
       System.out.println("Este es tu salario: $"+salario);
    }
    }
    
}