import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = entrada.nextInt();
        
        int raizDigital = num;
        
        while (raizDigital >= 10) {
            int sumaDigitos = 0;
            while (raizDigital != 0) {
                sumaDigitos += raizDigital % 10;
                raizDigital /= 10;
            }
            raizDigital = sumaDigitos;
        }
        System.out.println("La Raiz Digital de " + num + " es: " + raizDigital);
    }
}