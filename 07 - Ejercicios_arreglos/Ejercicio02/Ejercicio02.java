import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar el tamaño del arreglo: ");
        int num = teclado.nextInt();

        int arreglo [] = new int [num];


            int primo = 2;
            int contador = 0;


            while(contador < (num)){
                int divisores = 0;
                for(int i = 1; i<=primo ; i++){
                    if(primo % i == 0){
                        divisores = divisores + 1;
                    }
                }
                if(divisores == 2){
                    int i = contador;
                    arreglo[i] = primo;
                    System.out.print(" "+"["+arreglo[i]+"]");
                    primo++;
                    contador++;
                    if(contador % num == 0){
                        System.out.println("");
                    }
                }else{
                    primo++; 
                }

            }
        }            
    }
