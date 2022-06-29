/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Geocodificacion {
    String sURL="https://nominatim.openstreetmap.org/search/";
    double lat;
    double lon;
    int zoom;
    int nPalabras;
    
    String busqueda;

    public Geocodificacion(String buscar) {
        try {
            busqueda=buscar;
            nPalabras=calcularNPalabras(busqueda);
            sURL+=busqueda+"?format=json&addressdetails=1&limit="+nPalabras;
            System.out.println(sURL);
            // Connect to the URL using Java's native library
            URL url = new URL(sURL);
            URLConnection request = url.openConnection();
            request.connect();
            
            // Convert to a JSON object to print data
            JsonParser jp = new JsonParser(); //from gson
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
            JsonArray rootarr = root.getAsJsonArray(); //May be an array, may be an object.
            JsonObject rootobj=(JsonObject) rootarr.get(0);
            lat = rootobj.get("lat").getAsDouble(); //just grab the zipcode
            lon = rootobj.get("lon").getAsDouble();
            zoom=calculaZoom(rootobj);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Geocodificacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Geocodificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     private int calculaZoom(JsonObject rootobj){
        int zoomLevel;
        JsonArray boundingbox = rootobj.get("boundingbox").getAsJsonArray();
            List listbb = new ArrayList();
            for (JsonElement bb : boundingbox) {
                listbb.add(bb.getAsString());
            }
        double latMin  =Double.parseDouble(listbb.get(0).toString());
        double latMax  =Double.parseDouble(listbb.get(1).toString());
        double lngMin  =Double.parseDouble(listbb.get(2).toString());
        double lngMax  =Double.parseDouble(listbb.get(3).toString());
        
        double latDiff = latMax - latMin;
        double lngDiff = lngMax - lngMin;

        double maxDiff = (lngDiff > latDiff) ? lngDiff : latDiff;
        if (maxDiff < 360 / Math.pow(2, 20)) {
            zoomLevel = 21;
        } else {
            zoomLevel = (int) (-1*( (Math.log(maxDiff)/Math.log(2)) - (Math.log(360)/Math.log(2))));
            if (zoomLevel < 1)
                zoomLevel = 1;

            }
        return zoomLevel;
    }

    private int calcularNPalabras(String buscar) {
        int num=1;
        for(Character c:buscar.toCharArray()){
            if(Character.isWhitespace(c)){
                num++;
            }
        }
        return num;
    }
    public String getsURL() {
        return sURL;
    }

    public void setsURL(String sURL) {
        this.sURL = sURL;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public int getnPalabras() {
        return nPalabras;
    }

    public void setnPalabras(int nPalabras) {
        this.nPalabras = nPalabras;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public String getBusqueda() {
        return busqueda;
    }
    
    
    
}

