import java.util.Scanner;
public class Ejercicio03{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);

        int recorrer = 0;

        System.out.print("Ingresa el tamaño del arreglo: ");
        int numero = teclado.nextInt();

        int antihorario [] = new int [numero];

        for(int i = 0; i < numero; i++){
            System.out.print("Ingresa números para llenar el arreglo: ");
            int xd = teclado.nextInt();
            antihorario[i] = xd;
        }
            System.out.print ("Arreglo: ");
        for(int i = 0; i < numero; i++){

            System.out.print (antihorario[i]+"  ");
           
        }
        System.out.println(" ");

        System.out.print("Posición: ");
        int posicion = teclado.nextInt();


        System.out.print ("Antihorario: ");

        for(int i = posicion; i >= 0; i--){
            System.out.print (+antihorario[i]+"  ");
        }
        for(int i = numero-1; i > posicion; i--){
            System.out.print (+antihorario[i]+"  ");
        }
    }
}