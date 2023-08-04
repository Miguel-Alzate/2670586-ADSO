import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Scanner nueva = new Scanner(System.in);


        int bandera_final = 1;
        int posicion = 0;
        int bandera1 = 0;
        int bandera= 0;
        int xd = 1;
        int contador = 1;
        int contador3 = 0;
        int contador2 = 1;
        boolean fin;
        fin = true;
        int tamaño = 100;
        int registros2= 100;
        String nombre; 
        String nombre1;
        String nombre2;
        String nombre_completo;
        int op1 = 0;
        int op2 = 0;

        String arreglo [] = new String [tamaño];

        do{
            System.out.println("                                  Memoria disponible: "+registros2+ " Registros");
            System.out.println("----------- MENÚ -----------");
            System.out.println("1: Registrar cliente.");
            System.out.println("2: Ver lista de clientes.");
            System.out.println("3: Editar cliente.");
            System.out.println("4: Eliminar cliente.");
            System.out.println("5: Salir");
            System.out.print("Ingrese una opción: ");
            op1 = teclado.nextInt();

            if(op1 == 1){
     
                System.out.println("Ingresa el nombre completo para el registro:");
                nombre_completo = nueva.nextLine();
                
               
                for(int i = 0; i < arreglo.length; i++){
                    if ( nombre_completo.equalsIgnoreCase( arreglo[i] ) ){
                       bandera = 1;
                       posicion = i;
                    }
                }
                if(bandera == 1){
                    System.out.println("El nombre que ingresaste se encuentra repetido");
                    fin = false;
                    
                }else{
                    arreglo[contador3] = nombre_completo;
                    contador3 = contador3 + 1;
                    registros2 = registros2 - xd;
                    contador2 = contador2 + 1;
                    fin = true;
                }
                
        
            }
            if(op1 == 2){
                contador2 = contador2 - 1;
                bandera_final = 1;
         
                System.out.println("Esta es la lista de todos los clientes que tenemos: ");
                for(int i = 0; i < contador2; i++){
                    System.out.println("Cliente #"+bandera_final+" : "+arreglo[i]);  
                    contador++;  
                    bandera_final = bandera_final + 1 ;
                }
                contador2 = contador2 + 1;
                
                
            }
            if(op1 == 3){
                System.out.println("Ingresa un nombre para buscarlo");
                nombre = nueva.nextLine();

                for(int i = 0; i < arreglo.length; i++){
                    if ( nombre.equalsIgnoreCase( arreglo[i] ) ){
                        System.out.println("El nombre "+nombre+" se encuentra en registrado, que nuevo nombre le quiere poner?");
                        nombre1 = nueva.nextLine();
                        arreglo[i] = nombre1;
                    }else{
                        bandera1 = 1;
                    }
                }
                if(bandera1 == 1){
                    System.out.println("El nombre "+nombre+" no se encuentra en registrado.");  
                    fin = true;
                }
            
            }
            if(op1 == 4){
                System.out.println("Ingresa un nombre para eliminarlo");
                nombre = nueva.nextLine();

                for(int i = 0; i < arreglo.length; i++){
                    if ( nombre.equalsIgnoreCase( arreglo[i] ) ){
                        System.out.println("El nombre "+nombre+" se encuentra registrado, lo quiere eliminar?");
                        System.out.println("1 (Si)      2 (No)");
                        op2 = teclado.nextInt();
                        if (op2 == 1){
                            System.out.println("Se eliminó exitosamente.");
                            arreglo[i] = null;
                            contador3 = contador3 - 1;

                            fin = true;
                        }else if (op2 == 2){
                            System.out.println("Te arrepentiste, estás ahora en el menú inicial.");
                            fin = true;
                        }else{
                            bandera1 = 1;
                        }   
                    }
                }
                    if(bandera1 == 1){
                        System.out.println("El nombre "+nombre+" no se encuentra registrado.");  
                        fin = true;
                    }
                    
                
            }

            if(op1 == 5){
                System.out.println("Adios vaquero...");
                fin = false;
            }

        }while(fin == true);

        

    }
}