/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

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
        spinMinN.setEditor(new JSpinner.NumberEditor(spinHoraN, "00"));
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
        jMenuPaciente = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenuItem();
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
        
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.setIcon(obtenerImagen(logo_Usuario));
        jMenuUsuarios.setOpaque(true);
        jMenuUsuarios.setBackground(mColorFondoMenu);
        jMenuUsuarios.setForeground(Color.WHITE);
        jMenuUsuarios.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 40));

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
        jPanelPaciente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModificarPa = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNumTel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dateFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        btnGuardarPa = new javax.swing.JButton();
        btnEliminarPa = new javax.swing.JButton();
        btnLimpiarPa = new javax.swing.JButton();
        btnBuscarPa = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCorreoElec = new javax.swing.JTextField();
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
        txtPrecioTc = new javax.swing.JFormattedTextField();
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
        jLabel18 = new javax.swing.JLabel();
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
        jPanelPagoR = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        mbMenuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        jPanelUsuario.setBackground(new java.awt.Color(204, 255, 255));
        jPanelUsuario.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIOS");
        jPanelUsuario.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 299);

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
        btnModificarPa.setBounds(370, 310, 130, 23);
        jPanelPaciente.add(txtCedula);
        txtCedula.setBounds(170, 130, 130, 22);
        jPanelPaciente.add(txtNumTel);
        txtNumTel.setBounds(170, 230, 130, 22);

        jLabel11.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PACIENTE");
        jPanelPaciente.add(jLabel11);
        jLabel11.setBounds(260, 70, 150, 15);
        jPanelPaciente.add(dateFechaNac);
        dateFechaNac.setBounds(170, 180, 130, 22);

        jLabel12.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Fecha de Nacimiento ");
        jPanelPaciente.add(jLabel12);
        jLabel12.setBounds(170, 160, 130, 15);

        jLabel13.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Correo Electrónico");
        jPanelPaciente.add(jLabel13);
        jLabel13.setBounds(370, 210, 110, 15);

        jLabel14.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cédula");
        jPanelPaciente.add(jLabel14);
        jLabel14.setBounds(170, 110, 45, 15);

        jLabel15.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cédula");
        jPanelPaciente.add(jLabel15);
        jLabel15.setBounds(170, 110, 45, 15);
        jPanelPaciente.add(txtNombre);
        txtNombre.setBounds(370, 130, 130, 22);

        jLabel16.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Nombre");
        jPanelPaciente.add(jLabel16);
        jLabel16.setBounds(370, 110, 45, 15);
        jPanelPaciente.add(txtUbicacion);
        txtUbicacion.setBounds(370, 180, 130, 22);

        btnGuardarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarPa.setText("Guardar");
        jPanelPaciente.add(btnGuardarPa);
        btnGuardarPa.setBounds(170, 280, 130, 23);

        btnEliminarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarPa.setText("Eliminar");
        jPanelPaciente.add(btnEliminarPa);
        btnEliminarPa.setBounds(170, 310, 130, 23);

        btnLimpiarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarPa.setText("Limpiar");
        jPanelPaciente.add(btnLimpiarPa);
        btnLimpiarPa.setBounds(270, 360, 130, 23);

        btnBuscarPa.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarPa.setText("Buscar");
        jPanelPaciente.add(btnBuscarPa);
        btnBuscarPa.setBounds(370, 280, 130, 23);

        jLabel17.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Ubicación");
        jPanelPaciente.add(jLabel17);
        jLabel17.setBounds(370, 160, 110, 15);
        jPanelPaciente.add(txtCorreoElec);
        txtCorreoElec.setBounds(370, 230, 130, 22);

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
        txtNombreTF.setBounds(170, 130, 130, 22);

        jLabel25.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Tipo");
        jPanelTFacial.add(jLabel25);
        jLabel25.setBounds(370, 110, 130, 15);
        jPanelTFacial.add(txtTipoTF);
        txtTipoTF.setBounds(370, 130, 130, 22);

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
        btnModificarPa1.setBounds(370, 310, 130, 23);
        jPanelPaciente1.add(txtCedula1);
        txtCedula1.setBounds(170, 130, 130, 22);
        jPanelPaciente1.add(txtNumTel1);
        txtNumTel1.setBounds(170, 230, 130, 22);

        jLabel27.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PACIENTE");
        jPanelPaciente1.add(jLabel27);
        jLabel27.setBounds(260, 70, 150, 15);
        jPanelPaciente1.add(dateFechaNac1);
        dateFechaNac1.setBounds(170, 180, 130, 22);

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
        txtNombre1.setBounds(370, 130, 130, 22);

        jLabel32.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Nombre");
        jPanelPaciente1.add(jLabel32);
        jLabel32.setBounds(370, 110, 45, 15);
        jPanelPaciente1.add(txtUbicacion1);
        txtUbicacion1.setBounds(370, 180, 130, 22);

        btnGuardarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarPa1.setText("Guardar");
        jPanelPaciente1.add(btnGuardarPa1);
        btnGuardarPa1.setBounds(170, 280, 130, 23);

        btnEliminarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarPa1.setText("Eliminar");
        jPanelPaciente1.add(btnEliminarPa1);
        btnEliminarPa1.setBounds(170, 310, 130, 23);

        btnLimpiarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarPa1.setText("Limpiar");
        jPanelPaciente1.add(btnLimpiarPa1);
        btnLimpiarPa1.setBounds(270, 360, 130, 23);

        btnBuscarPa1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarPa1.setText("Buscar");
        jPanelPaciente1.add(btnBuscarPa1);
        btnBuscarPa1.setBounds(370, 280, 130, 23);

        jLabel33.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Ubicación");
        jPanelPaciente1.add(jLabel33);
        jLabel33.setBounds(370, 160, 110, 15);
        jPanelPaciente1.add(txtCorreoElec1);
        txtCorreoElec1.setBounds(370, 230, 130, 22);

        jPanelTFacial.add(jPanelPaciente1);
        jPanelPaciente1.setBounds(0, 0, 0, 0);

        btnModificarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarTF.setText("Modificar");
        jPanelTFacial.add(btnModificarTF);
        btnModificarTF.setBounds(380, 250, 130, 23);

        btnLimpiarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarTF.setText("Limpiar");
        jPanelTFacial.add(btnLimpiarTF);
        btnLimpiarTF.setBounds(270, 330, 130, 23);

        btnGuardarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarTF.setText("Guardar");
        jPanelTFacial.add(btnGuardarTF);
        btnGuardarTF.setBounds(170, 250, 130, 23);

        btnBuscarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarTF.setText("Buscar");
        jPanelTFacial.add(btnBuscarTF);
        btnBuscarTF.setBounds(380, 290, 130, 23);

        btnEliminarTF.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTF.setText("Eliminar");
        jPanelTFacial.add(btnEliminarTF);
        btnEliminarTF.setBounds(170, 290, 130, 23);

        jLabel34.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Código ");
        jPanelTFacial.add(jLabel34);
        jLabel34.setBounds(170, 160, 60, 15);
        jPanelTFacial.add(txtCodigoTF);
        txtCodigoTF.setBounds(170, 180, 130, 22);
        jPanelTFacial.add(txtPrecioTc);
        txtPrecioTc.setBounds(370, 180, 126, 22);

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
        btnGuardarTC.setBounds(170, 250, 130, 23);

        btnModificarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarTC.setText("Modificar");
        jPanelTCorporal.add(btnModificarTC);
        btnModificarTC.setBounds(380, 250, 130, 23);

        btnEliminarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTC.setText("Eliminar");
        btnEliminarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(btnEliminarTC);
        btnEliminarTC.setBounds(170, 290, 130, 23);

        btnBuscarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarTC.setText("Buscar");
        jPanelTCorporal.add(btnBuscarTC);
        btnBuscarTC.setBounds(380, 290, 130, 23);

        btnLimpiarTC.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarTC.setText("Limpiar");
        btnLimpiarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(btnLimpiarTC);
        btnLimpiarTC.setBounds(280, 330, 130, 23);

        txtNombreTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(txtNombreTC);
        txtNombreTC.setBounds(170, 130, 140, 22);

        txtTipoTC.setEditable(false);
        txtTipoTC.setText("CORPORAL");
        jPanelTCorporal.add(txtTipoTC);
        txtTipoTC.setBounds(370, 130, 120, 22);

        txtCodigoTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoTCActionPerformed(evt);
            }
        });
        jPanelTCorporal.add(txtCodigoTC);
        txtCodigoTC.setBounds(170, 180, 140, 22);

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
        txtPrecioTC.setBounds(370, 180, 120, 22);

        jPanelPrincipal.add(jPanelTCorporal, "TCorporal");

        jPanelMedicoActivo.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Médicos Activos");
        jPanelMedicoActivo.add(jLabel5);
        jLabel5.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelMedicoActivo, "MActivo");

        jPanelMedicoInactivo.setBackground(new java.awt.Color(221, 160, 221));
        jPanelMedicoInactivo.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Médicos Inactivos");
        jPanelMedicoInactivo.add(jLabel6);
        jLabel6.setBounds(260, 70, 150, 15);
        jPanelMedicoInactivo.add(txtNumCedulaMI);
        txtNumCedulaMI.setBounds(180, 130, 130, 22);
        jPanelMedicoInactivo.add(txtNombreMI);
        txtNombreMI.setBounds(370, 130, 130, 22);

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
        txtCorreoMI.setBounds(370, 230, 130, 22);

        txtNumTelefonoMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumTelefonoMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(txtNumTelefonoMI);
        txtNumTelefonoMI.setBounds(370, 180, 130, 22);

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
        dateFechaContratacionMI.setBounds(180, 180, 150, 22);
        jPanelMedicoInactivo.add(txtDireccionMI);
        txtDireccionMI.setBounds(180, 230, 130, 22);

        txtEstadoMI.setEditable(false);
        txtEstadoMI.setText("0");
        jPanelMedicoInactivo.add(txtEstadoMI);
        txtEstadoMI.setBounds(520, 130, 64, 22);

        jLabel49.setText("Dirección");
        jPanelMedicoInactivo.add(jLabel49);
        jLabel49.setBounds(170, 210, 80, 16);

        jLabel50.setText("Estado");
        jPanelMedicoInactivo.add(jLabel50);
        jLabel50.setBounds(520, 110, 80, 16);

        btnGuardarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarMI.setText("Guardar");
        jPanelMedicoInactivo.add(btnGuardarMI);
        btnGuardarMI.setBounds(170, 280, 120, 23);

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
        btnEliminarMI.setBounds(170, 310, 120, 23);

        btnBuscarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarMI.setText("Buscar");
        btnBuscarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMIActionPerformed(evt);
            }
        });
        jPanelMedicoInactivo.add(btnBuscarMI);
        btnBuscarMI.setBounds(370, 310, 130, 23);

        btnLimpiarMI.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarMI.setText("Limpiar");
        jPanelMedicoInactivo.add(btnLimpiarMI);
        btnLimpiarMI.setBounds(280, 350, 130, 23);

        jPanelPrincipal.add(jPanelMedicoInactivo, "MInactivo");

        jPanelCMNorte.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Comentario");
        jPanelCMNorte.add(jLabel8);
        jLabel8.setBounds(180, 160, 140, 15);

        jLabel18.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Citas Médicas de la Surcursal - Norte");
        jPanelCMNorte.add(jLabel18);
        jLabel18.setBounds(220, 70, 260, 15);
        jPanelCMNorte.add(txtCodigoCMN);
        txtCodigoCMN.setBounds(180, 130, 130, 22);

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
        dateChooserCMN.setBounds(370, 130, 130, 22);

        jLabel21.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Código de la Cita Médica");
        jPanelCMNorte.add(jLabel21);
        jLabel21.setBounds(180, 110, 140, 15);

        spinHoraN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanelCMNorte.add(spinHoraN);
        spinHoraN.setBounds(370, 180, 64, 22);

        spinMinN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));
        jPanelCMNorte.add(spinMinN);
        spinMinN.setBounds(440, 180, 64, 22);

        jLabel22.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Fecha de la Cita Médica ");
        jPanelCMNorte.add(jLabel22);
        jLabel22.setBounds(370, 110, 140, 15);
        jPanelCMNorte.add(txtSucursalCMN);
        txtSucursalCMN.setBounds(370, 230, 130, 22);

        btnEliminarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCMN.setText("Eliminar");
        jPanelCMNorte.add(btnEliminarCMN);
        btnEliminarCMN.setBounds(180, 310, 130, 23);

        btnLimpiarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarCMN.setText("Limpiar");
        jPanelCMNorte.add(btnLimpiarCMN);
        btnLimpiarCMN.setBounds(280, 350, 130, 23);

        btnGuardarCMN2.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarCMN2.setText("Guardar");
        btnGuardarCMN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCMN2ActionPerformed(evt);
            }
        });
        jPanelCMNorte.add(btnGuardarCMN2);
        btnGuardarCMN2.setBounds(180, 280, 130, 23);

        btnModificarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarCMN.setText("Modificar");
        jPanelCMNorte.add(btnModificarCMN);
        btnModificarCMN.setBounds(370, 280, 130, 23);

        btnBuscarCMN1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCMN1.setText("Buscar");
        btnBuscarCMN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCMN1ActionPerformed(evt);
            }
        });
        jPanelCMNorte.add(btnBuscarCMN1);
        btnBuscarCMN1.setBounds(370, 310, 130, 23);

        jPanelPrincipal.add(jPanelCMNorte, "CMNorte");

        jPanelCMSur.setBackground(new java.awt.Color(204, 255, 204));
        jPanelCMSur.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Citas Médicas de la Sucursal - Sur");
        jPanelCMSur.add(jLabel7);
        jLabel7.setBounds(200, 70, 260, 15);
        jPanelCMSur.add(txtCodigoCMS);
        txtCodigoCMS.setBounds(180, 130, 130, 22);

        jLabel39.setText("Código de la Cíta Médica");
        jPanelCMSur.add(jLabel39);
        jLabel39.setBounds(180, 110, 160, 16);

        jLabel40.setText("Fecha de la Cita Médica");
        jPanelCMSur.add(jLabel40);
        jLabel40.setBounds(370, 210, 150, 16);
        jPanelCMSur.add(dateChooserCMS);
        dateChooserCMS.setBounds(370, 230, 140, 22);

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
        spinHoraS.setBounds(370, 180, 64, 22);
        jPanelCMSur.add(spinMinSur);
        spinMinSur.setBounds(440, 180, 64, 22);

        txtSucursalS.setEditable(false);
        txtSucursalS.setText("SUR");
        jPanelCMSur.add(txtSucursalS);
        txtSucursalS.setBounds(370, 130, 130, 22);

        btnGuardarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarCMS.setText("Guardar");
        jPanelCMSur.add(btnGuardarCMS);
        btnGuardarCMS.setBounds(180, 280, 130, 23);

        btnModificarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarCMS.setText("Modificar");
        btnModificarCMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCMSActionPerformed(evt);
            }
        });
        jPanelCMSur.add(btnModificarCMS);
        btnModificarCMS.setBounds(370, 280, 130, 23);

        btnEliminarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCMS.setText("Eliminar");
        jPanelCMSur.add(btnEliminarCMS);
        btnEliminarCMS.setBounds(180, 310, 130, 23);

        btnBuscarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCMS.setText("Buscar");
        btnBuscarCMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCMSActionPerformed(evt);
            }
        });
        jPanelCMSur.add(btnBuscarCMS);
        btnBuscarCMS.setBounds(370, 310, 130, 23);

        btnLimpiarCMS.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarCMS.setText("Limpiar");
        btnLimpiarCMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCMSActionPerformed(evt);
            }
        });
        jPanelCMSur.add(btnLimpiarCMS);
        btnLimpiarCMS.setBounds(280, 350, 130, 23);

        jPanelPrincipal.add(jPanelCMSur, "CMSur");

        jPanelPagoP.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pago Pendiente");
        jPanelPagoP.add(jLabel9);
        jLabel9.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelPagoP, "PagoP");

        jPanelPagoR.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PagoRelizado");
        jPanelPagoR.add(jLabel10);
        jLabel10.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelPagoR, "PagoR");

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
    public javax.swing.JButton btnBuscarMI;
    public javax.swing.JButton btnBuscarPa;
    public javax.swing.JButton btnBuscarPa1;
    public javax.swing.JButton btnBuscarTC;
    public javax.swing.JButton btnBuscarTF;
    public javax.swing.JButton btnEliminarCMN;
    public javax.swing.JButton btnEliminarCMS;
    public javax.swing.JButton btnEliminarMI;
    public javax.swing.JButton btnEliminarPa;
    public javax.swing.JButton btnEliminarPa1;
    public javax.swing.JButton btnEliminarTC;
    public javax.swing.JButton btnEliminarTF;
    public javax.swing.JButton btnGuardarCMN2;
    public javax.swing.JButton btnGuardarCMS;
    public javax.swing.JButton btnGuardarMI;
    public javax.swing.JButton btnGuardarPa;
    public javax.swing.JButton btnGuardarPa1;
    public javax.swing.JButton btnGuardarTC;
    public javax.swing.JButton btnGuardarTF;
    public javax.swing.JButton btnLimpiarCMN;
    public javax.swing.JButton btnLimpiarCMS;
    public javax.swing.JButton btnLimpiarMI;
    public javax.swing.JButton btnLimpiarPa;
    public javax.swing.JButton btnLimpiarPa1;
    public javax.swing.JButton btnLimpiarTC;
    public javax.swing.JButton btnLimpiarTF;
    public javax.swing.JButton btnModificarCMN;
    public javax.swing.JButton btnModificarCMS;
    public javax.swing.JButton btnModificarMI;
    public javax.swing.JButton btnModificarPa;
    public javax.swing.JButton btnModificarPa1;
    public javax.swing.JButton btnModificarTC;
    public javax.swing.JButton btnModificarTF;
    public com.toedter.calendar.JDateChooser dateChooserCMN;
    public com.toedter.calendar.JDateChooser dateChooserCMS;
    public com.toedter.calendar.JDateChooser dateFechaContratacionMI;
    public com.toedter.calendar.JDateChooser dateFechaNac;
    public com.toedter.calendar.JDateChooser dateFechaNac1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanelCMNorte;
    public javax.swing.JPanel jPanelCMSur;
    private javax.swing.JPanel jPanelMedicoActivo;
    public javax.swing.JPanel jPanelMedicoInactivo;
    public javax.swing.JPanel jPanelPaciente;
    public javax.swing.JPanel jPanelPaciente1;
    private javax.swing.JPanel jPanelPagoP;
    private javax.swing.JPanel jPanelPagoR;
    public javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTCorporal;
    public javax.swing.JPanel jPanelTFacial;
    public javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar mbMenuBar;
    public javax.swing.JSpinner spinHoraN;
    public javax.swing.JSpinner spinHoraS;
    public javax.swing.JSpinner spinMinN;
    public javax.swing.JSpinner spinMinSur;
    public javax.swing.JTextArea txtAreaComenCMN;
    private javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCedula1;
    public javax.swing.JTextField txtCodigoCMN;
    public javax.swing.JTextField txtCodigoCMS;
    public javax.swing.JTextField txtCodigoTC;
    public javax.swing.JTextField txtCodigoTF;
    public javax.swing.JTextArea txtComenAreaCMS;
    public javax.swing.JTextField txtCorreoElec;
    public javax.swing.JTextField txtCorreoElec1;
    public javax.swing.JTextField txtCorreoMI;
    public javax.swing.JTextField txtDireccionMI;
    public javax.swing.JTextField txtEstadoMI;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombre1;
    public javax.swing.JTextField txtNombreMI;
    public javax.swing.JTextField txtNombreTC;
    public javax.swing.JTextField txtNombreTF;
    public javax.swing.JTextField txtNumCedulaMI;
    public javax.swing.JTextField txtNumTel;
    public javax.swing.JTextField txtNumTel1;
    public javax.swing.JTextField txtNumTelefonoMI;
    public javax.swing.JFormattedTextField txtPrecioTC;
    public javax.swing.JFormattedTextField txtPrecioTc;
    public javax.swing.JTextField txtSucursalCMN;
    public javax.swing.JTextField txtSucursalS;
    public javax.swing.JTextField txtTipoTC;
    public javax.swing.JTextField txtTipoTF;
    public javax.swing.JTextField txtUbicacion;
    public javax.swing.JTextField txtUbicacion1;
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

    public javax.swing.JMenuItem jMenuPaciente;
    public javax.swing.JMenuItem jMenuUsuarios;
    public String logo_Paciente = "/imagenes/paciente.png";
    public String logo_Usuario= "/imagenes/usuario.png";
    public String logo_Tratamientos= "/imagenes/tratamientos.png";
    public String logo_CitaMedica= "/imagenes/citaMedica.png";
    public String logo_Medico= "/imagenes/medico.png";
    public String logo_Pago= "/imagenes/pago.png";
    public Color mColorFondoMenu= new Color(150,250,220);


    // End of variables declaration         
}
