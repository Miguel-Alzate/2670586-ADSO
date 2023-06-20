import java.util.Scanner;
public class Ejercicio09{
public static void main (String [] args){
Scanner entrada = new Scanner(System.in);


    int fecha = 0;
    int digito_1 = 0;
    int digito_2 = 0;
    int digito_3 = 0;
    int digito_4 = 0;
    int digito_5 = 0;
    int digito_6 = 0;
    int digito_7 = 0;
    int digito_8 = 0;

    System.out.print("Ingresa los 8 dígitos de tu fecha, ejemplo:  (ddmmaaaa) :");
    fecha = entrada.nextInt();

    digito_1= fecha % 10;
    digito_2= fecha / 10 % 10;
    digito_3= fecha / 100 % 10;
    digito_4= fecha / 1000 % 10;
    digito_5= fecha / 10000 % 10;
    digito_6= fecha / 100000 % 10;
    digito_7= fecha / 1000000 % 10;
    digito_8= fecha / 10000000 % 10;

        if(digito_8 ==0 & digito_7 ==1){
            System.out.print("Primero de ");
        }else if(digito_8 ==0 & digito_7 ==2){
            System.out.print("Dos de ");
        }else if(digito_8 ==0 & digito_7 ==3){
            System.out.print("Tres de ");
        }else if(digito_8 ==0 & digito_7 ==4){
            System.out.print("Cuatro de ");
        }else if(digito_8 ==0 & digito_7 ==5){
            System.out.print("Cinco de ");
        }else if(digito_8 ==0 & digito_7 ==6){
            System.out.print("Seis de ");
        }else if(digito_8 ==0 & digito_7 ==7){
            System.out.print("Siete de ");
        }else if(digito_8 ==0 & digito_7 ==8){
            System.out.print("Ocho de ");
        }else if(digito_8 ==0 & digito_7 ==9){
            System.out.print("Nueve de ");
        }else if(digito_8 ==1 & digito_7 ==0){
            System.out.print("Diez de ");
        }else if(digito_8 ==1 & digito_7 ==1){
            System.out.print("Once de ");
        }else if(digito_8 ==1 & digito_7 ==2){
            System.out.print("Doce de ");
        }else if(digito_8 ==1 & digito_7 ==3){
            System.out.print("Trece de ");
        }else if(digito_8 ==1 & digito_7 ==4){
            System.out.print("Catorse de ");
        }else if(digito_8 ==1 & digito_7 ==5){
            System.out.print("Quince de ");
        }else if(digito_8 ==1 & digito_7 ==6){
            System.out.print("Dieciceis de ");
        }else if(digito_8 ==1 & digito_7 ==7){
            System.out.print("Diecisiete de ");
        }else if(digito_8 ==1 & digito_7 ==8){
            System.out.print("Dieciocho de ");
        }else if(digito_8 ==1 & digito_7 ==9){
            System.out.print("Diecinueve de ");
        }else if(digito_8 ==2 & digito_7 ==0){
            System.out.print("Veinte de ");
        }else if(digito_8 ==2 & digito_7 ==1){
            System.out.print("Ventiuno de ");
        }else if(digito_8 ==2 & digito_7 ==2){
            System.out.print("Veintidos de ");
        }else if(digito_8 ==2 & digito_7 ==3){
            System.out.print("Veintitres de ");
        }else if(digito_8 ==2 & digito_7 ==4){
            System.out.print("Veinticuatro de ");
        }else if(digito_8 ==2 & digito_7 ==5){
            System.out.print("Veinticinco de ");
        }else if(digito_8 ==2 & digito_7 ==6){
            System.out.print("Vientiseis de ");
        }else if(digito_8 ==2 & digito_7 ==7){
            System.out.print("Veintisiete de ");
        }else if(digito_8 ==2 & digito_7 ==8){
            System.out.print("Veintiocho de ");
        }else if(digito_8 ==2 & digito_7 ==9){
            System.out.print("Veintinueve de ");
        }else if(digito_8 ==3 & digito_7 ==0){
            System.out.print("Treinta de ");
        }else if(digito_8 ==3 & digito_7 ==1){
            System.out.print("Treinta y uno de ");
        }else{
            System.out.print("");
        }

        if (digito_6 == 0 & digito_5 == 1){
            System.out.print("Enero del ");
        }else if (digito_6 == 0 & digito_5 == 2){
            System.out.print("Febrero del ");
        }else if (digito_6 == 0 & digito_5 == 3){
            System.out.print("Marzo del ");
        }else if (digito_6 == 0 & digito_5 == 4){
            System.out.print("Abril del ");
        }else if (digito_6 == 0 & digito_5 == 5){
            System.out.print("Mayo del ");
        }else if (digito_6 == 0 & digito_5 == 6){
            System.out.print("Junio del ");
        }else if (digito_6 == 0 & digito_5 == 7){
            System.out.print("Julio del ");
        }else if (digito_6 == 0 & digito_5 == 8){
            System.out.print("Agosto del ");
        }else if (digito_6 == 0 & digito_5 == 9){
            System.out.print("Septiempre del ");
        }else if (digito_6 == 1 & digito_5 == 0){
            System.out.print("Octubre del ");
        }else if (digito_6 == 1 & digito_5 == 1){
            System.out.print("Noviembre del ");
        }else if (digito_6 == 1 & digito_5 == 2){
            System.out.print("Diciembre del ");
        }else{
            System.out.print("");
        }

        if(digito_4 ==1){
            System.out.print("mil ");
        }else if(digito_4 ==2){
            System.out.print("dos mil ");
        }else{
            System.out.print("");
        }

        
        if( digito_4 ==1 & digito_3 ==9){
            System.out.print("novecientos ");
        }else{
            System.out.print("");
        }
        

        if(digito_2 ==9 ){
            System.out.print("noventa y ");
        }else if(digito_2 ==8 ){
            System.out.print("ochenta y ");
        }else if(digito_2 ==7 ){
            System.out.print("setenta y ");
        }else if(digito_2 ==6 ){
            System.out.print("secenta y ");
        }else if(digito_2 ==5 ){
            System.out.print("cincuenta y ");
        }else if(digito_2 ==4 ){
            System.out.print("cuarenta y ");
        }else if(digito_2 ==3 ){
            System.out.print("treinta y ");
        }else if(digito_2 ==2 ){
            System.out.print("veinti y ");
        }else if(digito_2 ==1 ){
            System.out.print("diez");
        }else if(digito_2 ==1 & digito_1 ==1){
            System.out.print("once ");
        }else if(digito_2 ==1 & digito_1 ==2){
            System.out.print("doce ");
        }else if(digito_2 ==1 & digito_1 ==3){
            System.out.print("trese ");
        }else if(digito_2 ==1 & digito_1 ==4){
            System.out.print("catorse ");
        }else if(digito_2 ==1 & digito_1 ==5){
            System.out.print("quince ");
        }else if(digito_2 ==1 & digito_1 ==6){
            System.out.print("dieciceis ");
        }else if(digito_2 ==1 & digito_1 ==7){
            System.out.print("diecisiete y ");
        }else if(digito_2 ==1 & digito_1 ==8){
            System.out.print("dieciocho y ");
        }else if(digito_2 ==1 & digito_1 ==9){
            System.out.print("diecinueve y ");
        }else{
            System.out.print("");
        }


        if(digito_2 ==9 & digito_1==0){
            System.out.print("noventa ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("ochenta ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("setenta ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("secenta ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("cincuenta ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("cuarenta ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("treinta ");
        }else if(digito_2 ==9 & digito_1==0){
            System.out.print("veinte ");
        }else{
            System.out.print("");
        }

        if(digito_1 ==1){
            System.out.print("uno ");
        }else if(digito_1 ==2){
            System.out.print("dos ");
        }else if(digito_1 ==3){
            System.out.print("tres ");
        }else if(digito_1 ==4){
            System.out.print("cuatro ");
        }else if(digito_1 ==5){
            System.out.print("cinco ");
        }else if(digito_1 ==6){
            System.out.print("seis ");
        }else if(digito_1 ==7){
            System.out.print("siete ");
        }else if(digito_1 ==8){
            System.out.print("ocho ");
        }else if(digito_1 ==9){
            System.out.print("nueve ");
        }else{
            System.out.print("");
        }
    

































    }
}