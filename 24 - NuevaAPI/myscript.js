window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");
}

function cargarCategorias(){
    fetch("http://localhost/NuevaAPI/API/ObtenerCategorias.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
   
        document.getElementById("tbodyCategorias").innerHTML = "";
 
        data.forEach(categoria => {
            let fila = `
                <tr>
                    <td>${categoria.id_categoria}</td>
                    <td>${categoria.nombre_categoria}</td>                  
                </tr>
            `;
            document.getElementById("tbodyCategorias").innerHTML += fila;
        });
    });
}

function insertarCategoria(){
    let nombre_categoria = document.getElementById("nombre_categoria").value;


    if (nombre_categoria === '') {
        
        alert("Por favor, complete todos los campos.");
        return; 
    }

    let datos = new FormData();
    datos.append("nombre_categoria", nombre_categoria);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };
 
    fetch("http://localhost/NuevaAPI/API/InsertarCategorias.php", configuracion)
    .then(res => res.json())
    .then(data => {

        alert("Categoria insertada correctamente.");
        document.getElementById("nombre_categoria").value = '';
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
        cargarCategorias();
        
    });
    
}

function eliminarCategoria(){
    let categoriaEliminar = document.getElementById("categoriaEliminar").value;

    if (categoriaEliminar === '') {
        alert("Por favor, ingrese el nombre de la categoria a eliminar.");
        return; 
    }

    let datos = new FormData();
    datos.append("nombre_categoria", categoriaEliminar);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };

    fetch("http://localhost/NuevaAPI/API/EliminarCategorias.php", configuracion)
    .then(res => res.json())
    .then(data => {
        alert("Categoria eliminada correctamente.");
        cargarCategorias(); 
        document.getElementById("categoriaEliminar").value = '';
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
    })
    .catch(error => {
        alert('La categoria no ha podido ser eliminada');
        console.error('Error al eliminar categoria:', error);
    });

    
}

function actualizarPersona() {
    let nuevoNombre = document.getElementById("nuevo_nombre").value;
  

    if (nuevoNombre === '') {
        alert("Por favor, complete todos los campos.");
        return; 
    }

    let datos = new FormData();
    datos.append("nombre_categoria", nuevoNombre);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };
  
    fetch("http://localhost/NuevaAPI/API/ActualizarCategorias.php", configuracion)
    .then(res => res.json())
    .then(data => {
        alert("Categoria actualizada correctamente.");
        cargarCategorias(); 
        console.log('Respuesta JSON del Servidor:');
        console.log(data);


        document.getElementById("nuevo_nombre").value = '';

    });
}