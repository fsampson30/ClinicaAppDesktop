package View;

import Controller.SQLSeleciona;
import Model.Usuario;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaSenha extends javax.swing.JFrame {

    private Usuario usuario = new Usuario();
    private SQLSeleciona sqlSeleciona = new SQLSeleciona();

    public TelaSenha() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("SonusDesktop");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTelaSenhaLogin = new javax.swing.JLabel();
        txtTelaSenhaLogin = new javax.swing.JTextField();
        lblTelaSenhaPassworn = new javax.swing.JLabel();
        txtTelaSenhaPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnTelaSenhaLogin = new javax.swing.JButton();
        btnTelaSenhaSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(460, 360));

        lblTelaSenhaLogin.setText("Login:");
        lblTelaSenhaLogin.setName(""); // NOI18N

        txtTelaSenhaLogin.setMinimumSize(new java.awt.Dimension(10, 20));
        txtTelaSenhaLogin.setPreferredSize(new java.awt.Dimension(10, 20));

        lblTelaSenhaPassworn.setText("Senha:");

        txtTelaSenhaPassword.setMinimumSize(new java.awt.Dimension(10, 20));
        txtTelaSenhaPassword.setPreferredSize(new java.awt.Dimension(10, 20));
        txtTelaSenhaPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelaSenhaPasswordKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sonuslogo.png"))); // NOI18N

        btnTelaSenhaLogin.setMnemonic('E');
        btnTelaSenhaLogin.setText("Entrar");
        btnTelaSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaSenhaLoginActionPerformed(evt);
            }
        });

        btnTelaSenhaSair.setMnemonic('S');
        btnTelaSenhaSair.setText("Sair");
        btnTelaSenhaSair.setActionCommand("");
        btnTelaSenhaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaSenhaSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelaSenhaPassworn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelaSenhaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelaSenhaLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelaSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTelaSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTelaSenhaSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaSenhaLogin)
                    .addComponent(txtTelaSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaSenhaPassworn)
                    .addComponent(txtTelaSenhaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaSenhaLogin)
                    .addComponent(btnTelaSenhaSair))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaSenhaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaSenhaSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnTelaSenhaSairActionPerformed

    private void btnTelaSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaSenhaLoginActionPerformed
        String loginTela = txtTelaSenhaLogin.getText().toUpperCase();
        String senhaTela = String.valueOf(txtTelaSenhaPassword.getPassword()).toUpperCase();
        if (loginTela.isEmpty() || senhaTela.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelaSenhaLogin.requestFocus();
        } else {
            if (validaLogin(loginTela, senhaTela)) {
                TelaPrincipal telaPrincipal = new TelaPrincipal(loginTela);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Dados do usuário incorretos.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnTelaSenhaLoginActionPerformed

    private void txtTelaSenhaPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelaSenhaPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String loginTela = txtTelaSenhaLogin.getText().toUpperCase();
            String senhaTela = String.valueOf(txtTelaSenhaPassword.getPassword()).toUpperCase();
            if (loginTela.isEmpty() || senhaTela.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtTelaSenhaLogin.requestFocus();
            } else {
                if (validaLogin(loginTela, senhaTela)) {
                    TelaPrincipal telaPrincipal = new TelaPrincipal(loginTela);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Dados do usuário incorretos.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txtTelaSenhaPasswordKeyPressed

    public boolean validaLogin(String login, String senha) {
        usuario = sqlSeleciona.pesquisaDadosUsuariosCadastrados(login);
        if (login.equals(usuario.getLogin()) && senha.equals(usuario.getSenha())) {
            return true;
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTelaSenhaLogin;
    private javax.swing.JButton btnTelaSenhaSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTelaSenhaLogin;
    private javax.swing.JLabel lblTelaSenhaPassworn;
    private javax.swing.JTextField txtTelaSenhaLogin;
    private javax.swing.JPasswordField txtTelaSenhaPassword;
    // End of variables declaration//GEN-END:variables
}
