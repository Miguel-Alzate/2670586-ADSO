import java.util.Scanner;

public class Principal{
    public static void main (String []args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);

        CajeroElectronico cajero_02 = new CajeroElectronico(150000000, "Davivienda","adso54321","54321");
        cajero_02.abastecerCajero(1000, 1000, 500, 500); 
        cajero_02.abastecerCajero(2000, 1000, 1000, 2000); 
        cajero_02.imprimirDetalle();

        TarjetaDebito tarjeta01 = new TarjetaDebito("MIGUEL ALZATE", "0001 0001 0001 0001", "Davivienda", 0, 450000, "2299");
        cajero_02.consignarDineroaTarjeta(tarjeta01, "2299", 0, 0, 0, 10);

        cajero_02.imprimirDetalle();


        


      
        

        

    }
}