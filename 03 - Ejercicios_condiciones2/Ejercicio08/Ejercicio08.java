import java.util.Scanner;
public class Ejercicio08{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);


    int base = 0;
    int altura = 0;
    int area = 0;
    System.out.print("Ingresa la base de tu triangulo. ");
    base = entrada.nextInt();

    System.out.print("Ingresa la altura de tu triangulo. ");
    altura = entrada.nextInt();


    area = base * altura /2;

    if (base>0 & altura>0){
        System.out.println("Esta es el area de tu triangulo: "+area);
    }else{
        System.out.println("Ingresa valores positivos");
    }


    }
}