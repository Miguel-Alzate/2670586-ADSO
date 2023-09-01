import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

        CajeroElectronico cajero01 = new CajeroElectronico (300000000, 10000000, 100, 300, 50, 5, "Banco Avilla", "usuario123", "123456789");
        cajero01.imprimirDetalle();
        CajeroElectronico cajero02 = new CajeroElectronico (150000000, "Davivienda", "adso12345", "12345");
        cajero02.imprimirDetalle();


        cajero02.abastecerCajero(1000, 1000, 500, 500);
        cajero02.abastecerCajero(10000, 1000, 5000, 500);
        cajero02.imprimirDetalle();




    }
}