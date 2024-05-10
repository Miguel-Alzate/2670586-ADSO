let contenPrincipal;
let anteriorEndPoint;
let siguienteEndPoint;
let paginaActual = 1;
let texto = "Numero de página: ";
let aux;
let pagina_temp = 1;

window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");

}

function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";
    loader.style.display = "block"; 

    // Consumo - AJAX (Asíncrono)
    fetch( endpoint )
    .then(respuesta => respuesta.json())
    .then(data => {

        // Codigo para ejercutar en caso de tener JSON como respuesta de la API
        loader.style.display = "none"; 

        anteriorEndPoint = data.previous;
        siguienteEndPoint = data.next;

        contentPrincipal.innerHTML = "";
        for (let i = 0; i < data.results.length; i++) {
            
            let html_temp = `
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-primary m-1 col-2"> ${ data.results[i].name } </button> 
                           `;
            
            contentPrincipal.innerHTML += html_temp;  
        }

    });
    aux = texto + pagina_temp
    document.getElementById("num_pagina").innerHTML=aux;
    btn_consumo.setAttribute("hidden", true);
    btn_anterior.setAttribute("disabled", true);
    
}

function cargarDetalle(endpoint){
    loader.style.display = "block"; 
    fetch( endpoint )
    .then(respuesta => respuesta.json())
    .then(data => {
        nombrePokemon.innerText = data.name;
        imgPokemon.src = data.sprites.other.dream_world.front_default;
        loader.style.display = "none"; 
    });     
}

function cambiar_pagina(numero){
    let btn_anterior = document.getElementById("btn_anterior"); 
    let texto = "Numero de pagina: "; 

    if (numero == -1 && anteriorEndPoint) {
        paginaActual--;
        pagina_temp--;
        aux = texto + pagina_temp;
        btn_anterior.removeAttribute("disabled");
        consumirPaginaActual(anteriorEndPoint);
        document.getElementById("num_pagina").innerHTML = aux;
        if (pagina_temp === 1) { 
            btn_anterior.setAttribute("disabled", true); 
            return; 
        }
        
    } else if (numero == 1 && siguienteEndPoint){
        paginaActual++;
        pagina_temp++;
        aux = texto + pagina_temp;
        btn_anterior.removeAttribute("disabled");
        consumirPaginaActual(siguienteEndPoint);
        document.getElementById("num_pagina").innerHTML = aux;
    }
}

function consumirPaginaActual(endpoint){
    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => { 
        contentPrincipal.innerHTML = "";

        anteriorEndPoint = data.previous;
        siguienteEndPoint = data.next;

        for (let i = 0; i < data.results.length; i++) {
            let html_temp = `
            <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-primary m-1 col-2"> ${ data.results[i].name } </button> 
       `;

contentPrincipal.innerHTML += html_temp;                
        }
    });
}