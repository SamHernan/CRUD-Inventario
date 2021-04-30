var mensaje = '';

function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<UpdateArtRequest xmlns="http://cafeteria.uv/inventario">' +
    '<id>'+ document.getElementById('inputId').value +'</id>' +
    '<nombre>'+ document.getElementById('inputNombre').value +'</nombre>' +
    '<cantidad>'+ document.getElementById('inputStock').value +'</cantidad>' +
    '<unidad>'+ document.getElementById('inputUnidad').value +'</unidad>' +
    '<precio>'+ document.getElementById('inputPrecio').value +'</precio>' +
    '</UpdateArtRequest>' +
    '</Body>' +
    '</Envelope>';
}

function updateArticulo() {
    ini();
    axios.post('http://localhost:8080/ws/inventario', mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function(response){
        //console.log(response.data);
        var valor = resultado(response.data);
        console.log(valor);
        alert(valor);
    })
    .catch(err => console.log(err));
}

function resultado(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml, "text/xml");
    var resul = xmlDoc.getElementsByTagName("ns2:respuesta")[0].childNodes[0].nodeValue;
    return resul;
}