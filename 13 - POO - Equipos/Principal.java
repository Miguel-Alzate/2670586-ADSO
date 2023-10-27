import java.util.Scanner;
public class Principal{
    public static void main (String [] args){

        Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

        Jugador jugador01 = new Jugador (108801, "Benzema", 27, "Delantero");
        Jugador jugador02 = new Jugador (108802, "Ronaldo", 40, "Mediocampista");
        Jugador jugador03 = new Jugador (108803, "Messi", 15, "Defensa");
        Jugador jugador04 = new Jugador (108804, "Ronaldinho", 56, "Defensa");
        Jugador jugador05 = new Jugador (108805, "Falcao", 45, "Portero");
        Jugador jugador06 = new Jugador (108806, "Cuadrado", 32, "Volante derecho");
        Jugador jugador07 = new Jugador (108807, "James", 23, "Volante izquierdo");
        Jugador jugador08 = new Jugador (108808, "Quintero", 29, "Portero");
        Jugador jugador09 = new Jugador (108809, "Navas", 20, "Defensa");
        Jugador jugador10 = new Jugador (108810, "Mondragon", 35, "Delantero");

        Equipos equipo01 = new Equipos ("Manchester", 1956);
        Equipos equipo02 = new Equipos ("Dormunt", 1912);

        equipo01.AgregarJugador(jugador01);
        equipo01.AgregarJugador(jugador02);
        equipo01.AgregarJugador(jugador03);
        equipo01.AgregarJugador(jugador04);
        equipo01.AgregarJugador(jugador05);
        equipo01.AgregarJugador(jugador06);

        equipo02.AgregarJugador(jugador07);
        equipo02.AgregarJugador(jugador08);
        equipo02.AgregarJugador(jugador09);
        equipo02.AgregarJugador(jugador10);
        equipo02.AgregarJugador(jugador01);

        equipo01.Lista_de_Jugadores();
        equipo01.Lista_de_Jugadores_detallada();
        equipo01.EliminarJugador();
        equipo01.Lista_de_Jugadores();


       

       

    }
}