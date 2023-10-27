public class Curso{

    //Atributos
    int codigo;
    String nombre;
    String area_conocimiento;
    int duracion_curso;
    String lista_temas [];

    

    //Constructor 
    public Curso (int dato1, String dato2, String dato3, int dato4, String [] dato5){
        codigo = dato1;
        nombre = dato2;
        area_conocimiento = dato3;
        duracion_curso = dato4;
        lista_temas = dato5;


    }

    //Getters
    public int getCodigo(){
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

    public String [] getTemas(){
        return lista_temas;
    }

    //Setters
    public void setCodigo(int dato){
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

    public void editarInformacionCurso(String dato1, String dato2, int dato3){
        nombre = dato1;
        area_conocimiento = dato2;
        duracion_curso = dato3;
    }

    public String listarCursos(){
        String texto = "-- "+codigo+" -- "+nombre+" -- "+duracion_curso+ " hrs --";
        return texto;
    }

    public void agregarTemasCurso(String nuevo_Tema) {
        for (int i = 0; i < lista_temas.length; i++) {
            if (lista_temas[i] == null) {
                lista_temas[i] = nuevo_Tema;
                break;
            }
        }
    }
}