package com.example.inventario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//DTO
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private float cantidad;
    private String unidad;
    private float precio;

    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCantidad(float cantidad){
        this.cantidad=cantidad;
    }
    public float getCantidad(){
        return cantidad;
    }
    public void setUnidad(String unidad){
        this.unidad=unidad;
    }
    public String getUnidad(){
        return unidad;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public float getPrecio(){
        return precio;
    }    
}
