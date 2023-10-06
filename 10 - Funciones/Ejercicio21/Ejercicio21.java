import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = entrada_numeros.nextDouble();

        double fahrenheit = convertirCelsiusAFahrenheit(celsius);

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");

    }

    // Función para convertir grados Celsius a grados Fahrenheit
    public static double convertirCelsiusAFahrenheit(double celsius) {
        // Usamos la fórmula F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }
}