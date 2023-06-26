import java.util.Scanner;
public class Ejercicio03{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int num_aleatorio = 0;
    int contador = 0;
    int i = 0;
    int contador_numero = 1;

    System.out.print("Ingrese numero N: ");
    num = entrada.nextInt();

    System.out.println("Primos Aleatorios: ");

    while(contador < num){


        

        
        for(contador = 1; contador <= num; i=i+1){
        num_aleatorio = (int) Math.floor(Math.random() * 1000 + 1);
       
            int divisores = 0;
            for(i = 1; i<=num_aleatorio ; i++){
                if(num_aleatorio % i == 0){
                    divisores = divisores + 1;
                }
                }
                if(divisores == 2){
                    System.out.println("Primo "+contador_numero+" Generado: "+num_aleatorio);
                    contador_numero = contador_numero + 1;
                    contador++;
                }
        }
       
       

        
        }
        
    

      


    


    }
}