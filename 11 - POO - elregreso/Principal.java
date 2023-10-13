public class Principal{
    public static void main(String[] args){

        Perro perro_01 = new Perro("Pecas", "María", 108, "Boxer", 30.5, 40);
        perro_01.comer(800);
        perro_01.imprimirDetalle();

        perro_01.caminar(4000);
        perro_01.imprimirDetalle();

        perro_01.dormir(12);
        perro_01.imprimirDetalle();

    }
}











//  Clases: Definen nuevos tipos de datos, 
//          una clase es una plantilla que
//          se usará para crear objetos/variables.
    
//  Atributos: Datos propios de la clase definida.
//             Características propias de la clase.
//             Los atributos son variables globales.

//  Metodos: Acciones que puede realizar un objeto
//           perteneciente a la clase.
//           Se representan como funciones.







