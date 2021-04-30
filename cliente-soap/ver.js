function ini(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<ReadArtRequest xmlns="http://cafeteria.uv/inventario">' +
    '</ReadArtRequest>' +
    '</Body>' +
    '</Envelope>';
}

function verArticulo() {
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
        //window.alert(valor);
    })
    .catch(err => console.log(err));
}

function resultado(rXml){
    var txt ='';
    var id,nombre,cantidad,unidad,precio;
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml, "text/xml");
    var res = xmlDoc.getElementsByTagName("ns2:producto");
    var resul = res.length;
    for(i=0; i<resul;i++){
      id = xmlDoc.getElementsByTagName("ns2:id")[i].childNodes[0].nodeValue;
      nombre = xmlDoc.getElementsByTagName("ns2:nombre")[i].childNodes[0].nodeValue;
      cantidad = xmlDoc.getElementsByTagName("ns2:cantidad")[i].childNodes[0].nodeValue;
      unidad = xmlDoc.getElementsByTagName("ns2:unidad")[i].childNodes[0].nodeValue;
      precio = xmlDoc.getElementsByTagName("ns2:precio")[i].childNodes[0].nodeValue;
      console.log("Id: "+id+ " nombre: "+nombre+ " cantidad: "+cantidad+ " unidad: "+unidad+ " precio: "+precio);
      txt+= "Id: "+id+ " nombre: "+nombre+ " cantidad: "+cantidad+ " unidad: "+unidad+ " precio: "+precio+ "<br>";
    }
    document.getElementById("demo").innerHTML = txt;
    return "tengo "+ resul +" articulos registrados";
}