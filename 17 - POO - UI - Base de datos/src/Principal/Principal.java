
package Principal;

import utils.Persona;
import utils.BaseDatos;


public class Principal {
    
    public static void main(String[] args) {
        
        BaseDatos basedatos = new BaseDatos();
        
        Menu ventana = new Menu();
        
        
        // basedatos.insertarPersona("", "", "", "", "", "");
        // basedatos.actualizarPersona("", "", "", "", "", ""); //Editar persona en base de datos
        // basedatos.eliminarPersona("108800"); // Eliminar persona en base de datos
        
        Persona listado[] = basedatos.extraerPersonas();
        
        for(int i = 0; i < listado.length && listado[i] !=null; i++){
            System.out.println(" -> "+listado[i].getNombres()+" "+listado[i].getApellidos());
        }
        
    }
    
}




