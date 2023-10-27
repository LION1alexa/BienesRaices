package com.example.ProyectoFinal_BienesRaices.service;

import com.example.ProyectoFinal_BienesRaices.model.DetalleOrden;
import java.util.List;

public interface IDetalleOrdenService {
    List<DetalleOrden> findAll();
    DetalleOrden save(DetalleOrden detalleOrden); //Guardamos la informacion de la orden generada por el 
    //usuario
    public List<DetalleOrden> CantidadProductos(int id);
}
