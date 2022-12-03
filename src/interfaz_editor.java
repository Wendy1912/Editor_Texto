
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Formatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rocko
 */
public class interfaz_editor extends javax.swing.JFrame {

    Icon inst = (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconoinstruc.png")));
    String[] fuentes = {"Miriam Fixed", "Mongolian Baiti", "Monospaced", "MoolBoran", "Arial"};
    int[] tamaños = {3, 5, 8, 10, 12, 14, 18, 24, 36, 48,50,55,60};
    String selectedFont = "Miriam Fixed";
    String textocopiado = "";
    int selectedStile = 0;
    int selectedSize = 12;
    int previo = 0;
    int eleccion = 0;
    Font fini;
    String usuariocap = "";
    String usuarioAdmin = "Admin";
    String usuariioInvitado = "Invitado";
    int contusuAdmin = 12345;
    int contusuInvit = 120;
    int passcap;
       String texcop = "";
    Icon ic = (new ImageIcon(getClass().getResource("/edit_pelyimag/iconberror.png")));
    Icon ic2 = (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbaacep.png")));
    Icon ic3 = (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbverifi.png")));
    Icon ic4 = (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbadver.png")));
    Icon ic5 = (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/yopo2.png")));
    Icon av =  (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar.png")));
    Icon av1 =  (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconoauten.png")));
    Icon av2 =  (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar2.png")));
    Icon av3 =  (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar3.png")));
    Icon av4 =  (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar4.png")));
    Icon av5 =  (new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar5.png")));
    File arch;
    File arch2;
    int tipava;
 
    boolean comprobacionx = false;

    public interfaz_editor() {
        initComponents();
        fuentex.setBounds(0,0,400,460);
        fuentex.setLocationRelativeTo(null);
        jFrame1.setBounds(0, 0, 1780, 750);
        setBounds(0, 0, 362, 241);
        setLocationRelativeTo(null);
        setResizable(false);
         areadetexto.setLineWrap(true);
        areadetexto.setWrapStyleWord(true);
          framecolorfuen.setBounds(0, 0, 660, 490);
        framecolorfuen.setLocationRelativeTo(null);
        framecolorfuen.setResizable(false);
          framecolor.setBounds(0, 0, 660, 490);
        framecolor.setLocationRelativeTo(null);
        framecolor.setResizable(false);
           frameavatar.setBounds(0, 0, 550, 410);
        frameavatar.setLocationRelativeTo(null);
        frameavatar.setResizable(false);




    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraicono = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areadetexto = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jlavatar = new javax.swing.JLabel();
        jlnomuserav = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        iconmes = new javax.swing.JLabel();
        fuentex = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_Fuente = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_Estilo = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_Tamaño = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTara_previo = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        framecolorfuen = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        framecolor = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jColorChooser2 = new javax.swing.JColorChooser();
        frameavatar = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jlav1 = new javax.swing.JLabel();
        jlav2 = new javax.swing.JLabel();
        jlav3 = new javax.swing.JLabel();
        jlav4 = new javax.swing.JLabel();
        jlav5 = new javax.swing.JLabel();
        jlav6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        paraicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconoinstruc.png"))); // NOI18N
        paraicono.setText("jLabel6");

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Editor de Texto By Rocko");
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areadetexto.setColumns(20);
        areadetexto.setRows(5);
        jScrollPane1.setViewportView(areadetexto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 540, 620));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 204), 3));

        jlavatar.setBackground(new java.awt.Color(255, 204, 255));
        jlavatar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlavatar.setText("Bienvenido");
        jlavatar.setOpaque(true);

        jlnomuserav.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlnomuserav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlnomuserav, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jlavatar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlavatar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlnomuserav, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 150, 150));

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel6.setText("EDITOR DE TEXTO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 270, 30));

        jButton12.setBackground(new java.awt.Color(153, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 255, 255));
        jButton12.setText("Detalles de Aplicación");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 2));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 40));

        jFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 10, 1390, 1270));

        jMenuBar2.setBackground(new java.awt.Color(51, 255, 51));
        jMenuBar2.setForeground(new java.awt.Color(51, 255, 51));

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.setOpaque(true);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.setOpaque(true);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("Guardar");
        jMenuItem3.setOpaque(true);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu6.setText("Editar");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem10.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setText("Copiar");
        jMenuItem10.setOpaque(true);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem11.setText("Cortar");
        jMenuItem11.setOpaque(true);
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem12.setText("Pegar");
        jMenuItem12.setOpaque(true);
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar2.add(jMenu6);

        jMenu4.setText("Cuenta");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem4.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("Cerrar Sesión");
        jMenuItem4.setOpaque(true);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setText("Cambiar carita");
        jMenuItem5.setOpaque(true);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Propiedades de Fuente");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem6.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setText("Cambiar fuente");
        jMenuItem6.setOpaque(true);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setText("Color de Fuente");
        jMenuItem7.setOpaque(true);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar2.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(153, 255, 255));
        jMenu2.setText("Propiedades de Fondo");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem8.setBackground(new java.awt.Color(153, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setText("Cambiar color");
        jMenuItem8.setOpaque(true);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar2.add(jMenu2);

        jFrame1.setJMenuBar(jMenuBar2);

        iconmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbverifi.png"))); // NOI18N
        iconmes.setText("jLabel6");

        fuentex.setTitle("Propiedades de Fuente");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jList_Fuente.setBackground(new java.awt.Color(0, 0, 0));
        jList_Fuente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        jList_Fuente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jList_Fuente.setForeground(new java.awt.Color(0, 51, 204));
        jList_Fuente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Miriam Fixed", "Mongolian Baiti", "Monospaced", "MooolBoran", "Arial", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_Fuente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_FuenteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_Fuente);

        jList_Estilo.setBackground(new java.awt.Color(0, 0, 0));
        jList_Estilo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        jList_Estilo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jList_Estilo.setForeground(new java.awt.Color(0, 51, 204));
        jList_Estilo.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Plain", "Bold", "Italic" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_Estilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_EstiloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList_Estilo);

        jList_Tamaño.setBackground(new java.awt.Color(0, 0, 0));
        jList_Tamaño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        jList_Tamaño.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jList_Tamaño.setForeground(new java.awt.Color(0, 51, 204));
        jList_Tamaño.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "3", "5", "8", "10", "12", "14", "18", "24", "36", "48", "50", "55", "60" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList_Tamaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_TamañoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList_Tamaño);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fuente");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estilo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tamaño");

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vista Previa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 1, 14))); // NOI18N

        jTara_previo.setColumns(20);
        jTara_previo.setRows(5);
        jTara_previo.setText("Hola Bienvenido");
        jTara_previo.setCaretColor(new java.awt.Color(51, 255, 0));
        jScrollPane5.setViewportView(jTara_previo);

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton4)
                .addGap(89, 89, 89)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fuentexLayout = new javax.swing.GroupLayout(fuentex.getContentPane());
        fuentex.getContentPane().setLayout(fuentexLayout);
        fuentexLayout.setHorizontalGroup(
            fuentexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fuentexLayout.setVerticalGroup(
            fuentexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        framecolorfuen.setTitle("Color de Fuente");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jColorChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Aceptar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cancelar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout framecolorfuenLayout = new javax.swing.GroupLayout(framecolorfuen.getContentPane());
        framecolorfuen.getContentPane().setLayout(framecolorfuenLayout);
        framecolorfuenLayout.setHorizontalGroup(
            framecolorfuenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        framecolorfuenLayout.setVerticalGroup(
            framecolorfuenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        framecolor.setTitle("Color de Fondo");

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jButton8.setBackground(new java.awt.Color(0, 102, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 102, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Aceptar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jColorChooser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(31, 31, 31))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton8))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout framecolorLayout = new javax.swing.GroupLayout(framecolor.getContentPane());
        framecolor.getContentPane().setLayout(framecolorLayout);
        framecolorLayout.setHorizontalGroup(
            framecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        framecolorLayout.setVerticalGroup(
            framecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frameavatar.setTitle("Avatar´s");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/selavt.gif"))); // NOI18N

        jlav1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar2.png"))); // NOI18N
        jlav1.setText("jLabel11");
        jlav1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        jlav1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlav1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlav1MousePressed(evt);
            }
        });

        jlav2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar3.png"))); // NOI18N
        jlav2.setText("jLabel11");
        jlav2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        jlav2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlav2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlav2MousePressed(evt);
            }
        });

        jlav3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar.png"))); // NOI18N
        jlav3.setText("jLabel11");
        jlav3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        jlav3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlav3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlav3MousePressed(evt);
            }
        });

        jlav4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar4.png"))); // NOI18N
        jlav4.setText("jLabel11");
        jlav4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        jlav4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlav4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlav4MousePressed(evt);
            }
        });

        jlav5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconbavatar5.png"))); // NOI18N
        jlav5.setText("jLabel11");
        jlav5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jlav5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlav5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlav5MousePressed(evt);
            }
        });

        jlav6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_pelyimag/iconoauten.png"))); // NOI18N
        jlav6.setText("jLabel11");
        jlav6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        jlav6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlav6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlav6MousePressed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 102, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Cancelar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 102, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Aceptar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlav4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlav1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlav2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlav5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlav6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlav3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlav1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlav2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlav3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jlav4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlav5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlav6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout frameavatarLayout = new javax.swing.GroupLayout(frameavatar.getContentPane());
        frameavatar.getContentPane().setLayout(frameavatarLayout);
        frameavatarLayout.setHorizontalGroup(
            frameavatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameavatarLayout.setVerticalGroup(
            frameavatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameavatarLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Identificate");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 67, 79, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 100, 80, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 67, 66, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Contraeña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 100, 90, -1));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Acceso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        comprobarusu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (usuariocap.equals(usuarioAdmin)) {
            abrirarchadmin();
        } else if (usuariocap.equals(usuariioInvitado)) {
            abrirarchinvitado();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (usuariocap.equals("")) {
            int opc = JOptionPane.showConfirmDialog(iconmes, "No ha iniciado sesion, el editor se cerrara\nHasta que inicie sesion de nuevo"
                    + "\n¿desea salir ahora?", "", 0, 0, ic4);
            if (opc == 0) {
                jFrame1.dispose();
                this.dispose();
            } else if (opc == -1) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            int contains = 0;
            contains = (areadetexto.getText().charAt(contains));
            if (contains == 0) {
                areadetexto.setText("");
                areadetexto.setBackground(Color.white);
            } else {
                int opc2 = JOptionPane.showConfirmDialog(iconmes, "¿Desea Guardar cambios en el documento\n?", "Confirmacion", 0, 0, ic4);
                if (opc2 == 0) {
                    guardar();
                    areadetexto.setText("");
                    areadetexto.setBackground(Color.white);
                } else if (opc2 == 1) {
                    areadetexto.setText("");
                    areadetexto.setBackground(Color.white);
                } else if (opc2 == -1) {
                }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jList_FuenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_FuenteMouseClicked
        // TODO add your handling code here:
        int pos = jList_Fuente.getSelectedIndex();
        seleccionarFuente(pos);
    }//GEN-LAST:event_jList_FuenteMouseClicked

    private void jList_EstiloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_EstiloMouseClicked
        // TODO add your handling code here:
            int pos = jList_Estilo.getSelectedIndex();
        selectedStile = pos;
        seleccionarEstilo(selectedFont, selectedStile, selectedSize);
    }//GEN-LAST:event_jList_EstiloMouseClicked

    private void jList_TamañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_TamañoMouseClicked
        // TODO add your handling code here:
          int pos = jList_Tamaño.getSelectedIndex();
        seleccionarTamaño(pos);
    }//GEN-LAST:event_jList_TamañoMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        fuentex.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          previo = 1;
        seleccionarEstilo(selectedFont, selectedStile, selectedSize);
        fuentex.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          fuentex.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        framecolorfuen.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            Color colores = jColorChooser1.getColor();
        areadetexto.setForeground(colores);
        framecolorfuen.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       framecolorfuen.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        framecolor.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          Color colores = jColorChooser2.getColor();
        areadetexto.setBackground(colores);
        framecolor.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          framecolor.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
             usuariocap = "";
        passcap = 0;
       
        try {
            int contains = 0;
            contains = (areadetexto.getText().charAt(contains));
            if (contains == 0) {
                areadetexto.setText("");
            } else {
                int opc2 = JOptionPane.showConfirmDialog(iconmes, "¿Desea Guardar cambios en el documento?", "Confirmacion", 0, 0, ic4);
                if (opc2 == 0) {
                    guardar();
                    areadetexto.setText("");
                     usuario.setText("");
        password.setText("");
        show();
                } else if (opc2 == 1) {
                    areadetexto.setText("");
                     usuario.setText("");
        password.setText("");
       show();
                } else if (opc2 == -1) {
                 usuario.setText("");
        password.setText("");
       show();
       
                }

            }
        } catch (Exception e) {
        }
        usuario.setText("");
        password.setText("");
        show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        frameavatar.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jlav1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav1MouseClicked
        // TODO add your handling code here:
       tipava=2;
    }//GEN-LAST:event_jlav1MouseClicked

    private void jlav2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav2MouseClicked
        // TODO add your handling code here:
      tipava=3;
    }//GEN-LAST:event_jlav2MouseClicked

    private void jlav3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav3MouseClicked
        // TODO add your handling code here:
        tipava=0;
    }//GEN-LAST:event_jlav3MouseClicked

    private void jlav4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav4MouseClicked
        // TODO add your handling code here:
      tipava=4;
    }//GEN-LAST:event_jlav4MouseClicked

    private void jlav5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav5MouseClicked
        // TODO add your handling code here:
        tipava=5;
    }//GEN-LAST:event_jlav5MouseClicked

    private void jlav6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav6MouseClicked
        // TODO add your handling code here:
       tipava=1;
    }//GEN-LAST:event_jlav6MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(tipava==0){jlavatar.setIcon(av);
        }else if(tipava==1){jlavatar.setIcon(av1);
        }else if(tipava==2){jlavatar.setIcon(av2);
        }else if(tipava==3){jlavatar.setIcon(av3);
        }else if(tipava==4){jlavatar.setIcon(av4);
        }else if(tipava==5){jlavatar.setIcon(av5);
        }
       
        frameavatar.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
       frameavatar.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jlav3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav3MousePressed
        // TODO add your handling code here:
        pintarlabels();
       jlav3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
       
    }//GEN-LAST:event_jlav3MousePressed

    private void jlav1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav1MousePressed
        // TODO add your handling code here:
        pintarlabels();
        jlav1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
    }//GEN-LAST:event_jlav1MousePressed

    private void jlav2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav2MousePressed
        // TODO add your handling code here:
        pintarlabels();
        jlav2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
    }//GEN-LAST:event_jlav2MousePressed

    private void jlav4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav4MousePressed
        // TODO add your handling code here:
        pintarlabels();
        jlav4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
    }//GEN-LAST:event_jlav4MousePressed

    private void jlav5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav5MousePressed
        // TODO add your handling code here:
        pintarlabels();
        jlav5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
    }//GEN-LAST:event_jlav5MousePressed

    private void jlav6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlav6MousePressed
        // TODO add your handling code here:
        pintarlabels();
        jlav6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
    }//GEN-LAST:event_jlav6MousePressed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
          int inicio = areadetexto.getSelectionStart();
    String inicioText=areadetexto.getText().substring(0,inicio);
    String finText = areadetexto.getText().substring(inicio);
    String res = inicioText+textocopiado+finText;
    areadetexto.setText(res);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
          int inicio=areadetexto.getSelectionStart();
        int fin = areadetexto.getSelectionEnd();
        String s =areadetexto.getText();
        textocopiado=s.substring(inicio,fin);
        String inicioText=areadetexto.getText().substring(0,inicio);
        String finText = areadetexto.getText().substring(fin,areadetexto.getText().length());
        areadetexto.setText(inicioText+finText);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        int inicio = areadetexto.getSelectionStart();
        int fin =areadetexto.getSelectionEnd();
        String s =areadetexto.getText();
        textocopiado = s.substring(inicio , fin);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

    }//GEN-LAST:event_jButton12ActionPerformed

    public void comprobarusu() {

        try {
            usuariocap = usuario.getText();
            passcap = Integer.parseInt(password.getText());
            if (usuariocap.equals(usuarioAdmin)) {
                if (passcap == contusuAdmin) {
                    JOptionPane.showMessageDialog(iconmes, "Usuario y contraseña Correctos  "
                            + "Bienvenido\n" + usuarioAdmin, "", JOptionPane.PLAIN_MESSAGE, ic2);
                    comprobacionx = true;
                    dispose();
                    jFrame1.show();
                    jlnomuserav.setText("  " + usuariocap);
                } else if (usuarioAdmin.equals(usuariocap) && passcap != contusuAdmin) {
                    JOptionPane.showMessageDialog(iconmes, "Verifique la contrseña  por favor Usuario\n"
                            + usuariocap, "", JOptionPane.PLAIN_MESSAGE, ic3);
                    password.setText("");
                }

            } else if (usuariocap.equals(usuariioInvitado)) {
                if (passcap == contusuInvit) {
                    JOptionPane.showMessageDialog(iconmes, "Usuario y contraseña Correctos  "
                            + "Bienvenido\n" + usuariioInvitado, "", JOptionPane.PLAIN_MESSAGE, ic2);
                    comprobacionx = false;
                    dispose();
                    jFrame1.show();
                    jlnomuserav.setText("  " + usuariocap);
                } else if (usuariocap.equals(usuariioInvitado) && passcap != contusuInvit) {
                    JOptionPane.showMessageDialog(iconmes, "Verifique la contrseña  por favor Usuario\n"
                            + usuariioInvitado, "", JOptionPane.PLAIN_MESSAGE, ic3);
                    System.out.println(passcap);
                    password.setText("");

                }

            } else if (usuariocap != (usuariioInvitado) && passcap != contusuInvit) {
                JOptionPane.showMessageDialog(iconmes, "Datos Erroneos Verifica\n", "", JOptionPane.PLAIN_MESSAGE, ic);
                usuario.setText("");
                password.setText("");

            } else if (usuariocap != (usuarioAdmin) && passcap != contusuAdmin) {
                JOptionPane.showMessageDialog(iconmes, "Datos Erroneos Verifica\n", "", JOptionPane.PLAIN_MESSAGE, ic);
                usuario.setText("");
                password.setText("");
            } else {
                JOptionPane.showMessageDialog(iconmes, "No existe el Usuario\n" + usuario, "", JOptionPane.PLAIN_MESSAGE, ic);
                usuario.setText("");
            }
        } catch (Exception e) {
        }
    }

    private void guardar() {
        if (comprobacionx == true) {
            FileNameExtensionFilter filtro =
                    new FileNameExtensionFilter("Archivos de texto", "doc","txt");
            JFileChooser archivo = new JFileChooser();
            archivo.setFileFilter(filtro);
            archivo.setDialogTitle("Admin Guardar......");
            int comparar = archivo.showSaveDialog(null);
            comprobacionx = false;
            if (comparar == JFileChooser.APPROVE_OPTION) {
                final Formatter crear;
                try {
                    crear = new Formatter(archivo.getSelectedFile() + ".doc");
                    crear.format(areadetexto.getText());
                    crear.close();

                } catch (Exception e) {
                }

            }
        } else if (comprobacionx == false) {
            FileNameExtensionFilter filtro =
                    new FileNameExtensionFilter("Archivos de texto", "txt");
            JFileChooser archivo = new JFileChooser();
            archivo.setFileFilter(filtro);
            archivo.setDialogTitle("Invitado Guardar......");
            int comparar = archivo.showSaveDialog(null);
            comprobacionx = true;
            if (comparar == JFileChooser.APPROVE_OPTION) {
                final Formatter crear;
                try {
                    crear = new Formatter(archivo.getSelectedFile() + ".txt");
                    crear.format(areadetexto.getText());
                    crear.close();

                } catch (Exception e) {
                }

            }
        }

    }

    private void abrirarchadmin() {
        FileNameExtensionFilter filtro =
                new FileNameExtensionFilter("Archivos de texto", "doc", "txt");
        String nombre, contenido;
        JFileChooser archivo = new JFileChooser();
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Archivos de Admin....");
        int comparar = archivo.showOpenDialog(null);

        if (comparar == JFileChooser.APPROVE_OPTION) {
            arch = archivo.getSelectedFile();
            nombre = arch.getName();

            try {

                FileInputStream f1 = new FileInputStream(arch);
                InputStreamReader f2 = new InputStreamReader(f1);
                BufferedReader linea = new BufferedReader(f2);
                contenido = "";
                while (linea.ready()) {
                    String linea_arch = linea.readLine();
                    contenido = contenido + linea_arch + "\n";
                }
                linea.close();
                areadetexto.setText(contenido);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void abrirarchinvitado() {
        FileNameExtensionFilter filtro =
                new FileNameExtensionFilter("Archivos de texto", "txt");
        String nombre, contenido;
        JFileChooser archivo = new JFileChooser();
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Archivos de Invitado....");
        int comparar = archivo.showOpenDialog(null);

        if (comparar == JFileChooser.APPROVE_OPTION) {
            arch = archivo.getSelectedFile();
            nombre = arch.getName();

            try {

                FileInputStream f1 = new FileInputStream(arch);
                InputStreamReader f2 = new InputStreamReader(f1);
                BufferedReader linea = new BufferedReader(f2);
                contenido = "";
                while (linea.ready()) {
                    String linea_arch = linea.readLine();
                    contenido = contenido + linea_arch + "\n";
                }
                linea.close();
                areadetexto.setText(contenido);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void seleccionarFuente(int pos) {

        switch (pos) {

            case 0:
                selectedFont = fuentes[0];
                seleccionarEstilo(selectedFont, selectedStile, selectedSize);
                break;

            case 1:
                selectedFont = fuentes[1];
                seleccionarEstilo(selectedFont, selectedStile, selectedSize);
                break;

            case 2:
                selectedFont = fuentes[2];
                seleccionarEstilo(selectedFont, selectedStile, selectedSize);
                break;

            case 3:
                selectedFont = fuentes[3];
                seleccionarEstilo(selectedFont, selectedStile, selectedSize);
                break;

            case 4:
                selectedFont = fuentes[4];
                seleccionarEstilo(selectedFont, selectedStile, selectedSize);
                break;
        }


    }

    public void seleccionarEstilo(String fuen, int estlo, int tamaño) {

        switch (estlo) {

            case 0:
                if (previo == 1) {
                    Font f = new Font(fuen, Font.PLAIN, tamaño);
                    areadetexto.setFont(f);
                    previo = 0;
                } else {
                    Font f = new Font(fuen, Font.PLAIN, tamaño);
                    jTara_previo.setFont(f);

                }
                break;

            case 1:

                if (previo == 1) {
                    Font f = new Font(fuen, Font.BOLD, tamaño);
                    areadetexto.setFont(f);
                    previo = 0;
                } else {
                    Font f = new Font(fuen, Font.BOLD, tamaño);
                    jTara_previo.setFont(f);

                }
                break;

            case 2:

                if (previo == 1) {
                    Font f = new Font(fuen, Font.ITALIC, tamaño);
                    areadetexto.setFont(f);
                    previo = 0;
                } else {
                    Font f = new Font(fuen, Font.ITALIC, tamaño);
                    jTara_previo.setFont(f);

                }
                break;

        }

    }

    public void seleccionarTamaño(int t) {

        selectedSize = tamaños[t];
        seleccionarEstilo(selectedFont, selectedStile, selectedSize);
    }
    
    void pintarlabels(){
        jlav1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jlav2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jlav3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jlav4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jlav5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        jlav6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
          
    }
    

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(interfaz_editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_editor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areadetexto;
    private javax.swing.JFrame frameavatar;
    private javax.swing.JFrame framecolor;
    private javax.swing.JFrame framecolorfuen;
    private javax.swing.JFrame fuentex;
    private javax.swing.JLabel iconmes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList_Estilo;
    private javax.swing.JList jList_Fuente;
    private javax.swing.JList jList_Tamaño;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTara_previo;
    private javax.swing.JLabel jlav1;
    private javax.swing.JLabel jlav2;
    private javax.swing.JLabel jlav3;
    private javax.swing.JLabel jlav4;
    private javax.swing.JLabel jlav5;
    private javax.swing.JLabel jlav6;
    private javax.swing.JLabel jlavatar;
    private javax.swing.JLabel jlnomuserav;
    private javax.swing.JLabel paraicono;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
