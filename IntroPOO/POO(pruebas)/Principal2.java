import java.util.Scanner;
public class Principal2{
    public static void main (String[] args){
        
        Persona2 arreglo [] = new Persona2 [100];

        arreglo[0] = new Persona2 (108800, "Pepe", "Argento", 23, 190, 37.5);
        arreglo[1] = new Persona2 (108801, "Chupamis", "Bolas", 74, 110, 72.5);
        arreglo[2] = new Persona2 (108802, "Pamela", "Johnson", 12, 120, 15.5);
        arreglo[3] = new Persona2 (108803, "Spilverg", "Antonio", 76, 140, 54.5);
        arreglo[4] = new Persona2 (108804, "Miguel", "Alzate", 54, 160, 46.5);

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] != null){
                System.out.println("Persona "+i+" :"+arreglo[i].getNombres());
            }
            
        }

    }
}