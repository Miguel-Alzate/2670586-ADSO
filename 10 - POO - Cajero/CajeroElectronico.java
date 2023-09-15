import java.util.Date; //Libreria de fechas

public class CajeroElectronico{
    //Atributos
    int capacidadTotal;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombreBanco;
    String listaTransacciones [];
    String usuarioAdmin;
    String claveAdmin;

    //Metodo constructor 1
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


    //Funcionalidades
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

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
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

    public void verHistorialCajero(String user, String pass){

        if(user.equals(usuarioAdmin) && pass.equals(claveAdmin) ){
            registrarTransaccion(" HISTORIAL", "0000 0000 0000 0000", 0, "OK");
            for (int i = 0; i<listaTransacciones.length; i++){
                if (listaTransacciones[i] != null){
                    System.out.println(listaTransacciones[i]);
                }
            }
        }else{
            System.out.println("ACCESO DENEGADO !!!");
            registrarTransaccion(" HISTORIAL", "0000 0000 0000 0000", 0, "ERROR");
        }
    }

    public void consignarDineroaTarjeta(TarjetaDebito tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100){
        int monto = (10000*cant_10) + (20000*cant_20) + (50000*cant_50) + (100000*cant_100);
        //validar clave
        if (tarjeta.validarClave(clave)){
            //validar estado de la tarjeta "Activa"
            if(tarjeta.validarEstadoActiva()){
                //validar que el monto sea positivo
                if(monto > 0){
                    //validar que no se exceda la capidad del cajero
                    if(dineroDisponible+monto <= capacidadTotal){
                        //aumentar saldo en la tarjeta
                        tarjeta.aumentarSaldo(monto, clave);
                        //aumentar el dinero disponible, y las cantidades de los billetes
                        dineroDisponible += monto;
                        this.cant_10 += cant_10;
                        this.cant_20 += cant_20;
                        this.cant_50 += cant_50;
                        this.cant_100 += cant_100;
                        //registrar transaccion
                        System.out.println(" ======> REALIZADO - CONSIGNAR DINERO <======");
                        registrarTransaccion(" CONSIGNACIÓN", tarjeta.getNumero(), monto, "OK");

                    }else{
                        System.out.println("======> ERROR MONTO SUPERIOR - CONSIGNAR DINERO <======");
                        registrarTransaccion(" CONSIGNACIÓN", tarjeta.getNumero(), monto, "ERROR MONTO SUPERIOR");
                    }
                }else{
                    System.out.println("======> ERROR MONTO INFERIOR - CONSIGNAR DINERO <======");
                    registrarTransaccion(" CONSIGNACIÓN", tarjeta.getNumero(), monto, "ERROR MONTO INFERIOR");
                }

            }else{
                System.out.println("======> ERROR ESTADO - CONSIGNAR DINERO <======");
                registrarTransaccion(" CONSIGNACIÓN", tarjeta.getNumero(), monto, "ERROR ESTADO");
            }

        }else{
            System.out.println("======> ERROR PASSWORD - CONSIGNAR DINERO <======");
            registrarTransaccion(" CONSIGNACIÓN", tarjeta.getNumero(), monto, "ERROR PASSWORD");
        }
    }

    public void retirarDineroTarjeta(TarjetaDebito tarjeta, String clave, int cant_10, int cant_20, int cant_50, int cant_100) {
        int monto = (10000*cant_10) + (20000*cant_20) + (50000*cant_50) + (100000*cant_100);
  
        if (tarjeta.validarClave(clave)){
          
            if(tarjeta.validarEstadoActiva()){
             
                if(monto > 0){
                  
                    if(dineroDisponible+monto <= capacidadTotal){
                        if(tarjeta.getCantidadRetiro() > monto){
                            tarjeta.disminuirSaldo(monto, clave);
                            dineroDisponible -= monto;
                            this.cant_10 -= cant_10;
                            this.cant_20 -= cant_20;
                            this.cant_50 -= cant_50;
                            this.cant_100 -= cant_100;

                            System.out.println(" ======> REALIZADO - RETIRAR DINERO <======");
                            registrarTransaccion(" RETIRO", tarjeta.getNumero(), monto, "OK");
                        }else{
                            System.out.println("======> ERROR MONTO SUPERIOR A SALDO EN TARJETA - RETIRAR DINERO <======");
                            registrarTransaccion(" RETIRO", tarjeta.getNumero(), monto, "ERROR MONTO SUPERIOR");
                        }
                    }else{
                        System.out.println("======> ERROR MONTO SUPERIOR - RETIRAR DINERO <======");
                        registrarTransaccion(" RETIRO", tarjeta.getNumero(), monto, "ERROR MONTO SUPERIOR");
                    }
                }else{
                    System.out.println("======> ERROR MONTO INFERIOR - RETIRAR DINERO <======");
                    registrarTransaccion(" RETIRO", tarjeta.getNumero(), monto, "ERROR MONTO INFERIOR");
                }
            }else{
                System.out.println("======> ERROR ESTADO - RETIRAR DINERO <======");
                registrarTransaccion(" RETIRO", tarjeta.getNumero(), monto, "ERROR ESTADO");
            }
        }else{
            System.out.println("======> ERROR PASSWORD - RETIRAR DINERO <======");
            registrarTransaccion(" RETIRO", tarjeta.getNumero(), monto, "ERROR PASSWORD");
        }
    }

    public void verHistorialTarjeta(String clave, TarjetaDebito tarjeta){
        if (tarjeta.validarClave(clave)){
            if(tarjeta.validarEstadoActiva()){
                tarjeta.verHistorial(clave);
                System.out.println(" ======> REALIZADO - HISTORIAL TARJETA <======");
                registrarTransaccion(" HISTORIAL", tarjeta.getNumero(), 0, "OK");
            }else{
                System.out.println("======> ERROR ESTADO - VER HISTORIAL <======");
                registrarTransaccion(" HISTORIAL", tarjeta.getNumero(), 0, "ERROR ESTADO");
            }

        }else{
            System.out.println("======> ERROR PASSWORD - VER HISTORIAL <======");
            registrarTransaccion(" HISTORIAL", tarjeta.getNumero(), 0, "ERROR PASSWORD");
        }
    }

    public void consultarSaldoTarjeta(String clave, TarjetaDebito tarjeta){
        if (tarjeta.validarClave(clave)){
            if(tarjeta.validarEstadoActiva()){
                System.out.println("SALDO ACTUAL DE LA TARJETA: "+tarjeta.getSaldo(clave));
                System.out.println(" ======> REALIZADO - CONSULTA SALDO <======");
                registrarTransaccion(" CONSULTASALDO", tarjeta.getNumero(), 0, "OK");
            }else{
                System.out.println("======> ERROR ESTADO - CONSULTA SALDO <======");
                registrarTransaccion(" CONSULTASALDO", tarjeta.getNumero(), 0, "ERROR ESTADO");
            }

        }else{
            System.out.println("======> ERROR PASSWORD - CONSULTA SALDO <======");
            registrarTransaccion(" CONSULTASALDO", tarjeta.getNumero(), 0, "ERROR PASSWORD");
        }
    }
    
    public void cambiarClave(String clave_actual, String clave_cambio, CajeroElectronico cajero){
        if (cajero.getClave(clave_actual)){
            cajero.setClave(clave_cambio);
        }else{
            System.out.println("======> ERROR PASSWORD - CAMBIO DE CLAVE <======");
            registrarTransaccion(" CAMBIO CLAVE", "0000 0000 0000 0000", 0, "ERROR PASSWORD");
        }
    }

    public boolean getClave(String pass){
        if (pass.equals(claveAdmin)){
            registrarTransaccion(" CAMBIO DE CLAVE","0000 0000 0000 0000", 0, "OK");
            return true;
        }else{
            registrarTransaccion(" CAMBIO DE CLAVE","0000 0000 0000 0000", 0, "ERROR");
            return false;
        }
    }
    public void setClave(String clave_cambio){
        claveAdmin = clave_cambio;
    }
}