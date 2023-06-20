import java.util.Scanner;
public class Ejercicio01{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int cantidad_notas = 0;
    double suma_notas = 0;
    double notas = 0;
    int contador = 1;
    
    System.out.print("Señor usuario, ingrese la cantidad de notas: ");
    cantidad_notas = entrada.nextInt();

		while( contador <= cantidad_notas ){
		 
		 	System.out.print("Ingrese la nota "+contador+" = ");
            notas = entrada.nextDouble();
			contador = contador + 1;
            suma_notas = suma_notas + notas;
		}
        double promedio = suma_notas / cantidad_notas ;
        System.out.println("Este es el promedio de las notas: "+ promedio);

    }
}