/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Insets getBorderInsets(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isBorderOpaque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
/JFrame.java to edit this template
 */
package UI;


import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class LichSu extends javax.swing.JFrame{

    /**
     * Creates new form DangNhap
     */
    private final ImageIcon img_Back;
    private final String username=DangNhap.Username;
    private static final Logger logger = Setting.SettingUI.logger;

    public LichSu() {
        img_Back=new ImageIcon(new ImageIcon(getClass().getResource("/Image/backicon.png")).getImage().getScaledInstance(45, 25, Image.SCALE_SMOOTH));
        initComponents();
        String filePath = "log.txt";  // Đường dẫn đến file txt cần đọc

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String log="";
            String line;
            int count=0;
            while ((line = reader.readLine()) != null) {
                if(count%3==0)
                   log+="***";
                log+=line; 
                if(count%3==0)
                   log+="***";
                log+="\n";
                count++;
            }
            jTextPane_LichSu.setText(log);
        } catch (IOException e) {
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

        jPanel_ChucNang_main = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_mainTittle = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_LichSu = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 300));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1063, 623));
        setMinimumSize(new java.awt.Dimension(1063, 623));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1063, 623));
        setResizable(false);

        jPanel_ChucNang_main.setBackground(Setting.SettingUI.UI_colorDefault);
        jPanel_ChucNang_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel_ChucNang_main.setToolTipText("");
        jPanel_ChucNang_main.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_mainTittle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_mainTittle.setText("Lịch Sử Thao Tác Ứng Dụng");

        btn_back.setBackground(new java.awt.Color(250, 215, 172));
        btn_back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_back.setIcon(img_Back);
        btn_back.setBorderPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jTextPane_LichSu.setEditable(false);
        jTextPane_LichSu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_LichSu);

        javax.swing.GroupLayout jPanel_ChucNang_mainLayout = new javax.swing.GroupLayout(jPanel_ChucNang_main);
        jPanel_ChucNang_main.setLayout(jPanel_ChucNang_mainLayout);
        jPanel_ChucNang_mainLayout.setHorizontalGroup(
            jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(jLabel_mainTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))))
            .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE))
        );
        jPanel_ChucNang_mainLayout.setVerticalGroup(
            jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_mainTittle)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ChucNang_mainLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(542, 542, 542)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ChucNang_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ChucNang_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1063, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChucNang().setVisible(true);
        logger.log(Level.INFO, " Ng\u01b0\u1eddi d\u00f9ng {0} tr\u1edf v\u1ec1 m\u00e0n h\u00ecnh ch\u1ecdn ch\u1ee9c n\u0103ng\n", username);
    }//GEN-LAST:event_btn_backActionPerformed

    
     

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LichSu().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel_mainTittle;
    private javax.swing.JPanel jPanel_ChucNang_main;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane_LichSu;
    // End of variables declaration//GEN-END:variables

    private Image Image(ImageIcon img_bookIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}