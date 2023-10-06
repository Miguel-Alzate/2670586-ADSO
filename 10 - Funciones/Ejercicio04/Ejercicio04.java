import java.util.Scanner;
public class Ejercicio04{

    //4. División de dos números: Crea una función que reciba dos números, los divida y retorne el cociente.
    public static void main(String[] args){
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.print("Ingrese número 1: ");
        num1 = entrada_numeros.nextInt();

        System.out.print("Ingrese número 2: ");
        num2 = entrada_numeros.nextInt();

        System.out.println("División: "+division(num1, num2));
  
    }

    public static float division (float a, float b){
        float resultado = (a / b);
        if(a!=0 && b!=0){
            return resultado;
        }else{
            return -1;
        }
        
    }

}