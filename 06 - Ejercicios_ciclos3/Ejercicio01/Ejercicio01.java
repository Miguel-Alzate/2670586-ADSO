import java.util.Scanner;
public class Ejercicio01{
    public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);

    int sueldo = 0;
    int cantidad_pagos = 0;
    int op1 = 0;
    int auxiliar = 0;
    int auxiliar2 = 0;
    int auxiliar3 = 0;
    int contador = 1;
    boolean fin;

    fin = true;


    System.out.print("=> Ingrese un sueldo Total: ");
    sueldo = entrada.nextInt();

    System.out.print("=> Cantidad de Pagos: ");
    cantidad_pagos = entrada.nextInt();

    do{
        System.out.println();
        System.out.println("|------------FORMAS DE PAGO-----------|");
        System.out.println("|  1. Pagos de igual valor            |");
        System.out.println("|  2. Primer pago diferente           |");
        System.out.println("|  3. Ultimo pago diferente           |");
        System.out.println("|  4. Primer y ultimo pago diferente  |");
        System.out.println("|-------------------------------------|");
        System.out.print  ("--> Ingrese una forma de pago: ");
        op1 = entrada.nextInt(); 
        System.out.println  ("---------- SUS PAGOS SERAN ---------");

            switch(op1) {

            case 1:
                
                auxiliar = sueldo / cantidad_pagos;
        
                while(contador <= cantidad_pagos){
                    System.out.println("Mes 0"+contador+":  $"+auxiliar);
                    contador = contador + 1;
                }
                fin = false;
                break;

            case 2:
                contador = 2;
                auxiliar = sueldo / 2 ;
                System.out.println("Mes 01:  $"+auxiliar);
                

                while(contador <= cantidad_pagos){
                    auxiliar3 = cantidad_pagos - 1;
                    auxiliar2 = auxiliar / auxiliar3;
                    System.out.println("Mes 0"+contador+":  $"+auxiliar2);
                    contador = contador + 1;
                }
                fin = false;
                break;
    
            case 3:
                contador = 1;
                auxiliar = sueldo / 2 ;
                
                while(contador < cantidad_pagos){
                    auxiliar3 = cantidad_pagos - 1;
                    auxiliar2 = auxiliar / auxiliar3;
                    System.out.println("Mes 0"+contador+":  $"+auxiliar2);
                    contador = contador + 1;
                }
                auxiliar = sueldo / 2 ;
                System.out.println("Mes 0"+contador+":  $"+auxiliar);
                fin = false;
                break;

            case 4:

                auxiliar = sueldo / 2 / 2;
                System.out.println("Mes 01:  $"+auxiliar);
                contador = 2;
                
                while(contador < cantidad_pagos){
                    auxiliar3 = cantidad_pagos - 2;
                    auxiliar2 = auxiliar / auxiliar3;
                    auxiliar2 = auxiliar2 * 2;
                    System.out.println("Mes 0"+contador+":  $"+auxiliar2);
                    contador = contador + 1;
                }
                auxiliar = sueldo / 2 / 2;
                System.out.println("Mes 0"+contador+":  $"+auxiliar);
                fin = false;
                break;
            default:
                System.out.println("Opción inválida.");
                break;
            }   

        }while(fin = false);


    }
}