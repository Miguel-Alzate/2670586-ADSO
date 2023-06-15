import java.util.Scanner;
public class Ejercicio02{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int cantidad_notas = 0;
    double suma_notas = 0;
    double notas = 0;
    int contador = 1;
    int creditos = 0;
    int suma_creditos = 0;
    double suma_nota_por_creditos = 0;
    
    System.out.print("Señor usuario, ingrese la cantidad de Materias: ");
    cantidad_notas = entrada.nextInt();

		while( contador <= cantidad_notas ){
		 
		 	System.out.print("Ingrese la nota del Materia "+contador+" = ");
            notas = entrada.nextDouble();

            System.out.print("Ingrese el crédito de la Materia "+contador+" = ");
            creditos = entrada.nextInt();

			contador = contador + 1;
            suma_notas = suma_notas + notas;
            suma_creditos = suma_creditos + creditos;
            suma_nota_por_creditos = suma_nota_por_creditos + (notas * creditos);

		}

        double promedio = suma_nota_por_creditos / suma_creditos ;
        System.out.println("Este es el total de creditos: "+ suma_creditos);
        System.out.println("Este es el promedio de las notas: "+ promedio);

    }
}