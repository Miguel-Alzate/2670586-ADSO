import java.util.Scanner;
public class Ejercicio05{

    //5. Potencia: Escribe una función que tome dos números como entrada y calcule el primero elevado a la potencia del segundo.
    public static void main(String[] args){
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.print("Ingrese número 1: ");
        num1 = entrada_numeros.nextInt();

        System.out.print("Ingrese número 2: ");
        num2 = entrada_numeros.nextInt();

        System.out.println("Potencia: " + potencia(num1, num2));
  
    }

    public static int potencia(int a, int b) {
    int resultado = 1;
    
    for (int i = 0; i < b; i++) {
        resultado *= a;
    }
    
    return resultado;
}

}