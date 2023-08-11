import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int palindromo = 0;
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        int digito4 = 0;
        int digito5 = 0;
        int digito6 = 0;

        System.out.println("Ingresa el número de maximo 6 dígitos. ");
        palindromo = teclado.nextInt();

        digito1 = palindromo % 10;
        digito2 = (palindromo % 100) / 10;
        digito3 = (palindromo % 1000) / 100; 
        digito4 = (palindromo % 10000) / 1000;
        digito5 = (palindromo % 100000) / 10000;
        digito6 = (palindromo % 1000000) / 100000;

        if(palindromo < 1000000){
            if(palindromo <=9){

                System.out.println("El número "+palindromo+" es palíndromo");

            }else if(palindromo > 9 && palindromo <= 99){

                if(digito1 == digito2){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else{
                    System.out.println("El número "+palindromo+" no es palíndromo");
                }
                
            }else if(palindromo > 99 && palindromo <= 999){

                if(digito1 == digito3){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else{
                    System.out.println("El número "+palindromo+" no es palíndromo");
                }

            }else if(palindromo > 999 && palindromo <= 9999){

                if(digito1 == digito2 && digito1 == digito3 && digito1 == digito4){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else if (digito1 == digito4 && digito2 == digito3){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else{
                    System.out.println("El número "+palindromo+" no es palíndromo");
                }

            }else if(palindromo > 9999 && palindromo <= 99999){

                if(digito1 == digito2 && digito4 == digito5){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else if(digito1 == digito5 && digito2 == digito4){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else{
                    System.out.println("El número "+palindromo+" no es palíndromo");
                }

            }else if(palindromo > 99999 && palindromo <= 999999){

                if(digito1 == digito6 && digito2 == digito5 && digito3 == digito4){
                    System.out.println("El número "+palindromo+" es palíndromo");
                }else{
                    System.out.println("El número "+palindromo+" no es palíndromo");
                }

            }
            

        }else{
            System.out.println("Número no valido.");
        }

        
     
    }
}