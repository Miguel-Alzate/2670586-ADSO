import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = entrada_numeros.nextDouble();

        double area = calcularAreaCirculo(radio);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);


    }

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        // Usamos la fórmula A = π * r^2
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}

