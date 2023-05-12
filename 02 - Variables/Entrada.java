import java.util.Scanner;

public class Entrada{
    public static void main(String[] args){
        // Variable para leer el teclado
        Scanner teclado = new Scanner(System.in);
       
        byte turno;
        short loteria_risaralda;
        int saldo_bancario;
        long tarjeta_identidad;
        float nota;
        double pi;
        boolean bandera;

        System.out.println("Ingrese turno:");
        turno = teclado.nextByte();

        System.out.println("Loteria Risaralda: ");
        loteria_risaralda = teclado.nextShort();

        System.out.println("Saldo Bancario: ");
        saldo_bancario = teclado.nextInt();

        System.out.println("Tarjeta de Identidad: ");
        tarjeta_identidad = teclado.nextLong();

        System.out.println("Nota: ");
        nota = teclado.nextFloat();

        System.out.println("Pi: ");
        pi = teclado.nextDouble();

        System.out.println("Banderita: ");
        bandera = teclado.nextBoolean();

        System.out.println("                                  ");
        System.out.println("---------------------------------");
        System.out.println("                                  ");

        System.out.println("Turno: "+turno);
        System.out.println("Loteria Risaralda: "+loteria_risaralda);
        System.out.println("Saldo Bancario: "+saldo_bancario);
        System.out.println("Tarjeta de Identidad: "+tarjeta_identidad);
        System.out.println("Nota: "+nota);
        System.out.println("Pi: "+pi);
        System.out.println("Banderita: "+bandera);
    }
}