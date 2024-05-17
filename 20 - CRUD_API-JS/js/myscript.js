
window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");

}

function cargarPersonas(){
    fetch("https://codetesthub.com/API/Obtener.php")
    .then(res => res.json())
    .then(data => {
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
   
        document.getElementById("tbodyPersonas").innerHTML = "";
 
        data.forEach(persona => {
            let fila = `
                <tr>
                    <td>${persona.cedula}</td>
                    <td>${persona.nombres}</td>
                    <td>${persona.apellidos}</td>
                    <td>${persona.telefono}</td>
                    <td>${persona.direccion}</td>
                    <td>${persona.email}</td>
                    <td><button type="button" class="btn btn-primary" type="button" data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="cargarDatosActualizar('${persona.cedula}', '${persona.nombres}', '${persona.apellidos}', '${persona.telefono}', '${persona.direccion}', '${persona.email}')">Actualizar</button></td>
                    
                </tr>
            `;
            document.getElementById("tbodyPersonas").innerHTML += fila;
        });
    });
}

function insertarPersona(){
    let cedula = document.getElementById("cedula").value;
    let nombres = document.getElementById("nombre").value;
    let apellidos = document.getElementById("apellido").value;
    let telefono = document.getElementById("telefono").value;
    let direccion = document.getElementById("direccion").value;
    let email = document.getElementById("email").value;

    if (cedula === '' || nombres === '' || apellidos === '' || telefono === '' || direccion === '' || email === '') {
        
        alert("Por favor, complete todos los campos.");
        return; 
    }

    let datos = new FormData();
    datos.append("cedula", cedula);
    datos.append("nombres", nombres);
    datos.append("apellidos", apellidos);
    datos.append("telefono", telefono);
    datos.append("direccion", direccion);
    datos.append("email", email);
    datos.append("foto", "foto.png");

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };
 
    fetch("https://codetesthub.com/API/Insertar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        alert("Persona insertada correctamente.");

        document.getElementById("cedula").value = '';
        document.getElementById("nombre").value = '';
        document.getElementById("apellido").value = '';
        document.getElementById("telefono").value = '';
        document.getElementById("direccion").value = '';
        document.getElementById("email").value = '';

        cargarPersonas();
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
    });
    
}

function actualizarPersona() {
    let nuevoCedula = document.getElementById("nuevo_cedula").value;
    let nuevoNombres = document.getElementById("nuevo_nombre").value;
    let nuevoApellidos = document.getElementById("nuevo_apellido").value;
    let nuevoTelefono = document.getElementById("nuevo_telefono").value;
    let nuevoDireccion = document.getElementById("nuevo_direccion").value;
    let nuevoEmail = document.getElementById("nuevo_email").value;

    if (nuevoCedula === '' || nuevoNombres === '' || nuevoApellidos === '' || nuevoTelefono === '' || nuevoDireccion === '' || nuevoEmail === '') {
        alert("Por favor, complete todos los campos.");
        return; 
    }

    let datos = new FormData();
    datos.append("cedula", parseInt(nuevoCedula));
    datos.append("nombres", nuevoNombres);
    datos.append("apellidos", nuevoApellidos);
    datos.append("telefono", nuevoTelefono);
    datos.append("direccion", nuevoDireccion);
    datos.append("email", nuevoEmail);
   

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };
  
    fetch("https://codetesthub.com/API/Actualizar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        alert("Persona actualizada correctamente.");
        cargarPersonas(); 
        console.log('Respuesta JSON del Servidor:');
        console.log(data);


        document.getElementById("nuevo_cedula").value = '';
        document.getElementById("nuevo_nombre").value = '';
        document.getElementById("nuevo_apellido").value = '';
        document.getElementById("nuevo_telefono").value = '';
        document.getElementById("nuevo_direccion").value = '';
        document.getElementById("nuevo_email").value = '';
    });
}

function eliminarPersona(){
    let cedulaEliminar = document.getElementById("cedulaEliminar").value;

    if (cedulaEliminar === '') {
        alert("Por favor, ingrese la cédula de la persona a eliminar.");
        return; 
    }

    let datos = new FormData();
    datos.append("cedula", cedulaEliminar);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos,
    };

    fetch("https://codetesthub.com/API/Eliminar.php", configuracion)
    .then(res => res.json())
    .then(data => {
        alert("Persona eliminada correctamente.");
        cargarPersonas(); 
        document.getElementById("cedulaEliminar").value = '';
        console.log('Respuesta JSON del Servidor:');
        console.log(data);
    })
    .catch(error => {
        alert('La persona no ha podido ser eliminada');
        console.error('Error al eliminar persona:', error);
    });

    
}

function cargarDatosActualizar(cedula, nombres, apellidos, telefono, direccion, email) {
    document.getElementById("nuevo_cedula").value = cedula;
    document.getElementById("nuevo_nombre").value = nombres;
    document.getElementById("nuevo_apellido").value = apellidos;
    document.getElementById("nuevo_telefono").value = telefono;
    document.getElementById("nuevo_direccion").value = direccion;
    document.getElementById("nuevo_email").value = email;
}