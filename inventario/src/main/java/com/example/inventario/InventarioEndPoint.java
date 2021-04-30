package com.example.inventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import uv.cafeteria.inventario.CreateArtRequest;
import uv.cafeteria.inventario.CreateArtResponse;
import uv.cafeteria.inventario.DeleteArtRequest;
import uv.cafeteria.inventario.DeleteArtResponse;
import uv.cafeteria.inventario.ReadArtResponse;
import uv.cafeteria.inventario.UpdateArtRequest;
import uv.cafeteria.inventario.UpdateArtResponse;

@Endpoint
public class InventarioEndPoint {
    @Autowired
    private InterfazInventario inInventario;
    @PayloadRoot(namespace = "http://cafeteria.uv/inventario", localPart = "CreateArtRequest")
    @ResponsePayload
    public CreateArtResponse altaProducto( @RequestPayload CreateArtRequest peticion){
        CreateArtResponse respuesta=new CreateArtResponse();
        respuesta.setRespuesta("Producto registrado exitosamente");
        //salvar la BD
        Productos producto= new Productos();
        producto.setNombre(peticion.getNombre());
        producto.setCantidad(peticion.getCantidad());
        producto.setUnidad(peticion.getUnidad());
        producto.setPrecio(peticion.getPrecio());
        inInventario.save(producto);
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria.uv/inventario", localPart = "ReadArtRequest")
    @ResponsePayload
    public ReadArtResponse dameProductos(){
        ReadArtResponse respuesta = new ReadArtResponse();
        Iterable<Productos> listaProductos = inInventario.findAll();
        for(Productos ls : listaProductos){
            ReadArtResponse.Producto e = new ReadArtResponse.Producto();
            e.setId(ls.getId());
            e.setNombre(ls.getNombre());
            e.setCantidad(ls.getCantidad());
            e.setUnidad(ls.getUnidad());
            e.setPrecio(ls.getPrecio());
            respuesta.getProducto().add(e);
        }
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria.uv/inventario", localPart = "UpdateArtRequest")
    @ResponsePayload
    public UpdateArtResponse updateDatos(@RequestPayload UpdateArtRequest peticion){
        UpdateArtResponse respuesta = new UpdateArtResponse();
        int id = peticion.getId();//id existente este no se actualiza 
        String nombre = peticion.getNombre();//nombre nuevo
        float cantidad = peticion.getCantidad();
        String unidad = peticion.getUnidad();
        float precio = peticion.getPrecio();

        Productos p = inInventario.findById(id).orElse(null);
        p.setNombre(nombre);
        p.setCantidad(cantidad);
        p.setUnidad(unidad);
        p.setPrecio(precio);
        inInventario.save(p);
        respuesta.setRespuesta("Producto Actualizado exitosamente");
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria.uv/inventario", localPart = "DeleteArtRequest")
    @ResponsePayload
    public DeleteArtResponse deleteArt(@RequestPayload DeleteArtRequest peticion){
        DeleteArtResponse respuesta = new DeleteArtResponse();
        int id = peticion.getId();//id existente
        
        Productos p = inInventario.findById(id).orElse(null);
        inInventario.delete(p);
        respuesta.setRespuesta("Producto eliminado exitosamente");
 
        return respuesta;
    }
}
