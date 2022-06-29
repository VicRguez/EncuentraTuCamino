/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public class Ruta {
    private int id;
    private String nombre;
    private int id_usuario;
    private HashMap <Ubicacion,Integer> ubicaciones;

    public Ruta(int id,String nombre,int id_usuario, HashMap<Ubicacion,Integer> ubicaciones) {
        this.id = id;
        this.nombre=nombre;
        this.id_usuario = id_usuario;
        this.ubicaciones = ubicaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ruta() {
        ubicaciones=new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public HashMap<Ubicacion,Integer> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(HashMap<Ubicacion,Integer> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    public void anyadeUbicacion(int pos,Ubicacion ubicacion){
        ubicaciones.put(ubicacion,pos);
    }

    void eliminarUbicacion(int pos, Ubicacion ub) {
        ubicaciones.remove(ub,pos);
    }

    void cambiaposicion(int pos, Ubicacion ub) {
        ubicaciones.put(ub, pos);
    }
}
