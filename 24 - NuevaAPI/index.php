<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Api Obras de Teatro</title>
    <link rel="icon" type="image/x-icon" href="WEB/img/teatro.png">
    <link rel="stylesheet" href="WEB/css/style.css">
<body>
    <div class="container">
        <h1>API de Obras de Teatro</h1>
        <h2>Parte de las obras</h2>
        <ul id="endpoint-list">

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ObtenerObras.php">API/ObtenerObras.php</a> </span></h4>
        		<h5>Metodo: GET</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li></li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Lista de obras:</h5>
					<pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre_obra": "La divina comedia",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_categoria": "1",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fecha_presentacion": "2024-06-15",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"lugar_presentacion": "Palacio de las bellas artes",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"duracion": "1:30hrs",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"actor_principal": "Cristian Schwalo",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre_categoria": "Terror"<br>&nbsp;&nbsp;&nbsp;&nbsp;},<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre_obra": "Hamlet",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_categoria": "2",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fecha_presentacion": "2024-06-30",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"lugar_presentacion": "Parque Arboleda",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"duracion": "2:00hrs",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"actor_principal": "Stroganof Murillo",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre_categoria": "Comedia"<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;]</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarObras.php">API/InsertarObras.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>String</b></i> nombre_obra</li>
					<li><i><b>int</b></i> id_categoria</li>
					<li><i><b>Date</b></i> fecha_presentacion</li>
					<li><i><b>String</b></i> lugar_presentacion</li>
					<li><i><b>String</b></i> duracion</li>
					<li><i><b>String</b></i> actor_principal</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Obra actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##OBRA##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##OBRA##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarObras.php">API/ActualizarObras.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
                    <li><i><b>String</b></i> nombre_obra</li>
					<li><i><b>int</b></i> id_categoria</li>
					<li><i><b>Date</b></i> fecha_presentacion</li>
					<li><i><b>String</b></i> lugar_presentacion</li>
					<li><i><b>String</b></i> duracion</li>
					<li><i><b>String</b></i> actor_principal</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Obra actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##OBRA##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##OBRA##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarObras.php">API/EliminarObras.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>String</b></i> nombre_obra</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Obra eliminada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>
        </ul>
    </div>

    <div class="container">
        <h1>API de Obras de Teatro</h1>
        <h2>Parte de las categorias</h2>
        <ul id="endpoint-list">

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ObtenerCategorias.php">API/ObtenerCategorias.php</a> </span></h4>
        		<h5>Metodo: GET</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li></li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Lista de categorias:</h5>
					<pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_categoria": "1",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre_categoria": "Terror"<br>&nbsp;&nbsp;&nbsp;&nbsp;},<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id_categoria": "2",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"nombre_categoria": "Comedia"<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;]</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarCategorias.php">API/InsertarCategorias.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>String</b></i> nombre_categoria</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Categoria actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##CATEGORIA##INSERT"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##CATEGORIA##INSERT"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarCategorias.php">API/ActualizarCategorias.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
                    <li><i><b>String</b></i> nombre_categoria</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Categoria actualizada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##CATEGORIA##UPDATE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en actualizacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##CATEGORIA##UPDATE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>

        	<li>
        		<h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarCategorias.php">API/EliminarCategorias.php</a> </span></h4>
        		<h5>Metodo: POST</h5>
        		<h5>Parametros:</h5>
        		<ul class="input-list">
        			<li><i><b>String</b></i> nombre_categoria</li>
        		</ul>
        		<h5 style="padding-top:5px;">Salida: JSON</h5>
        		<div style="padding-left: 30px; padding-top:5px; padding-bottom:5px;">
					<h5 style="padding-top:5px;">Categoria eliminada:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en parametros:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

					<h5 style="padding-top:5px;">Error en eliminacion:</h5>
					<pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
        		</div>
        	</li>
        </ul>
    </div>


    <script src="WEB/js/scripts.js"></script>
</body>
</html>