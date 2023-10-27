import java.util.Scanner;
public class Equipos{

    Scanner entrada_numero = new Scanner(System.in);
	Scanner entrada_texto = new Scanner(System.in);

    //Atributos
    private String nombre;
    private int ano_fundacion;
    private int cantidad_ganados;
    private int cantidad_empatados;
    private int cantidad_perdidos;
    Jugador lista_jugadores [];


    //Constructor
    public Equipos (String dato1, int dato2){
        nombre = dato1;
        ano_fundacion = dato2;
        cantidad_ganados = 0;
        cantidad_empatados = 0;
        cantidad_perdidos = 0;
        lista_jugadores = new Jugador [11];

    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getFundacion(){
        return ano_fundacion;
    }

    public int getGanados(){
        return cantidad_ganados;
    }

    public int getEmpatados(){
        return cantidad_empatados;
    }

    public int getPerdidos(){
        return cantidad_perdidos;
    }


    //Setters
    public void setNombre(String dato){
        nombre = dato;
    }

    public void setFundacion(int dato){
        ano_fundacion = dato;
    }

    public void setGanados(int dato){
        cantidad_ganados = dato;
    }

    public void setEmpatados(int dato){
        cantidad_empatados = dato;
    }

    public void setPerdidos(int dato){
        cantidad_perdidos = dato;
    }

    //Agregar jugadores al equipo
    public void AgregarJugador(Jugador jugador_prueba){
        for (int i = 0; i < lista_jugadores.length; i++) {
            if (lista_jugadores[i] == null) {
                lista_jugadores[i] = jugador_prueba;
                break;
            }
        }
    }

    //Eliminar jugadores del equipo
    public void EliminarJugador(){
		System.out.print("Ingrese nombre del jugador a eliminar: ");
		String nombre = entrada_texto.nextLine();

		int indiceEncontrado = -1;
		for (int i=0; i<lista_jugadores.length; i++){
			if(lista_jugadores[i] != null && lista_jugadores[i].getNombre() == nombre){
				indiceEncontrado = i;
			}
		}

		if(indiceEncontrado != -1){

		    for(int i=indiceEncontrado; i<lista_jugadores.length-1; i++){
			    lista_jugadores[i] = lista_jugadores[i+1];
			}
			lista_jugadores[ lista_jugadores.length-1 ] = null;
            

            System.out.println("+-------------------------------------+");
            System.out.println("+   JUGADOR ELIMINADO CON EXTIO       +");
            System.out.println("+-------------------------------------+");

		}else{
		    System.out.println("+-------------------------------------+");
			System.out.println("+ El jugador "+nombre+" no corresponde+");
			System.out.println("+ a un jugador del equipo.            +");
			System.out.println("+-------------------------------------+");
		}
    }

    //Listar nombre de los jugadores
    public void Lista_de_Jugadores(){
        for(int i = 0; i < lista_jugadores.length; i++){
            if (lista_jugadores[i] !=null){
                System.out.println("=> "+lista_jugadores[i].getNombre());
            }
        }
    }

    //Listar jugadores con info detallada
    public void Lista_de_Jugadores_detallada(){
        for(int i = 0; i < lista_jugadores.length; i++){
            if (lista_jugadores[i] !=null){
                lista_jugadores[i].infoDetallada();
            }
        }
    }



    public void imprimirDetalleEquipo(){
        System.out.println("|-----------------------------------|");
        System.out.println("|Nombre: "+nombre);
        System.out.println("|Año de fundacion: "+ano_fundacion);
        System.out.println("|Cantidad de partidos ganados: "+cantidad_ganados);
        System.out.println("|Cantidad de partidos empatados: "+cantidad_empatados);
        System.out.println("|Cantidad de partidos perdidos: "+cantidad_perdidos);
        System.out.println("|-----------------------------------|");
    }



}