import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String cadena;
        int num = 0;

        System.out.print("Ingrese un número: ");
        cadena = entrada.nextLine();
        
       
        num = Integer.parseInt(cadena);

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par.");
        }else{
            System.out.println("El número ingresado es impar.");
        }
        
    }
}