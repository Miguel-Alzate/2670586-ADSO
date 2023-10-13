public class Curso{

    //Atributos
    String codigo;
    String nombre;
    String area_conocimiento;
    int duracion_curso;
    String lista_temas [];

    //Constructor
    public Curso (String dato1, String dato2, String dato3, int dato4){
        codigo = dato1;
        nombre = dato2;
        area_conocimiento = dato3;
        duracion_curso = dato4;
        lista_temas = new String [100];
    }

    //Getters
    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getArea(){
        return area_conocimiento;
    }

    public int getDuracion(){
        return duracion_curso;
    }

    //Setters
    public void setCodigo(String dato){
        codigo = dato;
    }

    public void setNombre(String dato){
        nombre = dato;
    }

    public void setArea(String dato){
        area_conocimiento = dato;
    }

    public void setDuracion(int dato){
        duracion_curso = dato;
    }


    //Metodos
    public void imprimirDetalleCurso(){
        System.out.println("|----------------------------------------------------|");
        System.out.println("|Codigo: "+codigo);
        System.out.println("|Nombre: "+nombre);
        System.out.println("|Area: "+area_conocimiento);
        System.out.println("|Duración: "+duracion_curso+" hrs");
        System.out.println("|Lista de temas: ");

        for(int i = 0; i < lista_temas.length; i++){
            if (lista_temas[i] !=null){
                System.out.println("|        => "+lista_temas[i]);
            }
        }

        System.out.println("|----------------------------------------------------|");
    }

}