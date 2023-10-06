import java.util.Scanner;
public class Ejercicio01{

    //1. Suma de dos números: Escribe una función que tome dos números como parámetros y devuelva su suma.
    public static void main(String[] args){
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.print("Ingrese número 1: ");
        num1 = entrada_numeros.nextInt();

        System.out.print("Ingrese número 2: ");
        num2 = entrada_numeros.nextInt();

        System.out.println("Suma: "+sumar(num1, num2));
  
    }

    public static int sumar (int a, int b){
        int resultado = (a + b);
        return resultado;
    }

    





}