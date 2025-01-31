/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import com.toedter.calendar.JDateChooser;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author RIBZ
 */
public class frmContenedorPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmContenedorPrincipal
     */
    public frmContenedorPrincipal() {
        initComponents();
        inicializacionItemsMenuBar();
        CardLayout cardLayout = new CardLayout();
        spinHoraN.setEditor(new JSpinner.NumberEditor(spinHoraN, "00"));
        spinMinN.setEditor(new JSpinner.NumberEditor(spinMinN, "00"));
    }

    private void inicializacionItemsMenuBar() {
        // Menú principal de "Pago"
        jMenuPago = new javax.swing.JMenu();
        jMenuItemPagoPendiente = new javax.swing.JMenuItem();
        jMenuItemPagoRealizado = new javax.swing.JMenuItem();
        
        // Menú principal de "Medicos"
        jMenuMedicos = new javax.swing.JMenu();
        jMenuItemMedicoActivos = new javax.swing.JMenuItem();
        jMenuItemMedicoInactivos = new javax.swing.JMenuItem();
        
        // Menú principal de "Cita Medica"
        jMenuCitaMedica = new javax.swing.JMenu();
        jMenuItemCitaMedicaNorte = new javax.swing.JMenuItem();
        jMenuItemCitaMedicaSur = new javax.swing.JMenuItem();
        
        // Menú principal de "Tratamientos"
        jMenuTratamientos = new javax.swing.JMenu();
        jMenuItemTratamientosFacial = new javax.swing.JMenuItem();
        jMenuItemTratamientosCorporal = new javax.swing.JMenuItem();

        // Menú de "Paciente" y "Usuarios"
        jMenuPaciente = new javax.swing.JMenu();
        jMenuItemPaciente= new javax.swing.JMenuItem();
        jMenuItemPacienteM= new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemUsuario= new javax.swing.JMenuItem();
        jMenuItemUsuarioM= new javax.swing.JMenuItem();
        // Menú Pago
        jMenuPago.setText("Pago");
        jMenuPago.setIcon(obtenerImagen(logo_Pago));
        jMenuPago.setOpaque(true);
        jMenuPago.setBackground(mColorFondoMenu);
        jMenuPago.setForeground(Color.WHITE);
        jMenuPago.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40)); 
        
        jMenuItemPagoPendiente.setText("Pendiente");
        jMenuItemPagoRealizado.setText("Realizado");
        jMenuPago.add(jMenuItemPagoPendiente);
        jMenuPago.add(jMenuItemPagoRealizado);
        
        // Menú Medicos
        jMenuMedicos.setText("Medicos");
        jMenuMedicos.setIcon(obtenerImagen(logo_Medico));
        jMenuMedicos.setOpaque(true);
        jMenuMedicos.setBackground(mColorFondoMenu);
        jMenuMedicos.setForeground(Color.WHITE);
        jMenuMedicos.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40));
        
        jMenuItemMedicoActivos.setText("Activos");
        jMenuItemMedicoInactivos.setText("Inactivos");
        jMenuMedicos.add(jMenuItemMedicoActivos);
        jMenuMedicos.add(jMenuItemMedicoInactivos);
        
        // Menú Cita Medica
        jMenuCitaMedica.setText("Cita Medica");
        jMenuCitaMedica.setIcon(obtenerImagen(logo_CitaMedica));
        jMenuCitaMedica.setOpaque(true);
        jMenuCitaMedica.setBackground(mColorFondoMenu);
        jMenuCitaMedica.setForeground(Color.WHITE);
        jMenuCitaMedica.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40));
        
        jMenuItemCitaMedicaNorte.setText("Norte");
        jMenuItemCitaMedicaSur.setText("Sur");
        jMenuCitaMedica.add(jMenuItemCitaMedicaNorte);
        jMenuCitaMedica.add(jMenuItemCitaMedicaSur);
        
        // Menú Tratamientos
        jMenuTratamientos.setText("Tratamientos");
        jMenuTratamientos.setIcon(obtenerImagen(logo_Tratamientos));
        jMenuTratamientos.setOpaque(true);
        jMenuTratamientos.setBackground(mColorFondoMenu);
        jMenuTratamientos.setForeground(Color.WHITE);
        jMenuTratamientos.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40));
        
        jMenuItemTratamientosFacial.setText("Facial");
        
        jMenuItemTratamientosCorporal.setText("Corporal");
        
        jMenuTratamientos.add(jMenuItemTratamientosFacial);
        jMenuTratamientos.add(jMenuItemTratamientosCorporal);
        
        // Menú Paciente y Usuarios
        jMenuPaciente.setText("Paciente");
        jMenuPaciente.setIcon(obtenerImagen(logo_Paciente));
        jMenuPaciente.setOpaque(true);
        jMenuPaciente.setBackground(mColorFondoMenu);
        jMenuPaciente.setForeground(Color.WHITE);
        jMenuPaciente.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40));
        jMenuItemPaciente.setText("Paciente VM");
        jMenuItemPacienteM.setText("Paciente");
        jMenuPaciente.add(jMenuItemPacienteM);
        jMenuPaciente.add(jMenuItemPaciente);
        //--------USUARIO----
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.setIcon(obtenerImagen(logo_Usuario));
        jMenuUsuarios.setOpaque(true);
        jMenuUsuarios.setBackground(mColorFondoMenu);
        jMenuUsuarios.setForeground(Color.WHITE);
        jMenuUsuarios.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40));
        jMenuItemUsuario.setText("Usuario VM");
        jMenuItemUsuarioM.setText("Usuario");
        jMenuUsuarios.add(jMenuItemUsuarioM);
        jMenuUsuarios.add(jMenuItemUsuario);

        // Añadir todos los menús al menu bar
        mbMenuBar.add(jMenuPago);
        mbMenuBar.add(jMenuMedicos);
        mbMenuBar.add(jMenuCitaMedica);
        mbMenuBar.add(jMenuTratamientos);
        mbMenuBar.add(jMenuPaciente);
        mbMenuBar.add(jMenuUsuarios);
        
    }
    private Icon obtenerImagen(String ruta){
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(30, 30, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEstadoUs = new javax.swing.JTextField();
        txtCorreoUs = new javax.swing.JTextField();
        txtIdUsVM = new javax.swing.JTextField();
        btnBuscarUs = new javax.swing.JButton();
        listRolUs = new javax.swing.JComboBox<>();
        btnModificarUs = new javax.swing.JButton();
        btnEliminarUs = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNuevaPassUs = new javax.swing.JPasswordField();
        txtConfNuevaPassUs = new javax.swing.JPasswordField();
        btnGuardarUs = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtNombreUs = new javax.swing.JTextField();
        jPanelPaciente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModificarPa = new javax.swing.JButton();
        txtCedulaPA = new javax.swing.JTextField();
        txtNumTelPA = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        dateFechaNacPA = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtNombrePA = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtUbicacionPA = new javax.swing.JTextField();
        btnGuardarPa = new javax.swing.JButton();
        btnEliminarPa = new javax.swing.JButton();
        btnLimpiarPa = new javax.swing.JButton();
        btnBuscarPa = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        txtCorreoElecPA = new javax.swing.JTextField();
        jPanelTFacial = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNombreTF = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTipoTF = new javax.swing.JTextField();
        jPanelPaciente1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnModificarPa1 = new javax.swing.JButton();
        txtCedula1 = new javax.swing.JTextField();
        txtNumTel1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        dateFechaNac1 = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtUbicacion1 = new javax.swing.JTextField();
        btnGuardarPa1 = new javax.swing.JButton();
        btnEliminarPa1 = new javax.swing.JButton();
        btnLimpiarPa1 = new javax.swing.JButton();
        btnBuscarPa1 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtCorreoElec1 = new javax.swing.JTextField();
        btnModificarTF = new javax.swing.JButton();
        btnLimpiarTF = new javax.swing.JButton();
        btnGuardarTF = new javax.swing.JButton();
        btnBuscarTF = new javax.swing.JButton();
        btnEliminarTF = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtCodigoTF = new javax.swing.JTextField();
        txtPrecioTF = new javax.swing.JFormattedTextField();
        jPanelTCorporal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarTC = new javax.swing.JButton();
        btnModificarTC = new javax.swing.JButton();
        btnEliminarTC = new javax.swing.JButton();
        btnBuscarTC = new javax.swing.JButton();
        btnLimpiarTC = new javax.swing.JButton();
        txtNombreTC = new javax.swing.JTextField();
        txtTipoTC = new javax.swing.JTextField();
        txtCodigoTC = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtPrecioTC = new javax.swing.JFormattedTextField();
        jPanelMedicoActivo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dateFechaMA = new com.toedter.calendar.JDateChooser();
        txtCedulaMA = new javax.swing.JTextField();
        txtNombreMA = new javax.swing.JTextField();
        txtTelefonoMA = new javax.swing.JTextField();
        txtCorreoMA = new javax.swing.JTextField();
        txtEstadoMA = new javax.swing.JTextField();
        txtDireccionMA = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        btnEliminarMA = new javax.swing.JButton();
        btnGuardarMA = new javax.swing.JButton();
        btnModificarMA = new javax.swing.JButton();
        btnBuscarMA = new javax.swing.JButton();
        jPanelMedicoInactivo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNumCedulaMI = new javax.swing.JTextField();
        txtNombreMI = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtCorreoMI = new javax.swing.JTextField();
        txtNumTelefonoMI = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        dateFechaContratacionMI = new com.toedter.calendar.JDateChooser();
        txtDireccionMI = new javax.swing.JTextField();
        txtEstadoMI = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btnGuardarMI = new javax.swing.JButton();
        btnModificarMI = new javax.swing.JButton();
        btnEliminarMI = new javax.swing.JButton();
        btnBuscarMI = new javax.swing.JButton();
        btnLimpiarMI = new javax.swing.JButton();
        jPanelCMNorte = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtCodigoCMN = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaComenCMN = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        dateChooserCMN = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        spinHoraN = new javax.swing.JSpinner();
        spinMinN = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        txtSucursalCMN = new javax.swing.JTextField();
        btnEliminarCMN = new javax.swing.JButton();
        btnLimpiarCMN = new javax.swing.JButton();
        btnGuardarCMN2 = new javax.swing.JButton();
        btnModificarCMN = new javax.swing.JButton();
        btnBuscarCMN1 = new javax.swing.JButton();
        jPanelCMSur = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoCMS = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        dateChooserCMS = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComenAreaCMS = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        spinHoraS = new javax.swing.JSpinner();
        spinMinSur = new javax.swing.JSpinner();
        txtSucursalS = new javax.swing.JTextField();
        btnGuardarCMS = new javax.swing.JButton();
        btnModificarCMS = new javax.swing.JButton();
        btnEliminarCMS = new javax.swing.JButton();
        btnBuscarCMS = new javax.swing.JButton();
        btnLimpiarCMS = new javax.swing.JButton();
        jPanelPagoP = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtIdPP = new javax.swing.JTextField();
        txtEstadoPP = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        btnGuardarPP = new javax.swing.JButton();
        btnModificarPP = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        txtCantidadPP = new javax.swing.JTextField();
        btnBuscarPP = new javax.swing.JButton();
        btnEliminarPP = new javax.swing.JButton();
        dateFechaPP = new com.toedter.calendar.JDateChooser();
        jPanelPagoR = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadPR = new javax.swing.JTextField();
        txtMetodoPR = new javax.swing.JTextField();
        dateFechaPR = new com.toedter.calendar.JDateChooser();
        txtHoraPR = new javax.swing.JTextField();
        txtMinutoPR = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        btnGuardarPR = new javax.swing.JButton();
        btnModificarPR = new javax.swing.JButton();
        btnBuscarPR = new javax.swing.JButton();
        btnEliminarPR = new javax.swing.JButton();
        txtIdPR = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jPanelPacienteVM = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        txtCedulaPAVM = new javax.swing.JTextField();
        txtNumTelPAVM = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        dateFechaNacPAVM = new com.toedter.calendar.JDateChooser();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txtNombrePAVM = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txtUbicacionPAVM = new javax.swing.JTextField();
        btnLimpiarPaVM = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        txtCorreoElecPAVM = new javax.swing.JTextField();
        btnBuscarPaVM = new javax.swing.JButton();
        jPanelUsuarioVM = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtEstadoUsVM = new javax.swing.JTextField();
        txtCorreoUsVM = new javax.swing.JTextField();
        txtIdUs1 = new javax.swing.JTextField();
        btnLimpiarUsVM = new javax.swing.JButton();
        listRolUsVM = new javax.swing.JComboBox<>();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        txtNombreUsVM = new javax.swing.JTextField();
        btnBuscarUsVM = new javax.swing.JButton();
        mbMenuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        jPanelUsuario.setBackground(new java.awt.Color(204, 255, 255));
        jPanelUsuario.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo usuario");
        jPanelUsuario.add(jLabel2);
        jLabel2.setBounds(290, 380, 140, 22);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setText("Confirmar contraseña");
        jPanelUsuario.add(jLabel11);
        jLabel11.setBounds(410, 410, 160, 16);

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel13.setText("Correo Electrónico");
        jPanelUsuario.add(jLabel13);
        jLabel13.setBounds(400, 170, 150, 16);

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel15.setText("Estado");
        jPanelUsuario.add(jLabel15);
        jLabel15.setBounds(150, 260, 70, 16);
        jPanelUsuario.add(txtEstadoUs);
        txtEstadoUs.setBounds(150, 280, 140, 26);
        jPanelUsuario.add(txtCorreoUs);
        txtCorreoUs.setBounds(400, 190, 180, 26);
        jPanelUsuario.add(txtIdUsVM);
        txtIdUsVM.setBounds(0, 10, 10, 26);

        btnBuscarUs.setText("Buscar");
        jPanelUsuario.add(btnBuscarUs);
        btnBuscarUs.setBounds(220, 330, 80, 27);

        listRolUs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario", "Médico" }));
        listRolUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRolUsActionPerformed(evt);
            }
        });
        jPanelUsuario.add(listRolUs);
        listRolUs.setBounds(400, 280, 180, 26);

        btnModificarUs.setText("Modificar");
        jPanelUsuario.add(btnModificarUs);
        btnModificarUs.setBounds(420, 330, 80, 27);

        btnEliminarUs.setText("Eliminar");
        jPanelUsuario.add(btnEliminarUs);
        btnEliminarUs.setBounds(320, 330, 80, 27);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("USUARIOS");
        jPanelUsuario.add(jLabel14);
        jLabel14.setBounds(290, 130, 140, 22);

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel16.setText("Rol");
        jPanelUsuario.add(jLabel16);
        jLabel16.setBounds(400, 260, 70, 16);

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel17.setText("Contraseña");
        jPanelUsuario.add(jLabel17);
        jLabel17.setBounds(160, 410, 120, 16);
        jPanelUsuario.add(txtNuevaPassUs);
        txtNuevaPassUs.setBounds(160, 440, 190, 26);
        jPanelUsuario.add(txtConfNuevaPassUs);
        txtConfNuevaPassUs.setBounds(410, 440, 190, 26);

        btnGuardarUs.setText("Guardar");
        jPanelUsuario.add(btnGuardarUs);
        btnGuardarUs.setBounds(320, 490, 110, 27);

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel18.setText("Nombre");
        jPanelUsuario.add(jLabel18);
        jLabel18.setBounds(150, 170, 70, 16);
        jPanelUsuario.add(txtNombreUs);
        txtNombreUs.setBounds(150, 190, 140, 26);

        jPanelPrincipal.add(jPanelUsuario, "Usuario");

        jPanelPaciente.setBackground(new java.awt.Color(255, 204, 255));
        jPanelPaciente.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Número de Teléfono ");
        jPanelPaciente.add(jLabel1);
        jLabel1.setBounds(170, 210, 130, 15);

        btnModificarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarPa.setText("Modificar");
        jPanelPaciente.add(btnModificarPa);
        btnModificarPa.setBounds(370, 310, 130, 27);
        jPanelPaciente.add(txtCedulaPA);
        txtCedulaPA.setBounds(170, 130, 130, 26);
        jPanelPaciente.add(txtNumTelPA);
        txtNumTelPA.setBounds(170, 230, 130, 26);

        jLabel51.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("PACIENTE");
        jPanelPaciente.add(jLabel51);
        jLabel51.setBounds(260, 70, 150, 15);
        jPanelPaciente.add(dateFechaNacPA);
        dateFechaNacPA.setBounds(170, 180, 130, 26);

        jLabel12.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Fecha de Nacimiento ");
        jPanelPaciente.add(jLabel12);
        jLabel12.setBounds(170, 160, 130, 15);

        jLabel52.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("Correo Electrónico");
        jPanelPaciente.add(jLabel52);
        jLabel52.setBounds(370, 210, 110, 15);

        jLabel53.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Cédula");
        jPanelPaciente.add(jLabel53);
        jLabel53.setBounds(170, 110, 45, 15);

        jLabel54.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Cédula");
        jPanelPaciente.add(jLabel54);
        jLabel54.setBounds(170, 110, 45, 15);
        jPanelPaciente.add(txtNombrePA);
        txtNombrePA.setBounds(370, 130, 130, 26);

        jLabel55.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Nombre");
        jPanelPaciente.add(jLabel55);
        jLabel55.setBounds(370, 110, 45, 15);
        jPanelPaciente.add(txtUbicacionPA);
        txtUbicacionPA.setBounds(370, 180, 130, 26);

        btnGuardarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarPa.setText("Guardar");
        jPanelPaciente.add(btnGuardarPa);
        btnGuardarPa.setBounds(170, 280, 130, 27);

        btnEliminarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarPa.setText("Eliminar");
        jPanelPaciente.add(btnEliminarPa);
        btnEliminarPa.setBounds(170, 310, 130, 27);

        btnLimpiarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarPa.setText("Limpiar");
        jPanelPaciente.add(btnLimpiarPa);
        btnLimpiarPa.setBounds(270, 360, 130, 27);

        btnBuscarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarPa.setText("Buscar");
        jPanelPaciente.add(btnBuscarPa);
        btnBuscarPa.setBounds(370, 280, 130, 27);

        jLabel56.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel56.setText("Ubicación");
        jPanelPaciente.add(jLabel56);
        jLabel56.setBounds(370, 160, 110, 15);
        jPanelPaciente.add(txtCorreoElecPA);
        txtCorreoElecPA.setBounds(370, 230, 130, 26);

        jPanelPrincipal.add(jPanelPaciente, "Paciente");

        jPanelTFacial.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Precio (ej: 12.00)");
        jPanelTFacial.add(jLabel3);
        jLabel3.setBounds(370, 160, 120, 20);

        jLabel24.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Tratamientos Faciales");
        jPanelTFacial.add(jLabel24);
        jLabel24.setBounds(260, 70, 150, 15);

        jLabel23.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Nombre");
        jPanelTFacial.add(jLabel23);
        jLabel23.setBounds(170, 110, 60, 15);
        jPanelTFacial.add(txtNombreTF);
        txtNombreTF.setBounds(170, 130, 130, 26);

        jLabel25.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Tipo");
        jPanelTFacial.add(jLabel25);
        jLabel25.setBounds(370, 110, 130, 15);
        jPanelTFacial.add(txtTipoTF);
        txtTipoTF.setBounds(370, 130, 130, 26);

        jPanelPaciente1.setBackground(new java.awt.Color(255, 204, 255));
        jPanelPaciente1.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Número de Teléfono ");
        jPanelPaciente1.add(jLabel26);
        jLabel26.setBounds(170, 210, 130, 15);

        btnModificarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarPa1.setText("Modificar");
        jPanelPaciente1.add(btnModificarPa1);
        btnModificarPa1.setBounds(370, 310, 130, 27);
        jPanelPaciente1.add(txtCedula1);
        txtCedula1.setBounds(170, 130, 130, 26);
        jPanelPaciente1.add(txtNumTel1);
        txtNumTel1.setBounds(170, 230, 130, 26);

        jLabel27.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PACIENTE");
        jPanelPaciente1.add(jLabel27);
        jLabel27.setBounds(260, 70, 150, 15);
        jPanelPaciente1.add(dateFechaNac1);
        dateFechaNac1.setBounds(170, 180, 130, 26);

        jLabel28.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Fecha de Nacimiento ");
        jPanelPaciente1.add(jLabel28);
        jLabel28.setBounds(170, 160, 130, 15);

        jLabel29.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Correo Electrónico");
        jPanelPaciente1.add(jLabel29);
        jLabel29.setBounds(370, 210, 110, 15);

        jLabel30.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Cédula");
        jPanelPaciente1.add(jLabel30);
        jLabel30.setBounds(170, 110, 45, 15);

        jLabel31.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Cédula");
        jPanelPaciente1.add(jLabel31);
        jLabel31.setBounds(170, 110, 45, 15);
        jPanelPaciente1.add(txtNombre1);
        txtNombre1.setBounds(370, 130, 130, 26);

        jLabel32.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Nombre");
        jPanelPaciente1.add(jLabel32);
        jLabel32.setBounds(370, 110, 45, 15);
        jPanelPaciente1.add(txtUbicacion1);
        txtUbicacion1.setBounds(370, 180, 130, 26);

        btnGuardarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarPa1.setText("Guardar");
        jPanelPaciente1.add(btnGuardarPa1);
        btnGuardarPa1.setBounds(170, 280, 130, 27);

        btnEliminarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarPa1.setText("Eliminar");
        jPanelPaciente1.add(btnEliminarPa1);
        btnEliminarPa1.setBounds(170, 310, 130, 27);

        btnLimpiarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarPa1.setText("Limpiar");
        jPanelPaciente1.add(btnLimpiarPa1);
        btnLimpiarPa1.setBounds(270, 360, 130, 27);

        btnBuscarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarPa1.setText("Buscar");
        jPanelPaciente1.add(btnBuscarPa1);
        btnBuscarPa1.setBounds(370, 280, 130, 27);

        jLabel33.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Ubicación");
        jPanelPaciente1.add(jLabel33);
        jLabel33.setBounds(370, 160, 110, 15);
        jPanelPaciente1.add(txtCorreoElec1);
        txtCorreoElec1.setBounds(370, 230, 130, 26);

        jPanelTFacial.add(jPanelPaciente1);
        jPanelPaciente1.setBounds(0, 0, 0, 0);

        btnModificarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarTF.setText("Modificar");
        jPanelTFacial.add(btnModificarTF);
        btnModificarTF.setBounds(380, 250, 130, 27);

        btnLimpiarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarTF.setText("Limpiar");
        jPanelTFacial.add(btnLimpiarTF);
        btnLimpiarTF.setBounds(270, 330, 130, 27);

        btnGuardarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarTF.setText("Guardar");
        jPanelTFacial.add(btnGuardarTF);
        btnGuardarTF.setBounds(170, 250, 130, 27);

        btnBuscarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarTF.setText("Buscar");
        jPanelTFacial.add(btnBuscarTF);
        btnBuscarTF.setBounds(380, 290, 130, 27);

        btnEliminarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTF.setText("Eliminar");
        jPanelTFacial.add(btnEliminarTF);
        btnEliminarTF.setBounds(170, 290, 130, 27);

        jLabel34.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Código ");
        jPanelTFacial.add(jLabel34);
        jLabel34.setBounds(170, 160, 60, 15);
        jPanelTFacial.add(txtCodigoTF);
        txtCodigoTF.setBounds(170, 180, 130, 26);
        jPanelTFacial.add(txtPrecioTF);
        txtPrecioTF.setBounds(370, 180, 126, 26);

        jPanelPrincipal.add(jPanelTFacial, "TFacial");

        jPanelTCorporal.setBackground(new java.awt.Color(255, 204, 153));
        jPanelTCorporal.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tratamientos Corporales");
        jPanelTCorporal.add(jLabel4);
        jLabel4.setBounds(260, 70, 150, 15);

        btnGuardarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarTC.setText("Guardar");
        jPanelTCorporal.add(btnGuardarTC);
        btnGuardarTC.setBounds(170, 250, 130, 27);

        btnModificarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarTC.setText("Modificar");
        jPanelTCorporal.add(btnModificarTC);
        btnModificarTC.setBounds(380, 250, 130, 27);

        btnEliminarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTC.setText("Eliminar");
        btnEliminarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(btnEliminarTC);
        btnEliminarTC.setBounds(170, 290, 130, 27);

        btnBuscarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarTC.setText("Buscar");
        jPanelTCorporal.add(btnBuscarTC);
        btnBuscarTC.setBounds(380, 290, 130, 27);

        btnLimpiarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarTC.setText("Limpiar");
        btnLimpiarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(btnLimpiarTC);
        btnLimpiarTC.setBounds(280, 330, 130, 27);

        txtNombreTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(txtNombreTC);
        txtNombreTC.setBounds(170, 130, 140, 26);

        txtTipoTC.setEditable(false);
        txtTipoTC.setText("CORPORAL");
        jPanelTCorporal.add(txtTipoTC);
        txtTipoTC.setBounds(370, 130, 120, 26);

        txtCodigoTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(txtCodigoTC);
        txtCodigoTC.setBounds(170, 180, 140, 26);

        jLabel35.setText("Nombre");
        jPanelTCorporal.add(jLabel35);
        jLabel35.setBounds(170, 110, 60, 16);

        jLabel36.setText("Código");
        jPanelTCorporal.add(jLabel36);
        jLabel36.setBounds(170, 160, 80, 16);

        jLabel37.setText("Tipo");
        jPanelTCorporal.add(jLabel37);
        jLabel37.setBounds(370, 110, 70, 16);

        jLabel38.setText("Precio (ej: 12.00)");
        jPanelTCorporal.add(jLabel38);
        jLabel38.setBounds(370, 160, 110, 16);
        jPanelTCorporal.add(txtPrecioTC);
        txtPrecioTC.setBounds(370, 180, 120, 26);

        jPanelPrincipal.add(jPanelTCorporal, "TCorporal");

        jPanelMedicoActivo.setBackground(new java.awt.Color(255, 255, 204));
        jPanelMedicoActivo.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dirección");
        jPanelMedicoActivo.add(jLabel5);
        jLabel5.setBounds(100, 270, 120, 16);
        jPanelMedicoActivo.add(dateFechaMA);
        dateFechaMA.setBounds(200, 220, 150, 26);

        txtCedulaMA.setText(" ");
        txtCedulaMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaMAActionPerformed(evt);
            }
        });
        jPanelMedicoActivo.add(txtCedulaMA);
        txtCedulaMA.setBounds(200, 170, 150, 26);

        txtNombreMA.setText(" ");
        jPanelMedicoActivo.add(txtNombreMA);
        txtNombreMA.setBounds(510, 170, 160, 26);

        txtTelefonoMA.setText(" ");
        txtTelefonoMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoMAActionPerformed(evt);
            }
        });
        jPanelMedicoActivo.add(txtTelefonoMA);
        txtTelefonoMA.setBounds(510, 220, 160, 26);

        txtCorreoMA.setText(" ");
        jPanelMedicoActivo.add(txtCorreoMA);
        txtCorreoMA.setBounds(200, 320, 150, 26);

        txtEstadoMA.setText(" ");
        txtEstadoMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoMAActionPerformed(evt);
            }
        });
        jPanelMedicoActivo.add(txtEstadoMA);
        txtEstadoMA.setBounds(510, 270, 160, 26);

        txtDireccionMA.setText(" ");
        jPanelMedicoActivo.add(txtDireccionMA);
        txtDireccionMA.setBounds(200, 270, 150, 26);

        jLabel57.setFont(new java.awt.Font("Rondalo", 1, 24)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Médicos Activos");
        jPanelMedicoActivo.add(jLabel57);
        jLabel57.setBounds(300, 90, 220, 40);

        jLabel58.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Cédula");
        jPanelMedicoActivo.add(jLabel58);
        jLabel58.setBounds(130, 170, 70, 16);

        jLabel59.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Fecha contratación");
        jPanelMedicoActivo.add(jLabel59);
        jLabel59.setBounds(50, 220, 150, 16);

        jLabel60.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Nombre");
        jPanelMedicoActivo.add(jLabel60);
        jLabel60.setBounds(410, 170, 120, 16);

        jLabel61.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Correo electrónico");
        jPanelMedicoActivo.add(jLabel61);
        jLabel61.setBounds(50, 320, 160, 16);

        jLabel62.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Teléfono");
        jPanelMedicoActivo.add(jLabel62);
        jLabel62.setBounds(410, 220, 120, 16);

        jLabel63.setFont(new java.awt.Font("Rondalo", 1, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Estado");
        jPanelMedicoActivo.add(jLabel63);
        jLabel63.setBounds(430, 270, 90, 16);

        btnEliminarMA.setText("Eliminar");
        jPanelMedicoActivo.add(btnEliminarMA);
        btnEliminarMA.setBounds(530, 390, 110, 27);

        btnGuardarMA.setText("Guardar");
        jPanelMedicoActivo.add(btnGuardarMA);
        btnGuardarMA.setBounds(140, 390, 110, 27);

        btnModificarMA.setText("Modificar");
        jPanelMedicoActivo.add(btnModificarMA);
        btnModificarMA.setBounds(270, 390, 110, 27);

        btnBuscarMA.setText("Buscar");
        jPanelMedicoActivo.add(btnBuscarMA);
        btnBuscarMA.setBounds(400, 390, 110, 27);

        jPanelPrincipal.add(jPanelMedicoActivo, "MActivo");

        jPanelMedicoInactivo.setBackground(new java.awt.Color(221, 160, 221));
        jPanelMedicoInactivo.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Médicos Inactivos");
        jPanelMedicoInactivo.add(jLabel6);
        jLabel6.setBounds(260, 70, 150, 15);
        jPanelMedicoInactivo.add(txtNumCedulaMI);
        txtNumCedulaMI.setBounds(180, 130, 130, 26);
        jPanelMedicoInactivo.add(txtNombreMI);
        txtNombreMI.setBounds(370, 130, 130, 26);

        jLabel44.setText("Número de Cédula");
        jPanelMedicoInactivo.add(jLabel44);
        jLabel44.setBounds(170, 110, 110, 16);

        jLabel45.setText("Nombre");
        jPanelMedicoInactivo.add(jLabel45);
        jLabel45.setBounds(370, 110, 160, 16);

        txtCorreoMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(txtCorreoMI);
        txtCorreoMI.setBounds(370, 230, 130, 26);

        txtNumTelefonoMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumTelefonoMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(txtNumTelefonoMI);
        txtNumTelefonoMI.setBounds(370, 180, 130, 26);

        jLabel46.setText("Correo Electrónico");
        jPanelMedicoInactivo.add(jLabel46);
        jLabel46.setBounds(370, 210, 120, 20);

        jLabel47.setText("Número de Teléfono");
        jPanelMedicoInactivo.add(jLabel47);
        jLabel47.setBounds(370, 160, 130, 16);

        jLabel48.setText("Fecha de Contratación");
        jPanelMedicoInactivo.add(jLabel48);
        jLabel48.setBounds(170, 160, 170, 20);
        jPanelMedicoInactivo.add(dateFechaContratacionMI);
        dateFechaContratacionMI.setBounds(180, 180, 150, 26);
        jPanelMedicoInactivo.add(txtDireccionMI);
        txtDireccionMI.setBounds(180, 230, 130, 26);

        txtEstadoMI.setEditable(false);
        txtEstadoMI.setText("0");
        jPanelMedicoInactivo.add(txtEstadoMI);
        txtEstadoMI.setBounds(520, 130, 68, 26);

        jLabel49.setText("Dirección");
        jPanelMedicoInactivo.add(jLabel49);
        jLabel49.setBounds(170, 210, 80, 16);

        jLabel50.setText("Estado");
        jPanelMedicoInactivo.add(jLabel50);
        jLabel50.setBounds(520, 110, 80, 16);

        btnGuardarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarMI.setText("Guardar");
        jPanelMedicoInactivo.add(btnGuardarMI);
        btnGuardarMI.setBounds(170, 280, 120, 27);

        btnModificarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarMI.setText("Modificar");
        btnModificarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(btnModificarMI);
        btnModificarMI.setBounds(370, 280, 130, 30);

        btnEliminarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarMI.setText("Eliminar");
        btnEliminarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(btnEliminarMI);
        btnEliminarMI.setBounds(170, 310, 120, 27);

        btnBuscarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarMI.setText("Buscar");
        btnBuscarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(btnBuscarMI);
        btnBuscarMI.setBounds(370, 310, 130, 27);

        btnLimpiarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarMI.setText("Limpiar");
        jPanelMedicoInactivo.add(btnLimpiarMI);
        btnLimpiarMI.setBounds(280, 350, 130, 27);

        jPanelPrincipal.add(jPanelMedicoInactivo, "MInactivo");

        jPanelCMNorte.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Comentario");
        jPanelCMNorte.add(jLabel8);
        jLabel8.setBounds(180, 160, 140, 15);

        jLabel64.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Citas Médicas de la Surcursal - Norte");
        jPanelCMNorte.add(jLabel64);
        jLabel64.setBounds(220, 70, 260, 15);
        jPanelCMNorte.add(txtCodigoCMN);
        txtCodigoCMN.setBounds(180, 130, 130, 26);

        jLabel19.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Sucursal");
        jPanelCMNorte.add(jLabel19);
        jLabel19.setBounds(370, 210, 140, 15);

        txtAreaComenCMN.setColumns(20);
        txtAreaComenCMN.setRows(5);
        jScrollPane1.setViewportView(txtAreaComenCMN);

        jPanelCMNorte.add(jScrollPane1);
        jScrollPane1.setBounds(180, 180, 130, 80);

        jLabel20.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Hora de la Cita Médica ");
        jPanelCMNorte.add(jLabel20);
        jLabel20.setBounds(370, 160, 140, 15);
        jPanelCMNorte.add(dateChooserCMN);
        dateChooserCMN.setBounds(370, 130, 130, 26);

        jLabel21.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Código de la Cita Médica");
        jPanelCMNorte.add(jLabel21);
        jLabel21.setBounds(180, 110, 140, 15);

        spinHoraN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanelCMNorte.add(spinHoraN);
        spinHoraN.setBounds(370, 180, 68, 26);

        spinMinN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));
        jPanelCMNorte.add(spinMinN);
        spinMinN.setBounds(440, 180, 68, 26);

        jLabel22.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Fecha de la Cita Médica ");
        jPanelCMNorte.add(jLabel22);
        jLabel22.setBounds(370, 110, 140, 15);
        jPanelCMNorte.add(txtSucursalCMN);
        txtSucursalCMN.setBounds(370, 230, 130, 26);

        btnEliminarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCMN.setText("Eliminar");
        jPanelCMNorte.add(btnEliminarCMN);
        btnEliminarCMN.setBounds(180, 310, 130, 27);

        btnLimpiarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarCMN.setText("Limpiar");
        jPanelCMNorte.add(btnLimpiarCMN);
        btnLimpiarCMN.setBounds(280, 350, 130, 27);

        btnGuardarCMN2.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarCMN2.setText("Guardar");
        btnGuardarCMN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCMN2ActionPerformed(evt);
            }
        });
        jPanelCMNorte.add(btnGuardarCMN2);
        btnGuardarCMN2.setBounds(180, 280, 130, 27);

        btnModificarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarCMN.setText("Modificar");
        jPanelCMNorte.add(btnModificarCMN);
        btnModificarCMN.setBounds(370, 280, 130, 27);

        btnBuscarCMN1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCMN1.setText("Buscar");
        btnBuscarCMN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCMN1ActionPerformed(evt);
            }
        });
        jPanelCMNorte.add(btnBuscarCMN1);
        btnBuscarCMN1.setBounds(370, 310, 130, 27);

        jPanelPrincipal.add(jPanelCMNorte, "CMNorte");

        jPanelCMSur.setBackground(new java.awt.Color(204, 255, 204));
        jPanelCMSur.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Citas Médicas de la Sucursal - Sur");
        jPanelCMSur.add(jLabel7);
        jLabel7.setBounds(200, 70, 260, 15);
        jPanelCMSur.add(txtCodigoCMS);
        txtCodigoCMS.setBounds(180, 130, 130, 26);

        jLabel39.setText("Código de la Cíta Médica");
        jPanelCMSur.add(jLabel39);
        jLabel39.setBounds(180, 110, 160, 16);

        jLabel40.setText("Fecha de la Cita Médica");
        jPanelCMSur.add(jLabel40);
        jLabel40.setBounds(370, 210, 150, 16);
        jPanelCMSur.add(dateChooserCMS);
        dateChooserCMS.setBounds(370, 230, 140, 26);

        jLabel41.setText("Comentario");
        jPanelCMSur.add(jLabel41);
        jLabel41.setBounds(180, 160, 120, 16);

        txtComenAreaCMS.setColumns(20);
        txtComenAreaCMS.setRows(5);
        jScrollPane2.setViewportView(txtComenAreaCMS);

        jPanelCMSur.add(jScrollPane2);
        jScrollPane2.setBounds(180, 180, 130, 80);

        jLabel42.setText("Hora de la cita");
        jPanelCMSur.add(jLabel42);
        jLabel42.setBounds(370, 160, 110, 16);

        jLabel43.setText("Sucursal");
        jPanelCMSur.add(jLabel43);
        jLabel43.setBounds(370, 110, 80, 16);
        jPanelCMSur.add(spinHoraS);
        spinHoraS.setBounds(370, 180, 68, 26);
        jPanelCMSur.add(spinMinSur);
        spinMinSur.setBounds(440, 180, 68, 26);

        txtSucursalS.setEditable(false);
        txtSucursalS.setText("SUR");
        jPanelCMSur.add(txtSucursalS);
        txtSucursalS.setBounds(370, 130, 130, 26);

        btnGuardarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarCMS.setText("Guardar");
        jPanelCMSur.add(btnGuardarCMS);
        btnGuardarCMS.setBounds(180, 280, 130, 27);

        btnModificarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarCMS.setText("Modificar");
        btnModificarCMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCMSActionPerformed(evt);
            }
        });
        jPanelCMSur.add(btnModificarCMS);
        btnModificarCMS.setBounds(370, 280, 130, 27);

        btnEliminarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCMS.setText("Eliminar");
        jPanelCMSur.add(btnEliminarCMS);
        btnEliminarCMS.setBounds(180, 310, 130, 27);

        btnBuscarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCMS.setText("Buscar");
        btnBuscarCMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCMSActionPerformed(evt);
            }
        });
        jPanelCMSur.add(btnBuscarCMS);
        btnBuscarCMS.setBounds(370, 310, 130, 27);

        btnLimpiarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarCMS.setText("Limpiar");
        btnLimpiarCMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCMSActionPerformed(evt);
            }
        });
        jPanelCMSur.add(btnLimpiarCMS);
        btnLimpiarCMS.setBounds(280, 350, 130, 27);

        jPanelPrincipal.add(jPanelCMSur, "CMSur");

        jPanelPagoP.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Rondalo", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pago Pendiente");
        jPanelPagoP.add(jLabel9);
        jLabel9.setBounds(320, 80, 180, 40);

        txtIdPP.setText(" ");
        jPanelPagoP.add(txtIdPP);
        txtIdPP.setBounds(240, 140, 80, 26);

        txtEstadoPP.setText(" ");
        jPanelPagoP.add(txtEstadoPP);
        txtEstadoPP.setBounds(490, 180, 150, 26);

        jLabel65.setText("Id");
        jPanelPagoP.add(jLabel65);
        jLabel65.setBounds(220, 150, 10, 16);

        jLabel66.setText("Fecha Límite ");
        jPanelPagoP.add(jLabel66);
        jLabel66.setBounds(374, 150, 110, 16);

        jLabel67.setText("Cantidad");
        jPanelPagoP.add(jLabel67);
        jLabel67.setBounds(180, 190, 48, 16);

        btnGuardarPP.setText("Guardar");
        jPanelPagoP.add(btnGuardarPP);
        btnGuardarPP.setBounds(163, 260, 90, 27);

        btnModificarPP.setText("Modificar");
        jPanelPagoP.add(btnModificarPP);
        btnModificarPP.setBounds(280, 260, 100, 27);

        jLabel68.setText("Estado (Activo o Inactivo)");
        jPanelPagoP.add(jLabel68);
        jLabel68.setBounds(320, 190, 180, 16);
        jPanelPagoP.add(txtCantidadPP);
        txtCantidadPP.setBounds(240, 180, 80, 26);

        btnBuscarPP.setText("Buscar");
        jPanelPagoP.add(btnBuscarPP);
        btnBuscarPP.setBounds(387, 260, 90, 27);

        btnEliminarPP.setText("Eliminar");
        jPanelPagoP.add(btnEliminarPP);
        btnEliminarPP.setBounds(480, 260, 120, 27);
        jPanelPagoP.add(dateFechaPP);
        dateFechaPP.setBounds(490, 140, 160, 26);

        jPanelPrincipal.add(jPanelPagoP, "PagoP");

        jPanelPagoR.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Rondalo", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Pago Realizado");
        jPanelPagoR.add(jLabel10);
        jLabel10.setBounds(280, 60, 300, 50);

        txtCantidadPR.setText(" ");
        txtCantidadPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadPRActionPerformed(evt);
            }
        });
        jPanelPagoR.add(txtCantidadPR);
        txtCantidadPR.setBounds(240, 190, 100, 26);

        txtMetodoPR.setText(" ");
        txtMetodoPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoPRActionPerformed(evt);
            }
        });
        jPanelPagoR.add(txtMetodoPR);
        txtMetodoPR.setBounds(240, 240, 100, 26);
        jPanelPagoR.add(dateFechaPR);
        dateFechaPR.setBounds(540, 190, 180, 26);

        txtHoraPR.setText(" ");
        jPanelPagoR.add(txtHoraPR);
        txtHoraPR.setBounds(570, 240, 70, 26);

        txtMinutoPR.setText(" ");
        jPanelPagoR.add(txtMinutoPR);
        txtMinutoPR.setBounds(650, 240, 70, 26);

        jLabel69.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel69.setText(":");
        jPanelPagoR.add(jLabel69);
        jLabel69.setBounds(640, 240, 10, 16);

        jLabel70.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel70.setText("ID");
        jPanelPagoR.add(jLabel70);
        jLabel70.setBounds(220, 160, 80, 16);

        jLabel71.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel71.setText("Método de pago");
        jPanelPagoR.add(jLabel71);
        jLabel71.setBounds(120, 240, 130, 16);

        jLabel72.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel72.setText("Fecha cancelación");
        jPanelPagoR.add(jLabel72);
        jLabel72.setBounds(400, 200, 170, 16);

        jLabel73.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        jLabel73.setText("00-60");
        jPanelPagoR.add(jLabel73);
        jLabel73.setBounds(670, 270, 40, 16);

        jLabel74.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel74.setText("Hora de cancelación");
        jPanelPagoR.add(jLabel74);
        jLabel74.setBounds(400, 240, 170, 16);

        jLabel75.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        jLabel75.setText("01-24");
        jPanelPagoR.add(jLabel75);
        jLabel75.setBounds(580, 270, 40, 16);

        btnGuardarPR.setText("Guardar");
        jPanelPagoR.add(btnGuardarPR);
        btnGuardarPR.setBounds(220, 340, 76, 27);

        btnModificarPR.setText("Modificar");
        jPanelPagoR.add(btnModificarPR);
        btnModificarPR.setBounds(320, 340, 90, 27);

        btnBuscarPR.setText("Buscar");
        jPanelPagoR.add(btnBuscarPR);
        btnBuscarPR.setBounds(430, 340, 76, 27);

        btnEliminarPR.setText("Eliminar");
        jPanelPagoR.add(btnEliminarPR);
        btnEliminarPR.setBounds(523, 340, 100, 27);

        txtIdPR.setText(" ");
        jPanelPagoR.add(txtIdPR);
        txtIdPR.setBounds(240, 150, 100, 26);

        jLabel76.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel76.setText("Cantidad");
        jPanelPagoR.add(jLabel76);
        jLabel76.setBounds(170, 200, 80, 16);

        jPanelPrincipal.add(jPanelPagoR, "PagoR");

        jPanelPacienteVM.setBackground(new java.awt.Color(255, 204, 255));
        jPanelPacienteVM.setLayout(null);

        jLabel77.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setText("Número de Teléfono ");
        jPanelPacienteVM.add(jLabel77);
        jLabel77.setBounds(170, 210, 130, 15);
        jPanelPacienteVM.add(txtCedulaPAVM);
        txtCedulaPAVM.setBounds(170, 130, 130, 26);
        jPanelPacienteVM.add(txtNumTelPAVM);
        txtNumTelPAVM.setBounds(170, 230, 130, 26);

        jLabel78.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("PACIENTE");
        jPanelPacienteVM.add(jLabel78);
        jLabel78.setBounds(260, 70, 150, 15);
        jPanelPacienteVM.add(dateFechaNacPAVM);
        dateFechaNacPAVM.setBounds(170, 180, 130, 26);

        jLabel79.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel79.setText("Fecha de Nacimiento ");
        jPanelPacienteVM.add(jLabel79);
        jLabel79.setBounds(170, 160, 130, 15);

        jLabel80.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel80.setText("Correo Electrónico");
        jPanelPacienteVM.add(jLabel80);
        jLabel80.setBounds(370, 210, 110, 15);

        jLabel81.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Cédula");
        jPanelPacienteVM.add(jLabel81);
        jLabel81.setBounds(170, 110, 45, 15);

        jLabel82.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Cédula");
        jPanelPacienteVM.add(jLabel82);
        jLabel82.setBounds(170, 110, 45, 15);
        jPanelPacienteVM.add(txtNombrePAVM);
        txtNombrePAVM.setBounds(370, 130, 130, 26);

        jLabel83.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Nombre");
        jPanelPacienteVM.add(jLabel83);
        jLabel83.setBounds(370, 110, 45, 15);
        jPanelPacienteVM.add(txtUbicacionPAVM);
        txtUbicacionPAVM.setBounds(370, 180, 130, 26);

        btnLimpiarPaVM.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarPaVM.setText("Limpiar");
        jPanelPacienteVM.add(btnLimpiarPaVM);
        btnLimpiarPaVM.setBounds(280, 360, 130, 27);

        jLabel84.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel84.setText("Ubicación");
        jPanelPacienteVM.add(jLabel84);
        jLabel84.setBounds(370, 160, 110, 15);
        jPanelPacienteVM.add(txtCorreoElecPAVM);
        txtCorreoElecPAVM.setBounds(370, 230, 130, 26);

        btnBuscarPaVM.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarPaVM.setText("Buscar");
        jPanelPacienteVM.add(btnBuscarPaVM);
        btnBuscarPaVM.setBounds(280, 320, 130, 27);

        jPanelPrincipal.add(jPanelPacienteVM, "PacienteVM");

        jPanelUsuarioVM.setBackground(new java.awt.Color(204, 255, 255));
        jPanelUsuarioVM.setLayout(null);

        jLabel87.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel87.setText("Correo Electrónico");
        jPanelUsuarioVM.add(jLabel87);
        jLabel87.setBounds(400, 170, 150, 16);

        jLabel88.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel88.setText("Estado");
        jPanelUsuarioVM.add(jLabel88);
        jLabel88.setBounds(150, 260, 70, 16);
        jPanelUsuarioVM.add(txtEstadoUsVM);
        txtEstadoUsVM.setBounds(150, 280, 140, 26);
        jPanelUsuarioVM.add(txtCorreoUsVM);
        txtCorreoUsVM.setBounds(400, 190, 180, 26);
        jPanelUsuarioVM.add(txtIdUs1);
        txtIdUs1.setBounds(0, 10, 10, 26);

        btnLimpiarUsVM.setText("Limpiar");
        jPanelUsuarioVM.add(btnLimpiarUsVM);
        btnLimpiarUsVM.setBounds(320, 410, 80, 27);

        listRolUsVM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario", "Médico" }));
        listRolUsVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRolUsVMActionPerformed(evt);
            }
        });
        jPanelUsuarioVM.add(listRolUsVM);
        listRolUsVM.setBounds(400, 280, 180, 26);

        jLabel89.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("USUARIOS");
        jPanelUsuarioVM.add(jLabel89);
        jLabel89.setBounds(290, 130, 140, 22);

        jLabel90.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel90.setText("Rol");
        jPanelUsuarioVM.add(jLabel90);
        jLabel90.setBounds(400, 260, 70, 16);

        jLabel92.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel92.setText("Nombre");
        jPanelUsuarioVM.add(jLabel92);
        jLabel92.setBounds(150, 170, 70, 16);
        jPanelUsuarioVM.add(txtNombreUsVM);
        txtNombreUsVM.setBounds(150, 190, 140, 26);

        btnBuscarUsVM.setText("Buscar");
        jPanelUsuarioVM.add(btnBuscarUsVM);
        btnBuscarUsVM.setBounds(320, 360, 80, 27);

        jPanelPrincipal.add(jPanelUsuarioVM, "UsuarioVM");

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);
        setJMenuBar(mbMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTCActionPerformed

    private void txtCodigoTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoTCActionPerformed

    private void btnLimpiarCMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarCMSActionPerformed

    private void btnBuscarCMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCMSActionPerformed

    private void btnModificarCMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarCMSActionPerformed

    private void btnBuscarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMIActionPerformed

    private void btnModificarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarMIActionPerformed

    private void btnEliminarTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarTCActionPerformed

    private void btnLimpiarTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarTCActionPerformed

    private void btnGuardarCMN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCMN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCMN2ActionPerformed

    private void btnBuscarCMN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCMN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCMN1ActionPerformed

    private void btnEliminarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMIActionPerformed

    private void txtCorreoMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMIActionPerformed

    private void txtNumTelefonoMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumTelefonoMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumTelefonoMIActionPerformed

     private void listRolUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRolUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listRolUsActionPerformed

    private void txtMetodoPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetodoPRActionPerformed

    private void txtCantidadPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadPRActionPerformed

    private void txtCedulaMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMAActionPerformed

    private void txtTelefonoMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMAActionPerformed

    private void listRolUsVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRolUsVMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listRolUsVMActionPerformed

    private void txtEstadoMAActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }//
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmContenedorPrincipal().setVisible(true));
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarCMN1;
    public javax.swing.JButton btnBuscarCMS;
    public javax.swing.JButton btnBuscarMA;
    public javax.swing.JButton btnBuscarMI;
    public javax.swing.JButton btnBuscarPP;
    public javax.swing.JButton btnBuscarPR;
    public javax.swing.JButton btnBuscarPa;
    public javax.swing.JButton btnBuscarPa1;
    public javax.swing.JButton btnBuscarPaVM;
    public javax.swing.JButton btnBuscarTC;
    public javax.swing.JButton btnBuscarTF;
    public javax.swing.JButton btnBuscarUs;
    public javax.swing.JButton btnBuscarUsVM;
    public javax.swing.JButton btnEliminarCMN;
    public javax.swing.JButton btnEliminarCMS;
    public javax.swing.JButton btnEliminarMA;
    public javax.swing.JButton btnEliminarMI;
    public javax.swing.JButton btnEliminarPP;
    public javax.swing.JButton btnEliminarPR;
    public javax.swing.JButton btnEliminarPa;
    public javax.swing.JButton btnEliminarPa1;
    public javax.swing.JButton btnEliminarTC;
    public javax.swing.JButton btnEliminarTF;
    public javax.swing.JButton btnEliminarUs;
    public javax.swing.JButton btnGuardarCMN2;
    public javax.swing.JButton btnGuardarCMS;
    public javax.swing.JButton btnGuardarMA;
    public javax.swing.JButton btnGuardarMI;
    public javax.swing.JButton btnGuardarPP;
    public javax.swing.JButton btnGuardarPR;
    public javax.swing.JButton btnGuardarPa;
    public javax.swing.JButton btnGuardarPa1;
    public javax.swing.JButton btnGuardarTC;
    public javax.swing.JButton btnGuardarTF;
    public javax.swing.JButton btnGuardarUs;
    public javax.swing.JButton btnLimpiarCMN;
    public javax.swing.JButton btnLimpiarCMS;
    public javax.swing.JButton btnLimpiarMI;
    public javax.swing.JButton btnLimpiarPa;
    public javax.swing.JButton btnLimpiarPa1;
    public javax.swing.JButton btnLimpiarPaVM;
    public javax.swing.JButton btnLimpiarTC;
    public javax.swing.JButton btnLimpiarTF;
    public javax.swing.JButton btnLimpiarUsVM;
    public javax.swing.JButton btnModificarCMN;
    public javax.swing.JButton btnModificarCMS;
    public javax.swing.JButton btnModificarMA;
    public javax.swing.JButton btnModificarMI;
    public javax.swing.JButton btnModificarPP;
    public javax.swing.JButton btnModificarPR;
    public javax.swing.JButton btnModificarPa;
    public javax.swing.JButton btnModificarPa1;
    public javax.swing.JButton btnModificarTC;
    public javax.swing.JButton btnModificarTF;
    public javax.swing.JButton btnModificarUs;
    public com.toedter.calendar.JDateChooser dateChooserCMN;
    public com.toedter.calendar.JDateChooser dateChooserCMS;
    public com.toedter.calendar.JDateChooser dateFechaContratacionMI;
    public com.toedter.calendar.JDateChooser dateFechaMA;
    public com.toedter.calendar.JDateChooser dateFechaNac1;
    public com.toedter.calendar.JDateChooser dateFechaNacPA;
    public com.toedter.calendar.JDateChooser dateFechaNacPAVM;
    public com.toedter.calendar.JDateChooser dateFechaPP;
    public com.toedter.calendar.JDateChooser dateFechaPR;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    public javax.swing.JPanel jPanelCMNorte;
    public javax.swing.JPanel jPanelCMSur;
    private javax.swing.JPanel jPanelMedicoActivo;
    public javax.swing.JPanel jPanelMedicoInactivo;
    public javax.swing.JPanel jPanelPaciente;
    public javax.swing.JPanel jPanelPaciente1;
    public javax.swing.JPanel jPanelPacienteVM;
    private javax.swing.JPanel jPanelPagoP;
    private javax.swing.JPanel jPanelPagoR;
    public javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTCorporal;
    public javax.swing.JPanel jPanelTFacial;
    public javax.swing.JPanel jPanelUsuario;
    public javax.swing.JPanel jPanelUsuarioVM;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> listRolUs;
    public javax.swing.JComboBox<String> listRolUsVM;
    private javax.swing.JMenuBar mbMenuBar;
    public javax.swing.JSpinner spinHoraN;
    public javax.swing.JSpinner spinHoraS;
    public javax.swing.JSpinner spinMinN;
    public javax.swing.JSpinner spinMinSur;
    public javax.swing.JTextArea txtAreaComenCMN;
    public javax.swing.JTextField txtCantidadPP;
    public javax.swing.JTextField txtCantidadPR;
    public javax.swing.JTextField txtCedula1;
    public javax.swing.JTextField txtCedulaMA;
    public javax.swing.JTextField txtCedulaPA;
    public javax.swing.JTextField txtCedulaPAVM;
    public javax.swing.JTextField txtCodigoCMN;
    public javax.swing.JTextField txtCodigoCMS;
    public javax.swing.JTextField txtCodigoTC;
    public javax.swing.JTextField txtCodigoTF;
    public javax.swing.JTextArea txtComenAreaCMS;
    public javax.swing.JPasswordField txtConfNuevaPassUs;
    public javax.swing.JTextField txtCorreoElec1;
    public javax.swing.JTextField txtCorreoElecPA;
    public javax.swing.JTextField txtCorreoElecPAVM;
    public javax.swing.JTextField txtCorreoMA;
    public javax.swing.JTextField txtCorreoMI;
    public javax.swing.JTextField txtCorreoUs;
    public javax.swing.JTextField txtCorreoUsVM;
    public javax.swing.JTextField txtDireccionMA;
    public javax.swing.JTextField txtDireccionMI;
    public javax.swing.JTextField txtEstadoMA;
    public javax.swing.JTextField txtEstadoMI;
    public javax.swing.JTextField txtEstadoPP;
    public javax.swing.JTextField txtEstadoUs;
    public javax.swing.JTextField txtEstadoUsVM;
    public javax.swing.JTextField txtHoraPR;
    public javax.swing.JTextField txtIdPP;
    public javax.swing.JTextField txtIdPR;
    public javax.swing.JTextField txtIdUs1;
    public javax.swing.JTextField txtIdUsVM;
    public javax.swing.JTextField txtMetodoPR;
    public javax.swing.JTextField txtMinutoPR;
    public javax.swing.JTextField txtNombre1;
    public javax.swing.JTextField txtNombreMA;
    public javax.swing.JTextField txtNombreMI;
    public javax.swing.JTextField txtNombrePA;
    public javax.swing.JTextField txtNombrePAVM;
    public javax.swing.JTextField txtNombreTC;
    public javax.swing.JTextField txtNombreTF;
    public javax.swing.JTextField txtNombreUs;
    public javax.swing.JTextField txtNombreUsVM;
    public javax.swing.JPasswordField txtNuevaPassUs;
    public javax.swing.JTextField txtNumCedulaMI;
    public javax.swing.JTextField txtNumTel1;
    public javax.swing.JTextField txtNumTelPA;
    public javax.swing.JTextField txtNumTelPAVM;
    public javax.swing.JTextField txtNumTelefonoMI;
    public javax.swing.JFormattedTextField txtPrecioTC;
    public javax.swing.JFormattedTextField txtPrecioTF;
    public javax.swing.JTextField txtSucursalCMN;
    public javax.swing.JTextField txtSucursalS;
    public javax.swing.JTextField txtTelefonoMA;
    public javax.swing.JTextField txtTipoTC;
    public javax.swing.JTextField txtTipoTF;
    public javax.swing.JTextField txtUbicacion1;
    public javax.swing.JTextField txtUbicacionPA;
    public javax.swing.JTextField txtUbicacionPAVM;
    // End of variables declaration//GEN-END:variables
 // Declaración de los menús
    public javax.swing.JMenu jMenuPago;
    public javax.swing.JMenuItem jMenuItemPagoPendiente;
    public javax.swing.JMenuItem jMenuItemPagoRealizado;

    public javax.swing.JMenu jMenuMedicos;
    public javax.swing.JMenuItem jMenuItemMedicoActivos;
    public javax.swing.JMenuItem jMenuItemMedicoInactivos;
    
    public javax.swing.JMenu jMenuCitaMedica;
    public javax.swing.JMenuItem jMenuItemCitaMedicaNorte;
    public javax.swing.JMenuItem jMenuItemCitaMedicaSur;
    
    public javax.swing.JMenu jMenuTratamientos;
    public javax.swing.JMenuItem jMenuItemTratamientosFacial;
    public javax.swing.JMenuItem jMenuItemTratamientosCorporal;

    public javax.swing.JMenu jMenuPaciente;
    public javax.swing.JMenuItem jMenuItemPaciente;
    public javax.swing.JMenuItem jMenuItemPacienteM;
    public javax.swing.JMenu jMenuUsuarios;
    public javax.swing.JMenuItem jMenuItemUsuario;
    public javax.swing.JMenuItem jMenuItemUsuarioM;
    
    
    public String logo_Paciente = "/imagenes/paciente.png";
    public String logo_Usuario= "/imagenes/usuario.png";
    public String logo_Tratamientos= "/imagenes/tratamientos.png";
    public String logo_CitaMedica= "/imagenes/citaMedica.png";
    public String logo_Medico= "/imagenes/medico.png";
    public String logo_Pago= "/imagenes/pago.png";
    public Color mColorFondoMenu= new Color(150,250,220);


    // End of variables declaration         
}
