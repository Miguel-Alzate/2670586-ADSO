import java.util.Scanner;
public class Ejercicio03{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    int valor_x;
    int valor_y;
    int cuadrante = 0;
    

    System.out.println("Ingresando coordenada en el Plano Cartesiano");
    System.out.print("Ingresa el valor de X: ");
    valor_x = entrada.nextInt();
    System.out.print("Ingresa el valor de Y: ");
    valor_y = entrada.nextInt();

    

    if (valor_x >1 & valor_y >1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Primer Cuadrante");
    }
    if (valor_x >1 & valor_y <1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Cuarto Cuadrante");
    }
    if (valor_x <1 & valor_y <1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Tercer Cuadrante");
    }
    if (valor_x <1 & valor_y >1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Segundo Cuadrante");
    }

    }
}