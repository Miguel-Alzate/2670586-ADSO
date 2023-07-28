import java.util.Scanner;
public class Ejercicio04{
    public static void main (String []args){
        Scanner teclado  = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int numero = teclado.nextInt();

        int antihorario [] = new int [numero];

        for(int i = 0; i < numero; i++){
            System.out.print("Ingresa números para llenar el arreglo: ");
            int xd = teclado.nextInt();
            antihorario[i] = xd;
        }
        System.out.println("Forma ascendente: ");
        for(int i = 0; i < numero; i++){
            System.out.print (antihorario[i]+"  ");
        }
        System.out.println(" ");
        System.out.println("Forma descendente: ");
        for(int i = numero-1; i >= 0; i--){
            System.out.print (antihorario[i]+"  ");
        }
       
    }
}