import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        int op1 = 0;
        boolean repite;
        int cantidad_notas = 0;
        double suma_notas = 0;
        double notas = 0;
        int contador = 1;
        int creditos = 0;
        int suma_creditos = 0;
        double suma_nota_por_creditos = 0;

        do{
            System.out.println();
            System.out.println("|----------Bienvenido----------|");
            System.out.println("|  1. Docente                  |");
            System.out.println("|  2. Estudiante               |");
            System.out.println("|  3. Salir                    |");
            System.out.println("|------------------------------|");
            System.out.print  ("--> Ingrese una opción: ");
            op1 = entrada.nextInt(); 

            switch(op1) {

            case 1:
                System.out.print("Señor DOCENTE, ingrese la cantidad de notas: ");
                cantidad_notas = entrada.nextInt();

		        while( contador <= cantidad_notas ){
		 
                System.out.print("Ingrese la nota "+contador+" = ");
                notas = entrada.nextDouble();
                contador = contador + 1;
                suma_notas = suma_notas + notas;
		        }

                double promedio = suma_notas / cantidad_notas ;
                System.out.println("Este es el promedio de las notas: "+ promedio);
                break;

            case 2:

                System.out.print("Querido ESTUDIANTE, ingrese la cantidad de Materias: ");
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

                promedio = suma_nota_por_creditos / suma_creditos;
                System.out.println("Este es el total de creditos: "+ suma_creditos);
                System.out.println("Este es el promedio de las notas: "+ promedio);  
                break;
    
            case 3:
                System.out.print("Adiós...");
                break;
                
            default:
                System.out.println("Opción inválida.");
                break;
            }   

        }while(op1 !=3);









    }
}