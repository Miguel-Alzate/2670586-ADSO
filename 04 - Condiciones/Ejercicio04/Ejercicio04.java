import java.util.Scanner;
public class Ejercicio04{
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

    if (num1 > num2 & num1 > num3){
        System.out.println("El número mayor es: "+num1);
        System.out.println("Los numeros menores son: "+num2+", "+num3);
    }
    if (num2 > num1 & num2 > num3){
        System.out.println("El número mayor es: "+num2);
        System.out.println("Los numeros menores son: "+num1+", "+num3);
    }
    if (num3 > num2 & num3 > num1){
        System.out.println("El número mayor es: "+num3);
        System.out.println("Los numeros menores son: "+num2+", "+num1);
    }

}
    
}