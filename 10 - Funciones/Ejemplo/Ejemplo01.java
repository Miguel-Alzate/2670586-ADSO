public class Ejemplo01{


    public static void main(String[] args){
        /*
        saludarEnBucle(3);
        System.out.println("+----- PROBANDO FUNCIONES -------+");
        System.out.println("| Suma: "+sumar(5,3));
        System.out.println("| Suma: "+sumar(3,2));
        System.out.println("| Suma: "+sumar(-3,20));
        System.out.println("| Suma: "+sumar(100,-50));

        System.out.println("----- PROBANDO FUNCIONES ------");
        System.out.println("| Dividir: "+division(5,3));
        System.out.println("| Dividir: "+division(3,2));
        System.out.println("| Dividir: "+division(-3,20));
        System.out.println("| Dividir: "+division(100,-50));

        imprimirTabla(5,10);

        */
       
        int listado [] = new int [10];
        imprimirArreglo(listado);
        listado = llenarArreglo (listado);
        imprimirArreglo(listado);

    }

    public static int sumar (int a, int b){
        int resultado = (a + b);
        return resultado;
    }

    public static float division (float a, float b){
        float resultado = (a / b);
        return resultado;
    }

    public static void saludar(){
        System.out.println("+--------------------------------+");
        System.out.println("+            HOLA MUNDO          +");
        System.out.println("+----------            ----------+"); 
    }

    public static void saludarEnBucle(int cantidad){
        for(int i = 0; i<cantidad; i++){
            System.out.println("+--------------------------------+");
            System.out.println("+         HOLA MUNDO "+i+"           +");
            System.out.println("+----------            ----------+");
        }
    }

    public static void imprimirTabla(int tabla, int multiplo){
        for(int i=0; i<=multiplo; i++){
            int resultado = tabla * i;
            System.out.println(tabla+" x "+i+" = "+resultado);
        }
    }

    public static void imprimirArreglo(int [] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
    }

    public static int[] llenarArreglo( int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            int aleatorio = (int) (Math.random()*100);
            arreglo[i] = aleatorio;
        }
        return arreglo;
    }





}