import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num = 0;
    int digito = 0;
    int contador = 1;
    int variable_divisora = 0;
    int variable_resto = 0;

    System.out.print("Ingresa un número de maximo 6 dígitos: ");
    num = entrada.nextInt();


    if(num>99999 && num<999999){

        variable_divisora=100000;
        variable_resto=1000000;
        System.out.println("Los dígitos separados son: ");
        while (num > 0) {
       
        
        
        digito = num % variable_resto / variable_divisora;
        System.out.println("El digito 0"+contador+ " es: "+ digito);
        variable_resto = variable_resto / 10;
        variable_divisora = variable_divisora / 10;
        contador = contador + 1;
        }

    }else if (num>9999 && num<99999){
        variable_divisora=10000;
        variable_resto=100000;
        System.out.println("Los dígitos separados son: ");
        while (num > 0) {
       
        
        
        digito = num % variable_resto / variable_divisora;
        System.out.println("El digito 0"+contador+ " es: "+ digito);
        variable_resto = variable_resto / 10;
        variable_divisora = variable_divisora / 10;
        contador = contador + 1;
    }
    }else if (num>999 && num<9999){
        variable_divisora=1000;
        variable_resto=10000;
        System.out.println("Los dígitos separados son: ");
        while (num > 0) {
       
        
        
        digito = num % variable_resto / variable_divisora;
        System.out.println("El digito 0"+contador+ " es: "+ digito);
        variable_resto = variable_resto / 10;
        variable_divisora = variable_divisora / 10;
        contador = contador + 1;
    }
    }else if (num>99 && num<999){
        variable_divisora=100;
        variable_resto=1000;
        System.out.println("Los dígitos separados son: ");
        while (num > 0) {
       
        
        
        digito = num % variable_resto / variable_divisora;
        System.out.println("El digito 0"+contador+ " es: "+ digito);
        variable_resto = variable_resto / 10;
        variable_divisora = variable_divisora / 10;
        contador = contador + 1;
    }
    }else if (num>9 && num<99){
        variable_divisora=10;
        variable_resto=100;
        System.out.println("Los dígitos separados son: ");
        while (num > 0) {
       
        
        
        digito = num % variable_resto / variable_divisora;
        System.out.println("El digito 0"+contador+ " es: "+ digito);
        variable_resto = variable_resto / 10;
        variable_divisora = variable_divisora / 10;
        contador = contador + 1;
    }
    }else if (num>=1 && num<=9){
        System.out.println("Los dígitos separados son: ");
        System.out.println("El digito 0"+contador+ " es: "+num);
    }

    
    
    


    







    }
}