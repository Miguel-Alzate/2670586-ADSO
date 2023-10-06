import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = entrada_numeros.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = entrada_numeros.nextDouble();

        double area = calcularAreaTriangulo(base, altura);

        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);

    
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        // Usamos la fórmula A = (base * altura) / 2
        double area = (base * altura) / 2.0;
        return area;
    }
}