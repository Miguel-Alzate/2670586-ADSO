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
                    <td><button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#modalActualizarCategoria" onclick="cargarDatosActualizar(${categoria.id_categoria}, '${categoria.nombre_categoria}')">Actualizar</button></td>
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
        alert("Categoría insertada correctamente.");
        document.getElementById("nombre_categoria").value = '';
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
        cargarCategorias();
    });
}

function eliminarCategoria(){
    let categoriaEliminar = document.getElementById("categoriaEliminar").value;

    if (categoriaEliminar === '') {
        alert("Por favor, ingrese el nombre de la categoría a eliminar.");
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
        alert("Categoría eliminada correctamente.");
        cargarCategorias(); 
        document.getElementById("categoriaEliminar").value = '';
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
    })
    .catch(error => {
        alert('La categoría no ha podido ser eliminada');
        console.error('Error al eliminar categoría:', error);
    });
}

function actualizarCategoria() {
    let nuevoNombre = document.getElementById("nuevo_nombre_categoria").value;
    let categoriaId = document.getElementById("categoria_id").value;

    if (nuevoNombre === '' || categoriaId === '') {
        alert("Por favor, complete todos los campos.");
        return; 
    }

    let datos = new FormData();
    datos.append("id_categoria", categoriaId);
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
        alert("Categoría actualizada correctamente.");
        cargarCategorias(); 
        console.log('Respuesta JSON del Servidor:');
        console.log(data);

        document.getElementById("nuevo_nombre").value = '';
    });
}

function cargarDatosActualizar(id, nombre) {
    document.getElementById("categoria_id").value = id;
    document.getElementById("nuevo_nombre_categoria").value = nombre;
}

function cargarObras() {
    fetch("http://localhost/NuevaAPI/API/ObtenerObras.php")
        .then(response => response.json())
        .then(data => {
            const tbody = document.getElementById('tbodyObras');
            tbody.innerHTML = '';
            data.forEach(obra => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${obra.nombre_obra}</td>
                    <td>${obra.id_categoria}</td>
                    <td>${obra.fecha_presentacion}</td>
                    <td>${obra.lugar_presentacion}</td>
                    <td>${obra.duracion}</td>
                    <td>${obra.actor_principal}</td>
                    <td>
                        <button class="btn btn-warning" onclick="cargarDatosActualizarObra('${obra.id_obra}', '${obra.nombre_obra}', '${obra.id_categoria}', '${obra.fecha_presentacion}', '${obra.lugar_presentacion}', '${obra.duracion}', '${obra.actor_principal}')"
                            data-bs-toggle="modal" data-bs-target="#modalActualizarObra">
                            Actualizar
                        </button>
                    </td>
                `;
                tbody.appendChild(row);
            });
        });
}

function insertarObra() {
    let nombre_obra = document.getElementById("nombre_obra").value;
    let id_categoria = document.getElementById("id_categoria").value;
    let fecha_presentacion = document.getElementById("fecha_presentacion").value;
    let lugar_presentacion = document.getElementById("lugar_presentacion").value;
    let duracion = document.getElementById("duracion").value;
    let actor_principal = document.getElementById("actor_principal").value;


    if (!nombre_obra || !id_categoria || !fecha_presentacion || !lugar_presentacion || !duracion || !actor_principal) {
        alert("Por favor, complete todos los campos.");
        return;
    }

    let datos = new FormData();
    datos.append("nombre_obra", nombre_obra);
    datos.append("id_categoria", id_categoria);
    datos.append("fecha_presentacion", fecha_presentacion);
    datos.append("lugar_presentacion", lugar_presentacion);
    datos.append("duracion", duracion);
    datos.append("actor_principal", actor_principal);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };

    fetch("http://localhost/NuevaAPI/API/InsertarObras.php", configuracion)
    .then(res => res.json())
    .then(data => {
        if (data.status) {
            alert("Obra insertada correctamente.");
            document.getElementById("formularioInsertarObra").reset();
            cargarObras();
        } else {
            alert(data.message);
        }
    });
}

function eliminarObra() {
    let nombre_obra = document.getElementById("obraEliminar").value;

    if (nombre_obra === '') {
        alert("Por favor, ingrese el nombre de la obra a eliminar.");
        return; 
    }

    let datos = new FormData();
    datos.append("nombre_obra", nombre_obra);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };

    fetch("http://localhost/NuevaAPI/API/EliminarObras.php", configuracion)
    .then(res => res.json())
    .then(data => {
        if (data.status) {
            alert("Obra eliminada correctamente.");
            cargarObras();
            document.getElementById("obraEliminar").value = '';
            console.log('Respuesta JSON del Servidor:');
            console.log(data);
        } else {
            alert(data.message);
        }
    })
    .catch(error => {
        alert('La obra no ha podido ser eliminada');
        console.error('Error al eliminar obra:', error);
    });
}

function actualizarObra() {
    let nuevoNombreObra = document.getElementById("nombre_obra_actualizar").value;
    let idCategoria = document.getElementById("id_categoria_actualizar").value;
    let nuevaFechaPresentacion = document.getElementById("fecha_presentacion_actualizar").value;
    let nuevoLugarPresentacion = document.getElementById("lugar_presentacion_actualizar").value;
    let nuevaDuracion = document.getElementById("duracion_actualizar").value;
    let nuevoActorPrincipal = document.getElementById("actor_principal_actualizar").value;
    let obraId = document.getElementById("obra_id_actualizar").value;

    if (nuevoNombreObra === '' || idCategoria === '' || nuevaFechaPresentacion === '' || nuevoLugarPresentacion === '' || nuevaDuracion === '' || nuevoActorPrincipal === '' || obraId === '') {
        alert("Por favor, complete todos los campos.");
        return; 
    }

    let datos = new FormData();
    datos.append("id_obra", obraId);
    datos.append("nombre_obra", nuevoNombreObra);
    datos.append("id_categoria", idCategoria);
    datos.append("fecha_presentacion", nuevaFechaPresentacion);
    datos.append("lugar_presentacion", nuevoLugarPresentacion);
    datos.append("duracion", nuevaDuracion);
    datos.append("actor_principal", nuevoActorPrincipal);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };

    fetch("http://localhost/NuevaAPI/API/ActualizarObras.php", configuracion)
        .then(res => res.json())
        .then(data => {
            if (data.status) {
                alert("Obra actualizada correctamente.");
                cargarObras(); 
                console.log('Respuesta JSON del Servidor:');
                console.log(data);

                // Limpiar los campos del formulario y el campo oculto
                document.getElementById("nombre_obra_actualizar").value = '';
                document.getElementById("id_categoria_actualizar").value = '';
                document.getElementById("fecha_presentacion_actualizar").value = '';
                document.getElementById("lugar_presentacion_actualizar").value = '';
                document.getElementById("duracion_actualizar").value = '';
                document.getElementById("actor_principal_actualizar").value = '';
                document.getElementById("obra_id_actualizar").value = '';
            } else {
                alert(data.message);
            }
        })
        .catch(error => {
            alert('La obra no ha podido ser actualizada');
            console.error('Error al actualizar obra:', error);
        });
}

function cargarDatosActualizarObra(id_obra, nombre_obra, id_categoria, fecha_presentacion, lugar_presentacion, duracion, actor_principal) {
    document.getElementById("obra_id_actualizar").value = id_obra;
    document.getElementById("nombre_obra_actualizar").value = nombre_obra;
    document.getElementById("id_categoria_actualizar").value = id_categoria;
    document.getElementById("fecha_presentacion_actualizar").value = fecha_presentacion;
    document.getElementById("lugar_presentacion_actualizar").value = lugar_presentacion;
    document.getElementById("duracion_actualizar").value = duracion;
    document.getElementById("actor_principal_actualizar").value = actor_principal;
}
