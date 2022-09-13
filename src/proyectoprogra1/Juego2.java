package proyectoprogra1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego2 extends javax.swing.JFrame {

    long tiempo1;
    long tiempo2;
    String Ruta;

    public Juego2() {
        initComponents();
        jPanelRESULTADO.setVisible(false);
        jPanelAPROBADO.setVisible(false);
        jButtonANALIZAR.setEnabled(false);
        tiempo1 = System.currentTimeMillis();
        for (long i = 0; i <= 100000; i++) {
            continue;
        }
        String DatosUsuario;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\felix\\Documents\\DatosUsuario.txt"));
            DatosUsuario = bf.readLine();
            DatosUsuario.replaceAll("Etapa 1", "Etapa 2");
            PrintWriter writer = new PrintWriter("C:\\Users\\felix\\Documents\\DatosUsuario.txt", "UTF-8");
            writer.print(DatosUsuario);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelINTRO = new javax.swing.JPanel();
        jScrollPaneINTRO = new javax.swing.JScrollPane();
        jTextAreaINTRO = new javax.swing.JTextArea();
        jPanelRUTA = new javax.swing.JPanel();
        jLabelRUTA = new javax.swing.JLabel();
        jTextFieldRUTA = new javax.swing.JTextField();
        jButtonRUTA = new javax.swing.JButton();
        jPanelINSTRUCCIONES = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelANALIZAR = new javax.swing.JPanel();
        jButtonANALIZAR = new javax.swing.JButton();
        jPanelRESULTADO = new javax.swing.JPanel();
        jScrollPaneRESULTADO = new javax.swing.JScrollPane();
        jTextAreaRESULTADO = new javax.swing.JTextArea();
        jPanelAPROBADO = new javax.swing.JPanel();
        jLabelRESULTADO = new javax.swing.JLabel();
        jLabelPUNTAJE = new javax.swing.JLabel();
        jButtonAPROBADO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1061, 681));
        setMinimumSize(new java.awt.Dimension(1061, 681));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1061, 681));

        jPanelINTRO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etapa 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jTextAreaINTRO.setColumns(20);
        jTextAreaINTRO.setRows(5);
        jScrollPaneINTRO.setViewportView(jTextAreaINTRO);

        javax.swing.GroupLayout jPanelINTROLayout = new javax.swing.GroupLayout(jPanelINTRO);
        jPanelINTRO.setLayout(jPanelINTROLayout);
        jPanelINTROLayout.setHorizontalGroup(
            jPanelINTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneINTRO)
        );
        jPanelINTROLayout.setVerticalGroup(
            jPanelINTROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneINTRO)
        );

        jLabelRUTA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRUTA.setText("Especificar ruta:");

        jTextFieldRUTA.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRUTA.setText("Pegue la ruta de la ubicación del diccionario aquí...");
        jTextFieldRUTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRUTAActionPerformed(evt);
            }
        });

        jButtonRUTA.setText("Leer ruta");
        jButtonRUTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRUTAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRUTALayout = new javax.swing.GroupLayout(jPanelRUTA);
        jPanelRUTA.setLayout(jPanelRUTALayout);
        jPanelRUTALayout.setHorizontalGroup(
            jPanelRUTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRUTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRUTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRUTA, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRUTA)
                .addContainerGap())
        );
        jPanelRUTALayout.setVerticalGroup(
            jPanelRUTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRUTALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRUTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRUTA)
                    .addComponent(jTextFieldRUTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRUTA))
                .addContainerGap())
        );

        jPanelINSTRUCCIONES.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instrucciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanelINSTRUCCIONES.setMinimumSize(new java.awt.Dimension(443, 214));

        jLabel2.setText("En el espacio de la izquierda se puede digitar el problema como usted desee.");

        jLabel3.setText("Una vez que haya terminado de digitar el problema, presione el boton inferior que");

        jLabel4.setText("dice \"Analizar\".");

        jLabel5.setText("El programa localizará y le mostrará las palabras y frases clave en su texto.");

        jLabel6.setText("Si el programa no es capaz de encontrar palabras o frases clave, se le solicitará");

        jLabel7.setText("que sugiera nuevas palabras clave para ser registradas.");

        jLabel8.setText("Debe indicar la ubicación del diccionario en la sección de \"Especificar ruta\".");

        javax.swing.GroupLayout jPanelINSTRUCCIONESLayout = new javax.swing.GroupLayout(jPanelINSTRUCCIONES);
        jPanelINSTRUCCIONES.setLayout(jPanelINSTRUCCIONESLayout);
        jPanelINSTRUCCIONESLayout.setHorizontalGroup(
            jPanelINSTRUCCIONESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINSTRUCCIONESLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelINSTRUCCIONESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelINSTRUCCIONESLayout.setVerticalGroup(
            jPanelINSTRUCCIONESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelINSTRUCCIONESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jButtonANALIZAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonANALIZAR.setText("Analizar");
        jButtonANALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANALIZARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelANALIZARLayout = new javax.swing.GroupLayout(jPanelANALIZAR);
        jPanelANALIZAR.setLayout(jPanelANALIZARLayout);
        jPanelANALIZARLayout.setHorizontalGroup(
            jPanelANALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelANALIZARLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButtonANALIZAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelANALIZARLayout.setVerticalGroup(
            jPanelANALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelANALIZARLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonANALIZAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRESULTADO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextAreaRESULTADO.setColumns(20);
        jTextAreaRESULTADO.setRows(5);
        jScrollPaneRESULTADO.setViewportView(jTextAreaRESULTADO);

        javax.swing.GroupLayout jPanelRESULTADOLayout = new javax.swing.GroupLayout(jPanelRESULTADO);
        jPanelRESULTADO.setLayout(jPanelRESULTADOLayout);
        jPanelRESULTADOLayout.setHorizontalGroup(
            jPanelRESULTADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneRESULTADO)
        );
        jPanelRESULTADOLayout.setVerticalGroup(
            jPanelRESULTADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneRESULTADO, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        jPanelAPROBADO.setBackground(new java.awt.Color(102, 255, 0));
        jPanelAPROBADO.setForeground(new java.awt.Color(240, 240, 240));
        jPanelAPROBADO.setMaximumSize(new java.awt.Dimension(367, 60));
        jPanelAPROBADO.setMinimumSize(new java.awt.Dimension(367, 60));

        jLabelRESULTADO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRESULTADO.setText("¡Fase completada con éxito!");

        jLabelPUNTAJE.setText("Tiempo requerido y puntaje.");

        jButtonAPROBADO.setText("A Etapa 3");
        jButtonAPROBADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPROBADOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAPROBADOLayout = new javax.swing.GroupLayout(jPanelAPROBADO);
        jPanelAPROBADO.setLayout(jPanelAPROBADOLayout);
        jPanelAPROBADOLayout.setHorizontalGroup(
            jPanelAPROBADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAPROBADOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAPROBADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRESULTADO)
                    .addComponent(jLabelPUNTAJE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAPROBADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAPROBADOLayout.setVerticalGroup(
            jPanelAPROBADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAPROBADOLayout.createSequentialGroup()
                .addGroup(jPanelAPROBADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAPROBADOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAPROBADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAPROBADOLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelRESULTADO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPUNTAJE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelINTRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRUTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelINSTRUCCIONES, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelANALIZAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRESULTADO, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(jPanelAPROBADO, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanelINSTRUCCIONES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelANALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelRESULTADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelAPROBADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanelINTRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelRUTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRUTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRUTAActionPerformed
        if (jTextFieldRUTA.equals("Pegue la ruta de la ubicación del diccionario aquí..."));
        {
            jTextFieldRUTA.setText("");
        }
    }//GEN-LAST:event_jTextFieldRUTAActionPerformed

    private void jButtonRUTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRUTAActionPerformed
        try {
            Ruta = jTextFieldRUTA.getText();
            Ruta = Ruta + "\\PalabrasClave.txt";
            jButtonANALIZAR.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error leyendo el archivo: " + e);
        }
    }//GEN-LAST:event_jButtonRUTAActionPerformed

    private void jButtonANALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonANALIZARActionPerformed
        jPanelRESULTADO.setVisible(true);
        tiempo2 = System.currentTimeMillis();
        jLabelPUNTAJE.setText("Etapa 3 concluida en "
                + (((tiempo2 - tiempo1) / 36000000) + " horas, "
                + (((tiempo2 - tiempo1) / 60000) % 60) + " minutos y "
                + ((tiempo2 - tiempo1) / 1000) % 60) + " segundos.");
        jButtonANALIZAR.setText("Reintentar");
        String TextoUsuario, Palabra, Resultado;
        String Informacion;
        Resultado = "";
        int TotalPalabras;
        TextoUsuario = jTextAreaINTRO.getText().toLowerCase();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(Ruta));
            Informacion = bf.readLine();
            String[] Frases = Informacion.split(":; ");
            TotalPalabras = Frases.length;
            for (int n = 0; n < TotalPalabras; n = n + 3) {
                Palabra = Frases[n];
                if (TextoUsuario.contains(Palabra)) {
                    Resultado = Resultado + (Palabra + ": " + Frases[n + 2] + "\n\n");
                }
            }
            if (Resultado.equals("")) {
                jTextAreaRESULTADO.setText("No se encontraron palabras clave");
            } else {
                jTextAreaRESULTADO.setText(Resultado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error leyendo el archivo: " + e);
        }
        jPanelAPROBADO.setVisible(true);
    }//GEN-LAST:event_jButtonANALIZARActionPerformed

    private void jButtonAPROBADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPROBADOActionPerformed
        Juego3 juego3 = new Juego3();
        juego3.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAPROBADOActionPerformed

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
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonANALIZAR;
    private javax.swing.JButton jButtonAPROBADO;
    private javax.swing.JButton jButtonRUTA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPUNTAJE;
    private javax.swing.JLabel jLabelRESULTADO;
    private javax.swing.JLabel jLabelRUTA;
    private javax.swing.JPanel jPanelANALIZAR;
    private javax.swing.JPanel jPanelAPROBADO;
    private javax.swing.JPanel jPanelINSTRUCCIONES;
    private javax.swing.JPanel jPanelINTRO;
    private javax.swing.JPanel jPanelRESULTADO;
    private javax.swing.JPanel jPanelRUTA;
    private javax.swing.JScrollPane jScrollPaneINTRO;
    private javax.swing.JScrollPane jScrollPaneRESULTADO;
    private javax.swing.JTextArea jTextAreaINTRO;
    private javax.swing.JTextArea jTextAreaRESULTADO;
    private javax.swing.JTextField jTextFieldRUTA;
    // End of variables declaration//GEN-END:variables
}
