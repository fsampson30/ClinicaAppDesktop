package View;

import Controller.SQLAltera;
import Controller.SQLDeleta;
import Controller.SQLInsere;
import Controller.SQLSeleciona;
import Controller.Tabela;
import Model.Mensagem;
import Model.Usuario;
import java.awt.Dialog;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastroUsuarios extends javax.swing.JFrame {

    private String loginAntigo = "";
    private Usuario usuario = new Usuario();
    private SQLInsere sqlInsere = new SQLInsere();
    private SQLDeleta sqlLDeleta = new SQLDeleta();
    private SQLAltera sqlAltera = new SQLAltera();
    private SQLSeleciona sqlSeleciona = new SQLSeleciona();

    public TelaCadastroUsuarios() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Cadastro de usuários");
        this.setLocationRelativeTo(null);
        this.requestFocusInWindow();
        desabilitaCampos();
        desabilitaBotoesInsercao();
        populaTabelaUsuarios();
        desabilitaBotaoZerarSenha();
        desabilitaBotaoDeletar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneUsuarios = new javax.swing.JScrollPane();
        tblUsuariosCadastrados = new javax.swing.JTable();
        lblUsuariosCadastrados = new javax.swing.JLabel();
        lblTelaUSuariosNome = new javax.swing.JLabel();
        txtTelaUsuariosNome = new javax.swing.JTextField();
        lblTelaUsuariosLogin = new javax.swing.JLabel();
        txtTelaUsuariosLogin = new javax.swing.JTextField();
        lblTelausuariosSenha = new javax.swing.JLabel();
        lblTelaUsuariosConfirmaSenha = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnZerarSenha = new javax.swing.JButton();
        txtTelaUsuariosSenha = new javax.swing.JPasswordField();
        txtTelaUsuariosConfirmaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblUsuariosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblUsuariosCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosCadastradosMouseClicked(evt);
            }
        });
        scrollPaneUsuarios.setViewportView(tblUsuariosCadastrados);

        lblUsuariosCadastrados.setText("Usuários Cadastrados:");

        lblTelaUSuariosNome.setText("Nome:");

        txtTelaUsuariosNome.setColumns(10);
        txtTelaUsuariosNome.setFocusCycleRoot(true);
        txtTelaUsuariosNome.setNextFocusableComponent(txtTelaUsuariosLogin);

        lblTelaUsuariosLogin.setText("Login:");

        txtTelaUsuariosLogin.setNextFocusableComponent(txtTelaUsuariosSenha);

        lblTelausuariosSenha.setText("Senha:");

        lblTelaUsuariosConfirmaSenha.setText("Confirmar Senha:");

        btnNovo.setMnemonic('N');
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setMnemonic('D');
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnCancelar.setMnemonic('C');
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setMnemonic('S');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnZerarSenha.setMnemonic('Z');
        btnZerarSenha.setText("Zerar Senha");
        btnZerarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarSenhaActionPerformed(evt);
            }
        });

        txtTelaUsuariosSenha.setNextFocusableComponent(txtTelaUsuariosConfirmaSenha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelaUsuariosLogin)
                            .addComponent(lblTelaUsuariosLogin)
                            .addComponent(lblTelaUsuariosConfirmaSenha)
                            .addComponent(lblTelausuariosSenha)
                            .addComponent(txtTelaUsuariosNome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(lblTelaUSuariosNome)
                            .addComponent(txtTelaUsuariosSenha)
                            .addComponent(txtTelaUsuariosConfirmaSenha))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsuariosCadastrados)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPaneUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZerarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuariosCadastrados)
                    .addComponent(lblTelaUSuariosNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelaUsuariosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelaUsuariosLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelaUsuariosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelausuariosSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelaUsuariosSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelaUsuariosConfirmaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelaUsuariosConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZerarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaBotoesInsercao();
        habilitaCampos();
        limpaCampos();
        desabilitaTabela();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtTelaUsuariosLogin.getText().equals("") || txtTelaUsuariosNome.getText().equals("") || 
                txtTelaUsuariosSenha.getPassword().length == 0 || txtTelaUsuariosConfirmaSenha.getPassword().length == 0 ) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (btnAlterar.getText().equals("Gravar")) {
                String s1 = new String(txtTelaUsuariosSenha.getPassword());
                String s2 = new String(txtTelaUsuariosConfirmaSenha.getPassword());
                if (s1.equals(s2)) {
                    desabilitaBotoesInsercao();
                    recebeCamposTelaGravacao();
                    habilitaTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Senhas digitadas não conferem!", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.out.println(txtTelaUsuariosSenha.getPassword());
                    System.out.println(txtTelaUsuariosConfirmaSenha.getPassword());
                    limpaCamposSenha();
                    habilitaBotaoDeletar();
                }
            } else {
                recebeCamposTelaAlteracao();
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        recebeCamposTelaDelecao();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        desabilitaBotoesInsercao();
        limpaCampos();
        desabilitaCampos();
        habilitaTabela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnZerarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarSenhaActionPerformed
        zeraSenhaUsuario(txtTelaUsuariosLogin.getText());
    }//GEN-LAST:event_btnZerarSenhaActionPerformed

    private void tblUsuariosCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosCadastradosMouseClicked
        int linha = 0;
        if (evt.getClickCount() == 1 && tblUsuariosCadastrados.isEnabled()) {
            linha = tblUsuariosCadastrados.getSelectedRow();
            txtTelaUsuariosLogin.setText((String) tblUsuariosCadastrados.getValueAt(linha, 0));
            loginAntigo = ((String) tblUsuariosCadastrados.getValueAt(linha, 0));
            txtTelaUsuariosNome.setText((String) tblUsuariosCadastrados.getValueAt(linha, 1));
            desabilitaBotoesAlteracao();
            desabilitaCampos();
        } else if (evt.getClickCount() == 2 && tblUsuariosCadastrados.isEnabled()) {
            linha = tblUsuariosCadastrados.getSelectedRow();
            usuario.setLogin((String) tblUsuariosCadastrados.getValueAt(linha, 0));
            usuario.setNome((String) tblUsuariosCadastrados.getValueAt(linha, 1));
            carregaCamposTabela(usuario);
            if (verificaSenhaNula()) {
                habilitaCampos();
                habilitaBotaoDeletar();
            } else {
                habilitaCampos();
                habilitaBotaoDeletar();
                desabilitaCamposSenha();     
                habilitaBotaoZerarSenha();
            }
        }
    }//GEN-LAST:event_tblUsuariosCadastradosMouseClicked

    public void desabilitaBotoesInsercao() {
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnAlterar.setText("Alterar");
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);
        btnZerarSenha.setEnabled(false);
    }

    public void habilitaBotoesInsercao() {
        btnAlterar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setText("Gravar");
        btnNovo.setEnabled(false);
        btnSair.setEnabled(false);
        txtTelaUsuariosNome.requestFocus();
    }

    public void habilitaBotoesAlteracao() {
        btnAlterar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnSair.setEnabled(false);
    }

    public void desabilitaBotoesAlteracao() {
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);
        btnZerarSenha.setEnabled(false);
    }

    public void habilitaBotaoZerarSenha() {
        btnZerarSenha.setEnabled(true);
    }

    public void desabilitaBotaoZerarSenha() {
        btnZerarSenha.setEnabled(false);
    }
    
    public void habilitaBotaoDeletar(){
        btnDeletar.setEnabled(true);
    }
    
    public void desabilitaBotaoDeletar(){
        btnDeletar.setEnabled(false);
    }

    public void limpaCampos() {
        txtTelaUsuariosNome.setText("");
        txtTelaUsuariosLogin.setText("");
        txtTelaUsuariosSenha.setText("");
        txtTelaUsuariosConfirmaSenha.setText("");
    }

    public void desabilitaCampos() {
        txtTelaUsuariosNome.setEnabled(false);
        txtTelaUsuariosLogin.setEnabled(false);
        txtTelaUsuariosSenha.setEnabled(false);
        txtTelaUsuariosConfirmaSenha.setEnabled(false);
    }

    public void desabilitaCamposSenha() {
        txtTelaUsuariosSenha.setEnabled(false);
        txtTelaUsuariosConfirmaSenha.setEnabled(false);
    }

    public void habilitaCampos() {
        txtTelaUsuariosNome.setEnabled(true);
        txtTelaUsuariosLogin.setEnabled(true);
        txtTelaUsuariosSenha.setEnabled(true);
        txtTelaUsuariosConfirmaSenha.setEnabled(true);
    }

    public void recebeCamposTelaGravacao() {
        usuario.setLogin(txtTelaUsuariosLogin.getText());
        usuario.setNome(txtTelaUsuariosNome.getText());
        usuario.setSenha(String.valueOf(txtTelaUsuariosConfirmaSenha.getPassword()));
        boolean ok = sqlInsere.insereUsuario(usuario);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            limpaCampos();
            desabilitaCampos();
            populaTabelaUsuarios();

        } else {
            JOptionPane.showMessageDialog(null, "Erro");
        }

    }

    public void recebeCamposTelaDelecao() {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma exclusão do usuário '" + usuario.getNome() + "' ?", "Confirme", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            boolean ok = sqlLDeleta.deletaUsuario(usuario);
            if (ok) {
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
                limpaCampos();
                desabilitaCampos();
                populaTabelaUsuarios();
                desabilitaBotoesInsercao();
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
            }
        } else {
            desabilitaBotoesInsercao();
            limpaCampos();
            desabilitaCampos();
        }
    }

    public void recebeCamposTelaAlteracao() {
        usuario.setLogin(txtTelaUsuariosLogin.getText());
        usuario.setNome(txtTelaUsuariosNome.getText());
        usuario.setSenha(String.valueOf(txtTelaUsuariosConfirmaSenha.getPassword()));
        boolean ok = sqlAltera.alteraUsuarioCadastrado(usuario, loginAntigo);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
            limpaCampos();
            desabilitaCampos();
            populaTabelaUsuarios();
            desabilitaBotoesInsercao();
        } else {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    public void zeraSenhaUsuario(String login) {
        int resposta = JOptionPane.showConfirmDialog(null, "Zera senha do Usuário " + login + "?", "Confirme", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            boolean ok = sqlAltera.zeraSenhaUsuarioCadastrado(login);
            if (ok) {
                JOptionPane.showMessageDialog(null, "Senha zerada com sucesso!");
                limpaCampos();
                desabilitaCampos();
                populaTabelaUsuarios();
                desabilitaBotoesInsercao();
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
            }
        } else {
            desabilitaBotoesInsercao();
            limpaCampos();
            desabilitaCampos();
        }

    }

    public void populaTabelaUsuarios() {
        try {
            Tabela tabela = new Tabela(sqlSeleciona.getSelecionaUsuariosCadastrados());
            tblUsuariosCadastrados.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void limpaCamposSenha() {
        txtTelaUsuariosSenha.setText("");
        txtTelaUsuariosConfirmaSenha.setText("");
        txtTelaUsuariosSenha.requestFocus();
    }

    public void carregaCamposTabela(Usuario usuario) {
        txtTelaUsuariosNome.setText(usuario.getNome());
        txtTelaUsuariosLogin.setText(usuario.getLogin());
        habilitaBotoesAlteracao();
    }

    public boolean verificaSenhaNula() {
        usuario = sqlSeleciona.pesquisaDadosUsuariosCadastrados(loginAntigo);
        if (usuario.getSenha().equals("")) {
            return true;
        }
        return false;
    }
    
    public void desabilitaTabela(){
        tblUsuariosCadastrados.setEnabled(false);
    }
    
    public void habilitaTabela(){
        tblUsuariosCadastrados.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnZerarSenha;
    private javax.swing.JLabel lblTelaUSuariosNome;
    private javax.swing.JLabel lblTelaUsuariosConfirmaSenha;
    private javax.swing.JLabel lblTelaUsuariosLogin;
    private javax.swing.JLabel lblTelausuariosSenha;
    private javax.swing.JLabel lblUsuariosCadastrados;
    private javax.swing.JScrollPane scrollPaneUsuarios;
    private javax.swing.JTable tblUsuariosCadastrados;
    private javax.swing.JPasswordField txtTelaUsuariosConfirmaSenha;
    private javax.swing.JTextField txtTelaUsuariosLogin;
    private javax.swing.JTextField txtTelaUsuariosNome;
    private javax.swing.JPasswordField txtTelaUsuariosSenha;
    // End of variables declaration//GEN-END:variables
}
