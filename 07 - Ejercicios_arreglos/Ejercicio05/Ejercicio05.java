import java.util.Scanner;
public class Ejercicio05{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);

        int contador = 1;


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

        System.out.print("Número de movimientos: ");
        int movimientos = teclado.nextInt();
        


        for(int i = 1; i <= movimientos; i++){
            System.out.print("Movimiento 0"+i+": ");
            for(int j = contador; j < numero; j++){
                System.out.print (antihorario[j]+"  ");

            }
            for(int k = 0; k < contador; k++){
            System.out.print (+antihorario[k]+"  ");
            }
            System.out.println(" ");
            contador++;
        }
       
    }
}