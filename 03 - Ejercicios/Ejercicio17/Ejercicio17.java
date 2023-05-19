import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Conversión de moneda

    double pesos = 0;
    double usd = 0;
    double eur = 0;
    double jpy = 0;
    double gbp = 0;


    System.out.println("Escriba la cantidad de pesos que desea convertir a Dolares, Euros, Yenes y Libras esterlinas :");
    pesos = entrada.nextDouble();


    usd = pesos *0.00022;
    eur = pesos *0.00021;
    jpy = pesos *0.031;
    gbp = pesos *0.00018;


    System.out.println("Esta es tu conversión de "+pesos+ " Pesos Colombianos a Dolares, Euros, Yenes y Libras esterlinas:");
    System.out.println("USD: "+usd+"$");
    System.out.println("EUR: "+eur+"$");
    System.out.println("JPY: "+jpy+"$");
    System.out.println("GBP: "+gbp+"$");


    }
}