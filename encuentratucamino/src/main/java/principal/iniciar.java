/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import iniciosesion.InicioSesion;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class iniciar extends javax.swing.JFrame {


    private static JLabel et1; 
    /**
     * Creates new form iniciar
     */
    public iniciar() {
        
        et1 = new JLabel();
        Image img= new ImageIcon("imagenfondo2.jpg").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(798, 635, Image.SCALE_SMOOTH));
        et1.setIcon(img2);
        setContentPane(et1);
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Opciones_app = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        texto_panel4 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        texto_panel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        texto_panel2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        texto_panel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        jLabel1.setText("Encuentra tu camino");

        Opciones_app.setOpaque(false);
        Opciones_app.setLayout(new java.awt.CardLayout());

        panel4.setBackground(new java.awt.Color(248, 106, 106));
        panel4.setOpaque(false);

        texto_panel4.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        texto_panel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_panel4.setText("??Puedes ver rutas que contengan alguna de las ubicaciones mas votadas!");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(texto_panel4)
                .addGap(29, 29, 29))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(texto_panel4)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        Opciones_app.add(panel4, "card2");

        panel1.setBackground(new java.awt.Color(248, 106, 106));
        panel1.setOpaque(false);

        texto_panel1.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        texto_panel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_panel1.setText("??Inicia sesion para ver rutas!");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(texto_panel1)
                .addGap(217, 217, 217))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(texto_panel1)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        Opciones_app.add(panel1, "card2");

        panel2.setBackground(new java.awt.Color(204, 204, 255));
        panel2.setOpaque(false);

        texto_panel2.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        texto_panel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_panel2.setText("??Puedes ver rutas que comiencen por una ubicacion!");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(texto_panel2)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(texto_panel2)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        Opciones_app.add(panel2, "card2");

        panel3.setBackground(new java.awt.Color(204, 204, 255));
        panel3.setOpaque(false);

        texto_panel3.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        texto_panel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_panel3.setText("Puedes recomendar una ruta!");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(texto_panel3)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(texto_panel3)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        Opciones_app.add(panel3, "card2");

        jButton1.setBackground(new java.awt.Color(49, 205, 195));
        jButton1.setFont(new java.awt.Font("Ink Free", 0, 14)); // NOI18N
        jButton1.setText("Inicia Sesi??n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        siguiente.setBackground(new java.awt.Color(49, 205, 195));
        siguiente.setFont(new java.awt.Font("Ink Free", 0, 11)); // NOI18N
        siguiente.setText(">");
        siguiente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(102, 0, 255)));
        siguiente.setBorderPainted(false);
        siguiente.setFocusPainted(false);
        siguiente.setMaximumSize(new java.awt.Dimension(20, 25));
        siguiente.setMinimumSize(new java.awt.Dimension(20, 25));
        siguiente.setPreferredSize(new java.awt.Dimension(30, 30));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setBackground(new java.awt.Color(49, 205, 195));
        anterior.setFont(new java.awt.Font("Ink Free", 0, 11)); // NOI18N
        anterior.setText("<");
        anterior.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(102, 0, 255)));
        anterior.setBorderPainted(false);
        anterior.setFocusPainted(false);
        anterior.setMaximumSize(new java.awt.Dimension(20, 25));
        anterior.setMinimumSize(new java.awt.Dimension(20, 25));
        anterior.setPreferredSize(new java.awt.Dimension(30, 30));
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Opciones_app, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {anterior, siguiente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Opciones_app, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {anterior, siguiente});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        InicioSesion sesi??n = new InicioSesion();
        sesi??n.setVisible( true );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        CardLayout name = (CardLayout) Opciones_app.getLayout();
        name.next(Opciones_app);
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        CardLayout name = (CardLayout) Opciones_app.getLayout();
        name.previous(Opciones_app);
    }//GEN-LAST:event_anteriorActionPerformed

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
            java.util.logging.Logger.getLogger(iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciar().setVisible(true);
            }
        });
    }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Opciones_app;
    private javax.swing.JButton anterior;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel texto_panel1;
    private javax.swing.JLabel texto_panel2;
    private javax.swing.JLabel texto_panel3;
    private javax.swing.JLabel texto_panel4;
    // End of variables declaration//GEN-END:variables
}
