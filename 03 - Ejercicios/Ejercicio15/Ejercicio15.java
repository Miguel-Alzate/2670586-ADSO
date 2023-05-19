import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Conversión de unidades

    float mts = 0;
    float cm = 0;
    double inch = 0;
    double feet = 0;


    System.out.println("Escriba los metros que quiera cambiar a Centímetros, Pulgadas y Pies:");
    mts = entrada.nextFloat();


    cm = mts *100;
    inch = mts *39.37;
    feet = mts *3.281;


    System.out.println("Esta es tu conversión de "+mts+ " metros a Centímetros, Pulgadas y Pies:");
    System.out.println("Cm: "+cm);
    System.out.println("Inches: "+inch);
    System.out.println("Ft: "+feet);





    }
}