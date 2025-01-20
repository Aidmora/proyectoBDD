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
        jPanelTCoporal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelMedicoActivo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelMedicoInactivo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelCMSur = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tratamientos Faciales");
        jPanelTFacial.add(jLabel3);
        jLabel3.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelTFacial, "TFacial");

        jPanelTCoporal.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tratamientos Corporales");
        jPanelTCoporal.add(jLabel4);
        jLabel4.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelTCoporal, "TCorporal");

        jPanelMedicoActivo.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Médicos Activos");
        jPanelMedicoActivo.add(jLabel5);
        jLabel5.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelMedicoActivo, "MActivo");

        jPanelMedicoInactivo.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Médicos Inactivos");
        jPanelMedicoInactivo.add(jLabel6);
        jLabel6.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelMedicoInactivo, "MInactivo");

        jPanelCMSur.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cita Médica Sur");
        jPanelCMSur.add(jLabel7);
        jLabel7.setBounds(120, 110, 150, 15);

        jPanelPrincipal.add(jPanelCMSur, "CMSur");

        jPanelCMNorte.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Comentario");
        jPanelCMNorte.add(jLabel8);
        jLabel8.setBounds(170, 160, 140, 15);

        jLabel18.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Citas Médicas de la Surcursal - Norte");
        jPanelCMNorte.add(jLabel18);
        jLabel18.setBounds(230, 70, 260, 15);
        jPanelCMNorte.add(txtCodigoCMN);
        txtCodigoCMN.setBounds(170, 130, 130, 22);

        jLabel19.setFont(new java.awt.Font("Rubik Medium", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Sucursal");
        jPanelCMNorte.add(jLabel19);
        jLabel19.setBounds(370, 210, 140, 15);

        txtAreaComenCMN.setColumns(20);
        txtAreaComenCMN.setRows(5);
        jScrollPane1.setViewportView(txtAreaComenCMN);

        jPanelCMNorte.add(jScrollPane1);
        jScrollPane1.setBounds(170, 180, 130, 80);

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
        jLabel21.setBounds(170, 110, 140, 15);

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
        btnEliminarCMN.setBounds(170, 310, 130, 23);

        btnLimpiarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiarCMN.setText("Limpiar");
        jPanelCMNorte.add(btnLimpiarCMN);
        btnLimpiarCMN.setBounds(280, 350, 130, 23);

        btnGuardarCMN2.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarCMN2.setText("Guardar");
        jPanelCMNorte.add(btnGuardarCMN2);
        btnGuardarCMN2.setBounds(170, 280, 130, 23);

        btnModificarCMN.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarCMN.setText("Modificar");
        jPanelCMNorte.add(btnModificarCMN);
        btnModificarCMN.setBounds(370, 280, 130, 23);

        btnBuscarCMN1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCMN1.setText("Buscar");
        jPanelCMNorte.add(btnBuscarCMN1);
        btnBuscarCMN1.setBounds(370, 310, 130, 23);

        jPanelPrincipal.add(jPanelCMNorte, "CMNorte");

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
    public javax.swing.JButton btnBuscarPa;
    public javax.swing.JButton btnEliminarCMN;
    public javax.swing.JButton btnEliminarPa;
    public javax.swing.JButton btnGuardarCMN2;
    public javax.swing.JButton btnGuardarPa;
    public javax.swing.JButton btnLimpiarCMN;
    public javax.swing.JButton btnLimpiarPa;
    public javax.swing.JButton btnModificarCMN;
    public javax.swing.JButton btnModificarPa;
    public com.toedter.calendar.JDateChooser dateChooserCMN;
    public com.toedter.calendar.JDateChooser dateFechaNac;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanelCMNorte;
    private javax.swing.JPanel jPanelCMSur;
    private javax.swing.JPanel jPanelMedicoActivo;
    private javax.swing.JPanel jPanelMedicoInactivo;
    public javax.swing.JPanel jPanelPaciente;
    private javax.swing.JPanel jPanelPagoP;
    private javax.swing.JPanel jPanelPagoR;
    public javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTCoporal;
    private javax.swing.JPanel jPanelTFacial;
    public javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar mbMenuBar;
    public javax.swing.JSpinner spinHoraN;
    public javax.swing.JSpinner spinMinN;
    public javax.swing.JTextArea txtAreaComenCMN;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCodigoCMN;
    public javax.swing.JTextField txtCorreoElec;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNumTel;
    public javax.swing.JTextField txtSucursalCMN;
    public javax.swing.JTextField txtUbicacion;
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
