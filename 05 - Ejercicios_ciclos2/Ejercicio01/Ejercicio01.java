import java.util.Scanner;
public class Ejercicio01{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int contador = 1;
    double numero_aleatorio = 0;
    int producto = 0;
    int numero_final = 0;
    int sumaxd = 0;

    System.out.print("Ingresa un número entre 1 y 6: ");
    int num = entrada.nextInt();

    System.out.print("El número construido es: ");


    if(num >= 1 && num < 7){
        while(contador <= num){
            
            numero_aleatorio = Math.random() * 9;

            contador = contador + 1;
            
            numero_final = (int) Math.floor(numero_aleatorio);

            System.out.print(numero_final);

            producto = producto + numero_final;
            
        }
            System.out.println(" ");
            System.out.println("Resultado producto: "+producto);
    }else{
        System.out.println("Ingresa un número VALIDO entre 1 y 6.");
    }
    
    }
}