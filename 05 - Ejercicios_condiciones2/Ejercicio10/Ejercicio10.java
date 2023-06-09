import java.util.Scanner;
public class Ejercicio10{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    int digito_8 = 0;
    int digito_7 = 0;
    int digito_6 = 0;
    int digito_5 = 0;
    int digito_4 = 0;
    int digito_3 = 0;
    int digito_2 = 0;
    int digito_1 = 0;
    int fecha_nacimiento = 0;

    System.out.print ("Ingresa tu fecha de nacimiento: (ddmmaaaa):  ");
    fecha_nacimiento = entrada.nextInt();

    digito_8= fecha_nacimiento % 10;
    digito_7= fecha_nacimiento / 10 % 10;
    digito_6= fecha_nacimiento / 100 % 10;
    digito_5= fecha_nacimiento / 1000 % 10;
    digito_4= fecha_nacimiento / 10000 % 10;
    digito_3= fecha_nacimiento / 100000 % 10;
    digito_2= fecha_nacimiento / 1000000 % 10;
    digito_1= fecha_nacimiento / 10000000 % 10;

    if(digito_5 == 2 && digito_6 == 0 && digito_7 >= 0 && digito_8 >= 6){
        System.out.println("Señor usuario, NO eres mayor de edad.");
    }else{
        System.out.println("Señor usuario, eres mayor de edad");
    }


    }
}