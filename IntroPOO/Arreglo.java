import java.util.Scanner;
public class Arreglo{
    public static void main (String[] args){

        Scanner nueva = new Scanner(System.in);


        Persona arreglo [] = {new Persona(108800, "Miguel Angel", "Alzate Lozano", 17, 170, 70.5)};

        

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Arreglo: "+arreglo[i]);
        }

    }
}