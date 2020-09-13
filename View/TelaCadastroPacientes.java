package View;

import Controller.ConfiguraCPF;
import Controller.ControlaCorLinhaTabela;
import Controller.SQLAltera;
import Controller.SQLDeleta;
import Controller.SQLInsere;
import Controller.SQLSeleciona;
import Controller.Tabela;
import Model.Paciente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;

public class TelaCadastroPacientes extends javax.swing.JFrame {

    private String cpfTela = "";
    private Paciente paciente = new Paciente();
    private SQLInsere sqlInsere = new SQLInsere();
    private SQLSeleciona sqlSeleciona = new SQLSeleciona();
    private SQLAltera sqlAltera = new SQLAltera();
    private SQLDeleta sqlDeleta = new SQLDeleta();
    private ConfiguraCPF configuraCpf = new ConfiguraCPF();

    public TelaCadastroPacientes() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Cadastro de Pacientes");
        this.setLocationRelativeTo(null);
        desabilitaCampos();
        desabilitaBotoesInsercao();
        populaTabelaPacientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanePacientesCadastrados = new javax.swing.JScrollPane();
        tblPacientesCadastrados = new javax.swing.JTable();
        lblPacientesCadastrados = new javax.swing.JLabel();
        lblNomePaciente = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        scrollPaneObservacoes = new javax.swing.JScrollPane();
        txtAreaObservacoes = new javax.swing.JTextArea();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        btnZerarSenha = new javax.swing.JButton();
        lblLocalizarPaciente = new javax.swing.JLabel();
        lblLocalizarPacienteNome = new javax.swing.JLabel();
        lblLocalizarPacienteCpf = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisaNome = new javax.swing.JButton();
        txtPesquisaCpf = new javax.swing.JTextField();
        btnPesquisaCpf = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPacientesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPacientesCadastrados.setToolTipText("Clique 1 vez para selecionar e 2 vezes para alterar");
        tblPacientesCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesCadastradosMouseClicked(evt);
            }
        });
        scrollPanePacientesCadastrados.setViewportView(tblPacientesCadastrados);

        lblPacientesCadastrados.setText("Pacientes Cadastrados:");

        lblNomePaciente.setText("Nome do Paciente:");

        txtNomePaciente.setFocusCycleRoot(true);
        txtNomePaciente.setNextFocusableComponent(txtCpf);

        lblCpf.setText("CPF:");

        txtCpf.setNextFocusableComponent(txtDataNascimento);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        lblDataNascimento.setText("Data de Nascimento:");

        lblTelefone.setText("Telefone:");

        txtTelefone.setNextFocusableComponent(txtCelular);

        lblCelular.setText("Celular:");

        txtCelular.setNextFocusableComponent(txtAreaObservacoes);

        lblObservacoes.setText("Observações:");

        txtAreaObservacoes.setColumns(20);
        txtAreaObservacoes.setRows(5);
        scrollPaneObservacoes.setViewportView(txtAreaObservacoes);

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

        txtDataNascimento.setNextFocusableComponent(txtTelefone);

        btnZerarSenha.setMnemonic('Z');
        btnZerarSenha.setText("Zerar Senha");
        btnZerarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarSenhaActionPerformed(evt);
            }
        });

        lblLocalizarPaciente.setText("Localizar Paciente:");

        lblLocalizarPacienteNome.setText("Nome:");

        lblLocalizarPacienteCpf.setText("CPF:");

        btnPesquisaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        btnPesquisaCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnPesquisaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCpfActionPerformed(evt);
            }
        });

        btnLimpar.setMnemonic('L');
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblLocalizarPacienteCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisaCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblLocalizarPacienteNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCelular)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                            .addComponent(scrollPaneObservacoes)
                            .addComponent(txtNomePaciente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataNascimento)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblObservacoes, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomePaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLocalizarPaciente, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPacientesCadastrados)
                        .addGap(358, 358, 358))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scrollPanePacientesCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZerarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPacientesCadastrados)
                    .addComponent(lblNomePaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanePacientesCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpf)
                            .addComponent(lblDataNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(lblCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObservacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lblLocalizarPaciente)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisaNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLocalizarPacienteNome)
                                .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisaCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPesquisaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLocalizarPacienteCpf)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZerarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitaBotoesInsercao();
        habilitaCampos("novo");
        limpaCampos();
        desabilitaTabela();
        desabilitaBotoesPesquisa();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (btnAlterar.getText().equals("Gravar")) {
            if (txtNomePaciente.getText().equals("") || txtCpf.getText().equals("") || txtCpf.getText().length() != 14) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtNomePaciente.requestFocus();
            } else if (sqlSeleciona.pesquisaCpfCadastrado(txtCpf.getText())) {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtCpf.requestFocus();
            } else {
                desabilitaBotoesInsercao();
                capturaCamposTelaGravacao();
                habilitaBotoesPesquisa();
                habilitaTabela();
            }
        } else {
            if (txtCpf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o CPF.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                capturaCamposTelaAlteracao(configuraCpf.desmontaCpf(cpfTela));
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
        habilitaBotoesPesquisa();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblPacientesCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesCadastradosMouseClicked
        int linha = 0;
        if (evt.getClickCount() == 1 && tblPacientesCadastrados.isEnabled()) {
            linha = tblPacientesCadastrados.getSelectedRow();
            String cpf = configuraCpf.desmontaCpf((String) tblPacientesCadastrados.getValueAt(linha, 0));
            recuperaDadosPaciente(cpf);
            desabilitaCampos();
            desabilitaBotoesAlteracao();
        } else if (evt.getClickCount() == 2 && tblPacientesCadastrados.isEnabled()) {
            linha = tblPacientesCadastrados.getSelectedRow();
            cpfTela = configuraCpf.desmontaCpf((String) tblPacientesCadastrados.getValueAt(linha, 0));
            recuperaDadosPaciente(cpfTela);
            habilitaCampos("existente");
            habilitaBotoesAlteracao();
        }
    }//GEN-LAST:event_tblPacientesCadastradosMouseClicked

    private void btnZerarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarSenhaActionPerformed
        int resultado = JOptionPane.showConfirmDialog(rootPane, "A senha do Paciente será zerada, confirma?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resultado == 0) {
            zeraSenhaPaciente(configuraCpf.desmontaCpf(txtCpf.getText()));
        }
    }//GEN-LAST:event_btnZerarSenhaActionPerformed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        txtCpf.setText(configuraCpf.montaCpf(txtCpf.getText()));
    }//GEN-LAST:event_txtCpfFocusLost

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        if (txtPesquisaNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o nome para pesquisa.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pesquisaNome(txtPesquisaNome.getText());
        }
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void btnPesquisaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCpfActionPerformed
        if (txtPesquisaCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CPF para pesquisa.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pesquisaCpf(txtPesquisaCpf.getText());
        }
    }//GEN-LAST:event_btnPesquisaCpfActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
        limpaCamposPesquisa();
        populaTabelaPacientes();
        desabilitaBotoesAlteracao();
    }//GEN-LAST:event_btnLimparActionPerformed

    public void habilitaCampos(String tipo) {
        txtNomePaciente.setEnabled(true);
        if (tipo.equals("existente")) {
            if (cpfTela.length() == 11) {
                txtCpf.setEnabled(false);
            } else {
                txtCpf.setEnabled(true);
            }
        } else {
            txtCpf.setEnabled(true);
        }
        txtDataNascimento.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtCelular.setEnabled(true);
        txtAreaObservacoes.setEnabled(true);
        txtNomePaciente.requestFocus();
    }

    public void desabilitaCampos() {
        txtNomePaciente.setEnabled(false);
        txtCpf.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCelular.setEnabled(false);
        txtAreaObservacoes.setEnabled(false);
    }

    public void capturaCamposTelaGravacao() {
        boolean ok = false;
        paciente.setNome(txtNomePaciente.getText());
        paciente.setCpf(configuraCpf.desmontaCpf(txtCpf.getText()));
        paciente.setData_nascimento(txtDataNascimento.getText());
        paciente.setTelefone(txtTelefone.getText());
        paciente.setCelular(txtCelular.getText());
        paciente.setObservacoes(txtAreaObservacoes.getText());
        ok = sqlInsere.inserePaciente(paciente);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
            limpaCampos();
            desabilitaCampos();
            populaTabelaPacientes();
        } else {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    public void capturaCamposTelaAlteracao(String cpf) {
        paciente.setNome(txtNomePaciente.getText());
        paciente.setCpf(configuraCpf.desmontaCpf(txtCpf.getText()));
        paciente.setData_nascimento(txtDataNascimento.getText());
        paciente.setTelefone(txtTelefone.getText());
        paciente.setCelular(txtCelular.getText());
        paciente.setObservacoes(txtAreaObservacoes.getText());
        boolean ok = sqlAltera.alteraPacienteCadastrado(paciente, cpf);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso");
            limpaCampos();
            desabilitaCampos();
            populaTabelaPacientes();
            desabilitaBotoesInsercao();

        } else {
            JOptionPane.showMessageDialog(null, "Erro de alteracao");
        }
    }

    public void recebeCamposTelaDelecao() {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma exclusão do paciente '" + paciente.getNome() + "' ?", "Confirme", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            boolean ok = sqlDeleta.deletaPaciente(paciente);
            if (ok) {
                JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso");
                limpaCampos();
                desabilitaCampos();
                populaTabelaPacientes();
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

    public void zeraSenhaPaciente(String cpf) {
        boolean ok = sqlAltera.zeraSenhaPaciente(cpf);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Senha zerada com sucesso");
            desabilitaBotoesAlteracao();
            limpaCampos();
            desabilitaCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao zerar a senha");
        }
    }

    public void pesquisaNome(String nome) {
        boolean achou = false;
        achou = sqlSeleciona.validaPesquisaNome(nome);
        if (achou) {
            try {
                Tabela tabela = new Tabela(sqlSeleciona.getSelecionaPacientesCadastradosNome(nome));
                tblPacientesCadastrados.setModel(tabela);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public void pesquisaCpf(String cpf) {
        boolean achou = false;
        achou = sqlSeleciona.validaPesquisaCpf(cpf);
        if (achou) {
            try {
                Tabela tabela = new Tabela(sqlSeleciona.getSelecionaPacientesCadastradosCpf(cpf));
                tblPacientesCadastrados.setModel(tabela);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void recuperaDadosPaciente(String cpf) {
        paciente = sqlSeleciona.pesquisaDadosPacientesCadastrados(cpf);
        txtNomePaciente.setText(paciente.getNome());
        txtCpf.setText(configuraCpf.montaCpf(paciente.getCpf()));
        txtDataNascimento.setText(paciente.getData_nascimento());
        txtTelefone.setText(paciente.getTelefone());
        txtCelular.setText(paciente.getCelular());
        txtAreaObservacoes.setText(paciente.getObservacoes());
    }

    public void desabilitaBotoesInsercao() {
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnZerarSenha.setEnabled(false);
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
    }

    public void habilitaBotoesAlteracao() {
        btnAlterar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnZerarSenha.setEnabled(true);
        btnNovo.setEnabled(false);
        btnSair.setEnabled(false);
    }

    public void desabilitaBotoesAlteracao() {
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnZerarSenha.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);
    }
    
    public void desabilitaBotoesPesquisa(){
        btnLimpar.setEnabled(false);
        btnPesquisaNome.setEnabled(false);
        btnPesquisaCpf.setEnabled(false);
    }
    
    public void habilitaBotoesPesquisa(){
        btnLimpar.setEnabled(true);
        btnPesquisaNome.setEnabled(true);
        btnPesquisaCpf.setEnabled(true);
    }

    public void limpaCampos() {
        txtNomePaciente.setText("");
        txtCpf.setText("");
        txtDataNascimento.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtAreaObservacoes.setText("");
    }

    public void limpaCamposPesquisa() {
        txtPesquisaNome.setText("");
        txtPesquisaCpf.setText("");
    }

    public void populaTabelaPacientes() {
        try {
            SQLSeleciona sql = new SQLSeleciona();
            Tabela tabela = new Tabela(sql.getSelecionaPacientesCadastrados());
            tblPacientesCadastrados.setModel(tabela);
            TableCellRenderer renderer = new ControlaCorLinhaTabela();
            for (int i = 0; i < tblPacientesCadastrados.getColumnCount(); i++) {
                tblPacientesCadastrados.setDefaultRenderer(tblPacientesCadastrados.getColumnClass(i), renderer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void desabilitaTabela(){
        tblPacientesCadastrados.setEnabled(false);
    }
    
    public void habilitaTabela(){
        tblPacientesCadastrados.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisaCpf;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnZerarSenha;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblLocalizarPaciente;
    private javax.swing.JLabel lblLocalizarPacienteCpf;
    private javax.swing.JLabel lblLocalizarPacienteNome;
    private javax.swing.JLabel lblNomePaciente;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPacientesCadastrados;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JScrollPane scrollPaneObservacoes;
    private javax.swing.JScrollPane scrollPanePacientesCadastrados;
    private javax.swing.JTable tblPacientesCadastrados;
    private javax.swing.JTextArea txtAreaObservacoes;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtPesquisaCpf;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
