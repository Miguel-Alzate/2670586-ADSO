
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;

public class Principal {

    public static void main(String[] args) {
        
       
        
       Menu ventana = new Menu();
       // Instancia para realizar Consumos
       ConsumoAPI consumo = new ConsumoAPI();
                
       // EndPoint Obtener
       String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
       System.out.println("Respuesta Obtener: " + respuesta01);
       
       
       Map<String, String> datosInsertar = new HashMap<>();
       datosInsertar.put("cedula","1088258");
       datosInsertar.put("nombres","Miguel");
       datosInsertar.put("apellidos","Alzate");
       datosInsertar.put("telefono","3008914");
       datosInsertar.put("direccion","Calle mi casa");
       datosInsertar.put("email","miguelalz@mail.com");
       
       // EndPoint Insertar 
       String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
       System.out.println("Respuesta Insertar: " + respuesta02);
       
       // EndPoint Actualizar
       
       Map<String, String> datosActualizar = new HashMap<>();
       datosActualizar.put("cedula","1088258");
       datosActualizar.put("nombres","Juancho Guitierrez");
       datosActualizar.put("apellidos","Malboro");
       datosActualizar.put("telefono","3008914");
       datosActualizar.put("direccion","Calle su casa");
       datosActualizar.put("email","juanchito@mail");
       
       String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
       System.out.println("Respuesta Actualizar: " + respuesta03);
       
       
       // EndPoint Eliminar 
       
       //Map<String, String> datosEliminar = new HashMap<>();
       //datosEliminar.put("cedula", "1088258");
       
       //String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
       //System.out.println("Respuesta Eliminar: " + respuesta04);
       
       
       JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
        for (int i=0; i<registros.size(); i++){
           JsonObject temp = registros.get(i).getAsJsonObject();
           String nombres = temp.get("nombres").getAsString();
           String apellidos = temp.get("apellidos").getAsString();
           
           System.out.println(nombres + "" + apellidos);
        }
        
    }
    
}
