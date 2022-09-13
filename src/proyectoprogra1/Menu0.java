package proyectoprogra1;

import java.awt.*;
import java.io.PrintWriter;

public class Menu0 extends javax.swing.JFrame {

    int BarraProgreso = 0;

    public Menu0() {

        initComponents();
        setLocationRelativeTo(null);
        labelNOMBREreq.setText("*Requerido");
        labelUSUARIOreq.setText("*Requerido");
        labelCORREOreq.setText("*Requerido");
        labelCEDULAreq.setText("*Requerido");
        labelEDADreq.setText("*Requerido");
        buttonACEPTAR.setEnabled(false);
    }

    public void Validar() {
        if (textNOMBRE.getText().isBlank()) {
            labelNOMBREreq.setText("*Requerido");
            labelNOMBREreq.setForeground(Color.red);
        } else {
            labelNOMBREreq.setText("Correcto");
            labelNOMBREreq.setForeground(Color.green);
        }

        if (textUSUARIO.getText().isBlank()) {
            labelUSUARIOreq.setText("*Requerido");
            labelUSUARIOreq.setForeground(Color.red);
        } else if (textUSUARIO.getText().contains(" ")) {
            labelUSUARIOreq.setText("No se permiten espacios");
            labelUSUARIOreq.setForeground(Color.red);
        } else {
            labelUSUARIOreq.setText("Correcto");
            labelUSUARIOreq.setForeground(Color.green);
        }

        if (textCORREO.getText().isBlank()) {
            labelCORREOreq.setText("*Requerido");
            labelCORREOreq.setForeground(Color.red);
        } else if (!textCORREO.getText().contains("@") || !textCORREO.getText().contains(".")) {
            labelCORREOreq.setText("Correo inválido");
            labelCORREOreq.setForeground(Color.red);
        } else {
            labelCORREOreq.setText("Correcto");
            labelCORREOreq.setForeground(Color.green);
        }

        if (textCEDULA.getText().isBlank()) {
            labelCEDULAreq.setText("*Requerido");
            labelCEDULAreq.setForeground(Color.red);
        } else if (textCEDULA.getText().equals(" -    -    ")) {
            labelCEDULAreq.setText("*Requerido");
            labelCEDULAreq.setForeground(Color.red);
        } else if (textCEDULA.getText().contains(" ")) {
            labelCEDULAreq.setText("Se requieren 9 dígitos");
            labelCEDULAreq.setForeground(Color.red);
        } else {
            labelCEDULAreq.setText("Correcto");
            labelCEDULAreq.setForeground(Color.green);
        }

        if (textEDAD.getText().isBlank()) {
            labelEDADreq.setText("*Requerido");
            labelEDADreq.setForeground(Color.red);
        } else if (textEDAD.getText().equals("  ")) {
            labelEDADreq.setText("*Requerido");
            labelEDADreq.setForeground(Color.red);
        } else if (textEDAD.getText().contains(" ")) {
            labelEDADreq.setText("Se requieren 2 dígitos");
            labelEDADreq.setForeground(Color.red);
        } else {
            labelEDADreq.setText("Correcto");
            labelEDADreq.setForeground(Color.green);
        }

        if (textNOMBRE.getText().isBlank() || textUSUARIO.getText().isBlank()
                || textCORREO.getText().isBlank()
                || textCEDULA.getText().isBlank()
                || textEDAD.getText().isBlank()
                || labelUSUARIOreq.getText().equals("No se permiten espacios")
                || labelCORREOreq.getText().equals("Correo inválido")
                || labelCEDULAreq.getText().equals("Se requieren 9 dígitos")
                || labelCEDULAreq.getText().equals("*Requerido")
                || labelEDADreq.getText().equals("*Requerido")
                || labelEDADreq.getText().equals("Se requieren 2 dígitos")) {
            buttonACEPTAR.setEnabled(false);
        } else {
            buttonACEPTAR.setEnabled(true);
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        textNOMBRE = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        labelNOMBRE = new javax.swing.JLabel();
        labelUSUARIO = new javax.swing.JLabel();
        labelCORREO = new javax.swing.JLabel();
        labelCEDULA = new javax.swing.JLabel();
        textUSUARIO = new javax.swing.JFormattedTextField();
        labelEDAD = new javax.swing.JLabel();
        textCEDULA = new javax.swing.JFormattedTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        buttonACEPTAR = new javax.swing.JButton();
        labelUSUARIOcond = new javax.swing.JLabel();
        labelCORREOcond = new javax.swing.JLabel();
        labelNOMBREreq = new javax.swing.JLabel();
        labelUSUARIOreq = new javax.swing.JLabel();
        labelCEDULAreq = new javax.swing.JLabel();
        labelCORREOreq = new javax.swing.JLabel();
        labelEDADreq = new javax.swing.JLabel();
        textCORREO = new javax.swing.JFormattedTextField();
        textEDAD = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al programa del Proyecto de Programación 1");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText(" \n El siguiente programa es un analizador de lógica para ingenieros.\n\n El mismo se compone de 3 etapas que deberá ir completando, completar cada una es necesario para avanzar a la siguiente.\n\n Al inicio verá una interfaz de registro donde deberá introducir sus datos válidos para poder continuar. Si en algún momento\n desea no continuar con el programa usted recibirá su avance y tiempo utilizado en el programa por correo electrónico.");
        jScrollPane2.setViewportView(jTextArea2);

        textNOMBRE.setToolTipText("");
        textNOMBRE.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNOMBREActionPerformed(evt);
            }
        });
        textNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNOMBREKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Formulario de registro");

        labelNOMBRE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNOMBRE.setText("Nombre:");

        labelUSUARIO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelUSUARIO.setText("Usuario:");

        labelCORREO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCORREO.setText("Correo electrónico:");

        labelCEDULA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelCEDULA.setText("Número de cédula:");

        textUSUARIO.setToolTipText("");
        textUSUARIO.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUSUARIOActionPerformed(evt);
            }
        });
        textUSUARIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textUSUARIOKeyReleased(evt);
            }
        });

        labelEDAD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEDAD.setText("Edad:");

        try {
            textCEDULA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCEDULA.setToolTipText("");
        textCEDULA.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textCEDULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCEDULAActionPerformed(evt);
            }
        });
        textCEDULA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCEDULAKeyReleased(evt);
            }
        });

        buttonACEPTAR.setText("¡Comenzar prueba y activar temporizador!");
        buttonACEPTAR.setSelected(true);
        buttonACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonACEPTARActionPerformed(evt);
            }
        });

        labelUSUARIOcond.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        labelUSUARIOcond.setText("[Hasta 16 caracteres, no se aceptan espacios]");

        labelCORREOcond.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        labelCORREOcond.setText("[Introducir un correo válido]");

        labelNOMBREreq.setForeground(new java.awt.Color(255, 102, 102));

        labelUSUARIOreq.setForeground(new java.awt.Color(255, 102, 102));

        labelCEDULAreq.setForeground(new java.awt.Color(255, 102, 102));

        labelCORREOreq.setForeground(new java.awt.Color(255, 102, 102));

        labelEDADreq.setForeground(new java.awt.Color(255, 102, 102));

        textCORREO.setToolTipText("");
        textCORREO.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textCORREO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCORREOActionPerformed(evt);
            }
        });
        textCORREO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCORREOKeyReleased(evt);
            }
        });

        try {
            textEDAD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textEDAD.setToolTipText("");
        textEDAD.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        textEDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEDADActionPerformed(evt);
            }
        });
        textEDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textEDADKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelNOMBRE)
                                                    .addComponent(labelUSUARIO)
                                                    .addComponent(labelCORREO)
                                                    .addComponent(labelCEDULA)
                                                    .addComponent(labelEDAD))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(51, 51, 51)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(labelUSUARIOcond)
                                                            .addComponent(textNOMBRE)
                                                            .addComponent(labelCORREOcond)
                                                            .addComponent(textUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(textCEDULA)
                                                            .addComponent(textEDAD, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(textCORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNOMBREreq)
                                            .addComponent(labelUSUARIOreq)
                                            .addComponent(labelCORREOreq)
                                            .addComponent(labelCEDULAreq)
                                            .addComponent(labelEDADreq))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(buttonACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNOMBRE)
                    .addComponent(textNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNOMBREreq))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUSUARIO)
                    .addComponent(textUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUSUARIOreq))
                .addGap(1, 1, 1)
                .addComponent(labelUSUARIOcond)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCORREO)
                    .addComponent(labelCORREOreq)
                    .addComponent(textCORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(labelCORREOcond)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCEDULA)
                    .addComponent(textCEDULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCEDULAreq))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEDAD)
                    .addComponent(labelEDADreq)
                    .addComponent(textEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNOMBREActionPerformed

    private void buttonACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonACEPTARActionPerformed
        String Nombre, Usuario, Correo, Cedula, Edad, Ruta, Informacion;
        Nombre = textNOMBRE.getText();
        Usuario = textUSUARIO.getText();
        Correo = textCORREO.getText();
        Cedula = textCEDULA.getText();
        Edad = textEDAD.getText();
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\felix\\Documents\\proyecto.txt", "UTF-8");
            writer.print("Etapa 1 - ");
            writer.print(Nombre);
            writer.print(" - " + Usuario);
            writer.print(" - " + Correo);
            writer.print(" - " + Cedula);
            writer.print(" - " + Edad);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dispose();
        Juego1 juego = new Juego1();
        Temporizador tempo = new Temporizador();
//        SwingUtilities.invokeLater(() -> {
//            tempo.setVisible(true);
//        });
    }//GEN-LAST:event_buttonACEPTARActionPerformed

    private void textUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUSUARIOActionPerformed

    private void textNOMBREKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNOMBREKeyReleased
        Validar();
    }//GEN-LAST:event_textNOMBREKeyReleased

    private void textUSUARIOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUSUARIOKeyReleased
        Validar();
    }//GEN-LAST:event_textUSUARIOKeyReleased

    private void textCORREOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCORREOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCORREOActionPerformed

    private void textCORREOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCORREOKeyReleased
        Validar();
    }//GEN-LAST:event_textCORREOKeyReleased

    private void textCEDULAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCEDULAKeyReleased
        Validar();
    }//GEN-LAST:event_textCEDULAKeyReleased

    private void textCEDULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCEDULAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCEDULAActionPerformed

    private void textEDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEDADActionPerformed

    private void textEDADKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEDADKeyReleased
        Validar();
    }//GEN-LAST:event_textEDADKeyReleased

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
            java.util.logging.Logger.getLogger(Menu0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonACEPTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelCEDULA;
    private javax.swing.JLabel labelCEDULAreq;
    private javax.swing.JLabel labelCORREO;
    private javax.swing.JLabel labelCORREOcond;
    private javax.swing.JLabel labelCORREOreq;
    private javax.swing.JLabel labelEDAD;
    private javax.swing.JLabel labelEDADreq;
    private javax.swing.JLabel labelNOMBRE;
    private javax.swing.JLabel labelNOMBREreq;
    private javax.swing.JLabel labelUSUARIO;
    private javax.swing.JLabel labelUSUARIOcond;
    private javax.swing.JLabel labelUSUARIOreq;
    private javax.swing.JFormattedTextField textCEDULA;
    private javax.swing.JFormattedTextField textCORREO;
    private javax.swing.JFormattedTextField textEDAD;
    private javax.swing.JFormattedTextField textNOMBRE;
    private javax.swing.JFormattedTextField textUSUARIO;
    // End of variables declaration//GEN-END:variables
}
