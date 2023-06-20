import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Interés compuesto

        int inversion = 0;
        double interes = 0;
        double mfinal = 0;
        int periodo = 0;


        System.out.println("Digite la inversión inicial: ");
        inversion = entrada.nextInt();

        System.out.println("Ingrese la tasa de interés que desea tener: ");
        interes = entrada.nextDouble();

        System.out.println("Ingrese el periodo de tiempo en el que estará la inversión (en meses) ");
        periodo = entrada.nextInt();



        interes = interes /100;
        mfinal = inversion * Math.pow (1 + interes, periodo);



        System.out.println ("El monto final con intereses es de: "+mfinal);

    }
}