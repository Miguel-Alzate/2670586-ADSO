import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int digito = 0;
    int resto;
    int invertido = 0;
    int contador = 1;

    System.out.print("Ingresa un número de maximo 6 dígitos: ");
    num = entrada.nextInt();


    if(num>=1 && num<999999){
        System.out.println("Los dígitos separados son: ");
        while (num >0) {
        digito = num % 10;
        System.out.println("El digito "+contador+ " es: "+ digito);
        num /= 10;
        contador = contador + 1;
    }
    }else{
        System.out.println("Dígita un número válido.");
    }

    
    







    }
}