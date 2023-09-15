import java.util.Scanner;
public class Ejercicio06{

    //6. Máximo de tres números: Crea una función que tome tres números y retorne el valor máximo entre ellos
    public static void main(String[] args){
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        System.out.print("Ingrese número 1: ");
        num1 = entrada_numeros.nextInt();

        System.out.print("Ingrese número 2: ");
        num2 = entrada_numeros.nextInt();

        System.out.print("Ingrese número 3: ");
        num3 = entrada_numeros.nextInt();

        System.out.println("El número mayor es: "+maximo(num1, num2, num3));
  
    }

    public static int maximo (int a, int b, int c){
        int resultado;
        if(a > b && a > c){
            resultado = a;
        }else if(b > a && b > c){
            resultado = b;
        }else{
            resultado = c;
        }
       
        return resultado;
       
        
    }

}