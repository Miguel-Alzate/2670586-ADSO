import java.util.Scanner;
public class Ejercicio05{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

    System.out.print("Señor usuario, ingrese el primer numero: ");
    num1 = entrada.nextInt();

    System.out.print("Señor usuario, ingrese el segundo numero: ");
    num2 = entrada.nextInt();

    System.out.print("Señor usuario, ingrese el tercer numero: ");
    num3 = entrada.nextInt();

    if (num1 < num2 & num2 < num3){
        System.out.println("Los números se ingresaron en Orden Ascendente.");
    }else if (num1 == num2 & num2 == num3){
        System.out.println("Los números son iguales");
    }else if (num1 > num2 & num2 > num3){
        System.out.println("Los números se ingresaron en Orden Descendente");
    }else{
        System.out.println("Los números están en desorden");
    }





    }
}
