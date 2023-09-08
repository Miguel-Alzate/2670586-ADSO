import java.util.Date;
public class TarjetaDebito{
    //Atributos
    String nombrePropietario;
    String numeroTarjeta;
    String nombreBanco;
    int cantidadDinero;
    int cantidadRetiro;
    String TransaccionesTarjeta [];
    String clave;
    String estado;

    //Metodo constructor
    public TarjetaDebito (String nombrePropietario, String numeroTarjeta, String nombreBanco, int cantidadDinero, int cantidadRetiro, String clave, String estado){
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreBanco = nombreBanco;
        this.cantidadDinero = cantidadDinero;
        this.cantidadRetiro = cantidadRetiro;
        this.clave = clave;
        this.estado = estado;

        TransaccionesTarjeta = new String [100];
    }

    public void imprimirDetalle(){
        System.out.println("---------------------------------------");
        System.out.println("  nombrePropietario: "+nombrePropietario);
        System.out.println("  numeroTarjeta: "+numeroTarjeta);
        System.out.println("  nombreBanco: "+nombreBanco);
        System.out.println("  cantidadDinero: "+cantidadDinero);
        System.out.println("  clave: "+clave);
        System.out.println("  estado: "+estado);
        System.out.println("  Historial de transacciones: ");

        for(int i = 0; i < TransaccionesTarjeta.length; i++){
            if (TransaccionesTarjeta[i] !=null){
                System.out.println("        => "+TransaccionesTarjeta[i]);
            }
        }

        System.out.println("---------------------------------------");


    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
        Date fecha = new Date();  //Se crea un objeto de tipo fecha, la cual genera la fecha actual del sistema
        String texto = fecha.toString()+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;  //fecha.toString para generar su texto
        
        //Buscar un indice donde este vacio
        int indice = -1;

        for(int i = 0; i < TransaccionesTarjeta.length; i++){
            if(TransaccionesTarjeta[i] == null){
                indice = i;
                break;
            }
        }

        if(indice != -1){
            TransaccionesTarjeta[indice] = texto;
        }else{
            for(int i = 0; i < TransaccionesTarjeta.length-1; i++){
                TransaccionesTarjeta[i] = TransaccionesTarjeta[i+1];
            }
            TransaccionesTarjeta[TransaccionesTarjeta.length-1] = texto;
        }

    }

    public void aumentarSaldo(int cantidad){
        if (cantidad > 0) {
            cantidadDinero += cantidad;
            registrarTransaccion(" DEPÓSITO", numeroTarjeta, cantidad, "Éxito");
        } else {
            System.out.println(" La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void disminuirSaldo(int cantidad){
        if (cantidad > 0 ) {
            cantidadDinero -= cantidad;
            registrarTransaccion(" RETIRO", numeroTarjeta, cantidad, "Exito");
        }else {
            System.out.println(" La cantidad a retirar debe ser mayor a cero.");
        }
    }
}