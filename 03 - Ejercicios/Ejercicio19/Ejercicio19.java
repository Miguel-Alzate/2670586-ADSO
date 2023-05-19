import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Registro de empleados

    String nombre;
    int edad = 0;
    int salario = 0;


    System.out.println("Ingresa tu nombre ");
    nombre = entrada.nextLine();

    System.out.println("Ingresa tu edad ");
    edad = entrada.nextInt();

    System.out.println("Ingresa tu salario ");
    salario = entrada.nextInt();

    System.out.println("-------------------------------");
    System.out.println("Este es tu registro: ");
    System.out.println("                      ");
    System.out.println("Nombre: "+nombre);
    System.out.println("Edad: "+edad);
    System.out.println("Salario: "+salario);

    }
}