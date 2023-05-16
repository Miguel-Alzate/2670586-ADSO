import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Area de un rectángulo

    int ancho = 0;
    int altura = 0;
    int area = 0;

    System.out.println("Digite el ancho del triangulo");
    ancho = entrada.nextInt();

    System.out.println("Digite la altura del triangulo");
    altura = entrada.nextInt();

    System.out.println("                                                    ");

    area = ancho * altura;
    System.out.println("Esta es el area del triangulo a partir del ancho y base proporcionados: "+area);

    }
}