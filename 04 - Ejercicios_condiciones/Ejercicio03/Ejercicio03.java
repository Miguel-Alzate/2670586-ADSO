import java.util.Scanner;
public class Ejercicio03{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

    int valor_x;
    int valor_y;
    

    System.out.println("Ingresando coordenada en el Plano Cartesiano");
    System.out.print("Ingresa el valor de X: ");
    valor_x = entrada.nextInt();
    System.out.print("Ingresa el valor de Y: ");
    valor_y = entrada.nextInt();

    if (valor_x == 0 & valor_y == 0){
        System.out.println("El valor de la coordenada se encuentra en el punto de Origen");
    }else if (valor_x >=1 & valor_y >=1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Primer Cuadrante");
    }else if (valor_x >=1 & valor_y <1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Cuarto Cuadrante");
    }else if (valor_x <1 & valor_y <1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Tercer Cuadrante");
    }else if (valor_x <1 & valor_y >=1){
        System.out.println("El valor de la coordenada ingresada se encuentra en el Segundo Cuadrante");
    }

   

    }
}