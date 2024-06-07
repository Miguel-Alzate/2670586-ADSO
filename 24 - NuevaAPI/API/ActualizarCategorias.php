<?php 
    include 'DB/Conexion.php';

    if  (!empty($_POST['nombre_categoria']))  {

        $nombre_categoria = $_POST['nombre_categoria'];
 
        try {
            $consulta = $base_de_datos->prepare("UPDATE categorias SET nombre_categoria=:cat WHERE nombre_categoria=:cat");

            $consulta->bindParam(':cat', $nombre_categoria);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CATEGORIA##UPDATE"
                            ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CATEGORIA##UPDATE"
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