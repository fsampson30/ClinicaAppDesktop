package View;

import Controller.SQLAltera;
import Controller.SQLDeleta;
import Controller.SQLInsere;
import Controller.SQLSeleciona;
import Controller.Tabela;
import Model.Mensagem;
import java.awt.Dialog;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastroMensagens extends javax.swing.JFrame {

    private Mensagem msg = new Mensagem();
    private SQLInsere sqlInsere = new SQLInsere();
    private SQLAltera sqlAltera = new SQLAltera();
    private SQLDeleta sqlDeleta = new SQLDeleta();

    public TelaCadastroMensagens() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Cadastro de Mensagens Padrão");
        desabilitaCampos();
        desabilitaBotoesInsercao();
        populaTabelaMensagens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelaCadastroMsgTitulo = new javax.swing.JLabel();
        txtTelaCadastroMsgTitulo = new javax.swing.JTextField();
        lblTelaCadastroConteudoMsg = new javax.swing.JLabel();
        scrollPaneMensagem = new javax.swing.JScrollPane();
        txtAreaMensagem = new javax.swing.JTextArea();
        lblTelaCadastroMsgTabela = new javax.swing.JLabel();
        scrollPaneTabelaMensagebs = new javax.swing.JScrollPane();
        tblMensagensCadastradas = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 320));

        lblTelaCadastroMsgTitulo.setText("Digite o título da Mensagem:");

        lblTelaCadastroConteudoMsg.setText("Digite o conteúdo da Mensagem:");

        txtAreaMensagem.setColumns(20);
        txtAreaMensagem.setLineWrap(true);
        txtAreaMensagem.setRows(5);
        scrollPaneMensagem.setViewportView(txtAreaMensagem);

        lblTelaCadastroMsgTabela.setText("Mensagens cadastradas:");

        tblMensagensCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Titulo", "Mensagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMensagensCadastradas.setToolTipText("Clique 1 vez para selecionar e 2 vezes para alterar");
        tblMensagensCadastradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMensagensCadastradasMouseClicked(evt);
            }
        });
        scrollPaneTabelaMensagebs.setViewportView(tblMensagensCadastradas);
        if (tblMensagensCadastradas.getColumnModel().getColumnCount() > 0) {
            tblMensagensCadastradas.getColumnModel().getColumn(0).setResizable(false);
            tblMensagensCadastradas.getColumnModel().getColumn(1).setResizable(false);
        }

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

        btnDeletar.setMnemonic('D');
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollPaneMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(lblTelaCadastroMsgTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelaCadastroConteudoMsg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelaCadastroMsgTitulo))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelaCadastroMsgTabela)
                    .addComponent(scrollPaneTabelaMensagebs, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaCadastroMsgTitulo)
                    .addComponent(lblTelaCadastroMsgTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelaCadastroMsgTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelaCadastroConteudoMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneTabelaMensagebs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaBotoesInsercao();
        habilitaCampos();
        limpaCampos();
        desabilitaTabela();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtTelaCadastroMsgTitulo.getText().equals("") || txtAreaMensagem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (btnAlterar.getText().equals("Gravar")) {
                desabilitaBotoesInsercao();
                recebeCamposTelaGravacao();
                habilitaTabela();
            } else {
                recebeCamposTelaAlteracao();
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        desabilitaBotoesInsercao();
        limpaCampos();
        desabilitaCampos();
        habilitaTabela();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblMensagensCadastradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMensagensCadastradasMouseClicked
        int linha = 0;
        if (evt.getClickCount() == 1 && tblMensagensCadastradas.isEnabled()) {
            linha = tblMensagensCadastradas.getSelectedRow();
            txtTelaCadastroMsgTitulo.setText((String) tblMensagensCadastradas.getValueAt(linha, 1));
            txtAreaMensagem.setText((String) tblMensagensCadastradas.getValueAt(linha, 2));
            desabilitaCampos();
            desabilitaBotoesAlteracao();
        } else if (evt.getClickCount() == 2 && tblMensagensCadastradas.isEnabled()) {
            linha = tblMensagensCadastradas.getSelectedRow();
            msg.setCodigo_texto((int) tblMensagensCadastradas.getValueAt(linha, 0));
            msg.setTitulo((String) tblMensagensCadastradas.getValueAt(linha, 1));
            msg.setTexto((String) tblMensagensCadastradas.getValueAt(linha, 2));
            carregaCamposTabela(msg);
            habilitaCampos();
        }

    }//GEN-LAST:event_tblMensagensCadastradasMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        recebeCamposTelaDelecao();
    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblTelaCadastroConteudoMsg;
    private javax.swing.JLabel lblTelaCadastroMsgTabela;
    private javax.swing.JLabel lblTelaCadastroMsgTitulo;
    private javax.swing.JScrollPane scrollPaneMensagem;
    private javax.swing.JScrollPane scrollPaneTabelaMensagebs;
    private javax.swing.JTable tblMensagensCadastradas;
    private javax.swing.JTextArea txtAreaMensagem;
    private javax.swing.JTextField txtTelaCadastroMsgTitulo;
    // End of variables declaration//GEN-END:variables

    public void desabilitaCampos() {
        txtTelaCadastroMsgTitulo.setEnabled(false);
        txtAreaMensagem.setEnabled(false);
    }

    public void habilitaCampos() {
        txtTelaCadastroMsgTitulo.setEnabled(true);
        txtAreaMensagem.setEnabled(true);
    }

    public void desabilitaBotoesInsercao() {
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnAlterar.setText("Alterar");
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);
    }

    public void habilitaBotoesInsercao() {
        btnAlterar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setText("Gravar");
        btnNovo.setEnabled(false);
        btnSair.setEnabled(false);
        txtTelaCadastroMsgTitulo.requestFocus();
    }

    public void habilitaBotoesAlteracao() {
        btnAlterar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnSair.setEnabled(false);
    }

    public void desabilitaBotoesAlteracao() {
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);
    }
    
    public void habilitaBotaoDeletar(){
        btnDeletar.setEnabled(true);
    }
    
    public void desabilitaBotaoDeletar(){
        btnDeletar.setEnabled(false);
    }

    public void recebeCamposTelaGravacao() {
        msg.setTitulo(txtTelaCadastroMsgTitulo.getText());
        msg.setTexto(txtAreaMensagem.getText());
        boolean ok = sqlInsere.insereMensagemPadrao(msg);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Mensagem cadastrada com sucesso");
            limpaCampos();
            desabilitaCampos();
            populaTabelaMensagens();

        } else {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    public void recebeCamposTelaAlteracao() {
        msg.setTitulo(txtTelaCadastroMsgTitulo.getText());
        msg.setTexto(txtAreaMensagem.getText());
        boolean ok = sqlAltera.alteraMensagemPadrao(msg);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Mensagem alterada com sucesso");
            limpaCampos();
            desabilitaCampos();
            populaTabelaMensagens();
            desabilitaBotoesInsercao();
        } else {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    public void recebeCamposTelaDelecao() {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma exclusão da mensagem '" + msg.getTitulo()+  "' ?", "Confirme", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            boolean ok = sqlDeleta.deletaMensagemPadrao(msg);
            if (ok) {
                JOptionPane.showMessageDialog(null, "Mensagem deletada com sucesso");
                limpaCampos();
                desabilitaCampos();
                populaTabelaMensagens();
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

    public void populaTabelaMensagens() {
        try {
            SQLSeleciona sql = new SQLSeleciona();
            Tabela tabela = new Tabela(sql.getSelecionaMensagensPadraoCadastradas());
            tblMensagensCadastradas.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void limpaCampos() {
        txtTelaCadastroMsgTitulo.setText("");
        txtAreaMensagem.setText("");
    }

    public void carregaCamposTabela(Mensagem msg) {
        txtTelaCadastroMsgTitulo.setText(msg.getTitulo());
        txtAreaMensagem.setText(msg.getTexto());
        habilitaBotoesAlteracao();
    }
    
    public void desabilitaTabela(){
        tblMensagensCadastradas.setEnabled(false);
    }
    
    public void habilitaTabela(){
        tblMensagensCadastradas.setEnabled(true);
    }

}
