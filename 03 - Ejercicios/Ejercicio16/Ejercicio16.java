import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    //Interés compuesto

        double inversion = 0;
        double interes = 0;
        double mfinal = 0;
        int periodo = 0;

        System.out.print("Ingrese la inversion inicial: ");
        inversion = entrada.nextDouble();
        
        System.out.print("Digite cuanto interés quiere sacar al final: ");
        interes = entrada.nextDouble();
        
        System.out.print("Introduce el tiempo que estará la inversión: ");
        periodo = entrada.nextInt();
        
        periodo = periodo * 12;
        interes = interes/365;
        mfinal = inversion * Math.pow(1 + interes, periodo);
        
        System.out.print("Este es el monto final:"+mfinal);
    }
}