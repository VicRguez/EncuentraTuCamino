/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Conexion.Conexion;
import Interfaces.UbicacionRuta;
import Interfaces.panelRuta;
import Interfaces.ubicacionPanel;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.LayerGroup;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

/**
 *
 * @author alumno
 */
public class Logica {
    private List <ubicacionPanel> listaRuta;
    private Ruta ruta;
    private Conexion conexion;
    private Usuario usuario;
    private List<panelRuta> rutas;
    private List<UbicacionRuta> ubicacionesRuta;

    public Logica() {
        this.ruta=new Ruta();
        this.listaRuta=new ArrayList<>();
        this.conexion=new Conexion();
        this.rutas=new ArrayList<>();
        this.ubicacionesRuta=new ArrayList<>();
    }

    public List<ubicacionPanel> getListaRuta() {
        return listaRuta;
    }

    public void setListaRuta(List<ubicacionPanel> listaRuta) {
        this.listaRuta = listaRuta;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    
    
    public JPanel moverUbicacion(JPanel panel, int posinicial, int posfinal){
       JPanel jPanel=panel;
        Component[] components =jPanel.getComponents();
        
        if((posfinal<=listaRuta.size())&&(posfinal>=1)){//comprueba que no se salga la posicion de la lista
            for (int i=0;i<components.length;i++){

                if(components[i] instanceof ubicacionPanel){//estos dos if son para intercambiar
                    ubicacionPanel ubpanel=(ubicacionPanel)components[i];
                    if(ubpanel.getPosicion()==posfinal){
                        Ubicacion ub=ubpanel.getUbicacion();

                        listaRuta.get(i).setPosicion(posinicial);
                        listaRuta.get(i).getNumero().setText(String.valueOf(posinicial));
                        ruta.cambiaposicion(posinicial,ub);

                        jPanel=actualizarPanel(jPanel);
                        

                    }else if(ubpanel.getPosicion()==posinicial){
                        Ubicacion ub=ubpanel.getUbicacion();

                        listaRuta.get(i).setPosicion(posfinal);
                        listaRuta.get(i).getNumero().setText(String.valueOf(posfinal));
                        ruta.cambiaposicion(posfinal,ub);

                        jPanel=actualizarPanel(jPanel);
                        
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No puedes moverlo");
        }
        

        return jPanel;
    }

    
    public JPanel eliminarElementoPanel(JPanel jPanel3) {
        JPanel jPanel=jPanel3;
        Component[] components =jPanel.getComponents();
        for (int i=0;i<components.length;i++){

            if(components[i] instanceof ubicacionPanel){
                ubicacionPanel ubpanel=(ubicacionPanel)components[i];
                if(ubpanel.isElimina()){
                    Ubicacion ub=ubpanel.getUbicacion();
                    int pos =ubpanel.getPosicion();
                    listaRuta.remove(i);
                    ruta.eliminarUbicacion(pos,ub);

                    jPanel=actualizarPanel(jPanel);
                    break;

                }
            }
        }

        return jPanel;
    }


    public JPanel actualizarPanel( JPanel jPanel) {
        jPanel.removeAll();
        Collections.sort(listaRuta, new Comparator<ubicacionPanel>() {
            @Override
            public int compare(ubicacionPanel o1, ubicacionPanel o2) {
                return Integer.compare(o1.getPosicion(),o2.getPosicion());
            }
        });

        for(ubicacionPanel up:listaRuta){

            jPanel.add(up);
        }
        
        jPanel.updateUI();


        return jPanel;
    }

    public void anyadirubicacion(JPanel listaubicaciones, Logica logica, Geocodificacion g,String ciudad, MapMarker mm ) {
        Ubicacion ub=new Ubicacion(g, ciudad);
        ruta.anyadeUbicacion(listaRuta.size()+1, ub);
        listaRuta.add(listaRuta.size(), new ubicacionPanel(listaRuta.size()+1, listaubicaciones, ub, logica,mm));
        actualizarPanel(listaubicaciones);
        
        
    }
    public List<MapMarker> dameMarcadores(){
        List<MapMarker> mm=new ArrayList<>();
        for(ubicacionPanel up:listaRuta){
            mm.add(up.getMm());
        }
        return mm;
    }
    
    public boolean compruebaUsuario(String usuario, String pwd){
        try {
            if(conexion.comprueba_existencia(usuario, pwd)!=null){
                this.usuario=conexion.comprueba_existencia(usuario, pwd);
                this.ruta.setId_usuario(this.usuario.getId());
                return true;
            }else{
                return false;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    


    public void anyadirRuta(String nombre) {
        ruta.setNombre(nombre);
        ruta.setId_usuario(usuario.getId());
        if(ruta.getUbicaciones().size()>0&&!ruta.getNombre().equals("")){
            conexion.crearRuta(ruta);
        }
    }

    public void crear_usuario(Usuario us) {
        try {
            conexion.crear_usuario(us);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int compruebaUsuario(String usuario,String contraseña,String email) {
        int cod =-1;
        try {
            
            
            cod=conexion.comprueba_existencia(usuario, contraseña, email);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }

    public void pintarRuta(Ruta ruta, JPanel panelUbis) {
        panelUbis.removeAll();
        this.ruta=ruta;
        HashMap<Ubicacion,Integer> ubicaciones=this.ruta.getUbicaciones();
        for (Map.Entry<Ubicacion, Integer> entry : ubicaciones.entrySet()) {
               Ubicacion key = entry.getKey(); //cada ubicacion
               UbicacionRuta ur=new UbicacionRuta(key, entry.getValue(),this);
               ubicacionesRuta.add(ur);
        }
        Collections.sort(ubicacionesRuta, new Comparator<UbicacionRuta>() {
            @Override
            public int compare(UbicacionRuta o1, UbicacionRuta o2) {
                return Integer.compare(o1.getPosicion(),o2.getPosicion());
            }
        });
        //para pintar en el panel
        for(UbicacionRuta ur:ubicacionesRuta){
                panelUbis.add(ur);
        }
        panelUbis.updateUI();
        
        
    }

    public void quitarRuta(Ruta ruta, JPanel panelUbis) {
        
        panelUbis.removeAll();
        ubicacionesRuta=new ArrayList<UbicacionRuta>();
        for(UbicacionRuta ur:ubicacionesRuta){
                panelUbis.add(ur);
        }
        panelUbis.updateUI();
        
    }

    public void mostrarRutas(JPanel panelListaRuta, String ciudad,JPanel panelUbis) {
        panelListaRuta.removeAll();
        try {
            List<Ruta> rut=conexion.damerutas(ciudad);
            for(Ruta r:rut){
                rutas.add(new panelRuta(r, this, panelUbis,panelListaRuta));
                
                
            }
            
            for(panelRuta pr:rutas){
                panelListaRuta.add(pr);
            }
            panelListaRuta.updateUI();
            
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void habilitaDemas(JPanel panelRutas, boolean flag) {
        
        for(panelRuta pr:rutas){
            if(!pr.getNombreRuta().isSelected()){
                pr.getNombreRuta().setEnabled(flag);
            }
        }
        
    }

    public List<MapMarker> dameMarcadoresRuta() {
        LayerGroup ubic = new LayerGroup("Ubicacion");
        Layer capas = ubic.addLayer("Ruta");
        List<MapMarker> mm=new ArrayList<>();
        for(UbicacionRuta ur:ubicacionesRuta){
            mm.add(new MapMarkerDot(capas, ur.getUb().nombre,ur.getUb().getUbicacion().getLat(),ur.getUb().getUbicacion().getLon()));
        }
        return mm;
        
    }

    public void actualizaValoracion(int id, int valoracion) {
        try {
            conexion.actualizaValoracion(id, valoracion);
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
