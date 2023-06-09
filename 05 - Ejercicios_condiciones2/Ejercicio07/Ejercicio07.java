import java.util.Scanner;

public class Ejercicio07{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    
   int num = 0; 
   int digito_1 = 0;
   int digito_2 = 0;
   int digito_3 = 0;
   int digito_4 = 0;
   int digito_5 = 0;

    System.out.print("Señor usuario, ingresa un número de 5 dígitos: ");
    num = entrada.nextInt();

    digito_1 = num % 10;
    digito_2 = (num / 10 ) % 10;
    digito_3 = (num / 100 ) % 10;
    digito_4 = (num / 1000 ) % 10;
    digito_5 = (num / 10000) % 10;


    if (num > 99999 || num < 10000){
        System.out.println("Ingrese un número de 5 dítigos.");
    }else if(digito_1 == digito_5 && digito_2 == digito_4 ){
        System.out.println("El número que ingresaste es un palíndromo");
    }else{
        System.out.println("El número que ingresaste no es un palíndromo");
    }
    

    }
}