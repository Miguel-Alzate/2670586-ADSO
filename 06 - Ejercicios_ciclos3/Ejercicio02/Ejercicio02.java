import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese la cantidad total financiada: ");
            double cantidadTotalFinanciada = entrada.nextDouble();

            System.out.print("Ingrese la cantidad de cuotas pagadas: ");
            int cuotasPagadas = entrada.nextInt();

            System.out.print("Ingrese el valor de cada cuota: ");
            double valorCuota = entrada.nextDouble();

            double interesPagado = (cuotasPagadas * valorCuota) - cantidadTotalFinanciada;
            double porcentajeInteresPagado = (interesPagado / cantidadTotalFinanciada) * 100;

            System.out.println("El total de intereses pagados es: " + interesPagado);
            System.out.println("El porcentaje de intereses pagados es: " + porcentajeInteresPagado + "%");

            System.out.print("¿Desea calcular los intereses para otro conjunto de valores? (S/N): ");
            String opcion = entrada.next();

            continuar = opcion.equalsIgnoreCase("S");
        }

    }
}