import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor total a financiar: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés (en decimal): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cuotas = scanner.nextInt();

        double interesMensual = tasaInteres * valorTotal;
        double cuotaMensual = (valorTotal + interesMensual) / cuotas;

        System.out.println("\nDetalle de cada cuota:");

        for (int i = 1; i <= cuotas; i++) {
            double interesCuota = tasaInteres * (valorTotal - cuotaMensual * (i - 1));
            double abonoCapital = cuotaMensual - interesCuota;
            valorTotal -= abonoCapital;

            System.out.println("Cuota " + i + ":");
            System.out.println("Valor de la cuota: $" + cuotaMensual);
            System.out.println("Interés: $" + interesCuota);
            System.out.println("Abono a capital: $" + abonoCapital);
            System.out.println("Deuda total: $" + valorTotal);
            System.out.println();
        }
    }
}
