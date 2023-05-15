import java.util.Scanner;
public class Ejercicio05{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    //Cálculo del área de un triángulo

    int base;
    int altura;
    int area;
    System.out.println("Ingresa la base de tu triangulo.");
    base = entrada.nextInt();

    System.out.println("Ingresa la altura de tu triangulo.");
    altura = entrada.nextInt();


    area = base * altura /2;
    System.out.println("Esta es el area de tu triangulo: "+area);



    }
}