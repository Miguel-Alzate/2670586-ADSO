import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int c_parada = 0;
        double contador_kilometros = 0.0;

        System.out.println("|----------RUTA DEL RECORRIDO----------|");
        System.out.println("|                                      |");
        System.out.println("|      1-Apía                          |");
        System.out.println("|      2-Balboa                        |");
        System.out.println("|      3-Belén de Umbrìa               |");
        System.out.println("|      4-Dosquebradas                  |");
        System.out.println("|      5-Guática                       |");
        System.out.println("|      6-La Celia                      |");
        System.out.println("|      7-La Virginia                   |");
        System.out.println("|      8-Marsella                      |");
        System.out.println("|      9-Mistrató                      |");
        System.out.println("|     10-Pereira                       |");
        System.out.println("|     11-Pueblo Rico                   |");
        System.out.println("|     12-Quinchía                      |");
        System.out.println("|     13-Santa Rosa de Cabal           |");
        System.out.println("|     14-Santuario                     |");
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
                    kilometros_recorridos = 39.8;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 39.5;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 68.9;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 58.7;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 24.1;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 34.9;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 88.1;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 55.6;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 65.7;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 26.4;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 77.4;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 77.8;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 15.3;
                }
            }
    
            if (c_origen == 2) {
                if (c_parada == 1) {
                    kilometros_recorridos = 39.8;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 56.9;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 52.9;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 76.1;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 13.7;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 18.9;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 72.1;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 73.0;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 49.7;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 68.8;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 94.8;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 61.9;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 38.3;
                }
            }
    
            if (c_origen == 3) {
                if (c_parada == 1) {
                    kilometros_recorridos = 39.5;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 56.9;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 74.6;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 25.1;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 71.9;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 40.8;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 93.8;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 16.3;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 71.4;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 65.4;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 52.4;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 83.6;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 71.4;
                }
            }
    
            if (c_origen == 4) {
                if (c_parada == 1) {
                    kilometros_recorridos = 67.5;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 51.5;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 73.1;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 92.3;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 66.6;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 32.5;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 34.4;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 89.3;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 2.4;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 92.5;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 93.9;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 12.4;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 66.0;
                }
            }
    
            if (c_origen == 5) {
                if (c_parada == 1) {
                    kilometros_recorridos = 58.7;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 76.1;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 25.1;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 93.8;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 91.1;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 60.0;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 98.5;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 25.1;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 90.6;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 84.8;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 22.9;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 85.5;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 73.4;
                }
            }
    
            if (c_origen == 6) {
                if (c_parada == 1) {
                    kilometros_recorridos = 24.1;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 13.7;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 71.9;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 67.9;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 91.1;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 33.9;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 87.2;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 88.1;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 64.7;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 49.1;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 110.0;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 76.9;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 22.6;
                }
            }
    
            if (c_origen == 7) {
                if (c_parada == 1) {
                    kilometros_recorridos = 35.0;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 19.0;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 40.8;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 34.0;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 60.0;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 34.0;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 53.3;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 56.9;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 30.8;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 60.0;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 78.7;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 43.0;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 33.5;
                }
            }
    
            if (c_origen == 8) {
                if (c_parada == 1) {
                    kilometros_recorridos = 88.0;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 72.0;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 93.6;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 35.8;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 98.4;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 87.0;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 53.0;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 110.0;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 32.9;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 113.0;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 96.6;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 44.7;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 86.5;
                }
            }
    
            if (c_origen == 9) {
                if (c_parada == 1) {
                    kilometros_recorridos = 55.7;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 73.1;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 16.3;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 90.8;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 25.1;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 88.1;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 57.0;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 110.0;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 87.6;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 81.7;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 53.6;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 99.8;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 70.4;
                }
            }
    
            if (c_origen == 10) {
                if (c_parada == 1) {
                    kilometros_recorridos = 65.7;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 49.8;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 71.3;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 2.4;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 90.5;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 64.8;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 30.7;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 33.0;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 87.5;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 90.7;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 95.8;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 14.3;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 64.2;
                }
            }
    
            if (c_origen == 11) {
                if (c_parada == 1) {
                    kilometros_recorridos = 26.2;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 64.6;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 65.5;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 93.7;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 84.5;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 48.9;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 59.7;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 113.0;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 81.5;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 90.5;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 103.0;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 103.0;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 34.3;
                }
            }
    
            if (c_origen == 12) {
                if (c_parada == 1) {
                    kilometros_recorridos = 77.4;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 94.7;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 52.4;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 91.9;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 22.8;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 110.0;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 78.7;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 96.2;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 57.9;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 93.8;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 103.0;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 83.2;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 109.0;
                }
            }
    
            if (c_origen == 13) {
                if (c_parada == 1) {
                    kilometros_recorridos = 76.7;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 60.8;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 82.6;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 10.3;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 85.4;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 75.8;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 41.7;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 43.6;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 98.5;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 12.3;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 102.0;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 83.5;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 5.0;
                } else if (c_parada == 14) {
                    kilometros_recorridos = 75.2;
                }
            }
    
            if (c_origen == 14) {
                if (c_parada == 1) {
                    kilometros_recorridos = 15.3;
                } else if (c_parada == 2) {
                    kilometros_recorridos = 38.3;
                } else if (c_parada == 3) {
                    kilometros_recorridos = 71.4;
                } else if (c_parada == 4) {
                    kilometros_recorridos = 67.4;
                } else if (c_parada == 5) {
                    kilometros_recorridos = 73.5;
                } else if (c_parada == 6) {
                    kilometros_recorridos = 22.6;
                } else if (c_parada == 7) {
                    kilometros_recorridos = 33.4;
                } else if (c_parada == 8) {
                    kilometros_recorridos = 86.6;
                } else if (c_parada == 9) {
                    kilometros_recorridos = 70.5;
                } else if (c_parada == 10) {
                    kilometros_recorridos = 64.2;
                } else if (c_parada == 11) {
                    kilometros_recorridos = 34.5;
                } else if (c_parada == 12) {
                    kilometros_recorridos = 109.0;
                } else if (c_parada == 13) {
                    kilometros_recorridos = 76.4;
                } else if (c_parada == 14) {
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