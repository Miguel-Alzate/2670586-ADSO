public class Jugador{

    //Atributos
    private int cedula;
    private String nombre;
    private int edad;
    private String posicion;

    //Constructor
    public Jugador (int dato1, String dato2, int dato3, String dato4){
        cedula = dato1;
        nombre = dato2;
        edad = dato3;
        posicion = dato4;
    }

    //Getters
    public int getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getPosicion(){
        return posicion;
    }


    //Setters
    public void setCedula(int dato){
        cedula = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setPosicion(String dato){
        posicion = dato;
    }

    public void infoDetallada(){
        System.out.println("+--------------------------+");
        System.out.println("Nombre => "+nombre);
        System.out.println("Cedula => "+cedula);
        System.out.println("Edad => "+edad);
        System.out.println("Posicion => "+posicion);
        System.out.println("+--------------------------+");
    }
}