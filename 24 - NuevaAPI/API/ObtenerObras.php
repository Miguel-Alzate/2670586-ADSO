<?php 
	include 'DB/Conexion.php';

    $consulta = $base_de_datos->query("SELECT obra.*,categorias.nombre_categoria FROM obra JOIN categorias ON obra.id_categoria = categorias.id_categoria");
    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

    // Codifica los datos en UTF-8, para que se puedan convertir a Json sin problema (Ñ y tildes)
    $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");

    echo json_encode($datos);
?>