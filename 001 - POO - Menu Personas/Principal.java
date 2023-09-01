import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );

		Persona listaPersonas [] = new Persona [99];
		int indicePersonas = 0;
		

		listaPersonas[0] = new Persona( 108800, "Oscar", "Loaiza", 85, 185, 320 );
		listaPersonas[1] = new Persona( 108801, "Pepito", "Embustero", 45, 144, 120 );
		listaPersonas[2] = new Persona( 108802, "Mandrola", "Fernandez", 67, 156, 450 );
		listaPersonas[3] = new Persona( 108803, "Cuchuco", "Fifirinola", 77, 175, 60 );
		listaPersonas[4] = new Persona( 108804, "Sanco", "cho", 23, 130, 80 );
		indicePersonas = 5;
 
		int opcion = 0;
		while( opcion!=11 ){

			
			System.out.println("+-------------------------------------+");
			System.out.println("+           MENU DE PERSONAS          +");
			System.out.println("+-------------------------------------+");
			System.out.println("|                        Memoria: "+(99-indicePersonas)+"  |");
			System.out.println("|   1: Registrar Persona.             |");
			System.out.println("|   2: Ver lista de Personas.         |");
			System.out.println("|   3: Editar Persona.                |");
			System.out.println("|   4: Eliminar Persona.              |");
			System.out.println("|   5: Persona con Mayor edad.        |"); 	
			System.out.println("|   6: Persona con Menor edad.        |");	
			System.out.println("|   7: Persona mas alta.              |");	
			System.out.println("|   8: Persona mas baja.              |");	
			System.out.println("|   9: Promedio de edades.            |");	
			System.out.println("|   10: Promedio de altura.           |");	
			System.out.println("|   11: Salir.                        |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 11): ");
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
				System.out.println("+---------------------------------------+");
				System.out.println("|--      PERSONA CON MAYOR EDAD       --|");
				System.out.println("+---------------------------------------+");

				int indiceEncontrado = -1;
				int mayor = listaPersonas[0].getEdad();

				for (int i=0; i < listaPersonas.length; i++){
					if(listaPersonas[i] != null){
						if (listaPersonas[i].getEdad() > mayor){
							mayor = listaPersonas[i].getEdad();
							indiceEncontrado = i;
						}else{
							mayor = listaPersonas[0].getEdad();
							indiceEncontrado = 0;
						}
					}
				}
				System.out.println("La persona con mayor edad es: "+listaPersonas[indiceEncontrado].getNombres()+" Con "+listaPersonas[indiceEncontrado].getEdad()+" años.");

			}

			if(opcion==6){

				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--      PERSONA CON MENOR EDAD       --|");
				System.out.println("+---------------------------------------+");

				int indiceEncontrado = -1;
				int menor = 1000;

				for (int i=0; i < listaPersonas.length; i++){
					if(listaPersonas[i] != null){
						if (listaPersonas[i].getEdad() < menor){
							menor = listaPersonas[i].getEdad();
							indiceEncontrado = i;
						}
					}
				}
				System.out.println("La persona con menor edad es: "+listaPersonas[indiceEncontrado].getNombres()+" Con "+listaPersonas[indiceEncontrado].getEdad()+" años.");

			}

			if(opcion==7){

				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--         PERSONA MAS ALTA          --|");
				System.out.println("+---------------------------------------+");

				int indiceEncontrado = -1;
				int mayor = listaPersonas[0].getAltura();

				for (int i=0; i < listaPersonas.length; i++){
					if(listaPersonas[i] != null){
						if (listaPersonas[i].getAltura() > mayor){
							mayor = listaPersonas[i].getAltura();
							indiceEncontrado = i;
						}else{
							mayor = listaPersonas[0].getAltura();
							indiceEncontrado = 0;
						}
					}
				}
				System.out.println("La persona mas alta es: "+listaPersonas[indiceEncontrado].getNombres()+" Con "+listaPersonas[indiceEncontrado].getAltura()+" cms.");

			}

			if(opcion==8){

				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--        PERSONA MAS BAJA           --|");
				System.out.println("+---------------------------------------+");

				int indiceEncontrado = -1;
				int menor = 100000;

				for (int i=0; i < listaPersonas.length; i++){
					if(listaPersonas[i] != null){
						if (listaPersonas[i].getAltura() < menor){
							menor = listaPersonas[i].getAltura();
							indiceEncontrado = i;
						}
					}
				}
				System.out.println("La persona mas baja es: "+listaPersonas[indiceEncontrado].getNombres()+" Con "+listaPersonas[indiceEncontrado].getAltura()+" cms.");

			}

			if(opcion==9){

				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--        PROMEDIO DE EDADES         --|");
				System.out.println("+---------------------------------------+");

				int cantidad_personas_actuales = 0;
				int suma = 0;
				float promedio = 0;

				for (int i=0; i < listaPersonas.length; i++){
					if(listaPersonas[i] != null){
						cantidad_personas_actuales += 1;
						suma = suma + listaPersonas[i].getEdad();
					}
				}
				promedio = (suma / cantidad_personas_actuales);
				System.out.println("El promedio de las edades es de: "+promedio);

			}

			if(opcion==10){

				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--        PROMEDIO DE ALTURA         --|");
				System.out.println("+---------------------------------------+");

				int cantidad_personas_actuales = 0;
				int suma = 0;
				float promedio = 0;

				for (int i=0; i < listaPersonas.length; i++){
					if(listaPersonas[i] != null){
						cantidad_personas_actuales += 1;
						suma = suma + listaPersonas[i].getAltura();
					}
					
				}
				promedio = (suma / cantidad_personas_actuales);
				System.out.println("El promedio de las alturas es de: "+promedio);

			}

			if(opcion==11){
				System.out.println();
				System.out.println("+-------------------------+");
				System.out.println("|-------- SALIENDO -------|");
				System.out.println("+-------------------------+");
			}
		}

	}
}