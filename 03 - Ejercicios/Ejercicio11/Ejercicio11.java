import java.util.Scanner;
public class Ejercicio11{   
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);

    //Area, Perimetro y radio
    double rad = 0;

    double area = 0;

    double per = 0;

    System.out.println("Digite el radio del circulo:");
    rad = entrada.nextDouble();

    System.out.println("                               ");

    per = 2 * Math.PI * rad;
    area = Math.PI * Math.pow(rad, 2);


    System.out.println("Este es el perímetro con base al radio anterior: "+per);


    System.out.println("Esta es el área con base al radio anterior: "+area);

    }

}