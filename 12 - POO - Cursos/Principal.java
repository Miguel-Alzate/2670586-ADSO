import java.util.Scanner;
public class Principal{
    public static void main (String[] args){
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Curso curso_01 = new Curso("108800","JAVA","POO y bases",48);
        curso_01.imprimirDetalleCurso();
    }
}