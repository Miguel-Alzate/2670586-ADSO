import java.util.Scanner;
public class Ejercicio01{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    int edad;

    System.out.println("Hola usuario, ¿cual es tu edad?");
    edad = entrada.nextInt();

    if (edad >= 100){
        System.out.println("Señor usuario, ingresa una edad válida.");
    }else if(edad <= 0){
        System.out.println("Señor usuario, ingresa una edad válida.");
    }else if (edad <18){
        System.out.println("Señor usuario, eres menor de edad y recibirás un auxilio económico de $800.000 Pesos.");
    }else{
        System.out.println("Señor usuario, eres mayor de edad y deberás pagar un impuesto de de $200.0000 Pesos.");
    }

















    }
}