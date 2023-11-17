public class Materia {
    private String nombre;
    private double creditos;
    private double nota;
  

    public Materia(String nombre, double creditos, double nota){
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota; 
    }

    public String getNombre() {
        return nombre;
    }

    public double getCreditos() {
        return creditos;
    }

    public double getNota(){
        return nota;
    }
    

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCreditos(double creditos){
        this.creditos = creditos;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
}
