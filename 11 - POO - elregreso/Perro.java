public class Perro{

    //Atributos:
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;


    //Constructor:
    public Perro(String dato1, String dato2, int dato3, String dato4, double dato5, int dato6){
        //Asignación de datos
        nombre = dato1;
        propietario = dato2;
        edad = dato3;
        raza = dato4;
        peso = dato5;
        energia = dato6;
    }
  
    //Metodos getters
    public String getNombre(){
        return nombre;
    }

    public String getPropietario(){
        return propietario;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso(){
        return peso;
    }

    public int getEnergia(){
        return energia;
    }
   

    //Metodos setters
    public void setNombre(String dato){
        nombre = dato;
    }

    public void setPropietario(String dato){
        propietario = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setRaza(String dato){
        raza = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    }

    public void setEnergia(int dato){
        energia = dato;
    }


    //Metodos/funciones
    public void imprimirDetalle(){
        System.out.println("|----------------------------|");
        System.out.println("|Nombre: "+nombre);
        System.out.println("|Propietario: "+propietario);
        System.out.println("|Edad: "+edad+" meses ("+((double ) edad/12 )+" años)");
        System.out.println("|Raza: "+raza);
        System.out.println("|Peso: "+peso+" Kg");
        System.out.println("|Energia: "+energia+"%");
        System.out.println("|----------------------------|");
    }

    public void comer(int gramos){
        peso = peso + ((double) gramos/1000);
        energia = energia + (gramos/100);
    }

}