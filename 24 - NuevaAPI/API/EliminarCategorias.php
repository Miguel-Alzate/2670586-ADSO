<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre_categoria'])) {
        
        $nombre_categoria = $_POST['nombre_categoria'];
        
        try {
            $consulta = $base_de_datos->prepare("DELETE FROM categorias WHERE nombre_categoria = :obr ");

            $consulta->bindParam(':obr', $nombre_categoria);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##DELETE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##DELETE"
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