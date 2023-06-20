import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Calculo IMC


    int peso = 0;
    double altura = 0;
    double masamuscular = 0;

    


    System.out.println("Ingrese su peso actual, ejemplo 80: ");
    peso = entrada.nextInt();

    System.out.println("Ingrese su estatura actual, ejemplo 1,80: ");
    altura = entrada.nextDouble();

    

    masamuscular = peso / Math.pow(altura, 2);

    System.out.println("Este es tu IMC: "+masamuscular);





    }
}