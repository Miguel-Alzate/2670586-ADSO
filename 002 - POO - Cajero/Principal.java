import java.util.Scanner;

public class Principal{
    public static void main (String []args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);

        CajeroElectronico cajero_01= new CajeroElectronico(500,250,5,10,20,2,"Banco popular","adso123","Admin pro");

        cajero_01.imprimirDetalle();

        CajeroElectronico cajero_02 = new CajeroElectronico(150000000, "Davivienda","adso45321","1234");
        cajero_02.imprimirDetalle();

        cajero_02.abastecerCajero(1000, 1000, 500, 500);
        cajero_02.imprimirDetalle();

        TarjetaDebito tarjeta_01 = new TarjetaDebito("Pepe", "1435 5675 2325 1673", "Banco popular", 1500, 500, "0414", "ACTIVA");
        TarjetaDebito tarjeta_02 = new TarjetaDebito("Carlos", "6741 1245 5742 8423", "Davivienda", 1500, 500, "2311", "ACTIVA");

        tarjeta_01.imprimirDetalle();
        tarjeta_02.imprimirDetalle();

    }
}