import java.util.Scanner;
public class Principal3{
    public static void main (String[] args){
        Scanner texto_entrada = new Scanner( System.in);
        Scanner numeros_entrada = new Scanner( System.in);

        int opcion = 0;

        while( opcion !=5 ){
            System.out.println("+------------------------------------+");
            System.out.println("+            MENU PERSONAS           +");
            System.out.println("+------------------------------------+");
            System.out.println("|                       Memoria: 00  |");
            System.out.println("|   1: Registrar persona.            |");
            System.out.println("|   2: Ver lista de personas.        |");
            System.out.println("|   3: Editar persona.               |");
            System.out.println("|   4: Eliminar persona.             |");
            System.out.println("|   5: Salir.                        |");
            System.out.println("+------------------------------------+");
            System.out.print("=> Ingrese una opción (1 al 5): ");
            opcion = numeros_entrada.nextInt();

            if(opcion == 1){

            }

            if(opcion == 2){
                
            }

            if(opcion == 3){
                
            }

            if(opcion == 4){
                
            }

            if(opcion == 5){
                System.out.println(""); 
                System.out.println("|----------------------|");      
                System.out.println("|------ SALIENDO ------|");   
                System.out.println("|----------------------|");       
            }



        }
        
     

    }
}