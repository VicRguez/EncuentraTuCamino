/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author alumno
 */
public class Ubicacion {
    int valoracion;
    int id;
    String nombre;
    String ciudad;
    Geocodificacion ubicacion;

    public Ubicacion(Geocodificacion ubicacion,String ciudad) {
        this.ubicacion=ubicacion;
        this.ciudad=ciudad;
        this.nombre=ubicacion.getBusqueda();
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Geocodificacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Geocodificacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
