import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
  
        System.out.println("Ingresa el tamaño del arreglo");
        numero = teclado.nextInt();

        int pares [] = new int [numero];

        for(int i = 0; i < numero; i++){
            pares[i] = (i+1)*2-1;
        }

        for(int i=0; i < numero; i++){
            System.out.print(" ["+ pares[i] +"] ");
        }
     
    }
}