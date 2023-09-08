import java.util.Date; //libreria de fechas

public class CajeroElectronico{
    //Atributos
    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String listaTransacciones [];  // Los atributos que son arreglos NO se ponen en el constructor
    String usuarioAdmin;
    String claveAdmin;

    //Metodo constructor
    public CajeroElectronico (int capacidadTotal,int dineroDisponible,int cant_10,int cant_20,int cant_50,int cant_100,String nombreBanco,String usuarioAdmin,String claveAdmin){
        this.capacidadTotal = capacidadTotal;  // This. para el contexto, ya que es ambiguo
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        listaTransacciones = new String [100];
    }

    //Metodo constructor 2
    public CajeroElectronico(int capacidadTotal, String nombreBanco, String usuarioAdmin, String claveAdmin){
        this.capacidadTotal = capacidadTotal;
        this.nombreBanco = nombreBanco;
        this.usuarioAdmin = usuarioAdmin;
        this.claveAdmin = claveAdmin;

        this.dineroDisponible = 0;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;

        listaTransacciones = new String [100];
    }

    public void imprimirDetalle(){
        System.out.println("---------------------------------------");
        System.out.println("  Total: "+capacidadTotal);
        System.out.println("  Disponible: "+dineroDisponible);
        System.out.println("  cant_10: "+cant_10);
        System.out.println("  cant_20: "+cant_20);
        System.out.println("  cant_50: "+cant_50);
        System.out.println("  cant_100: "+cant_100);
        System.out.println("  Banco: "+nombreBanco);
        System.out.println("  usuarioAdmin: "+usuarioAdmin);
        System.out.println("  claveAdmin: "+claveAdmin);
        System.out.println("  Historial de transacciones: ");

        for(int i = 0; i < listaTransacciones.length; i++){
            if (listaTransacciones[i] !=null){
                System.out.println("        => "+listaTransacciones[i]);
            }
        }

        System.out.println("---------------------------------------");


    }

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){  //Ademas de void se puede usar algun otro tipo de dato
        // Calcular total ingresado, luego validar que no exceda el limite
        int total = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);

        //Validar que no exceda el limite
        if(total <= capacidadTotal){
            //Si... almacenar los datos en los atributos y retornar verdadero
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;

            registrarTransaccion(" ABASTECER", "0000 0000 0000 0000", total, "OK");
            return true;
        }else{
            //No... Imprimir mensaje y retornar falso
            registrarTransaccion(" ABASTECER", "0000 0000 0000 0000", total, "ERROR");
            return false;

        }
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
        Date fecha = new Date();  //Se crea un objeto de tipo fecha, la cual genera la fecha actual del sistema
        String texto = fecha.toString()+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;  //fecha.toString para generar su texto
        
        //Buscar un indice donde este vacio
        int indice = -1;

        for(int i = 0; i < listaTransacciones.length; i++){
            if(listaTransacciones[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            listaTransacciones[indice] = texto;
        }else{
            for(int i = 0; i < listaTransacciones.length-1; i++){
                listaTransacciones[i] = listaTransacciones[i+1];
            }
            listaTransacciones[listaTransacciones.length-1] = texto;
        }

    }
}