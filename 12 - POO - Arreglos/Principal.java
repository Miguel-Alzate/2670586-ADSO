import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        //Arreglo de Objetos Perro
        Perro [] listado_perros = new Perro [20];

        listado_perros[0] = new Perro("Pecas", "Daniela", 108, "Boxer", 30, 100);
        listado_perros[1] = new Perro("Maxwell", "Anderson", 120, "Pequines", 21, 70);


        //Impresión del Arreglo de Objetos
        for(int i=0; i < listado_perros.length; i++){
            if(listado_perros[i] != null){
                listado_perros[i].imprimirDetalle();
            }
        }

        Perro nombre_mas_pesado = listado_perros[0];

        for(int i=0; i < listado_perros.length; i++){
            if (listado_perros[i] !=null){
                if ( listado_perros[i].getPeso()  >= nombre_mas_pesado.getPeso() ){
                    nombre_mas_pesado = listado_perros [i];
                }
            }
        }

        if (nombre_mas_pesado != null){
            System.out.println("Nombre mas pesado: "+ nombre_mas_pesado.getNombre());
        }else{
           // System.out.println("Perro no encontrado");
        }
        



    }
}