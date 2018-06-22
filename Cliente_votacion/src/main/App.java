package main;

import java.awt.Image;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Cuenta;
import model.Data;
import model.GenerarPass;
import model.Nacionalidad;
import model.Pais;
import model.Persona;
import model.PersonaSelect;
import model.Voto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class App extends javax.swing.JFrame {

    private Data data;
    private GenerarPass genPass;
    private List<Cuenta> listCuenta;
    private int privilegio = 0; //para ver el privilegio de la persona logeada
    private boolean sufrago = false; // para conocer si la persona voto

    public App() {
        initComponents();
        data = new Data();

        ImageIcon icon = new ImageIcon("src/images/servel.jpg");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(pnlLogoServel.getWidth(), pnlLogoServel.getHeight(), Image.SCALE_DEFAULT));

        pnlLogoServel.setIcon(icono);

        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfMenuAdmin = new javax.swing.JFrame();
        pnlAdmin = new javax.swing.JPanel();
        menAdmin = new javax.swing.JMenuBar();
        mePersona = new javax.swing.JMenu();
        miAddVotante = new javax.swing.JMenuItem();
        miChangeAdress = new javax.swing.JMenuItem();
        meCandidato = new javax.swing.JMenu();
        miAddCandidatura = new javax.swing.JMenuItem();
        meVotacion = new javax.swing.JMenu();
        miAddPartido = new javax.swing.JMenuItem();
        miEmitirVoto = new javax.swing.JMenuItem();
        miResult = new javax.swing.JMenuItem();
        meSalir = new javax.swing.JMenu();
        miCerrarSesion = new javax.swing.JMenuItem();
        jfMenuUserComun = new javax.swing.JFrame();
        pnlVotante = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        meVotacionVo = new javax.swing.JMenu();
        miVotarVo = new javax.swing.JMenuItem();
        miResultVo = new javax.swing.JMenuItem();
        meSalirVo = new javax.swing.JMenu();
        miCerrarSesionVo = new javax.swing.JMenuItem();
        jfIncribirPersona = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAddRun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddNombre = new javax.swing.JTextField();
        txtAddApellido = new javax.swing.JTextField();
        txtAddDireccion = new javax.swing.JTextField();
        txtAddEdad = new javax.swing.JTextField();
        cboPaisResidencia = new javax.swing.JComboBox();
        cboNacionalidad = new javax.swing.JComboBox();
        btnContinuarAdd = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        lblPassGenerada = new javax.swing.JLabel();
        btnAddVotante = new javax.swing.JButton();
        jfUpdateDireccion = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtActRun = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtActNombre = new javax.swing.JTextField();
        txtActApellido = new javax.swing.JTextField();
        txtActDireccion = new javax.swing.JTextField();
        txtActEdad = new javax.swing.JTextField();
        cboActPaisResidencia = new javax.swing.JComboBox<>();
        cboActNacionalidad = new javax.swing.JComboBox<>();
        btnAddVotante1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtBuscarPersonaUp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuscarPersonaCandidatoUp = new javax.swing.JTable();
        jfAddCandidatura = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarPersona = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuscarPersonaCandidato = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtRutCand = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNombreCand = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtApellidoCand = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDireccionCand = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cboPartidoCand = new javax.swing.JComboBox<>();
        btnAddCandidatura = new javax.swing.JButton();
        jfInscribirPartido = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombrePartido = new javax.swing.JTextField();
        txtAnioFundacionPartido = new javax.swing.JTextField();
        btnInscribirPartido = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRunIniciar = new javax.swing.JTextField();
        txtPassInicio = new javax.swing.JPasswordField();
        pnlLogoServel = new javax.swing.JLabel();

        pnlAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador"));

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        mePersona.setText("Persona");

        miAddVotante.setText("Inscribir Votante");
        miAddVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddVotanteActionPerformed(evt);
            }
        });
        mePersona.add(miAddVotante);

        miChangeAdress.setText("Cambiar Dirección");
        mePersona.add(miChangeAdress);

        menAdmin.add(mePersona);

        meCandidato.setText("Candidato");

        miAddCandidatura.setText("Inscribir Candidatura");
        meCandidato.add(miAddCandidatura);

        menAdmin.add(meCandidato);

        meVotacion.setText("Votación");

        miAddPartido.setText("Inscribir Partido");
        meVotacion.add(miAddPartido);

        miEmitirVoto.setText("Votar");
        meVotacion.add(miEmitirVoto);

        miResult.setText("Resultados");
        meVotacion.add(miResult);

        menAdmin.add(meVotacion);

        meSalir.setText("Salir");

        miCerrarSesion.setText("Cerrar Sesion");
        miCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCerrarSesionActionPerformed(evt);
            }
        });
        meSalir.add(miCerrarSesion);

        menAdmin.add(meSalir);

        jfMenuAdmin.setJMenuBar(menAdmin);

        javax.swing.GroupLayout jfMenuAdminLayout = new javax.swing.GroupLayout(jfMenuAdmin.getContentPane());
        jfMenuAdmin.getContentPane().setLayout(jfMenuAdminLayout);
        jfMenuAdminLayout.setHorizontalGroup(
            jfMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfMenuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jfMenuAdminLayout.setVerticalGroup(
            jfMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfMenuAdminLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(pnlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlVotante.setBorder(javax.swing.BorderFactory.createTitledBorder("Votante"));

        javax.swing.GroupLayout pnlVotanteLayout = new javax.swing.GroupLayout(pnlVotante);
        pnlVotante.setLayout(pnlVotanteLayout);
        pnlVotanteLayout.setHorizontalGroup(
            pnlVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        pnlVotanteLayout.setVerticalGroup(
            pnlVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        meVotacionVo.setText("Votación");

        miVotarVo.setText("Votar");
        meVotacionVo.add(miVotarVo);

        miResultVo.setText("Resultados");
        meVotacionVo.add(miResultVo);

        jMenuBar1.add(meVotacionVo);

        meSalirVo.setText("Salir");

        miCerrarSesionVo.setText("Cerrar Sesion");
        miCerrarSesionVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCerrarSesionVoActionPerformed(evt);
            }
        });
        meSalirVo.add(miCerrarSesionVo);

        jMenuBar1.add(meSalirVo);

        jfMenuUserComun.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jfMenuUserComunLayout = new javax.swing.GroupLayout(jfMenuUserComun.getContentPane());
        jfMenuUserComun.getContentPane().setLayout(jfMenuUserComunLayout);
        jfMenuUserComunLayout.setHorizontalGroup(
            jfMenuUserComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfMenuUserComunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlVotante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jfMenuUserComunLayout.setVerticalGroup(
            jfMenuUserComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfMenuUserComunLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(pnlVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Votante"));

        jLabel2.setText("R.U.N :");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Apellido :");

        jLabel5.setText("Direccion :");

        jLabel6.setText("Edad :");

        jLabel7.setText("Pais Residencia :");

        jLabel8.setText("Nacionalidad :");

        btnContinuarAdd.setText("Continuar");
        btnContinuarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddDireccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddRun, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(txtAddEdad)))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContinuarAdd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboPaisResidencia, 0, 121, Short.MAX_VALUE)
                                .addComponent(cboNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAddRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboPaisResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnContinuarAdd)
                .addGap(22, 22, 22))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta"));

        jLabel23.setText("Contraseña Para Inciar Sesion");

        lblPassGenerada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAddVotante.setText("Registrar Votante");
        btnAddVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVotanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblPassGenerada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddVotante)
                .addGap(42, 42, 42))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel23)
                .addGap(45, 45, 45)
                .addComponent(lblPassGenerada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnAddVotante)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jfIncribirPersonaLayout = new javax.swing.GroupLayout(jfIncribirPersona.getContentPane());
        jfIncribirPersona.getContentPane().setLayout(jfIncribirPersonaLayout);
        jfIncribirPersonaLayout.setHorizontalGroup(
            jfIncribirPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfIncribirPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jfIncribirPersonaLayout.setVerticalGroup(
            jfIncribirPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfIncribirPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfIncribirPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jfIncribirPersonaLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Update"));

        jLabel9.setText("R.U.N :");

        jLabel10.setText("Nombre :");

        jLabel11.setText("Apellido :");

        jLabel12.setText("Direccion :");

        jLabel13.setText("Edad :");

        jLabel14.setText("Pais Residencia :");

        jLabel15.setText("Nacionalidad :");

        btnAddVotante1.setText("Actualizar Votante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtActRun, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtActNombre))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtActApellido))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtActDireccion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtActEdad))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboActPaisResidencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboActNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnAddVotante1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtActRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtActNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtActApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtActDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtActEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cboActPaisResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboActNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddVotante1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Persona"));

        tblBuscarPersonaCandidatoUp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblBuscarPersonaCandidatoUp);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPersonaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarPersonaUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jfUpdateDireccionLayout = new javax.swing.GroupLayout(jfUpdateDireccion.getContentPane());
        jfUpdateDireccion.getContentPane().setLayout(jfUpdateDireccionLayout);
        jfUpdateDireccionLayout.setHorizontalGroup(
            jfUpdateDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfUpdateDireccionLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jfUpdateDireccionLayout.setVerticalGroup(
            jfUpdateDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfUpdateDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfUpdateDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jfUpdateDireccionLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Persona"));

        tblBuscarPersonaCandidato.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBuscarPersonaCandidato);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Candidato"));

        jLabel16.setText("R.U.N : ");

        jLabel17.setText("Nombre :");

        jLabel18.setText("Apellido :");

        jLabel19.setText("Direccion :");

        jLabel20.setText("Partido :");

        btnAddCandidatura.setText("Inscribir Candidatura");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRutCand)
                            .addComponent(txtNombreCand)
                            .addComponent(txtApellidoCand, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionCand)
                            .addComponent(cboPartidoCand, 0, 130, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(btnAddCandidatura)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtRutCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNombreCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtApellidoCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtDireccionCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cboPartidoCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnAddCandidatura)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jfAddCandidaturaLayout = new javax.swing.GroupLayout(jfAddCandidatura.getContentPane());
        jfAddCandidatura.getContentPane().setLayout(jfAddCandidaturaLayout);
        jfAddCandidaturaLayout.setHorizontalGroup(
            jfAddCandidaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfAddCandidaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jfAddCandidaturaLayout.setVerticalGroup(
            jfAddCandidaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfAddCandidaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfAddCandidaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Partido"));

        jLabel21.setText("Nombre Partido :");

        jLabel22.setText("Año Fundacion :");

        btnInscribirPartido.setText("Inscribir Partido");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnioFundacionPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnInscribirPartido)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtAnioFundacionPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnInscribirPartido)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jfInscribirPartidoLayout = new javax.swing.GroupLayout(jfInscribirPartido.getContentPane());
        jfInscribirPartido.getContentPane().setLayout(jfInscribirPartidoLayout);
        jfInscribirPartidoLayout.setHorizontalGroup(
            jfInscribirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfInscribirPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jfInscribirPartidoLayout.setVerticalGroup(
            jfInscribirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfInscribirPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        lbl1.setText("R.U.N : ");

        jLabel1.setText("Contraseña :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(txtRunIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion)
                        .addGap(78, 78, 78)))
                .addComponent(pnlLogoServel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlLogoServel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1)
                            .addComponent(txtRunIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPassInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btnIniciarSesion)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String rut, clave;
        rut = txtRunIniciar.getText();
        clave = txtPassInicio.getText();

        listCuenta = data.getListaCuentas();

        for (Cuenta c : listCuenta) {
            if (c.getRutPersona_fk().equalsIgnoreCase(rut) && c.getPass().equalsIgnoreCase(clave)) {
                privilegio = c.getPrivilegio_fk();
            }
        }

        if (privilegio == 1) {
            txtRunIniciar.setText("");
            txtPassInicio.setText("");

            this.setVisible(false);
            jfMenuAdmin.setVisible(true);
            jfMenuAdmin.setLocationRelativeTo(null);

            JOptionPane.showMessageDialog(this, "Bienvenido Administrador");

        } else if (privilegio == 2) {
            txtRunIniciar.setText("");
            txtPassInicio.setText("");

            this.setVisible(false);
            jfMenuUserComun.setVisible(true);
            jfMenuUserComun.setLocationRelativeTo(null);

            JOptionPane.showMessageDialog(this, "Bienvenido Votante");

        } else {
            JOptionPane.showMessageDialog(this, "Error Al Iniciar Sesión");
            txtRunIniciar.setText("");
            txtPassInicio.setText("");
        }

        /* para ver si ya voto el usuario logeado */
        sufrago = EstadoVoto(rut);

        if (privilegio == 1 && sufrago) {
            miEmitirVoto.setEnabled(false);
        }

        if (privilegio == 2 && sufrago) {
            miVotarVo.setEnabled(false);
        }


    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void miCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarSesionActionPerformed
        jfMenuAdmin.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_miCerrarSesionActionPerformed

    private void miCerrarSesionVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarSesionVoActionPerformed
        jfMenuUserComun.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_miCerrarSesionVoActionPerformed

    private void miAddVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddVotanteActionPerformed
        jfIncribirPersona.setVisible(true);
        jfIncribirPersona.setLocationRelativeTo(null);
    }//GEN-LAST:event_miAddVotanteActionPerformed

    private void btnContinuarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarAddActionPerformed
        // generamos una contraseña para la cuenta de la persona recien registrada
        String passGenerada = genPass.generarPass(genPass.MINUSCULAS + genPass.MAYUSCULAS + genPass.ESPECIALES, 12);

        Pais pa;
        Nacionalidad na;

        pa = (Pais) cboPaisResidencia.getSelectedItem();
        na = (Nacionalidad) cboNacionalidad.getSelectedItem();

        String rut = txtAddRun.getText();
        String nombre = txtAddNombre.getText();
        String apellido = txtAddApellido.getText();
        String direccion = txtAddDireccion.getText();
        int edad = Integer.parseInt(txtAddEdad.getText());
        int paisID = pa.getId();
        int nacionalidadID = na.getId();

        if (verificarRut(rut) == false) {
            JOptionPane.showMessageDialog(this, "El RUT (" + rut + ") Ya Existe");

            txtAddRun.setText("");
            txtAddNombre.setText("");
            txtAddApellido.setText("");
            txtAddDireccion.setText("");
            txtAddEdad.setText("");
            cboNacionalidad.setSelectedIndex(1);
            cboPaisResidencia.setSelectedIndex(1);
        } else {
            Persona persona = new Persona(rut, nombre, apellido, direccion, edad, paisID, nacionalidadID);
//        data.registrarPersona(persona);

            lblPassGenerada.setText(passGenerada);
            btnAddVotante.setEnabled(true);
            
            txtAddRun.setEditable(false);
            txtAddNombre.setEditable(false);
            txtAddApellido.setEditable(false);
            txtAddDireccion.setEditable(false);
            txtAddEdad.setEditable(false);
            cboNacionalidad.setEnabled(false);
            cboPaisResidencia.setEnabled(false);
            
            btnContinuarAdd.setEnabled(false);
        }


    }//GEN-LAST:event_btnContinuarAddActionPerformed

    private void btnAddVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVotanteActionPerformed
        String rutCuenta = txtAddRun.getText();
        String passNueva = lblPassGenerada.getText();
        
        Cuenta cuenta = new Cuenta(rutCuenta, passNueva, 2);
        
//        data.crearCuenta(cuenta);
    }//GEN-LAST:event_btnAddVotanteActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCandidatura;
    private javax.swing.JButton btnAddVotante;
    private javax.swing.JButton btnAddVotante1;
    private javax.swing.JButton btnContinuarAdd;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnInscribirPartido;
    private javax.swing.JComboBox<String> cboActNacionalidad;
    private javax.swing.JComboBox<String> cboActPaisResidencia;
    private javax.swing.JComboBox cboNacionalidad;
    private javax.swing.JComboBox cboPaisResidencia;
    private javax.swing.JComboBox<String> cboPartidoCand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFrame jfAddCandidatura;
    private javax.swing.JFrame jfIncribirPersona;
    private javax.swing.JFrame jfInscribirPartido;
    private javax.swing.JFrame jfMenuAdmin;
    private javax.swing.JFrame jfMenuUserComun;
    private javax.swing.JFrame jfUpdateDireccion;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblPassGenerada;
    private javax.swing.JMenu meCandidato;
    private javax.swing.JMenu mePersona;
    private javax.swing.JMenu meSalir;
    private javax.swing.JMenu meSalirVo;
    private javax.swing.JMenu meVotacion;
    private javax.swing.JMenu meVotacionVo;
    private javax.swing.JMenuBar menAdmin;
    private javax.swing.JMenuItem miAddCandidatura;
    private javax.swing.JMenuItem miAddPartido;
    private javax.swing.JMenuItem miAddVotante;
    private javax.swing.JMenuItem miCerrarSesion;
    private javax.swing.JMenuItem miCerrarSesionVo;
    private javax.swing.JMenuItem miChangeAdress;
    private javax.swing.JMenuItem miEmitirVoto;
    private javax.swing.JMenuItem miResult;
    private javax.swing.JMenuItem miResultVo;
    private javax.swing.JMenuItem miVotarVo;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JLabel pnlLogoServel;
    private javax.swing.JPanel pnlVotante;
    private javax.swing.JTable tblBuscarPersonaCandidato;
    private javax.swing.JTable tblBuscarPersonaCandidatoUp;
    private javax.swing.JTextField txtActApellido;
    private javax.swing.JTextField txtActDireccion;
    private javax.swing.JTextField txtActEdad;
    private javax.swing.JTextField txtActNombre;
    private javax.swing.JTextField txtActRun;
    private javax.swing.JTextField txtAddApellido;
    private javax.swing.JTextField txtAddDireccion;
    private javax.swing.JTextField txtAddEdad;
    private javax.swing.JTextField txtAddNombre;
    private javax.swing.JTextField txtAddRun;
    private javax.swing.JTextField txtAnioFundacionPartido;
    private javax.swing.JTextField txtApellidoCand;
    private javax.swing.JTextField txtBuscarPersona;
    private javax.swing.JTextField txtBuscarPersonaUp;
    private javax.swing.JTextField txtDireccionCand;
    private javax.swing.JTextField txtNombreCand;
    private javax.swing.JTextField txtNombrePartido;
    private javax.swing.JPasswordField txtPassInicio;
    private javax.swing.JTextField txtRunIniciar;
    private javax.swing.JTextField txtRutCand;
    // End of variables declaration//GEN-END:variables

    private void init() {
        cargarCbo();
        btnAddVotante.setEnabled(false);

        this.setLocationRelativeTo(null);

        // bounds a los formularios
        jfMenuAdmin.setBounds(0, 0, 666, 370);
        jfMenuUserComun.setBounds(0, 0, 666, 370);

        jfIncribirPersona.setBounds(0, 0, 720, 420);
    }

    // llenar el combobox de paises
    private void cargarCbo() {
        List<Pais> listaPa = data.getListaPais();
        List<Nacionalidad> listaNa = data.getListaNacionalidad();

        cboPaisResidencia.removeAllItems();
        cboActNacionalidad.removeAllItems();

        for (Pais pa : listaPa) {
            cboPaisResidencia.addItem(pa);
        }
        for (Nacionalidad na : listaNa) {
            cboNacionalidad.addItem(na);
        }
    }

    //metodo para ver si el usuario ya sufrago
    private boolean EstadoVoto(String rut) {
        List<Voto> listVoto = data.getListaVotos();

        for (Voto vo : listVoto) {
            if (vo.getVotante_fk().equalsIgnoreCase(rut)) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarRut(String rut) {
        List<PersonaSelect> listPersona = data.getListaPersonas();

        for (PersonaSelect pe : listPersona) {
            if (pe.getRut().equalsIgnoreCase(rut)) {
                return false;
            }
        }
        return true;
    }
}
