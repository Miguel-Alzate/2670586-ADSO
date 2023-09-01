import java.util.Date;
public class CajeroElectronico{

	// Atributos
	int capacidadTotal;
	int dineroTotal;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombre_banco;
    String lista_transacciones [];
    String usuario_admin;
    String clave_admin;


	// Metodos
	//    - Constructor
	public CajeroElectronico(int capacidadTotal, int dineroTotal, int cant_10, int cant_20, int cant_50, int cant_100, String nombre_banco, String usuario_admin, String clave_admin){
		this.capacidadTotal = capacidadTotal;
        this.dineroTotal = dineroTotal;
        this.cant_10 = cant_10 ;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombre_banco = nombre_banco;
        this.usuario_admin = usuario_admin;
        this.clave_admin = clave_admin;
		lista_transacciones = new String [100];
	}

	public CajeroElectronico (int capacidadTotal, String nombre_banco, String usuario_admin, String clave_admin){
		this.capacidadTotal = capacidadTotal;
		this.nombre_banco = nombre_banco;
        this.usuario_admin = usuario_admin;
        this.clave_admin = clave_admin;

		this.dineroTotal = 0;
		this.cant_10 = 0;
		this.cant_20 = 0;
		this.cant_50 = 0;
		this.cant_100 = 0;

		lista_transacciones = new String [100];
	}

	public void imprimirDetalle(){
		System.out.println("+----------------------------------+");
		System.out.println("Cantidad total: "+capacidadTotal);
		System.out.println("Dinero total: "+dineroTotal);
		System.out.println("Cantidad de 10: "+cant_10);
		System.out.println("Cantidad de 20: "+cant_20);
		System.out.println("Cantidad de 50: "+cant_50);
		System.out.println("Cantidad de 100: "+cant_100);
		System.out.println("Nombre banco: "+nombre_banco);
		System.out.println("Usuario admin: "+usuario_admin);
		System.out.println("Clave admin: "+clave_admin);
		System.out.println("Historial de transacciones: ");
		
		for (int i=0; i<lista_transacciones.length; i++){
			if (lista_transacciones[i] != null){
				System.out.println("      => "+lista_transacciones[i]);
			}
		}
		System.out.println("+----------------------------------+");
	}

	public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
		//calcular total ingresado
		int total = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);


		//validar que no exceda el limite
		if (total <= capacidadTotal){
			dineroTotal = total;
			this.cant_10 = cant_10;
			this.cant_20 = cant_20;
			this.cant_50 = cant_50;
			this.cant_100 = cant_100;

			
			registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
			return true;
		}else{
			registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "ERROR");
			return false;
		}
		
		
	}

	public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
		//Objeto date para fecha
		Date fecha = new Date();
		String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;


		//Buscar nulo para llenar el arreglo
		int indice = -1;
		for (int i=0; i<lista_transacciones.length; i++){
			if(lista_transacciones [i]==null){
				indice = i;
				break;
			}
		}
		//Llenar arreglo con indice en el que encontro nulo
		if (indice != -1){
			lista_transacciones[ indice ] = texto;
		}else{
			for(int i=0; i<lista_transacciones.length-1; i++){
				lista_transacciones[i] = lista_transacciones[i+1];
			}
			lista_transacciones[lista_transacciones.length-1] = texto;
		}
	}




	
}
