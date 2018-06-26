package main;

import java.awt.Image;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Candidato;
import model.CandidatoSelect;
import model.Cuenta;
import model.Data;
import model.GenerarPass;
import model.MostrarCandidato;
import model.Nacionalidad;
import model.Pais;
import model.Partido;
import model.Persona;
import model.PersonaSelect;
import model.Voto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import tableModels.TMPersona;
import tableModels.TM_MostrarCandidato;

public class App extends javax.swing.JFrame {

    private Data data;
    private GenerarPass genPass;
    private List<Cuenta> listCuenta;
    private List<PersonaSelect> listPersonaCandidato2;
    private List<MostrarCandidato> listPersonaCandidato;
    private int privilegio = 0; //para ver el privilegio de la persona logeada
    private boolean sufrago = false; // para conocer si la persona voto
    private String rutPersonaActual; // rut de la persona que se logeo
    private boolean verPass = true;
    private int idRegistrar = 0;

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
        miChangePass = new javax.swing.JMenuItem();
        meCandidato = new javax.swing.JMenu();
        miAddCandidatura = new javax.swing.JMenuItem();
        meVotacion = new javax.swing.JMenu();
        miAddPartido = new javax.swing.JMenuItem();
        miEmitirVoto = new javax.swing.JMenuItem();
        meSalir = new javax.swing.JMenu();
        miCerrarSesion = new javax.swing.JMenuItem();
        jfMenuUserComun = new javax.swing.JFrame();
        pnlVotante = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        meVotacionVo = new javax.swing.JMenu();
        miVotarVo = new javax.swing.JMenuItem();
        miCambiarPassVo = new javax.swing.JMenuItem();
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
        jfUpdateDatos = new javax.swing.JFrame();
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
        cboActPaisResidencia = new javax.swing.JComboBox();
        cboActNacionalidad = new javax.swing.JComboBox();
        btnActVotante = new javax.swing.JButton();
        txtActEdad = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtBuscarPersonaUp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuscarPersonaUp = new javax.swing.JTable();
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
        cboPartidoCand = new javax.swing.JComboBox();
        btnAddCandidatura = new javax.swing.JButton();
        jfInscribirPartido = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombrePartido = new javax.swing.JTextField();
        txtAnioFundacionPartido = new javax.swing.JTextField();
        btnInscribirPartido = new javax.swing.JButton();
        jfUpdatePass = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtRunUpdatePass = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNombreUpdatePass = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNuevaPassUpdate = new javax.swing.JPasswordField();
        btnUpdatePass = new javax.swing.JButton();
        jfEjercerVoto = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCandidatos = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNombreCandidatoVotar = new javax.swing.JTextField();
        txtApellidoCandidatoVotar = new javax.swing.JTextField();
        txtPartidoCandidatoVotar = new javax.swing.JTextField();
        btnVotar = new javax.swing.JButton();
        lblIdCandidato = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRunIniciar = new javax.swing.JTextField();
        pnlLogoServel = new javax.swing.JLabel();
        btnsa = new javax.swing.JButton();
        txtPassInicio = new javax.swing.JPasswordField();

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

        miChangeAdress.setText("Cambiar Datos");
        miChangeAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangeAdressActionPerformed(evt);
            }
        });
        mePersona.add(miChangeAdress);

        miChangePass.setText("Cambiar Mi Contraseña");
        miChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangePassActionPerformed(evt);
            }
        });
        mePersona.add(miChangePass);

        menAdmin.add(mePersona);

        meCandidato.setText("Candidato");

        miAddCandidatura.setText("Inscribir Candidatura");
        miAddCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddCandidaturaActionPerformed(evt);
            }
        });
        meCandidato.add(miAddCandidatura);

        menAdmin.add(meCandidato);

        meVotacion.setText("Votación");

        miAddPartido.setText("Inscribir Partido");
        miAddPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddPartidoActionPerformed(evt);
            }
        });
        meVotacion.add(miAddPartido);

        miEmitirVoto.setText("Votar");
        miEmitirVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmitirVotoActionPerformed(evt);
            }
        });
        meVotacion.add(miEmitirVoto);

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
        miVotarVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVotarVoActionPerformed(evt);
            }
        });
        meVotacionVo.add(miVotarVo);

        miCambiarPassVo.setText("Cambiar Contraseña");
        miCambiarPassVo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCambiarPassVoActionPerformed(evt);
            }
        });
        meVotacionVo.add(miCambiarPassVo);

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

        btnActVotante.setText("Actualizar Votante");
        btnActVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActVotanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtActNombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtActRun, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtActDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActVotante)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboActNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboActPaisResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtActNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtActApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtActDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtActEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cboActPaisResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboActNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActVotante)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Persona"));

        txtBuscarPersonaUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPersonaUpKeyReleased(evt);
            }
        });

        tblBuscarPersonaUp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuscarPersonaUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBuscarPersonaUpMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblBuscarPersonaUp);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(txtBuscarPersonaUp))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarPersonaUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jfUpdateDatosLayout = new javax.swing.GroupLayout(jfUpdateDatos.getContentPane());
        jfUpdateDatos.getContentPane().setLayout(jfUpdateDatosLayout);
        jfUpdateDatosLayout.setHorizontalGroup(
            jfUpdateDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfUpdateDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jfUpdateDatosLayout.setVerticalGroup(
            jfUpdateDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfUpdateDatosLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jfUpdateDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Persona"));

        txtBuscarPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPersonaKeyReleased(evt);
            }
        });

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
        tblBuscarPersonaCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBuscarPersonaCandidatoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuscarPersonaCandidato);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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
        btnAddCandidatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCandidaturaActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccionCand, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPartidoCand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(btnAddCandidatura)
                .addGap(35, 35, 35))
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
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(cboPartidoCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnAddCandidatura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jfAddCandidaturaLayout.setVerticalGroup(
            jfAddCandidaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfAddCandidaturaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jfAddCandidaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Partido"));

        jLabel21.setText("Nombre Partido :");

        jLabel22.setText("Año Fundacion :");

        btnInscribirPartido.setText("Inscribir Partido");
        btnInscribirPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirPartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombrePartido, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(txtAnioFundacionPartido)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnInscribirPartido)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtAnioFundacionPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInscribirPartido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jfInscribirPartidoLayout = new javax.swing.GroupLayout(jfInscribirPartido.getContentPane());
        jfInscribirPartido.getContentPane().setLayout(jfInscribirPartidoLayout);
        jfInscribirPartidoLayout.setHorizontalGroup(
            jfInscribirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfInscribirPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jfInscribirPartidoLayout.setVerticalGroup(
            jfInscribirPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfInscribirPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambiar Contraseña"));

        jLabel24.setText("R.U.N : ");

        jLabel25.setText("Nombre :");

        jLabel26.setText("Nueva Contraseña :");

        btnUpdatePass.setText("Cambiar Contraseña");
        btnUpdatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24)
                                .addComponent(jLabel25)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRunUpdatePass)
                            .addComponent(txtNombreUpdatePass)
                            .addComponent(txtNuevaPassUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnUpdatePass)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtRunUpdatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreUpdatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtNuevaPassUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnUpdatePass)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jfUpdatePassLayout = new javax.swing.GroupLayout(jfUpdatePass.getContentPane());
        jfUpdatePass.getContentPane().setLayout(jfUpdatePassLayout);
        jfUpdatePassLayout.setHorizontalGroup(
            jfUpdatePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfUpdatePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jfUpdatePassLayout.setVerticalGroup(
            jfUpdatePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfUpdatePassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Candidatos"));

        tblCandidatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCandidatosMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblCandidatos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Candidato"));

        jLabel28.setText("Nombre :");

        jLabel29.setText("Apellido :");

        jLabel30.setText("Partido :");

        btnVotar.setText("Votar");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoCandidatoVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCandidatoVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPartidoCandidatoVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVotar)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIdCandidato)
                .addGap(58, 58, 58))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdCandidato)
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(txtNombreCandidatoVotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidoCandidatoVotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPartidoCandidatoVotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVotar)
                    .addComponent(btnLimpiar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jfEjercerVotoLayout = new javax.swing.GroupLayout(jfEjercerVoto.getContentPane());
        jfEjercerVoto.getContentPane().setLayout(jfEjercerVotoLayout);
        jfEjercerVotoLayout.setHorizontalGroup(
            jfEjercerVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfEjercerVotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jfEjercerVotoLayout.setVerticalGroup(
            jfEjercerVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfEjercerVotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfEjercerVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jfEjercerVotoLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        btnsa.setText("xd");
        btnsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciarSesion)
                            .addComponent(txtRunIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtPassInicio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnsa)))
                .addGap(18, 18, 18)
                .addComponent(pnlLogoServel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogoServel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1)
                            .addComponent(txtRunIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPassInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion)))
                .addGap(36, 36, 36))
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
                rutPersonaActual = c.getRutPersona_fk();
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

        EstadoVoto(rutPersonaActual);
    }//GEN-LAST:event_miCerrarSesionActionPerformed

    private void miCerrarSesionVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCerrarSesionVoActionPerformed
        jfMenuUserComun.setVisible(false);
        this.setVisible(true);

        EstadoVoto(rutPersonaActual);
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
        /*Rescatamos los datos de la persona y los creamos*/
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

        Persona persona = new Persona(rut, nombre, apellido, direccion, edad, paisID, nacionalidadID);
        data.registrarPersona(persona);

        /* Registramos la nueva cuenta*/
        String rutCuenta = txtAddRun.getText();
        String passNueva = lblPassGenerada.getText();

        Cuenta cuenta = new Cuenta(rutCuenta, passNueva, 2);
        data.crearCuenta(cuenta);
    }//GEN-LAST:event_btnAddVotanteActionPerformed

    private void miChangeAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangeAdressActionPerformed
        jfUpdateDatos.setVisible(true);
        jfUpdateDatos.setLocationRelativeTo(null);
    }//GEN-LAST:event_miChangeAdressActionPerformed

    private void miAddCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddCandidaturaActionPerformed
        jfAddCandidatura.setVisible(true);
        jfAddCandidatura.setLocationRelativeTo(null);
    }//GEN-LAST:event_miAddCandidaturaActionPerformed

    private void btnInscribirPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirPartidoActionPerformed
        String nombrePartido = txtNombrePartido.getText();
        int fundacionPartido = Integer.parseInt(txtAnioFundacionPartido.getText());

        if (verificarPartido(nombrePartido) == false) {
            JOptionPane.showMessageDialog(this, nombrePartido + " Ya Existe ", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombrePartido.setText("");
            txtAnioFundacionPartido.setText("");
        } else {

            Partido partido = new Partido(nombrePartido, fundacionPartido);
            data.registrarPartido(partido);
        }
    }//GEN-LAST:event_btnInscribirPartidoActionPerformed

    private void miAddPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddPartidoActionPerformed
        jfInscribirPartido.setVisible(true);
        jfInscribirPartido.setLocationRelativeTo(null);
    }//GEN-LAST:event_miAddPartidoActionPerformed

    private void btnsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaActionPerformed
        if (verPass) {  // a es una variable boolean en true
            txtPassInicio.setEchoChar((char) 0); // este método es el que hace visible el texto del jPasswordField

            String ted = txtPassInicio.getText();
            System.out.println("mostar :" + ted);

            verPass = false;
        } else if (verPass == false) {
            String ted = txtPassInicio.getText();

            txtPassInicio.setEchoChar((char) ted.length());
            verPass = true;
        }
    }//GEN-LAST:event_btnsaActionPerformed

    private void btnUpdatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePassActionPerformed
        String rutAct = txtRunUpdatePass.getText();
        String newPass = txtNuevaPassUpdate.getText();
        // necesito el id de la cuenta para actulizar, int id 
        Cuenta cuentaDos = data.getCuentaByRut(rutAct);
        int idCuenta = cuentaDos.getId();
        int privilegioAct = cuentaDos.getPrivilegio_fk();

        Cuenta cuenta = new Cuenta(idCuenta, rutAct, newPass, privilegioAct);
        data.updatePass(cuenta);
    }//GEN-LAST:event_btnUpdatePassActionPerformed

    private void miChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangePassActionPerformed
        jfUpdatePass.setVisible(true);
        jfUpdatePass.setLocationRelativeTo(null);

        txtRunUpdatePass.setText(rutPersonaActual);

        PersonaSelect persona = data.getPersonaByRut(rutPersonaActual);

        txtNombreUpdatePass.setText(persona.getNombre() + " " + persona.getApellido());
    }//GEN-LAST:event_miChangePassActionPerformed

    private void miCambiarPassVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCambiarPassVoActionPerformed
        jfUpdatePass.setVisible(true);
        jfUpdatePass.setLocationRelativeTo(null);

        txtRunUpdatePass.setText(rutPersonaActual);

        PersonaSelect persona = data.getPersonaByRut(rutPersonaActual);

        txtNombreUpdatePass.setText(persona.getNombre() + " " + persona.getApellido());
    }//GEN-LAST:event_miCambiarPassVoActionPerformed

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed
        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        int idCandidatoVotar = Integer.parseInt(lblIdCandidato.getText());
        String rutVotante = rutPersonaActual;
        String fechaVoto = fecha.format(date);

        Voto voto = new Voto(fechaVoto, rutVotante, idCandidatoVotar);
        data.registrarVoto(voto);
        EstadoVoto(rutPersonaActual);


    }//GEN-LAST:event_btnVotarActionPerformed

    private void miEmitirVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmitirVotoActionPerformed
        jfEjercerVoto.setVisible(true);
        jfEjercerVoto.setLocationRelativeTo(null);
    }//GEN-LAST:event_miEmitirVotoActionPerformed

    private void txtBuscarPersonaUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPersonaUpKeyReleased
        String text = txtBuscarPersonaUp.getText();

        List<PersonaSelect> list = data.getListaPersonaByTexto(text);

        TMPersona model = new TMPersona(list);

        tblBuscarPersonaUp.setModel(model);
    }//GEN-LAST:event_txtBuscarPersonaUpKeyReleased

    private void tblBuscarPersonaUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarPersonaUpMouseReleased
        if (evt.getClickCount() == 2) {

            int fila = tblBuscarPersonaUp.getSelectedRow();

            TMPersona model = (TMPersona) tblBuscarPersonaUp.getModel();

            PersonaSelect p = model.getPersona(fila);

            txtActRun.setText(p.getRut());
            txtActNombre.setText(p.getNombre());
            txtActApellido.setText(p.getApellido());
            txtActDireccion.setText(p.getDireccion());
            txtActEdad.setText(p.getEdad());

            cboActNacionalidad.setSelectedIndex(Integer.parseInt(p.getNacionalidad_fk()) - 1);
            cboActPaisResidencia.setSelectedIndex(Integer.parseInt(p.getPaisRecidencia_fk()) - 1);

            //lo desactivamos ya que no se puede actualizar
            txtActRun.setEditable(false);

            btnActVotante.setEnabled(true);

        }
    }//GEN-LAST:event_tblBuscarPersonaUpMouseReleased

    private void btnActVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActVotanteActionPerformed
        Pais pa;
        Nacionalidad na;

        pa = (Pais) cboActPaisResidencia.getSelectedItem();
        na = (Nacionalidad) cboActNacionalidad.getSelectedItem();

        String rut = txtActRun.getText();
        String nombre = txtActNombre.getText();
        String apellido = txtActApellido.getText();
        String direccion = txtActDireccion.getText();
        int edad = Integer.parseInt(txtActEdad.getText());
        int paisID = pa.getId();
        int nacionalidadID = na.getId();

        Persona persona = new Persona(rut, nombre, apellido, direccion, edad, paisID, nacionalidadID);
        data.updatePersona(persona);

    }//GEN-LAST:event_btnActVotanteActionPerformed

    private void miVotarVoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVotarVoActionPerformed
        jfEjercerVoto.setVisible(true);
        jfEjercerVoto.setLocationRelativeTo(null);
    }//GEN-LAST:event_miVotarVoActionPerformed

    private void tblBuscarPersonaCandidatoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarPersonaCandidatoMouseReleased
        if (evt.getClickCount() == 2) {

            int fila = tblBuscarPersonaCandidato.getSelectedRow();

            TMPersona model = (TMPersona) tblBuscarPersonaCandidato.getModel();

            PersonaSelect p = model.getPersona(fila);

            txtRutCand.setText(p.getRut());
            txtNombreCand.setText(p.getNombre());
            txtApellidoCand.setText(p.getApellido());
            txtDireccionCand.setText(p.getDireccion());

            btnAddCandidatura.setEnabled(true);

        }
    }//GEN-LAST:event_tblBuscarPersonaCandidatoMouseReleased

    private void btnAddCandidaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCandidaturaActionPerformed
        String rut = txtRutCand.getText();

        Partido pa = (Partido) cboPartidoCand.getSelectedItem();
        int partidoID = pa.getId();

        if (verificarCandidatura(rut) == false) {
            JOptionPane.showMessageDialog(this, "El RUT (" + rut + ") Ya es Candidato", "ERROR", JOptionPane.ERROR);

            txtRutCand.setText("");
            txtNombreCand.setText("");
            txtApellidoCand.setText("");
            txtDireccionCand.setText("");

            cboPartidoCand.setSelectedIndex(0);

            btnAddCandidatura.setEnabled(false);

        } else {
            Candidato candidato = new Candidato(partidoID, rut);
            data.registrarCandidato(candidato);
            JOptionPane.showMessageDialog(this, "Registrado !!");
        }
    }//GEN-LAST:event_btnAddCandidaturaActionPerformed

    private void txtBuscarPersonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPersonaKeyReleased
        String text = txtBuscarPersona.getText();

        List<PersonaSelect> list = data.getListaPersonaByTexto(text);

        TMPersona model = new TMPersona(list);

        tblBuscarPersonaCandidato.setModel(model);
    }//GEN-LAST:event_txtBuscarPersonaKeyReleased

    private void tblCandidatosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCandidatosMouseReleased
        if (evt.getClickCount() == 2) {

            int fila = tblCandidatos.getSelectedRow();

            TM_MostrarCandidato model = (TM_MostrarCandidato) tblCandidatos.getModel();

            MostrarCandidato p = model.getCandidato(fila);

            lblIdCandidato.setText(p.getId());
            txtNombreCandidatoVotar.setText(p.getNombre());
            txtApellidoCandidatoVotar.setText(p.getApellido());
            txtPartidoCandidatoVotar.setText(p.getPartido());

            btnVotar.setEnabled(true);
        }
    }//GEN-LAST:event_tblCandidatosMouseReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        lblIdCandidato.setText("");
        txtNombreCandidatoVotar.setText("");
        txtApellidoCandidatoVotar.setText("");
        txtPartidoCandidatoVotar.setText("");

        btnVotar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
    private javax.swing.JButton btnActVotante;
    private javax.swing.JButton btnAddCandidatura;
    private javax.swing.JButton btnAddVotante;
    private javax.swing.JButton btnContinuarAdd;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnInscribirPartido;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnUpdatePass;
    private javax.swing.JButton btnVotar;
    private javax.swing.JButton btnsa;
    private javax.swing.JComboBox cboActNacionalidad;
    private javax.swing.JComboBox cboActPaisResidencia;
    private javax.swing.JComboBox cboNacionalidad;
    private javax.swing.JComboBox cboPaisResidencia;
    private javax.swing.JComboBox cboPartidoCand;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JFrame jfAddCandidatura;
    private javax.swing.JFrame jfEjercerVoto;
    private javax.swing.JFrame jfIncribirPersona;
    private javax.swing.JFrame jfInscribirPartido;
    private javax.swing.JFrame jfMenuAdmin;
    private javax.swing.JFrame jfMenuUserComun;
    private javax.swing.JFrame jfUpdateDatos;
    private javax.swing.JFrame jfUpdatePass;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblIdCandidato;
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
    private javax.swing.JMenuItem miCambiarPassVo;
    private javax.swing.JMenuItem miCerrarSesion;
    private javax.swing.JMenuItem miCerrarSesionVo;
    private javax.swing.JMenuItem miChangeAdress;
    private javax.swing.JMenuItem miChangePass;
    private javax.swing.JMenuItem miEmitirVoto;
    private javax.swing.JMenuItem miVotarVo;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JLabel pnlLogoServel;
    private javax.swing.JPanel pnlVotante;
    private javax.swing.JTable tblBuscarPersonaCandidato;
    private javax.swing.JTable tblBuscarPersonaUp;
    private javax.swing.JTable tblCandidatos;
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
    private javax.swing.JTextField txtApellidoCandidatoVotar;
    private javax.swing.JTextField txtBuscarPersona;
    private javax.swing.JTextField txtBuscarPersonaUp;
    private javax.swing.JTextField txtDireccionCand;
    private javax.swing.JTextField txtNombreCand;
    private javax.swing.JTextField txtNombreCandidatoVotar;
    private javax.swing.JTextField txtNombrePartido;
    private javax.swing.JTextField txtNombreUpdatePass;
    private javax.swing.JPasswordField txtNuevaPassUpdate;
    private javax.swing.JTextField txtPartidoCandidatoVotar;
    private javax.swing.JPasswordField txtPassInicio;
    private javax.swing.JTextField txtRunIniciar;
    private javax.swing.JTextField txtRunUpdatePass;
    private javax.swing.JTextField txtRutCand;
    // End of variables declaration//GEN-END:variables

    private void init() {
        cargarCbo();
        cargarDatosTabla();

        btnAddVotante.setEnabled(false);
        btnsa.setVisible(false);
        txtRunUpdatePass.setEditable(false);
        txtNombreUpdatePass.setEditable(false);
        lblIdCandidato.setVisible(false);
        btnActVotante.setEnabled(false);

        txtRutCand.setEditable(false);
        txtNombreCand.setEditable(false);
        txtApellidoCand.setEditable(false);
        txtDireccionCand.setEditable(false);
        btnAddCandidatura.setEnabled(false);

        txtNombreCandidatoVotar.setEditable(false);
        txtApellidoCandidatoVotar.setEditable(false);
        txtPartidoCandidatoVotar.setEditable(false);

        btnVotar.setEnabled(false);

        this.setLocationRelativeTo(null);

        // bounds a los formularios
        jfMenuAdmin.setBounds(0, 0, 666, 370);

        jfMenuUserComun.setBounds(0, 0, 666, 370);

        jfIncribirPersona.setBounds(0, 0, 720, 420);

        jfUpdateDatos.setBounds(0, 0, 820, 420);

        jfAddCandidatura.setBounds(0, 0, 720, 440);

        jfInscribirPartido.setBounds(0, 0, 300, 240);

        jfUpdatePass.setBounds(0, 0, 450, 350);

        jfEjercerVoto.setBounds(0, 0, 700, 380);
    }

    // llenar el combobox de paises
    private void cargarCbo() {
        List<Pais> listaPa = data.getListaPais();
        List<Nacionalidad> listaNa = data.getListaNacionalidad();
        List<Partido> listaPart = data.getListaPartidos();

        cboPaisResidencia.removeAllItems();
        cboActNacionalidad.removeAllItems();
        cboPartidoCand.removeAllItems();

        for (Pais pa : listaPa) {
            cboPaisResidencia.addItem(pa);
            cboActPaisResidencia.addItem(pa);
        }
        for (Nacionalidad na : listaNa) {
            cboNacionalidad.addItem(na);
            cboActNacionalidad.addItem(na);
        }
        for (Partido part : listaPart) {
            cboPartidoCand.addItem(part);
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

    private boolean verificarCandidatura(String rut) {
        List<CandidatoSelect> listCandidato = data.getListaCandidatos();

        for (CandidatoSelect pe : listCandidato) {
            if (pe.getPersona_fk().equalsIgnoreCase(rut)) {
                return false;
            }
        }
        return true;
    }

    private boolean verificarPartido(String nombre) {

        for (Partido part : data.getListaPartidos()) {
            if (part.getDescripcion().equalsIgnoreCase(nombre)) {
                return false;
            }
        }
        return true;
    }

    private void cargarDatosTabla() {
        List<PersonaSelect> listPersona = data.getListaPersonas();
        TMPersona tm = new TMPersona(listPersona);
        tblBuscarPersonaUp.setModel(tm);
        tblBuscarPersonaCandidato.setModel(tm);

        //llenando la tabla de candidatos al votar
        listPersonaCandidato = new ArrayList<>();
        MostrarCandidato mo = new MostrarCandidato();

        for (CandidatoSelect canS : data.getListaCandidatos()) {
            mo = data.getCandidatosParaVotar(canS.getPersona_fk());
            listPersonaCandidato.add(mo);
        }

        TM_MostrarCandidato tmCan = new TM_MostrarCandidato(listPersonaCandidato);
        tblCandidatos.setModel(tmCan);

    }

//        //Caso 1: obtener la hora y salida por pantalla con formato:
//        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
//        System.out.println("Hora: " + hourFormat.format(date));
//        //Caso 2: obtener la fecha y salida por pantalla con formato:
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("Fecha: " + dateFormat.format(date));
//        //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
}
