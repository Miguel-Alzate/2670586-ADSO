import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {
        Random random = new Random();

        int contador = 1;

        while(contador == 1){
            int dia = random.nextInt(31) + 1;
            int mes = random.nextInt(12) + 1; 
            int año = random.nextInt(9999) + 1;
            String fechaGenerada = String.format("%02d%02d%04d", dia, mes, año);
            System.out.println("Fecha generada: " + fechaGenerada);
            contador = 0;
        }
       

   
    }
}