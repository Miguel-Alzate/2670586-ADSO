import java.util.Scanner;
public class Ejercicio03{

    //3. Multiplicación de dos números: Implementa una función que reciba dos números, los multiplique y devuelva el resultado.
    public static void main(String[] args){
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.print("Ingrese número 1: ");
        num1 = entrada_numeros.nextInt();

        System.out.print("Ingrese número 2: ");
        num2 = entrada_numeros.nextInt();

        System.out.println("Multiplicacion: "+multiplicacion(num1, num2));
  
    }

    public static int multiplicacion (int a, int b){
        int resultado = (a * b);
        return resultado;
    }

    





}