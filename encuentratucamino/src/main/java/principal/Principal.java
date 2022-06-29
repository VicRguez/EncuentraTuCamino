/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Interfaces.panelRuta;
import Logica.Geocodificacion;
import Logica.Logica;
import Logica.Ruta;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.JMapViewerTree;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.LayerGroup;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    //componente para mostrar las rutas
    JMapViewerTree mapamostrarruta;
    //componente para mostrar la ruta creada
    JMapViewerTree mapacrearuta;
    Logica logica;
    Geocodificacion ciudadcreaRuta;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        mapamostrarruta = new JMapViewerTree("crea ruta");

        //añadir mapa al panel de buscar ruta
        mapamostrarruta.setBounds(0, 0, 460, 490);
        mapa_rutas.add(mapamostrarruta);
        //añadir mapa al panel de recomendar ruta
        mapacrearuta = new JMapViewerTree("Buscar rutas");
        mapacrearuta.setBounds(0, 0, 550, 500);
        panel_mapa.add(mapacrearuta);
        logica=new Logica();
        //añadir imagenes en la pagina principal
        Image img= new ImageIcon("recomendar.jpg").getImage();
        ImageIcon ic=new ImageIcon(img.getScaledInstance(300, 411, Image.SCALE_SMOOTH));
        jLabel1.setIcon(ic);
        jLabel1.setText("");
        Image img2= new ImageIcon("buscar.jpg").getImage();
        ImageIcon ic2=new ImageIcon(img2.getScaledInstance(300, 411, Image.SCALE_SMOOTH));
        jLabel2.setIcon(ic2);
        jLabel2.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incio = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recomendar = new javax.swing.JPanel();
        rutaTexto = new javax.swing.JLabel();
        nombre_ruta = new javax.swing.JTextField();
        busqueda = new javax.swing.JTextField();
        botonBucar = new javax.swing.JButton();
        listaRecomendar = new javax.swing.JScrollPane();
        listaubicaciones = new javax.swing.JPanel();
        anadeRuta = new javax.swing.JButton();
        textoCiudad = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        boton_ciudad = new javax.swing.JButton();
        textoLista = new javax.swing.JLabel();
        toPrincipal = new javax.swing.JButton();
        panel_mapa = new javax.swing.JPanel();
        buscar = new javax.swing.JPanel();
        textoListaRuta = new javax.swing.JLabel();
        listaRecomendarRuta = new javax.swing.JScrollPane();
        panelListaubicacionesRuta = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        textoCiudad1 = new javax.swing.JLabel();
        ciudad1 = new javax.swing.JTextField();
        boton_ciudad1 = new javax.swing.JButton();
        textoRutas = new javax.swing.JLabel();
        listaRutas = new javax.swing.JScrollPane();
        panelListaRuta = new javax.swing.JPanel();
        mapa_rutas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        incio.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Recomendar una ruta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar una ruta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("imagen 1");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("imagen 2");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout incioLayout = new javax.swing.GroupLayout(incio);
        incio.setLayout(incioLayout);
        incioLayout.setHorizontalGroup(
            incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incioLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(167, 167, 167))
            .addGroup(incioLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        incioLayout.setVerticalGroup(
            incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(75, 75, 75)
                .addGroup(incioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        getContentPane().add(incio, "inicio");

        recomendar.setBackground(new java.awt.Color(255, 255, 255));
        recomendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rutaTexto.setFont(new java.awt.Font("Ink Free", 0, 24)); // NOI18N
        rutaTexto.setText("Nombre de la ruta");
        recomendar.add(rutaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 39, -1, -1));

        nombre_ruta.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        recomendar.add(nombre_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 42, 333, 30));

        busqueda.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        recomendar.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 156, 440, -1));

        botonBucar.setBackground(new java.awt.Color(255, 255, 255));
        botonBucar.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        botonBucar.setText("Añadir sitio");
        botonBucar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBucarActionPerformed(evt);
            }
        });
        recomendar.add(botonBucar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 156, 80, -1));

        listaubicaciones.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                listaubicacionesComponentRemoved(evt);
            }
        });
        listaubicaciones.setLayout(new java.awt.GridLayout(0, 1));
        listaRecomendar.setViewportView(listaubicaciones);

        recomendar.add(listaRecomendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 271, 328));

        anadeRuta.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        anadeRuta.setText("Añadir ruta");
        anadeRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadeRutaActionPerformed(evt);
            }
        });
        recomendar.add(anadeRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 641, -1, -1));

        textoCiudad.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        textoCiudad.setText("Ciudad");
        recomendar.add(textoCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 90, -1, -1));

        ciudad.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        recomendar.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 91, 400, -1));

        boton_ciudad.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        boton_ciudad.setText("Buscar");
        boton_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ciudadActionPerformed(evt);
            }
        });
        recomendar.add(boton_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        textoLista.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        textoLista.setText("Lista de ubicaciones");
        recomendar.add(textoLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        toPrincipal.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        toPrincipal.setText("Atras");
        toPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toPrincipalActionPerformed(evt);
            }
        });
        recomendar.add(toPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 641, -1, -1));

        javax.swing.GroupLayout panel_mapaLayout = new javax.swing.GroupLayout(panel_mapa);
        panel_mapa.setLayout(panel_mapaLayout);
        panel_mapaLayout.setHorizontalGroup(
            panel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_mapaLayout.setVerticalGroup(
            panel_mapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        recomendar.add(panel_mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 540, 360));

        getContentPane().add(recomendar, "recomendar");

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setPreferredSize(new java.awt.Dimension(943, 695));
        buscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoListaRuta.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        textoListaRuta.setText("Lista de ubicaciones");
        buscar.add(textoListaRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        panelListaubicacionesRuta.setBackground(new java.awt.Color(255, 255, 255));
        panelListaubicacionesRuta.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                panelListaubicacionesRutaComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                panelListaubicacionesRutaComponentRemoved(evt);
            }
        });
        panelListaubicacionesRuta.setLayout(new java.awt.GridLayout(0, 1));
        listaRecomendarRuta.setViewportView(panelListaubicacionesRuta);

        buscar.add(listaRecomendarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 175, 204, 450));

        jButton3.setText("Ir a inicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        buscar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 644, -1, -1));

        textoCiudad1.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        textoCiudad1.setText("Ciudad");
        buscar.add(textoCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        ciudad1.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        buscar.add(ciudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 370, -1));

        boton_ciudad1.setBackground(new java.awt.Color(204, 204, 255));
        boton_ciudad1.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        boton_ciudad1.setText("Confirmar ciudad");
        boton_ciudad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ciudad1ActionPerformed(evt);
            }
        });
        buscar.add(boton_ciudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 130, -1));

        textoRutas.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        textoRutas.setText("Rutas");
        buscar.add(textoRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        panelListaRuta.setBackground(new java.awt.Color(255, 255, 255));
        panelListaRuta.setLayout(new java.awt.GridLayout(0, 1));
        listaRutas.setViewportView(panelListaRuta);

        buscar.add(listaRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 204, 450));

        javax.swing.GroupLayout mapa_rutasLayout = new javax.swing.GroupLayout(mapa_rutas);
        mapa_rutas.setLayout(mapa_rutasLayout);
        mapa_rutasLayout.setHorizontalGroup(
            mapa_rutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        mapa_rutasLayout.setVerticalGroup(
            mapa_rutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        buscar.add(mapa_rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 134, 460, 490));

        getContentPane().add(buscar, "buscar");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//estos eventos son para cambiar de un panel a otro
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout name = (CardLayout) getContentPane().getLayout();
        name.show(getContentPane(),"recomendar");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout name = (CardLayout) getContentPane().getLayout();
        name.show(getContentPane(),"buscar");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void toPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toPrincipalActionPerformed
        CardLayout name = (CardLayout) getContentPane().getLayout();
        name.show(getContentPane(),"inicio");
    }//GEN-LAST:event_toPrincipalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout name = (CardLayout) getContentPane().getLayout();
        name.show(getContentPane(),"inicio");
    }//GEN-LAST:event_jButton3ActionPerformed

    //buscar una ciudad en el mapa de crear una ruta
    private void boton_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ciudadActionPerformed
        ciudadcreaRuta= new Geocodificacion(ciudad.getText());
        
        Coordinate c=new Coordinate(ciudadcreaRuta.getLat(),ciudadcreaRuta.getLon());
        
        
        
        //cambiar la posicion
        map(mapacrearuta).setDisplayPosition(c, ciudadcreaRuta.getZoom());
    }//GEN-LAST:event_boton_ciudadActionPerformed

    //buscar una ciudad en el mapa de mostrar rutas
    private void boton_ciudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ciudad1ActionPerformed
        logica.mostrarRutas(panelListaRuta, ciudad1.getText(),panelListaubicacionesRuta);

        Geocodificacion g= new Geocodificacion(ciudad1.getText());
        
        Coordinate c=new Coordinate(g.getLat(),g.getLon());
               
        //cambiar la posicion
        map(mapamostrarruta).setDisplayPosition(c, g.getZoom());
        
        
    }//GEN-LAST:event_boton_ciudad1ActionPerformed

    //añadir puntos en el mapa de crear una ruta
    private void botonBucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBucarActionPerformed
        Geocodificacion g= new Geocodificacion(busqueda.getText());
        
        
        LayerGroup ubic = new LayerGroup("Ubicacion");
        Layer capas = ubic.addLayer("Ruta");
        MapMarker marcador = new MapMarkerDot(capas, busqueda.getText(),g.getLat(),g.getLon());
        map(mapacrearuta).addMapMarker(marcador);
        
        logica.anyadirubicacion(listaubicaciones,logica,g,ciudadcreaRuta.getBusqueda(), marcador);
        
        busqueda.setText("");
        
    }//GEN-LAST:event_botonBucarActionPerformed

    private void listaubicacionesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_listaubicacionesComponentRemoved
        map(mapacrearuta).removeAllMapMarkers();
        List<MapMarker> mm=logica.dameMarcadores();
        for(MapMarker m:mm){
            map(mapacrearuta).addMapMarker(m);
        }
    }//GEN-LAST:event_listaubicacionesComponentRemoved
//añade una ruta en la base de datos
    private void anadeRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadeRutaActionPerformed
        logica.anyadirRuta(nombre_ruta.getText());
        map(mapacrearuta).removeAllMapMarkers();
        busqueda.setText("");
        nombre_ruta.setText("");
        ciudad.setText("");
        listaubicaciones.removeAll();
        logica.setListaRuta(new ArrayList<>());
        logica.setRuta(new Ruta());
        
    }//GEN-LAST:event_anadeRutaActionPerformed
//muestra los puntos de una ruta
    private void panelListaubicacionesRutaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelListaubicacionesRutaComponentAdded
        map(mapamostrarruta).removeAllMapMarkers();
        List<MapMarker> mm=logica.dameMarcadoresRuta();
        for(MapMarker m:mm){
            map(mapamostrarruta).addMapMarker(m);
        }
    }//GEN-LAST:event_panelListaubicacionesRutaComponentAdded
//elimina los puntos de una ruta
    private void panelListaubicacionesRutaComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelListaubicacionesRutaComponentRemoved
        map(mapamostrarruta).removeAllMapMarkers();
    }//GEN-LAST:event_panelListaubicacionesRutaComponentRemoved
    private JMapViewer map(JMapViewerTree theMap) {
        return theMap.getViewer();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public Logica getLogica() {
        return logica;
    }

    public void setLogica(Logica logica) {
        this.logica = logica;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadeRuta;
    private javax.swing.JButton botonBucar;
    private javax.swing.JButton boton_ciudad;
    private javax.swing.JButton boton_ciudad1;
    private javax.swing.JPanel buscar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField ciudad1;
    private javax.swing.JPanel incio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane listaRecomendar;
    private javax.swing.JScrollPane listaRecomendarRuta;
    private javax.swing.JScrollPane listaRutas;
    private javax.swing.JPanel listaubicaciones;
    private javax.swing.JPanel mapa_rutas;
    private javax.swing.JTextField nombre_ruta;
    private javax.swing.JPanel panelListaRuta;
    private javax.swing.JPanel panelListaubicacionesRuta;
    private javax.swing.JPanel panel_mapa;
    private javax.swing.JPanel recomendar;
    private javax.swing.JLabel rutaTexto;
    private javax.swing.JLabel textoCiudad;
    private javax.swing.JLabel textoCiudad1;
    private javax.swing.JLabel textoLista;
    private javax.swing.JLabel textoListaRuta;
    private javax.swing.JLabel textoRutas;
    private javax.swing.JButton toPrincipal;
    // End of variables declaration//GEN-END:variables
}