import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int c_parada = 0;
        double contador_kilometros = 0.0;

        System.out.println("|----------RUTA DEL RECORRIDO----------|");
        System.out.println("|                                      |");
        System.out.println("|      1-Mistrató                      |");
        System.out.println("|      2-Pueblo rico                   |");
        System.out.println("|      3-Quinchía                      |");
        System.out.println("|      4-Santo rosa de cabal           |");
        System.out.println("|      5-Santuario                     |");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("");

        System.out.print("Ingrese la ciudad de origen con su número correspondiente: ");
        int c_origen = entrada.nextInt();

        System.out.print("Ingrese la cantidad de paradas que hará: ");
        int paradas = entrada.nextInt();

        

        for (int i = 1; i <= paradas; i++) {

            System.out.print("Ingrese la ciudad " + i + " de parada(numero): ");
            c_parada = entrada.nextInt();

            double kilometros_recorridos = 0.0;

            if (c_origen == 1) {
                if (c_parada == 1) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 81.5;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 57.9;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 98.5;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 70.5;
                }
            }
    
            if (c_origen == 2) {
                if (c_parada == 1) {
                    kilometros_recorridos = 81.7;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 103.0;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 102.0;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 34.5;
                }
            }
    
            if (c_origen == 3) {
                if (c_parada == 1) {
                    kilometros_recorridos = 53.6;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 103.0;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 83.5;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 109.0;
                }
            }
    
            if (c_origen == 4) {
                if (c_parada == 1) {
                    kilometros_recorridos = 99.8;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 103.0;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 83.2;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 76.4;
                }
            }
    
            if (c_origen == 5) {
                if (c_parada == 1) {
                    kilometros_recorridos = 70.4;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 34.3;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 109.0;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 75.2;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 5.0;
                } 
            }
            
            contador_kilometros = contador_kilometros + kilometros_recorridos; 
            c_origen = c_parada; 
            System.out.println(kilometros_recorridos+"Km");

        }

        System.out.println("Estos son los kilometros totales recorridos: " + contador_kilometros+"Km"); 

        double precio_diesel = 2394.720;

        double consumo_diesel = 0.22; 

        double diesel_consumido = contador_kilometros * consumo_diesel; 

        double precio_total = diesel_consumido * precio_diesel; 

        System.out.println ("Este es el total de combustible (Diesel) que se gastó en el viaje:  " + diesel_consumido+"Lts"); 

        System.out.println("El valor total en pesos de gasolina (Diesel) consumida  es: " + precio_total+"$"); 

    }
}