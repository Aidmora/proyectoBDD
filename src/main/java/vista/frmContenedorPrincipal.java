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
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEstadoUs = new javax.swing.JTextField();
        txtCorreoUs = new javax.swing.JTextField();
        txtIdUs = new javax.swing.JTextField();
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
        jPanelPagoP = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtIdPP = new javax.swing.JTextField();
        txtFechaPP = new javax.swing.JTextField();
        txtEstadoPP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnGuardarPP = new javax.swing.JButton();
        btnModificarPP = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtCantidadPP = new javax.swing.JTextField();
        btnBuscarPP = new javax.swing.JButton();
        btnEliminarPP = new javax.swing.JButton();
        jPanelPagoR = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        mbMenuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

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
        txtEstadoUs.setBounds(150, 280, 140, 28);
        jPanelUsuario.add(txtCorreoUs);
        txtCorreoUs.setBounds(400, 190, 180, 28);
        jPanelUsuario.add(txtIdUs);
        txtIdUs.setBounds(0, 10, 10, 28);

        btnBuscarUs.setText("Buscar");
        jPanelUsuario.add(btnBuscarUs);
        btnBuscarUs.setBounds(220, 330, 80, 28);

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
        btnModificarUs.setBounds(420, 330, 80, 28);

        btnEliminarUs.setText("Eliminar");
        jPanelUsuario.add(btnEliminarUs);
        btnEliminarUs.setBounds(320, 330, 80, 28);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("USUARIOS");
        jPanelUsuario.add(jLabel14);
        jLabel14.setBounds(290, 50, 140, 22);

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel16.setText("Rol");
        jPanelUsuario.add(jLabel16);
        jLabel16.setBounds(400, 260, 70, 16);

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel17.setText("Contraseña");
        jPanelUsuario.add(jLabel17);
        jLabel17.setBounds(160, 410, 120, 16);
        jPanelUsuario.add(txtNuevaPassUs);
        txtNuevaPassUs.setBounds(160, 440, 190, 16);
        jPanelUsuario.add(txtConfNuevaPassUs);
        txtConfNuevaPassUs.setBounds(410, 440, 190, 16);

        btnGuardarUs.setText("Guardar");
        jPanelUsuario.add(btnGuardarUs);
        btnGuardarUs.setBounds(320, 490, 110, 28);

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel18.setText("Nombre");
        jPanelUsuario.add(jLabel18);
        jLabel18.setBounds(150, 170, 70, 16);
        jPanelUsuario.add(txtNombreUs);
        txtNombreUs.setBounds(150, 190, 140, 28);

        jPanelPrincipal.add(jPanelUsuario, "Usuario");

        jPanelPaciente.setBackground(new java.awt.Color(255, 204, 255));
        jPanelPaciente.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PACIENTE");
        jPanelPaciente.add(jLabel1);
        jLabel1.setBounds(170, 100, 59, 16);

        jPanelPrincipal.add(jPanelPaciente, "Paciente");

        jPanelTFacial.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tratamientos Faciales");
        jPanelTFacial.add(jLabel3);
        jLabel3.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelTFacial, "TFacial");

        jPanelTCoporal.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tratamientos Corporales");
        jPanelTCoporal.add(jLabel4);
        jLabel4.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelTCoporal, "TCorporal");

        jPanelMedicoActivo.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Médicos Activos");
        jPanelMedicoActivo.add(jLabel5);
        jLabel5.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelMedicoActivo, "MActivo");

        jPanelMedicoInactivo.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Médicos Inactivos");
        jPanelMedicoInactivo.add(jLabel6);
        jLabel6.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelMedicoInactivo, "MInactivo");

        jPanelCMSur.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cita Médica Sur");
        jPanelCMSur.add(jLabel7);
        jLabel7.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelCMSur, "CMSur");

        jPanelCMNorte.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cita Médica Norte");
        jPanelCMNorte.add(jLabel8);
        jLabel8.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelCMNorte, "CMNorte");

        jPanelPagoP.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Rondalo", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pago Pendiente");
        jPanelPagoP.add(jLabel9);
        jLabel9.setBounds(320, 80, 180, 40);

        txtIdPP.setText(" ");
        jPanelPagoP.add(txtIdPP);
        txtIdPP.setBounds(280, 170, 80, 28);

        txtFechaPP.setText(" ");
        jPanelPagoP.add(txtFechaPP);
        txtFechaPP.setBounds(530, 170, 100, 28);

        txtEstadoPP.setText(" ");
        jPanelPagoP.add(txtEstadoPP);
        txtEstadoPP.setBounds(530, 210, 100, 28);

        jLabel12.setText("Id");
        jPanelPagoP.add(jLabel12);
        jLabel12.setBounds(260, 170, 10, 16);

        jLabel19.setText("Fecha Límite (dd/mm/yyyy)");
        jPanelPagoP.add(jLabel19);
        jLabel19.setBounds(380, 170, 144, 16);

        jLabel20.setText("Cantidad");
        jPanelPagoP.add(jLabel20);
        jLabel20.setBounds(220, 210, 50, 16);

        btnGuardarPP.setText("Guardar");
        jPanelPagoP.add(btnGuardarPP);
        btnGuardarPP.setBounds(230, 280, 73, 28);

        btnModificarPP.setText("Modificar");
        jPanelPagoP.add(btnModificarPP);
        btnModificarPP.setBounds(320, 280, 90, 28);

        jLabel21.setText("Estado (Activo o Inactivo)");
        jPanelPagoP.add(jLabel21);
        jLabel21.setBounds(390, 210, 150, 16);
        jPanelPagoP.add(txtCantidadPP);
        txtCantidadPP.setBounds(280, 210, 80, 28);

        btnBuscarPP.setText("Buscar");
        jPanelPagoP.add(btnBuscarPP);
        btnBuscarPP.setBounds(420, 280, 67, 28);

        btnEliminarPP.setText("Eliminar");
        jPanelPagoP.add(btnEliminarPP);
        btnEliminarPP.setBounds(510, 280, 90, 28);

        jPanelPrincipal.add(jPanelPagoP, "PagoP");

        jPanelPagoR.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Rondalo", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PagoRelizado");
        jPanelPagoR.add(jLabel10);
        jLabel10.setBounds(120, 110, 150, 16);

        jPanelPrincipal.add(jPanelPagoR, "PagoR");

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);
        setJMenuBar(mbMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listRolUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRolUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listRolUsActionPerformed


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
    public javax.swing.JButton btnBuscarPP;
    public javax.swing.JButton btnBuscarUs;
    public javax.swing.JButton btnEliminarPP;
    public javax.swing.JButton btnEliminarUs;
    public javax.swing.JButton btnGuardarPP;
    public javax.swing.JButton btnGuardarUs;
    public javax.swing.JButton btnModificarPP;
    public javax.swing.JButton btnModificarUs;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCMNorte;
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
    public javax.swing.JComboBox<String> listRolUs;
    private javax.swing.JMenuBar mbMenuBar;
    public javax.swing.JTextField txtCantidadPP;
    public javax.swing.JPasswordField txtConfNuevaPassUs;
    public javax.swing.JTextField txtCorreoUs;
    public javax.swing.JTextField txtEstadoPP;
    public javax.swing.JTextField txtEstadoUs;
    public javax.swing.JTextField txtFechaPP;
    public javax.swing.JTextField txtIdPP;
    public javax.swing.JTextField txtIdUs;
    public javax.swing.JTextField txtNombreUs;
    public javax.swing.JPasswordField txtNuevaPassUs;
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
