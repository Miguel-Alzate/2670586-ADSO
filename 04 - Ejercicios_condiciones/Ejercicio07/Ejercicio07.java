import java.util.Scanner;
public class Ejercicio07{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    long num = 0;
    long digito_1 = 0;
    long digito_2 = 0;
    long digito_3 = 0;
    long digito_4 = 0;
    long digito_5 = 0;
    long digito_6 = 0;
    long digito_7 = 0;
    long digito_8 = 0;
    long digito_9 = 0;
    long digito_10 = 0;
    
    System.out.print("Señor usuario, ingrese un número máximo de 10 dígitos y menor a DOS mil millones: ");
    num = entrada.nextLong();

    if(num>1999999999){
        System.out.println("Ingrese un número menor de DOS mil millones.");
    }
    digito_1 = num % 10;
    digito_2 = num % 100 / 10;
    digito_3 = num % 1000 / 100;
    digito_4 = num % 10000 / 1000;
    digito_5 = num % 100000 / 10000;
    digito_6 = num % 1000000 / 100000;
    digito_7 = num % 10000000 / 1000000;
    digito_8 = num % 100000000 / 10000000;
    digito_9 = num % 1000000000 / 100000000;
    digito_10 = num / 1000000000;

    if (num <9999){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_4+"."+digito_3+digito_2+digito_1);
    }else if (num <99999){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_5+digito_4+"."+digito_3+digito_2+digito_1);
    }else if (num <999999){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_6+digito_5+digito_4+"."+digito_3+digito_2+digito_1);
    }else if (num <9999999){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_7+"."+digito_6+digito_5+digito_4+"."+digito_3+digito_2+digito_1);
    }else if (num <99999999){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_8+digito_7+"."+digito_6+digito_5+digito_4+"."+digito_3+digito_2+digito_1);
    }else if (num <999999999){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_9+digito_8+digito_7+"."+digito_6+digito_5+digito_4+"."+digito_3+digito_2+digito_1);
    }else if (num <2000000000){
        System.out.println(" ");
        System.out.println("// ----------- FORMATO DE MONEDA ------------- //");
        System.out.println("Moneda: $ "+digito_10+"."+digito_9+digito_8+digito_7+"."+digito_6+digito_5+digito_4+"."+digito_3+digito_2+digito_1);
    }











    }
}