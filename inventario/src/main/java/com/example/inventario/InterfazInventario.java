package com.example.inventario;

import org.springframework.data.repository.CrudRepository;

public interface InterfazInventario extends CrudRepository<Productos, Integer>{
    
}
