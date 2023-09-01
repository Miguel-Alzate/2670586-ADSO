import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

		Persona listaPersonas [] = new Persona [99];
		int indicePersonas = 0;
		

		
		indicePersonas = 0;
 
		int opcion = 0;
		while( opcion!=5 ){

			
			System.out.println("+-------------------------------------+");
			System.out.println("+           MENU DE PERSONAS          +");
			System.out.println("+-------------------------------------+");
			System.out.println("|                        Memoria: "+(99-indicePersonas)+"  |");
			System.out.println("|   1: Registrar Persona.             |");
			System.out.println("|   2: Ver lista de Personas.         |");
			System.out.println("|   3: Editar Persona.                |");
			System.out.println("|   4: Eliminar Persona.              |");
			System.out.println("|   5: Salir.                         |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 5): ");
			opcion = entrada_numero.nextInt();

			if (opcion == 1) {
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+           REGISTRAR PERSONAS        +");
				System.out.println("+-------------------------------------+");
				System.out.print("=> Ingrese la cedula: ");
				int cedula = entrada_numero.nextInt();

				boolean bandera = false;

				for (int i = 0; i < listaPersonas.length; i++) {
					if (listaPersonas[i] != null && listaPersonas[i].getCedula() == cedula) {
						System.out.println("Esta cedula ya está en el sistema.");
						bandera = true;
						break;
					}
				}

				if (!bandera) {
					System.out.print("=> Ingrese nombres: ");
					String nombres = entrada_texto.nextLine();

					System.out.print("=> Ingrese apellidos: ");
					String apellidos = entrada_texto.nextLine();

					System.out.print("=> Ingrese la edad: ");
					int edad = entrada_numero.nextInt();

					System.out.print("=> Ingrese la altura: ");
					int altura = entrada_numero.nextInt();

					System.out.print("=> Ingrese la peso: ");
					double peso = entrada_numero.nextDouble();

					Persona temporal = new Persona(cedula, nombres, apellidos, edad, altura, peso);
					listaPersonas[indicePersonas] = temporal;
					indicePersonas += 1;
				}
			}

			if(opcion==2){

				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+          LISTA DE PERSONAS          +");
				System.out.println("+-------------------------------------+");
				
				for (int i=0; i<listaPersonas.length; i++){
					if ( listaPersonas[i] != null){
						System.out.println( (i+1)+ "  => "+listaPersonas[i].getInfo() );
					}
				}

			}

			if(opcion==3){
				
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+          EDITAR PERSONA             +");
				System.out.println("+-------------------------------------+");
				System.out.print(" => Ingrese cedula: ");
				int cedula = entrada_numero.nextInt();

				int indiceEncontrado = -1;
				for (int i=0; i<listaPersonas.length; i++){
					if(listaPersonas[i] != null && listaPersonas[i].getCedula() == cedula){
						indiceEncontrado = i;
					}
				}
				if (indiceEncontrado != -1){
					System.out.print("=> Ingrese nombres: ");
					String nombres = entrada_texto.nextLine();

					System.out.print("=> Ingrese apellidos: ");
					String apellidos = entrada_texto.nextLine();

					System.out.print("=> Ingrese la edad: ");
					int edad = entrada_numero.nextInt();

					System.out.print("=> Ingrese la altura: ");
					int altura = entrada_numero.nextInt();

					System.out.print("=> Ingrese la peso: ");
					double peso = entrada_numero.nextDouble();

					Persona temporal = new Persona (cedula, nombres, apellidos, edad, altura, peso);
					listaPersonas[ indiceEncontrado ] = temporal;

				}else{
					System.out.println("\n\n");
					System.out.println("+-------------------------------------+");
					System.out.println("+ La cedula "+cedula+" no corresponde +");
					System.out.println("+ a un usuario del sistema.           +");
					System.out.println("+-------------------------------------+");
				}

			}

			if(opcion==4){
				
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+          ELIMINAR PERSONA           +");
				System.out.println("+-------------------------------------+");
				System.out.print(" => Ingrese cedula: ");
				int cedula = entrada_numero.nextInt();

				int indiceEncontrado = -1;
				for (int i=0; i<listaPersonas.length; i++){
					if(listaPersonas[i] != null && listaPersonas[i].getCedula() == cedula){
						indiceEncontrado = i;
					}
				}

				if(indiceEncontrado != -1){

					for(int i=indiceEncontrado; i<listaPersonas.length-1; i++){
						listaPersonas[i] = listaPersonas[i+1];
					}
					listaPersonas[ listaPersonas.length-1 ] = null;
					indicePersonas -= 1;

					System.out.println("+-------------------------------------+");
					System.out.println("+   PERSONA ELIMINADA CON EXTIO       +");
					System.out.println("+-------------------------------------+");

				}else{
					System.out.println("\n\n");
					System.out.println("+-------------------------------------+");
					System.out.println("+ La cedula "+cedula+" no corresponde +");
					System.out.println("+ a un usuario del sistema.           +");
					System.out.println("+-------------------------------------+");
				}

			}

			if(opcion==5){
				System.out.println();
				System.out.println("+-------------------------+");
				System.out.println("|-------- SALIENDO -------|");
				System.out.println("+-------------------------+");

			}

			
		}

	}
}