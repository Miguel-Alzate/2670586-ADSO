<?php 
    include 'DB/Conexion.php';

   
    if (!empty($_POST['nombre_obra']) and !empty($_POST['id_categoria']) and !empty($_POST['fecha_presentacion']) and !empty($_POST['lugar_presentacion'])  and !empty($_POST['duracion']) and !empty($_POST['actor_principal'])) {

        $nombre_obra = $_POST['nombre_obra'];
        $id_categoria = $_POST['id_categoria'];
        $fecha_presentacion = $_POST['fecha_presentacion'];
        $lugar_presentacion = $_POST['lugar_presentacion'];
        $duracion = $_POST['duracion'];
        $actor_principal = $_POST['actor_principal'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO obra (nombre_obra, id_categoria, fecha_presentacion, lugar_presentacion, duracion, actor_principal) VALUES(:obr, :cat, :pre, :lug, :dur, :pri) ");
            $consulta->bindParam(':obr', $nombre_obra);
            $consulta->bindParam(':cat', $id_categoria);
            $consulta->bindParam(':pre', $fecha_presentacion);
            $consulta->bindParam(':lug', $lugar_presentacion);
            $consulta->bindParam(':dur', $duracion);
            $consulta->bindParam(':pri', $actor_principal);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##OBRA##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##OBRA##INSERT"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>