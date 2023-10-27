import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		
		Scanner entrada_numero = new Scanner( System.in );
		Scanner entrada_texto = new Scanner( System.in );
		

		Curso listaCurso [] = new Curso [99];
		int indiceCurso = 0;
		
 
		int opcion = 0;
		while( opcion!=7 ){

			
			System.out.println("+-------------------------------------+");
			System.out.println("+            MENU DE CURSOS           +");
			System.out.println("+-------------------------------------+");
			System.out.println("|                        Memoria: "+(99-indiceCurso)+"  |");
			System.out.println("|   1: Crear Curso.                   |");
			System.out.println("|   2: Ver lista de Cursos.           |");
			System.out.println("|   3: Ver detalle de  Curso.         |");
            System.out.println("|   4: Editar informacion de un Curso.|");
            System.out.println("|   5: Agregar tema a curso.          |");
			System.out.println("|   6: Eliminar Curso.                |");
			System.out.println("|   7: Salir.                         |");
			System.out.println("+-------------------------------------+");
			System.out.print("=> Ingrese una opcion (1 al 7): ");
			opcion = entrada_numero.nextInt();

			if (opcion == 1) {
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+           REGISTRAR CURSO           +");
				System.out.println("+-------------------------------------+");
				System.out.print("=> Ingrese el codigo: ");
				int codigo = entrada_numero.nextInt();

				boolean bandera = false;

				for (int i = 0; i < listaCurso.length; i++) {
					if (listaCurso[i] != null && listaCurso[i].getCodigo() == codigo) {
						System.out.println("Esta codigo ya está en el sistema.");
						bandera = true;
						break;
					}
				}

				if (!bandera) {
					

					System.out.print("=> Ingrese nombre del curso: ");
					String nombre = entrada_texto.nextLine();

					System.out.print("=> Ingrese el area del curso : ");
					String area = entrada_texto.nextLine();

					System.out.print("=> Ingrese la duracion (en horas): ");
					int duracion = entrada_numero.nextInt();

					System.out.print("=> Ingrese la CANTIDAD de temas (maximo 15): ");
					int cantidad = entrada_numero.nextInt();
					
					if (cantidad >15 ){
						System.out.println("La cantidad excede el maximo permitido.");
					}else{
						String lista_de_temas [] = new String [15];
						for(int i = 0; i < cantidad; i++){
							System.out.print("=> Ingrese el tema numero "+(i+1)+": ");
							String temas_temporal = entrada_texto.nextLine();
							lista_de_temas[i] = temas_temporal;
						}

						Curso temporal = new Curso(codigo, nombre, area, duracion, lista_de_temas);
						listaCurso[indiceCurso] = temporal;
						indiceCurso += 1;

						System.out.println("+-------------------------------------+");
						System.out.println("+      CURSO CREADO CON EXTIO         +");
						System.out.println("+-------------------------------------+");

					}
					

                    System.out.println(" ");
					

					
				}
			}

			if(opcion==2){

				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+          LISTA DE CURSOS            +");
				System.out.println("+-------------------------------------+");
                System.out.println("              Codigo - nombre - duracion hrs");

				
				for (int i=0; i<listaCurso.length; i++){
					if ( listaCurso[i] != null){
						System.out.println("Curso "+ (i+1)+ "  => "+listaCurso[i].listarCursos() );
					}
				}

			}
			

			if(opcion==3){
				
				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+        VER DETALLE DE CURSO         +");
				System.out.println("+-------------------------------------+");
				System.out.print(" => Ingrese el codigo del curso: ");
				int codigo = entrada_numero.nextInt();

				int indiceEncontrado = -1;
				for (int i=0; i<listaCurso.length; i++){
					if(listaCurso[i] != null && listaCurso[i].getCodigo() == codigo){
						indiceEncontrado = i;
					}
				}
				if (indiceEncontrado != -1){
					listaCurso[indiceEncontrado].imprimirDetalleCurso();
				}else{
					System.out.println("\n\n");
					System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde +");
					System.out.println("+ a un curso del sistema.             +");
					System.out.println("+-------------------------------------+");
				}

			}

			if(opcion==4){
				
				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--      EDITAR INFO DE UN CURSO      --|");
				System.out.println("+---------------------------------------+");
				System.out.print(" => Ingrese el codigo de curso: ");
				int codigo = entrada_numero.nextInt();

				int indiceEncontrado = -1;
				for (int i=0; i<listaCurso.length; i++){
					if(listaCurso[i] != null && listaCurso[i].getCodigo() == codigo){
						indiceEncontrado = i;
					}
				}
				if (indiceEncontrado != -1){

					System.out.print("=> Ingrese nombre del curso: ");
					String nombres = entrada_texto.nextLine();

					System.out.print("=> Ingrese area de conocimiento: ");
					String area = entrada_texto.nextLine();

					System.out.print("=> Ingrese la duracion del curso (en horas): ");
					int duracion = entrada_numero.nextInt();

					listaCurso[ indiceEncontrado ].editarInformacionCurso(nombres, area, duracion);

				}else{
					System.out.println("\n\n");
					System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde +");
					System.out.println("+ a un curso del sistema.             +");
					System.out.println("+-------------------------------------+");
				}

			}

			if(opcion==5){

				System.out.println();
				System.out.println("+---------------------------------------+");
				System.out.println("|--       AGREGAR TEMA A CURSO        --|");
				System.out.println("+---------------------------------------+");
				System.out.print(" => Ingrese el codigo de curso: ");
				int codigo = entrada_numero.nextInt();

				int indiceEncontrado = -1;
				for (int i=0; i<listaCurso.length; i++){
					if(listaCurso[i] != null && listaCurso[i].getCodigo() == codigo){
						indiceEncontrado = i;
					}
				}
				if (indiceEncontrado != -1){
					
					if(listaCurso[indiceEncontrado].getTemas().length < 16){
						System.out.print("=> Ingrese el nuevo tema al  curso: ");
						String nuevo_Tema = entrada_texto.nextLine();
						listaCurso[indiceEncontrado].agregarTemasCurso(nuevo_Tema);
						System.out.println("=> TEMA AGREGADO CON EXITO ");
					}else{
						System.out.println("No hay capacidad para agregar mas temas");
					}
					

				}else{
					System.out.println("\n\n");
					System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde +");
					System.out.println("+ a un curso del sistema.             +");
					System.out.println("+-------------------------------------+");
				}

				

			}

			if(opcion==6){

				System.out.println("\n\n");
				System.out.println("+-------------------------------------+");
				System.out.println("+          ELIMINAR CURSO             +");
				System.out.println("+-------------------------------------+");
				System.out.print(" => Ingrese codigo: ");
				int codigo = entrada_numero.nextInt();

				int indiceEncontrado = -1;
				for (int i=0; i<listaCurso.length; i++){
					if(listaCurso[i] != null && listaCurso[i].getCodigo() == codigo){
						indiceEncontrado = i;
					}
				}

				if(indiceEncontrado != -1){

					for(int i=indiceEncontrado; i<listaCurso.length-1; i++){
						listaCurso[i] = listaCurso[i+1];
					}
					listaCurso[ listaCurso.length-1 ] = null;
					indiceCurso -= 1;

					System.out.println("+-------------------------------------+");
					System.out.println("+   CURSO ELIMINADO CON EXTIO         +");
					System.out.println("+-------------------------------------+");

				}else{
					System.out.println("\n\n");
					System.out.println("+-------------------------------------+");
					System.out.println("+ El codigo "+codigo+" no corresponde +");
					System.out.println("+ a un curso del sistema.             +");
					System.out.println("+-------------------------------------+");
				}

			}

			if(opcion==7){

				System.out.println();
				System.out.println("+-------------------------+");
				System.out.println("|-------- SALIENDO -------|");
				System.out.println("+-------------------------+");

			}

			
		}

	}
}