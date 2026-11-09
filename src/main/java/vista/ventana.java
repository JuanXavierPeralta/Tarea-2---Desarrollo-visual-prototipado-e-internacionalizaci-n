package vista;

import controlador.logica_ventana;
import idiomas.Idioma;

public class ventana extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ventana.class.getName());
    // Componentes para internacionalización
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JLabel lblTituloApp;
    private javax.swing.JLabel lblIdioma;

    public ventana() {
        initComponents();

        TemaOscuro.aplicar(this);
        configurarNuevaDistribucion();

        // Crear selector de idioma
        configurarSelectorIdioma();

        AcabadoVisual.aplicar(this);

        setLocationRelativeTo(null);

        logica_ventana controlador = new logica_ventana(this);

        // Aplicar traducciones iniciales
        aplicarIdioma();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnl_contactos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_categoria = new javax.swing.JLabel();
        chb_favorito = new javax.swing.JCheckBox();
        cmb_categorias = new javax.swing.JComboBox<>();
        btn_modificar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        lbl_buscarpornombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_contactos = new javax.swing.JTable();
        prg_carga = new javax.swing.JProgressBar();
        txt_buscarcontactos = new javax.swing.JTextField();
        lbl_estadodecarga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_resumendecontactos = new javax.swing.JLabel();
        lbl_trabajo = new javax.swing.JLabel();
        lbl_totaldecontactos = new javax.swing.JLabel();
        lbl_familia = new javax.swing.JLabel();
        lbl_amigos = new javax.swing.JLabel();
        lbl_favoritos = new javax.swing.JLabel();
        lbl_totalnumero = new javax.swing.JLabel();
        lbl_familianumero = new javax.swing.JLabel();
        lbl_trabajonumero = new javax.swing.JLabel();
        lbl_amigosnumero = new javax.swing.JLabel();
        lbl_favoritosnumero = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTION DE CONTACTOS");

        lbl_nombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nombres.setText("NOMBRES");

        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_telefono.setText("TELEFONO");

        lbl_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_email.setText("EMAIL");

        lbl_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_categoria.setText("CATEGORIA");

        chb_favorito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chb_favorito.setText("CONTACTO FAVORITO");

        cmb_categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una categoria", "Familia", "Amigos", "Trabajo", " " }));
        cmb_categorias.addActionListener(this::cmb_categoriasActionPerformed);

        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(this::btn_modificarActionPerformed);

        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setText("AGREGAR");

        btn_exportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_exportar.setText("EXPORTAR CSV");

        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setText("ELIMINAR");

        lbl_buscarpornombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_buscarpornombre.setText("BUSCAR POR NOMBRE");

        tbl_contactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Telefono", "Email", "Categoria", "Favorito"
            }
        ));
        jScrollPane2.setViewportView(tbl_contactos);

        prg_carga.setPreferredSize(new java.awt.Dimension(102, 20));
        prg_carga.setStringPainted(true);

        txt_buscarcontactos.addActionListener(this::txt_buscarcontactosActionPerformed);

        lbl_estadodecarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_estadodecarga.setText("ESTADO DE CARGA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_email)
                                    .addComponent(lbl_nombres))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(lbl_categoria)
                                    .addGap(79, 79, 79))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(lbl_telefono))
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_favorito)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_buscarpornombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscarcontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btn_agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_exportar)))
                        .addGap(100, 100, 100))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_estadodecarga)
                .addGap(530, 530, 530))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(prg_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(lbl_categoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(chb_favorito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_exportar)
                    .addComponent(btn_agregar))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_buscarpornombre)
                    .addComponent(txt_buscarcontactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_estadodecarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prg_carga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnl_contactos.addTab("CONTACTOS", jPanel1);

        lbl_resumendecontactos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_resumendecontactos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_resumendecontactos.setText("RESUMEN DE CONTACTOS");

        lbl_trabajo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_trabajo.setText("Trabajo");

        lbl_totaldecontactos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_totaldecontactos.setText("Total de Contactos");

        lbl_familia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_familia.setText("Familia");

        lbl_amigos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_amigos.setText("Amigos");

        lbl_favoritos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_favoritos.setText("Favoritos");

        lbl_totalnumero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_totalnumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totalnumero.setText("0");
        lbl_totalnumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_familianumero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_familianumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_familianumero.setText("0");
        lbl_familianumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_trabajonumero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_trabajonumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_trabajonumero.setText("0");
        lbl_trabajonumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_amigosnumero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_amigosnumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_amigosnumero.setText("0");
        lbl_amigosnumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_favoritosnumero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_favoritosnumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_favoritosnumero.setText("0");
        lbl_favoritosnumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lbl_resumendecontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_totaldecontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(lbl_totalnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(lbl_favoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(lbl_favoritosnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_familia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(lbl_familianumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(lbl_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(lbl_trabajonumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lbl_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(lbl_amigosnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_resumendecontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_totaldecontactos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_totalnumero))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_favoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_favoritosnumero)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_familia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_familianumero)
                    .addComponent(lbl_trabajonumero)
                    .addComponent(lbl_amigosnumero))
                .addContainerGap())
        );

        pnl_contactos.addTab("ESTADISTICAS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_contactos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_contactos)
        );

        pnl_contactos.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txt_buscarcontactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarcontactosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarcontactosActionPerformed

    private void cmb_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_categoriasActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ventana().setVisible(true));
    }

    private void configurarSelectorIdioma() {

        // Encabezado principal
        javax.swing.JPanel encabezado = new javax.swing.JPanel(
                new java.awt.BorderLayout());

        encabezado.setBackground(TemaOscuro.PANEL);
        encabezado.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(12, 20, 12, 20));

        // Título de la aplicación
        lblTituloApp = new javax.swing.JLabel("Gestión de Contactos");
        lblTituloApp.setFont(
                new java.awt.Font("Consolas", java.awt.Font.BOLD, 18));
        lblTituloApp.setForeground(TemaOscuro.TEXTO);

        encabezado.add(lblTituloApp, java.awt.BorderLayout.WEST);

        // Panel del selector
        javax.swing.JPanel panelIdioma = new javax.swing.JPanel(
                new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        panelIdioma.setOpaque(false);

        lblIdioma = new javax.swing.JLabel("Idioma");
        lblIdioma.setForeground(TemaOscuro.SECUNDARIO);

        cmbIdioma = new javax.swing.JComboBox<>(
                new String[]{"Español", "English", "Deutsch"});

        cmbIdioma.setPreferredSize(new java.awt.Dimension(140, 32));

        panelIdioma.add(lblIdioma);
        panelIdioma.add(cmbIdioma);

        encabezado.add(panelIdioma, java.awt.BorderLayout.EAST);

        // Reorganizar el contenido principal
        java.awt.Container contenido = getContentPane();
        contenido.removeAll();
        contenido.setLayout(new java.awt.BorderLayout());

        contenido.add(encabezado, java.awt.BorderLayout.NORTH);
        contenido.add(pnl_contactos, java.awt.BorderLayout.CENTER);

        // Evento de cambio de idioma
        cmbIdioma.addActionListener(e -> {

            int seleccion = cmbIdioma.getSelectedIndex();

            String[] codigos = {"es", "en", "de"};

            Idioma.cambiarIdioma(codigos[seleccion]);

            aplicarIdioma();
        });

        contenido.revalidate();
        contenido.repaint();
    }

    private void aplicarIdioma() {

        // Ventana y encabezado
        setTitle(Idioma.obtener("app.titulo"));
        lblTituloApp.setText(Idioma.obtener("app.titulo"));
        lblIdioma.setText(Idioma.obtener("idioma"));

        // Pestañas
        pnl_contactos.setTitleAt(0, Idioma.obtener("tab.contactos"));
        pnl_contactos.setTitleAt(1, Idioma.obtener("tab.estadisticas"));

        // Formulario
        lbl_nombres.setText(Idioma.obtener("campo.nombre"));
        lbl_telefono.setText(Idioma.obtener("campo.telefono"));
        lbl_email.setText(Idioma.obtener("campo.email"));
        lbl_categoria.setText(Idioma.obtener("campo.categoria"));
        chb_favorito.setText(Idioma.obtener("campo.favorito"));

        // Búsqueda
        lbl_buscarpornombre.setText(Idioma.obtener("campo.buscar"));

        // Botones
        btn_agregar.setText(Idioma.obtener("btn.agregar"));
        btn_modificar.setText(Idioma.obtener("btn.modificar"));
        btn_eliminar.setText(Idioma.obtener("btn.eliminar"));
        btn_exportar.setText(Idioma.obtener("btn.exportar"));

        // Estadísticas
        lbl_resumendecontactos.setText(
                Idioma.obtener("seccion.resumen"));

        lbl_totaldecontactos.setText(
                Idioma.obtener("estadisticas.total"));

        lbl_familia.setText(Idioma.obtener("estadisticas.familia"));
        lbl_amigos.setText(Idioma.obtener("estadisticas.amigos"));
        lbl_trabajo.setText(Idioma.obtener("estadisticas.trabajo"));
        lbl_favoritos.setText(Idioma.obtener("estadisticas.favoritos"));

        // Estado
        lbl_estadodecarga.setText(Idioma.obtener("carga.estado"));

        // Encabezados de tabla (sin borrar sus registros)
        javax.swing.JTable tabla = tbl_contactos;

        String[] columnas = {
            "tabla.nombre",
            "tabla.telefono",
            "tabla.email",
            "tabla.categoria",
            "tabla.favorito"
        };

        for (int i = 0; i < columnas.length; i++) {
            tabla.getColumnModel().getColumn(i)
                    .setHeaderValue(Idioma.obtener(columnas[i]));
        }

        tabla.getTableHeader().repaint();

        revalidate();
        repaint();
    }

// DISTRIBUCIÓN SEGÚN LOS MOCKUPS DE FIGMA (fuera de initComponents)
    private void configurarNuevaDistribucion() {
        configurarContactos();
        configurarEstadisticas();
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setSize(1180, 740);
    }

    private void configurarContactos() {
        // Retiramos los componentes del GroupLayout original, sin destruirlos.
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout(0, 16));
        jPanel1.setBackground(TemaOscuro.FONDO);
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(18, 18, 14, 18));

        // COLUMNA IZQUIERDA: formulario.
        javax.swing.JPanel datos = new javax.swing.JPanel();
        datos.setLayout(new javax.swing.BoxLayout(datos, javax.swing.BoxLayout.Y_AXIS));
        datos.setOpaque(false);
        javax.swing.JLabel tituloDatos = titulo("Datos del Contacto");
        tituloDatos.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        datos.add(tituloDatos);
        datos.add(javax.swing.Box.createVerticalStrut(18));

        javax.swing.JPanel nombre = campo(lbl_nombres, txt_nombres);
        javax.swing.JPanel telefono = campo(lbl_telefono, txt_telefono);
        javax.swing.JPanel email = campo(lbl_email, txt_email);
        javax.swing.JPanel categoria = campo(lbl_categoria, cmb_categorias);
        for (javax.swing.JPanel item : new javax.swing.JPanel[]{nombre, telefono, email, categoria}) {
            item.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            datos.add(item);
            datos.add(javax.swing.Box.createVerticalStrut(11));
        }
        chb_favorito.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        datos.add(chb_favorito);

        javax.swing.JPanel acciones = new javax.swing.JPanel(new java.awt.GridLayout(1, 4, 6, 0));
        acciones.setOpaque(false);
        for (javax.swing.JButton boton : new javax.swing.JButton[]{
            btn_agregar, btn_modificar, btn_eliminar, btn_exportar}) {
            boton.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 11));
            boton.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 4, 10, 4));
            acciones.add(boton);
        }

        javax.swing.JPanel izquierda = new javax.swing.JPanel(new java.awt.BorderLayout(0, 18));
        izquierda.setBackground(TemaOscuro.PANEL);
        izquierda.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createLineBorder(TemaOscuro.BORDE),
                javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14)));
        izquierda.add(datos, java.awt.BorderLayout.NORTH);
        izquierda.add(acciones, java.awt.BorderLayout.SOUTH);

        // COLUMNA DERECHA: búsqueda y tabla.
        javax.swing.JPanel cabeceraLista = new javax.swing.JPanel();
        cabeceraLista.setLayout(new javax.swing.BoxLayout(cabeceraLista, javax.swing.BoxLayout.Y_AXIS));
        cabeceraLista.setOpaque(false);
        javax.swing.JLabel tituloLista = titulo("Lista de Contactos");
        tituloLista.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        cabeceraLista.add(tituloLista);
        cabeceraLista.add(javax.swing.Box.createVerticalStrut(18));
        lbl_buscarpornombre.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        cabeceraLista.add(lbl_buscarpornombre);
        cabeceraLista.add(javax.swing.Box.createVerticalStrut(6));
        txt_buscarcontactos.setPreferredSize(new java.awt.Dimension(100, 34));
        txt_buscarcontactos.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 34));
        txt_buscarcontactos.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        cabeceraLista.add(txt_buscarcontactos);

        tbl_contactos.setRowHeight(30);
        tbl_contactos.setShowHorizontalLines(true);
        tbl_contactos.setShowVerticalLines(true);
        tbl_contactos.setGridColor(new java.awt.Color(0x39434E));
        tbl_contactos.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 34));
        tbl_contactos.getTableHeader().setDefaultRenderer(
                new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(
                    javax.swing.JTable tabla, Object valor, boolean seleccionado,
                    boolean foco, int fila, int columna) {
                super.getTableCellRendererComponent(tabla, valor, seleccionado, foco, fila, columna);
                setOpaque(true);
                setBackground(TemaOscuro.CAMPO);
                setForeground(TemaOscuro.TEXTO);
                setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 12));
                setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                setBorder(javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, TemaOscuro.BORDE),
                        javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 5)));
                return this;
            }
        });

        javax.swing.JPanel derecha = new javax.swing.JPanel(new java.awt.BorderLayout(0, 12));
        derecha.setBackground(TemaOscuro.FONDO);
        derecha.add(cabeceraLista, java.awt.BorderLayout.NORTH);
        derecha.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        // Ambas columnas comparten el espacio en proporción aproximada 35/65.
        javax.swing.JPanel principal = new javax.swing.JPanel(new java.awt.GridBagLayout());
        principal.setOpaque(false);
        java.awt.GridBagConstraints g = new java.awt.GridBagConstraints();
        g.gridy = 0;
        g.fill = java.awt.GridBagConstraints.BOTH;
        g.weighty = 1;
        g.gridx = 0;
        g.weightx = 0.36;
        g.insets = new java.awt.Insets(0, 0, 0, 16);
        principal.add(izquierda, g);
        g.gridx = 1;
        g.weightx = 0.64;
        g.insets = new java.awt.Insets(0, 0, 0, 0);
        principal.add(derecha, g);

        // Barra inferior: reutilizamos los componentes controlados por SwingWorker.
        javax.swing.JPanel pie = new javax.swing.JPanel(new java.awt.FlowLayout(
                java.awt.FlowLayout.LEFT, 12, 0));
        pie.setBackground(TemaOscuro.PANEL);
        pie.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 8, 12, 8));
        prg_carga.setUI(new javax.swing.plaf.basic.BasicProgressBarUI());
        prg_carga.setBackground(TemaOscuro.CAMPO);
        prg_carga.setForeground(TemaOscuro.AZUL);
        prg_carga.setPreferredSize(new java.awt.Dimension(320, 22));
        prg_carga.setStringPainted(true);
        lbl_estadodecarga.setText("Estado de carga");
        pie.add(prg_carga);
        pie.add(lbl_estadodecarga);

        jPanel1.add(principal, java.awt.BorderLayout.CENTER);
        jPanel1.add(pie, java.awt.BorderLayout.SOUTH);
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private javax.swing.JPanel campo(javax.swing.JLabel etiqueta,
            javax.swing.JComponent entrada) {
        javax.swing.JPanel bloque = new javax.swing.JPanel(new java.awt.BorderLayout(0, 6));
        bloque.setOpaque(false);
        entrada.setPreferredSize(new java.awt.Dimension(100, 34));
        bloque.add(etiqueta, java.awt.BorderLayout.NORTH);
        bloque.add(entrada, java.awt.BorderLayout.CENTER);
        bloque.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 62));
        return bloque;
    }

    private javax.swing.JLabel titulo(String texto) {
        javax.swing.JLabel etiqueta = new javax.swing.JLabel(texto);
        etiqueta.setForeground(TemaOscuro.TEXTO);
        etiqueta.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 15));
        return etiqueta;
    }

    private void configurarEstadisticas() {
        jPanel2.removeAll();
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.setBackground(TemaOscuro.FONDO);
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(24, 24, 24, 24));

        lbl_resumendecontactos.setText("Resumen de Contactos");
        lbl_resumendecontactos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_resumendecontactos.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 20));
        lbl_resumendecontactos.setForeground(TemaOscuro.TEXTO);

        javax.swing.JPanel tarjetas = new javax.swing.JPanel(new java.awt.GridBagLayout());
        tarjetas.setOpaque(false);
        java.awt.GridBagConstraints g = new java.awt.GridBagConstraints();
        g.fill = java.awt.GridBagConstraints.HORIZONTAL;
        g.weightx = 0.5;
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 2;
        g.insets = new java.awt.Insets(0, 0, 16, 0);
        tarjetas.add(tarjeta(lbl_totaldecontactos, lbl_totalnumero), g);

        g.gridwidth = 1;
        g.gridy = 1;
        g.gridx = 0;
        g.insets = new java.awt.Insets(0, 0, 16, 8);
        tarjetas.add(tarjeta(lbl_familia, lbl_familianumero), g);
        g.gridx = 1;
        g.insets = new java.awt.Insets(0, 8, 16, 0);
        tarjetas.add(tarjeta(lbl_amigos, lbl_amigosnumero), g);

        g.gridy = 2;
        g.gridx = 0;
        g.insets = new java.awt.Insets(0, 0, 0, 8);
        tarjetas.add(tarjeta(lbl_trabajo, lbl_trabajonumero), g);
        g.gridx = 1;
        g.insets = new java.awt.Insets(0, 8, 0, 0);
        tarjetas.add(tarjeta(lbl_favoritos, lbl_favoritosnumero), g);

        javax.swing.JPanel contenido = new javax.swing.JPanel(new java.awt.BorderLayout(0, 18));
        contenido.setOpaque(false);
        contenido.add(lbl_resumendecontactos, java.awt.BorderLayout.NORTH);
        contenido.add(tarjetas, java.awt.BorderLayout.CENTER);

        // La cuadrícula ocupa la parte superior; no estiramos las tarjetas verticalmente.
        jPanel2.add(contenido, java.awt.BorderLayout.NORTH);
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    private javax.swing.JPanel tarjeta(javax.swing.JLabel titulo, javax.swing.JLabel valor) {
        javax.swing.JPanel tarjeta = new javax.swing.JPanel();
        tarjeta.setLayout(new javax.swing.BoxLayout(tarjeta, javax.swing.BoxLayout.Y_AXIS));
        tarjeta.setBackground(TemaOscuro.PANEL);
        tarjeta.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createLineBorder(TemaOscuro.BORDE),
                javax.swing.BorderFactory.createEmptyBorder(18, 18, 18, 18)));
        tarjeta.setPreferredSize(new java.awt.Dimension(260, 112));

        titulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        titulo.setForeground(TemaOscuro.SECUNDARIO);
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        valor.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 30));
        valor.setForeground(TemaOscuro.TEXTO);
        valor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        valor.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
        valor.setBorder(null);

        tarjeta.add(titulo);
        tarjeta.add(javax.swing.Box.createVerticalStrut(8));
        tarjeta.add(valor);
        return tarjeta;
    }

    // Métodos para acceder a los componentes desde el controlador
    public javax.swing.JButton getBtnAgregar() {
        return btn_agregar;
    }

    public javax.swing.JButton getBtnModificar() {
        return btn_modificar;
    }

    public javax.swing.JButton getBtnEliminar() {
        return btn_eliminar;
    }

    public javax.swing.JButton getBtnExportar() {
        return btn_exportar;
    }

    public javax.swing.JTextField getTxtNombres() {
        return txt_nombres;
    }

    public javax.swing.JTextField getTxtTelefono() {
        return txt_telefono;
    }

    public javax.swing.JTextField getTxtEmail() {
        return txt_email;
    }

    public javax.swing.JTextField getTxtBuscarContactos() {
        return txt_buscarcontactos;
    }

    public javax.swing.JComboBox<String> getCmbCategorias() {
        return cmb_categorias;
    }

    public javax.swing.JCheckBox getChbFavorito() {
        return chb_favorito;
    }

    public javax.swing.JTable getTblContactos() {
        return tbl_contactos;
    }

    public javax.swing.JLabel getLblTotalNumero() {
        return lbl_totalnumero;
    }

    public javax.swing.JLabel getLblFamiliaNumero() {
        return lbl_familianumero;
    }

    public javax.swing.JLabel getLblTrabajoNumero() {
        return lbl_trabajonumero;
    }

    public javax.swing.JLabel getLblAmigosNumero() {
        return lbl_amigosnumero;
    }

    public javax.swing.JLabel getLblFavoritosNumero() {
        return lbl_favoritosnumero;
    }

    // Obtener la barra de progreso
    public javax.swing.JProgressBar getPrgCarga() {
        return prg_carga;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JCheckBox chb_favorito;
    private javax.swing.JComboBox<String> cmb_categorias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_amigos;
    private javax.swing.JLabel lbl_amigosnumero;
    private javax.swing.JLabel lbl_buscarpornombre;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_estadodecarga;
    private javax.swing.JLabel lbl_familia;
    private javax.swing.JLabel lbl_familianumero;
    private javax.swing.JLabel lbl_favoritos;
    private javax.swing.JLabel lbl_favoritosnumero;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_resumendecontactos;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_totaldecontactos;
    private javax.swing.JLabel lbl_totalnumero;
    private javax.swing.JLabel lbl_trabajo;
    private javax.swing.JLabel lbl_trabajonumero;
    private javax.swing.JTabbedPane pnl_contactos;
    private javax.swing.JProgressBar prg_carga;
    private javax.swing.JTable tbl_contactos;
    private javax.swing.JTextField txt_buscarcontactos;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
