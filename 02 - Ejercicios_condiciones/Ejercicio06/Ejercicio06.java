import java.util.Scanner;
public class Ejercicio06{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);

   int num = 0;
   int opcion = 0;
   int digito_1 = 0;
   int digito_2 = 0;
   int digito_3 = 0;
   int digito_4 = 0;
   int digito_5 = 0;
   int digito_6 = 0;


    System.out.print("Señor usuario, ingresa un número de 6 dígitos: ");
    num = entrada.nextInt();

    digito_1 = num%10;
    digito_2 = num%100/10;
    digito_3 = num%1000/100;
    digito_4 = num%10000/1000; 
    digito_5 = num%100000/10000;
    digito_6 = num%1000000/100000;

    if (num>999999){
        System.out.println("Ingrese un número de 6 dígitos válido.");
    }else if(num == 0){
        System.out.println("Ingrese un número de 6 dígitos válido.");
    }else{
        System.out.println("// ----------------------------------------------------------------- //");
        System.out.println("      Menú:");
        System.out.println("      1. Primer Dígito.    2. Segundo Dígito.    3. Tecer Dígito.");
        System.out.println("      4. Cuarto Dígito.    5. Quinto Dígito.     6. Sexto Dígito.");
        System.out.println("// ----------------------------------------------------------------- //");
        System.out.println(" ");
        System.out.print("Eliga una opción (1 al 6): ");
        opcion = entrada.nextInt();
    }

    if (opcion >6){
        System.out.println("Eliga una opción válida (del 1 al 6).");
    }else if (opcion == 1){
        System.out.println("El Primer Dígito de " +num+ " es: "+digito_1);
    }else if (opcion == 2){
        System.out.println("El Segundo Dígito de " +num+ " es: "+digito_2);
    }else if (opcion == 3){
        System.out.println("El Tercer Dígito de " +num+ " es: "+digito_3);
    }else if (opcion == 4){
        System.out.println("El Cuarto Dígito de " +num+ " es: "+digito_4);
    }else if (opcion == 5){
        System.out.println("El Quinto Dígito de " +num+ " es: "+digito_5);
    }else if (opcion == 6){
        System.out.println("El Sexto Dígito de " +num+ " es: "+digito_6);
    }
    }
}