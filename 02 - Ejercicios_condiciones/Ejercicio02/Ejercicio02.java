import java.util.Scanner;
public class Ejercicio02{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    int num = 0;

    System.out.print("Señor usuario, digita porfavor un número de 3 dígitos: ");
    num = entrada.nextInt();


    if (num > 999){
        System.out.println("Señor usuario, escriba un dígito válido de 3 dígitos porfavor.");
    }else if (num % 2 ==0){
        System.out.println("Señor usuario, el número que ingresaste es Par.");
    }else{
        System.out.println("Señor usuario, el número que ingresaste es Impar.");
    }




    }
}