import java.util.Scanner;

public class Ejercicio02{
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    
   int digito_1 = 0;
   int digito_2 = 0;
   int digito_3 = 0;
   int digito_4 = 0;


    System.out.print("Señor usuario, ingresa un número de 4 dígitos: ");
    int num = entrada.nextInt();
    
    digito_1 = num %10;
    digito_2 = num %10 / 10;
    digito_3 = num %100 / 10;
    digito_4 = num %1000 / 100;
    
    if(num>0 && num<9999){
        if(digito_1>digito_2 && digito_1>digito_3 && digito_1>digito_4){
            System.out.println("El mayor número de los 4 dígitos ingresados es el "+digito_1);
        }else if(digito_2>digito_1 && digito_2>digito_3 && digito_2>digito_4){
            System.out.println("El mayor número de los 4 dígitos ingresados es el "+digito_2);
        }else if(digito_3>digito_1 && digito_3>digito_2 && digito_3>digito_4){
            System.out.println("El mayor número de los 4 dígitos ingresados es el "+digito_3);
        }else if(digito_4>digito_1 && digito_4>digito_2 && digito_4>digito_3){
            System.out.println("El mayor número de los 4 dígitos ingresados es el "+digito_4);
        }
    }else{
        System.out.println("Ingrese un número de 4 dígitos");
    }


    }
}


