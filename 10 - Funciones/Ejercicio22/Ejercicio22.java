import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[] args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        int n = 0;
        System.out.println("Ingresa el tamaño del arreglo");
        n = entrada_numeros.nextInt();
        
        primosArreglo(n);


       
    }
    


    public static void primosArreglo(int tamano){
        int arreglo [] = new int [tamano];
        int aux = 0;

        for(int i=0; i<arreglo.length; aux++){
            int aleatorio = (int) (Math.random()*100);
            if(aleatorio % 2 == 0 ){
                aux = 0;
            }else{
                arreglo[i] = aleatorio;
                i++;
            }
        }

        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
    }


}