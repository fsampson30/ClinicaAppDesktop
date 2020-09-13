package View;

import Controller.ConfiguraCPF;
import Controller.ControlaCorLinhaTabela;
import Controller.ConverteData;
import Controller.SQLAltera;
import Controller.SQLDeleta;
import Controller.SQLInsere;
import Controller.SQLSeleciona;
import Controller.Tabela;
import Model.Laudo;
import Model.MensagemChat;
import Model.Paciente;
import Model.Usuario;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class TelaPrincipal extends javax.swing.JFrame {

    private String usuarioLogado;
    private Usuario usuario;
    private String dataHoje;
    private MensagemChat chat = new MensagemChat();
    private Paciente paciente = new Paciente();
    private SQLSeleciona sqlSeleciona = new SQLSeleciona();
    private SQLInsere sqlInsere = new SQLInsere();
    private SQLAltera sqlAltera = new SQLAltera();
    private ConfiguraCPF configuraCpf = new ConfiguraCPF();
    private ConverteData converteData = new ConverteData();
    private int qtdAtualArquivos = 0;
    private File[] arrayFiles;
    private String caminhoPedidos = "";
    private File caminho = new File("a.txt"); 

    public TelaPrincipal() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("SonusApp");
        desabilitaCamposPesquisaPaciente();
        desabilitaTabela();
        populaComboBoxMensagens();
        pegaDataAtual();
        populaTabelaAgendamentos(0);
        populaComboBoxExames();
        populaTabelaTodasMensagensEnviadas(0);
        populaTabelaTodosLaudosEnviados();
        desabilitaCamposPeriodoEnvioMsg();
        desabilitaBotaoExcluirLaudo();
        ocultaBarra();
    }

    public TelaPrincipal(String usuario) {
        this();
        this.usuarioLogado = usuario;
        exibeUsuarioLogado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRadioGroupPesquisaPaciente = new javax.swing.ButtonGroup();
        btnRadioGroupEnvioMensagens = new javax.swing.ButtonGroup();
        pnlAbasTelaPrincipal = new javax.swing.JTabbedPane();
        pnlTelaPrincipalMensagens = new javax.swing.JPanel();
        lblTelaPrincipalTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTelaPrincipalMsgLivre = new javax.swing.JTextArea();
        cbbMsgCadastradas = new javax.swing.JComboBox<>();
        btnTelaPrincipalEnviaMensagem = new javax.swing.JButton();
        btnTelaPrincipalEditaMensagem = new javax.swing.JButton();
        lblTelaEnvioMsgOpcoes = new javax.swing.JLabel();
        rdoButtonIndividual = new javax.swing.JRadioButton();
        rdoButtonTodos = new javax.swing.JRadioButton();
        rdoButtonPeriodo = new javax.swing.JRadioButton();
        txtTelaEnviaMsgDtInicial = new javax.swing.JTextField();
        lblTelaEnviaMsgDtInicial = new javax.swing.JLabel();
        lblTelaEnviaMsgDtFinal = new javax.swing.JLabel();
        txtTelaEnviaMsgDtFinal = new javax.swing.JTextField();
        ProgressBarEnvioMensagens = new javax.swing.JProgressBar();
        lblQuantidadeAtual = new javax.swing.JLabel();
        lblQuantidadeTotal = new javax.swing.JLabel();
        pnlTelaPrincipalMensagensRecebidas = new javax.swing.JPanel();
        scrollPaneTelaPrincipalTodasMensagensEnviadas = new javax.swing.JScrollPane();
        tblTelaPrincipalTodasMensagensEnviadas = new javax.swing.JTable();
        lblTelaMensagensRecebidasDataEnvio = new javax.swing.JLabel();
        txtTelaMensagensRecebidasDataEnvio = new javax.swing.JTextField();
        btnTelaMensagensRecebidasDataEnvio = new javax.swing.JButton();
        lblTelaMensagensRecebidasFiltro = new javax.swing.JLabel();
        lblTelaMensagensRecebidasOpcoesVisualizacao = new javax.swing.JLabel();
        cbbTelaMensagensRecebidasOpcoesVisualizacao = new javax.swing.JComboBox<>();
        pnlTelaPrincipalAgendamentos = new javax.swing.JPanel();
        scrollPaneTelaPrincipalAgendamentos = new javax.swing.JScrollPane();
        tblTelaPrincipalAgendamentos = new javax.swing.JTable();
        lblTelaPrincipalTituloAgendamentos = new javax.swing.JLabel();
        lblTelaPrincipalFiltros = new javax.swing.JLabel();
        cbbAgendamentosSecao = new javax.swing.JComboBox<>();
        lblTelaAgendamentosSecao = new javax.swing.JLabel();
        lblTelaAgendamentosTurno = new javax.swing.JLabel();
        cbbAgendamentosTurno = new javax.swing.JComboBox<>();
        lblTelaAgendamentosDataSolicitacao = new javax.swing.JLabel();
        txtAgendamentosDataSolicitacao = new javax.swing.JTextField();
        lblTelaAgendamentosDataExame = new javax.swing.JLabel();
        txtAgendamentosDataExame = new javax.swing.JTextField();
        btnAgendamentosDataSolicitacao = new javax.swing.JButton();
        btnAgendamentosDataExame = new javax.swing.JButton();
        lblTelaAgendamentosVerificaPedidos = new javax.swing.JLabel();
        lblTelaAgendamentosOpcoesVisualizacao = new javax.swing.JLabel();
        cbbTelaAgendamentosOpcoesVisualizacao = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPedidosMedicos = new javax.swing.JList<>();
        lblQuantidadeArquivos = new javax.swing.JLabel();
        lblTituloQuantidadeArquivos = new javax.swing.JLabel();
        lblTituloSelecionaPastaPedidos = new javax.swing.JLabel();
        btnTelaAgendamentosVerificaImagensPedidos = new javax.swing.JButton();
        txtCaminhoPasta = new javax.swing.JTextField();
        lblTituloQuantidadeNovosArquivos = new javax.swing.JLabel();
        lblQuantidadeNovosArquivos = new javax.swing.JLabel();
        pnlTelaPrincipalLaudos = new javax.swing.JPanel();
        cbbExames = new javax.swing.JComboBox<>();
        lblTelaLaudosDataAdmissao = new javax.swing.JLabel();
        txtTelaLaudosDataAdmissao = new javax.swing.JTextField();
        lblTelaLaudosCaminhoLaudo = new javax.swing.JLabel();
        txtTelaLaudosCaminhoLaudo = new javax.swing.JTextField();
        lblTelaLaudosCaminhoFoto = new javax.swing.JLabel();
        txtTelaLaudosCaminhoFoto = new javax.swing.JTextField();
        txtTelaLaudosCodigoExame = new javax.swing.JTextField();
        lblTelaLaudosMatricula = new javax.swing.JLabel();
        txtTelaLaudosMatricula = new javax.swing.JTextField();
        lblTelaLaudosCodigoExame = new javax.swing.JLabel();
        btnTelaLaudosGravar = new javax.swing.JButton();
        btnTelaLaudosEscolheLaudo = new javax.swing.JButton();
        btnTelaLaudosEscolheFoto = new javax.swing.JButton();
        lblTelaLaudosTitulo = new javax.swing.JLabel();
        scrollPaneTelaLaudosEnviados = new javax.swing.JScrollPane();
        tblTelaLaudosEnviados = new javax.swing.JTable();
        btnTelaLaudosExcluirLaudo = new javax.swing.JButton();
        pnlTelaPrincipalHistorico = new javax.swing.JPanel();
        lblTelaHistoricoMensagensRecebidas = new javax.swing.JLabel();
        lblTelaHistoricoMensagensEnviadas = new javax.swing.JLabel();
        lblTelaHistoricoAgendamentos = new javax.swing.JLabel();
        scrollPaneTelaPrincipalHistoricoAgendamentos = new javax.swing.JScrollPane();
        tblTelaPrincipalHistoricoAgendamentos = new javax.swing.JTable();
        scrollPaneTelaPrincipalHistoricoMensagensRecebidas = new javax.swing.JScrollPane();
        tblTelaPrincipalHistoricoMensagensRecebidas = new javax.swing.JTable();
        scrollPaneTelaPrincipalHistoricoMensagensEnviadas = new javax.swing.JScrollPane();
        tblTelaPrincipalHistoricoMensagensEnviadas = new javax.swing.JTable();
        lblTelaHistoricoLaudos = new javax.swing.JLabel();
        scrollPaneTelaPrincipalHistoricoLaudos = new javax.swing.JScrollPane();
        tblTelaPrincipalHistoricoLaudos = new javax.swing.JTable();
        lblTelaPrincipalPaciente = new javax.swing.JLabel();
        rdoButtonCpf = new javax.swing.JRadioButton();
        rdoButtonNome = new javax.swing.JRadioButton();
        btnLocalizaPaciente = new javax.swing.JButton();
        txtTelaPrincipalNome = new javax.swing.JTextField();
        txtTelaPrincipalCpf = new javax.swing.JTextField();
        toolBarTelaPrincipal = new javax.swing.JToolBar();
        lblTelaPrincipalUsuarioLogado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        lblTelaPrincipalExibeData = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        lblInformacoes = new javax.swing.JLabel();
        lblDadosNomePaciente = new javax.swing.JLabel();
        txtDadosNomePaciente = new javax.swing.JTextField();
        lblDadosCpfPaciente = new javax.swing.JLabel();
        lblDadosDataNascimentoPaciente = new javax.swing.JLabel();
        txtDadosDataNascimentoPaciente = new javax.swing.JFormattedTextField();
        txtDadosCpfPaciente = new javax.swing.JTextField();
        lbDadosTelefonePaciente = new javax.swing.JLabel();
        txtDadosTelefonePaciente = new javax.swing.JTextField();
        txtDadosCelularPaciente = new javax.swing.JTextField();
        lblDadosCelularPaciente = new javax.swing.JLabel();
        scrollPaneObservacoes = new javax.swing.JScrollPane();
        txtDadosAreaObservacoesPaciente = new javax.swing.JTextArea();
        lbDadoslObservacoesPaciente = new javax.swing.JLabel();
        scrollPaneTelaPrincipalPacientes1 = new javax.swing.JScrollPane();
        tblTelaPrincipalPacientes = new javax.swing.JTable();
        menuTelaPrincipal = new javax.swing.JMenuBar();
        menuItemArquivo = new javax.swing.JMenu();
        itemAtualizar = new javax.swing.JMenuItem();
        menuItemCadastro = new javax.swing.JMenu();
        itemCadastroMensagens = new javax.swing.JMenuItem();
        itemPacientes = new javax.swing.JMenuItem();
        itemUsuarios = new javax.swing.JMenuItem();
        menuItemUtilitarios = new javax.swing.JMenu();
        itemTrocaUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 700));

        pnlAbasTelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTelaPrincipalTitulo.setText("Selecione a mensagem que será enviada ao paciente:");

        txtAreaTelaPrincipalMsgLivre.setEditable(false);
        txtAreaTelaPrincipalMsgLivre.setColumns(20);
        txtAreaTelaPrincipalMsgLivre.setLineWrap(true);
        txtAreaTelaPrincipalMsgLivre.setRows(5);
        txtAreaTelaPrincipalMsgLivre.setToolTipText("Digite a mensagem a ser enviada.");
        txtAreaTelaPrincipalMsgLivre.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaTelaPrincipalMsgLivre);

        cbbMsgCadastradas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMsgCadastradasItemStateChanged(evt);
            }
        });

        btnTelaPrincipalEnviaMensagem.setText("Enviar Mensagem");
        btnTelaPrincipalEnviaMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaPrincipalEnviaMensagemActionPerformed(evt);
            }
        });

        btnTelaPrincipalEditaMensagem.setText("Editar Mensagem");
        btnTelaPrincipalEditaMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaPrincipalEditaMensagemActionPerformed(evt);
            }
        });

        lblTelaEnvioMsgOpcoes.setText("Opções de Envio de Mensagem:");

        btnRadioGroupEnvioMensagens.add(rdoButtonIndividual);
        rdoButtonIndividual.setSelected(true);
        rdoButtonIndividual.setText("Individual");
        rdoButtonIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoButtonIndividualActionPerformed(evt);
            }
        });

        btnRadioGroupEnvioMensagens.add(rdoButtonTodos);
        rdoButtonTodos.setText("Todos os Pacientes");
        rdoButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoButtonTodosActionPerformed(evt);
            }
        });

        btnRadioGroupEnvioMensagens.add(rdoButtonPeriodo);
        rdoButtonPeriodo.setText("Pacientes com Agendamentos no Período:");
        rdoButtonPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoButtonPeriodoActionPerformed(evt);
            }
        });

        lblTelaEnviaMsgDtInicial.setText("Data Inicial:");

        lblTelaEnviaMsgDtFinal.setText("Data Final:");

        lblQuantidadeAtual.setText("jLabel1");

        lblQuantidadeTotal.setText("jLabel2");

        javax.swing.GroupLayout pnlTelaPrincipalMensagensLayout = new javax.swing.GroupLayout(pnlTelaPrincipalMensagens);
        pnlTelaPrincipalMensagens.setLayout(pnlTelaPrincipalMensagensLayout);
        pnlTelaPrincipalMensagensLayout.setHorizontalGroup(
            pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelaPrincipalTitulo)
                                    .addComponent(cbbMsgCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTelaEnvioMsgOpcoes))
                            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                        .addComponent(rdoButtonPeriodo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTelaEnviaMsgDtInicial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelaEnviaMsgDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTelaEnviaMsgDtFinal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelaEnviaMsgDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                        .addComponent(rdoButtonIndividual)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoButtonTodos)
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                                .addComponent(lblQuantidadeAtual)
                                                .addGap(129, 129, 129)
                                                .addComponent(lblQuantidadeTotal)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(ProgressBarEnvioMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(btnTelaPrincipalEnviaMensagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTelaPrincipalEditaMensagem)))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTelaPrincipalMensagensLayout.setVerticalGroup(
            pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPrincipalTitulo)
                .addGap(18, 18, 18)
                .addComponent(cbbMsgCadastradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidadeTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelaEnvioMsgOpcoes)
                        .addComponent(lblQuantidadeAtual)))
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaPrincipalMensagensLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoButtonIndividual)
                            .addComponent(rdoButtonTodos))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelaEnviaMsgDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaEnviaMsgDtInicial)
                            .addComponent(rdoButtonPeriodo)
                            .addComponent(lblTelaEnviaMsgDtFinal)
                            .addComponent(txtTelaEnviaMsgDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ProgressBarEnvioMensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(pnlTelaPrincipalMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaPrincipalEnviaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaPrincipalEditaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlAbasTelaPrincipal.addTab("Enviar Mensagens", pnlTelaPrincipalMensagens);

        tblTelaPrincipalTodasMensagensEnviadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalTodasMensagensEnviadas.setToolTipText("Clique 2 vezes no nome para selecionar o paciente; Clique 2 vezes no quadrado para marcar como lida.");
        tblTelaPrincipalTodasMensagensEnviadas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblTelaPrincipalTodasMensagensEnviadas.setAutoscrolls(false);
        tblTelaPrincipalTodasMensagensEnviadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTelaPrincipalTodasMensagensEnviadasMouseClicked(evt);
            }
        });
        scrollPaneTelaPrincipalTodasMensagensEnviadas.setViewportView(tblTelaPrincipalTodasMensagensEnviadas);

        lblTelaMensagensRecebidasDataEnvio.setText("Data do Envio:");

        btnTelaMensagensRecebidasDataEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnTelaMensagensRecebidasDataEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaMensagensRecebidasDataEnvioActionPerformed(evt);
            }
        });

        lblTelaMensagensRecebidasFiltro.setText("Filtro:");

        lblTelaMensagensRecebidasOpcoesVisualizacao.setText("Opções de Exibição:");

        cbbTelaMensagensRecebidasOpcoesVisualizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Dia Atual", "Últimos 2 dias", "Última Semana", "Lidas", "Não Lidas" }));
        cbbTelaMensagensRecebidasOpcoesVisualizacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTelaMensagensRecebidasOpcoesVisualizacaoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlTelaPrincipalMensagensRecebidasLayout = new javax.swing.GroupLayout(pnlTelaPrincipalMensagensRecebidas);
        pnlTelaPrincipalMensagensRecebidas.setLayout(pnlTelaPrincipalMensagensRecebidasLayout);
        pnlTelaPrincipalMensagensRecebidasLayout.setHorizontalGroup(
            pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTelaPrincipalTodasMensagensEnviadas, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createSequentialGroup()
                                .addComponent(lblTelaMensagensRecebidasDataEnvio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelaMensagensRecebidasDataEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTelaMensagensRecebidasDataEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTelaMensagensRecebidasFiltro))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelaMensagensRecebidasOpcoesVisualizacao)
                            .addComponent(cbbTelaMensagensRecebidasOpcoesVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlTelaPrincipalMensagensRecebidasLayout.setVerticalGroup(
            pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneTelaPrincipalTodasMensagensEnviadas, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaMensagensRecebidasFiltro)
                    .addComponent(lblTelaMensagensRecebidasOpcoesVisualizacao))
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaPrincipalMensagensRecebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelaMensagensRecebidasDataEnvio)
                        .addComponent(txtTelaMensagensRecebidasDataEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTelaMensagensRecebidasDataEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbTelaMensagensRecebidasOpcoesVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pnlAbasTelaPrincipal.addTab("Mensagens Recebidas", pnlTelaPrincipalMensagensRecebidas);

        tblTelaPrincipalAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalAgendamentos.setToolTipText("Clique 2 vezes para selecionar o paciente");
        tblTelaPrincipalAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTelaPrincipalAgendamentosMouseClicked(evt);
            }
        });
        scrollPaneTelaPrincipalAgendamentos.setViewportView(tblTelaPrincipalAgendamentos);

        lblTelaPrincipalTituloAgendamentos.setText("Lista de Agendamentos Solicitados:");

        lblTelaPrincipalFiltros.setText("Escolha uma das opções para filtros:");

        cbbAgendamentosSecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ultrassonografia", "Densitometria Óssea", "Mapa", "Eletro", "Holter", "Pneumologista", "Dopplerfluxometria", "Ecocardio", "Mamografia Digital", "" }));
        cbbAgendamentosSecao.setSelectedIndex(-1);
        cbbAgendamentosSecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbAgendamentosSecaoItemStateChanged(evt);
            }
        });

        lblTelaAgendamentosSecao.setText("Seção:");

        lblTelaAgendamentosTurno.setText("Turno:");

        cbbAgendamentosTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Ambos" }));
        cbbAgendamentosTurno.setSelectedIndex(-1);
        cbbAgendamentosTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbAgendamentosTurnoItemStateChanged(evt);
            }
        });

        lblTelaAgendamentosDataSolicitacao.setText("Data da Solicitação:");

        lblTelaAgendamentosDataExame.setText("Data do Exame:");

        btnAgendamentosDataSolicitacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnAgendamentosDataSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentosDataSolicitacaoActionPerformed(evt);
            }
        });

        btnAgendamentosDataExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnAgendamentosDataExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentosDataExameActionPerformed(evt);
            }
        });

        lblTelaAgendamentosVerificaPedidos.setText("Pedidos Médicos:");

        lblTelaAgendamentosOpcoesVisualizacao.setText("Opções de Exibição:");

        cbbTelaAgendamentosOpcoesVisualizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Dia Atual", "Últimos 2 dias", "Última Semana" }));
        cbbTelaAgendamentosOpcoesVisualizacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTelaAgendamentosOpcoesVisualizacaoItemStateChanged(evt);
            }
        });

        jListPedidosMedicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListPedidosMedicos.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jListPedidosMedicos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListPedidosMedicosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListPedidosMedicos);

        lblQuantidadeArquivos.setText("0");

        lblTituloQuantidadeArquivos.setText("Total Arquivos:");

        lblTituloSelecionaPastaPedidos.setText("Caminho:");

        btnTelaAgendamentosVerificaImagensPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnTelaAgendamentosVerificaImagensPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaAgendamentosVerificaImagensPedidosActionPerformed(evt);
            }
        });

        lblTituloQuantidadeNovosArquivos.setText("Novos Arquivos:");

        lblQuantidadeNovosArquivos.setText("0");

        javax.swing.GroupLayout pnlTelaPrincipalAgendamentosLayout = new javax.swing.GroupLayout(pnlTelaPrincipalAgendamentos);
        pnlTelaPrincipalAgendamentos.setLayout(pnlTelaPrincipalAgendamentosLayout);
        pnlTelaPrincipalAgendamentosLayout.setHorizontalGroup(
            pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTelaPrincipalFiltros)
                            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                        .addComponent(lblTelaAgendamentosDataExame)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtAgendamentosDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                        .addComponent(lblTelaAgendamentosDataSolicitacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAgendamentosDataSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgendamentosDataSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgendamentosDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                .addComponent(lblTelaAgendamentosOpcoesVisualizacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbTelaAgendamentosOpcoesVisualizacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                .addComponent(lblTelaAgendamentosSecao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbAgendamentosSecao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                .addComponent(lblTelaAgendamentosTurno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbAgendamentosTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                .addComponent(txtCaminhoPasta)
                                .addGap(18, 18, 18)
                                .addComponent(btnTelaAgendamentosVerificaImagensPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                                        .addComponent(lblTituloSelecionaPastaPedidos)
                                        .addGap(95, 95, 95)
                                        .addComponent(lblTituloQuantidadeArquivos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblQuantidadeArquivos)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTituloQuantidadeNovosArquivos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblQuantidadeNovosArquivos))
                                    .addComponent(lblTelaAgendamentosVerificaPedidos)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelaPrincipalTituloAgendamentos)
                            .addComponent(scrollPaneTelaPrincipalAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTelaPrincipalAgendamentosLayout.setVerticalGroup(
            pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaPrincipalTituloAgendamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTelaPrincipalAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelaAgendamentosVerificaPedidos)
                    .addComponent(lblTelaPrincipalFiltros))
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaAgendamentosSecao)
                            .addComponent(cbbAgendamentosSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaAgendamentosTurno)
                            .addComponent(cbbAgendamentosTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaAgendamentosOpcoesVisualizacao)
                            .addComponent(cbbTelaAgendamentosOpcoesVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgendamentosDataSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelaAgendamentosDataSolicitacao)
                                .addComponent(txtAgendamentosDataSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaAgendamentosDataExame)
                            .addComponent(txtAgendamentosDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAgendamentosDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTelaPrincipalAgendamentosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTituloSelecionaPastaPedidos)
                            .addComponent(lblTituloQuantidadeArquivos)
                            .addComponent(lblQuantidadeArquivos)
                            .addComponent(lblTituloQuantidadeNovosArquivos)
                            .addComponent(lblQuantidadeNovosArquivos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTelaPrincipalAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCaminhoPasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTelaAgendamentosVerificaImagensPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pnlAbasTelaPrincipal.addTab("Agendamentos", pnlTelaPrincipalAgendamentos);

        cbbExames.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbExamesItemStateChanged(evt);
            }
        });

        lblTelaLaudosDataAdmissao.setText("Data de Admissão:");

        lblTelaLaudosCaminhoLaudo.setText("Caminho do Laudo:");

        txtTelaLaudosCaminhoLaudo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelaLaudosCaminhoLaudoKeyPressed(evt);
            }
        });

        lblTelaLaudosCaminhoFoto.setText("Caminho das Fotos:");

        txtTelaLaudosCaminhoFoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelaLaudosCaminhoFotoKeyPressed(evt);
            }
        });

        txtTelaLaudosCodigoExame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelaLaudosCodigoExameKeyPressed(evt);
            }
        });

        lblTelaLaudosMatricula.setText("Matrícula:");

        lblTelaLaudosCodigoExame.setText("Exame:");

        btnTelaLaudosGravar.setText("Gravar");
        btnTelaLaudosGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaLaudosGravarActionPerformed(evt);
            }
        });

        btnTelaLaudosEscolheLaudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnTelaLaudosEscolheLaudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaLaudosEscolheLaudoActionPerformed(evt);
            }
        });

        btnTelaLaudosEscolheFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_explore.png"))); // NOI18N
        btnTelaLaudosEscolheFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaLaudosEscolheFotoActionPerformed(evt);
            }
        });

        lblTelaLaudosTitulo.setText("Laudos Enviados:");

        tblTelaLaudosEnviados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaLaudosEnviados.setToolTipText("Clique 1 vez para selecionar o paciente; Clique 2 vezes para habilitar exclusão.");
        tblTelaLaudosEnviados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTelaLaudosEnviadosMouseClicked(evt);
            }
        });
        scrollPaneTelaLaudosEnviados.setViewportView(tblTelaLaudosEnviados);

        btnTelaLaudosExcluirLaudo.setText("Excluir");
        btnTelaLaudosExcluirLaudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaLaudosExcluirLaudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTelaPrincipalLaudosLayout = new javax.swing.GroupLayout(pnlTelaPrincipalLaudos);
        pnlTelaPrincipalLaudos.setLayout(pnlTelaPrincipalLaudosLayout);
        pnlTelaPrincipalLaudosLayout.setHorizontalGroup(
            pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelaLaudosCaminhoFoto)
                                    .addComponent(lblTelaLaudosCaminhoLaudo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelaLaudosCaminhoLaudo, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(txtTelaLaudosCaminhoFoto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTelaLaudosEscolheLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTelaLaudosEscolheFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelaLaudosMatricula)
                                    .addComponent(lblTelaLaudosCodigoExame))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                                        .addComponent(txtTelaLaudosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTelaLaudosDataAdmissao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelaLaudosDataAdmissao))
                                    .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                                        .addComponent(txtTelaLaudosCodigoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbExames, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneTelaLaudosEnviados)
                            .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                                .addComponent(lblTelaLaudosTitulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(btnTelaLaudosGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTelaLaudosExcluirLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 174, Short.MAX_VALUE))
        );
        pnlTelaPrincipalLaudosLayout.setVerticalGroup(
            pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTelaPrincipalLaudosLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaLaudosMatricula)
                            .addComponent(txtTelaLaudosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaLaudosDataAdmissao)
                            .addComponent(txtTelaLaudosDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelaLaudosCodigoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelaLaudosCodigoExame)
                            .addComponent(cbbExames, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelaLaudosCaminhoLaudo)
                                .addComponent(txtTelaLaudosCaminhoLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTelaLaudosEscolheLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelaLaudosCaminhoFoto)
                            .addComponent(txtTelaLaudosCaminhoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTelaLaudosEscolheFoto))
                .addGap(18, 18, 18)
                .addComponent(lblTelaLaudosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTelaLaudosEnviados, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlTelaPrincipalLaudosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaLaudosGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaLaudosExcluirLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlAbasTelaPrincipal.addTab("Laudos", pnlTelaPrincipalLaudos);

        lblTelaHistoricoMensagensRecebidas.setText("Mensagens Recebidas:");

        lblTelaHistoricoMensagensEnviadas.setText("Mensagens Enviadas:");

        lblTelaHistoricoAgendamentos.setText("Agendamentos Solicitados:");

        tblTelaPrincipalHistoricoAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalHistoricoAgendamentos.setToolTipText("Clique 2 vezes para selecionar o paciente");
        scrollPaneTelaPrincipalHistoricoAgendamentos.setViewportView(tblTelaPrincipalHistoricoAgendamentos);

        tblTelaPrincipalHistoricoMensagensRecebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalHistoricoMensagensRecebidas.setToolTipText("Clique 2 vezes para selecionar o paciente");
        scrollPaneTelaPrincipalHistoricoMensagensRecebidas.setViewportView(tblTelaPrincipalHistoricoMensagensRecebidas);

        tblTelaPrincipalHistoricoMensagensEnviadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalHistoricoMensagensEnviadas.setToolTipText("Clique 2 vezes para selecionar o paciente");
        scrollPaneTelaPrincipalHistoricoMensagensEnviadas.setViewportView(tblTelaPrincipalHistoricoMensagensEnviadas);

        lblTelaHistoricoLaudos.setText("Laudos Liberados:");

        tblTelaPrincipalHistoricoLaudos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalHistoricoLaudos.setToolTipText("Clique 2 vezes para selecionar o paciente");
        scrollPaneTelaPrincipalHistoricoLaudos.setViewportView(tblTelaPrincipalHistoricoLaudos);

        javax.swing.GroupLayout pnlTelaPrincipalHistoricoLayout = new javax.swing.GroupLayout(pnlTelaPrincipalHistorico);
        pnlTelaPrincipalHistorico.setLayout(pnlTelaPrincipalHistoricoLayout);
        pnlTelaPrincipalHistoricoLayout.setHorizontalGroup(
            pnlTelaPrincipalHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelaPrincipalHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTelaPrincipalHistoricoMensagensRecebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addComponent(scrollPaneTelaPrincipalHistoricoMensagensEnviadas, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addComponent(scrollPaneTelaPrincipalHistoricoAgendamentos)
                    .addComponent(scrollPaneTelaPrincipalHistoricoLaudos)
                    .addGroup(pnlTelaPrincipalHistoricoLayout.createSequentialGroup()
                        .addGroup(pnlTelaPrincipalHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelaHistoricoMensagensRecebidas)
                            .addComponent(lblTelaHistoricoMensagensEnviadas)
                            .addComponent(lblTelaHistoricoAgendamentos)
                            .addComponent(lblTelaHistoricoLaudos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTelaPrincipalHistoricoLayout.setVerticalGroup(
            pnlTelaPrincipalHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaPrincipalHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTelaHistoricoMensagensRecebidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTelaPrincipalHistoricoMensagensRecebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelaHistoricoMensagensEnviadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTelaPrincipalHistoricoMensagensEnviadas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelaHistoricoAgendamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTelaPrincipalHistoricoAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelaHistoricoLaudos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTelaPrincipalHistoricoLaudos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAbasTelaPrincipal.addTab("Histórico do Paciente", pnlTelaPrincipalHistorico);

        lblTelaPrincipalPaciente.setText("Selecione o Paciente:");

        btnRadioGroupPesquisaPaciente.add(rdoButtonCpf);
        rdoButtonCpf.setText("CPF");
        rdoButtonCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoButtonCpfActionPerformed(evt);
            }
        });

        btnRadioGroupPesquisaPaciente.add(rdoButtonNome);
        rdoButtonNome.setText("Nome");
        rdoButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoButtonNomeActionPerformed(evt);
            }
        });

        btnLocalizaPaciente.setText("Localizar");
        btnLocalizaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizaPacienteActionPerformed(evt);
            }
        });

        txtTelaPrincipalNome.setPreferredSize(new java.awt.Dimension(10, 23));
        txtTelaPrincipalNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelaPrincipalNomeKeyPressed(evt);
            }
        });

        txtTelaPrincipalCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelaPrincipalCpfKeyPressed(evt);
            }
        });

        toolBarTelaPrincipal.setRollover(true);

        lblTelaPrincipalUsuarioLogado.setText("Usuário:");
        toolBarTelaPrincipal.add(lblTelaPrincipalUsuarioLogado);
        toolBarTelaPrincipal.add(jSeparator1);

        lblTelaPrincipalExibeData.setText("jLabel1");
        toolBarTelaPrincipal.add(lblTelaPrincipalExibeData);
        toolBarTelaPrincipal.add(jSeparator2);

        lblInformacoes.setText("Pressione F5 para atualizar informações.");
        toolBarTelaPrincipal.add(lblInformacoes);

        lblDadosNomePaciente.setText("Nome do Paciente:");

        txtDadosNomePaciente.setEditable(false);
        txtDadosNomePaciente.setFocusCycleRoot(true);

        lblDadosCpfPaciente.setText("CPF:");

        lblDadosDataNascimentoPaciente.setText("Data de Nascimento:");

        txtDadosDataNascimentoPaciente.setEditable(false);

        txtDadosCpfPaciente.setEditable(false);

        lbDadosTelefonePaciente.setText("Telefone:");

        txtDadosTelefonePaciente.setEditable(false);

        txtDadosCelularPaciente.setEditable(false);

        lblDadosCelularPaciente.setText("Celular:");

        txtDadosAreaObservacoesPaciente.setEditable(false);
        txtDadosAreaObservacoesPaciente.setColumns(20);
        txtDadosAreaObservacoesPaciente.setRows(5);
        scrollPaneObservacoes.setViewportView(txtDadosAreaObservacoesPaciente);

        lbDadoslObservacoesPaciente.setText("Observações:");

        tblTelaPrincipalPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTelaPrincipalPacientes.setToolTipText("Clique 2 vezes para selecionar o paciente");
        tblTelaPrincipalPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTelaPrincipalPacientesMouseClicked(evt);
            }
        });
        scrollPaneTelaPrincipalPacientes1.setViewportView(tblTelaPrincipalPacientes);

        menuItemArquivo.setMnemonic('A');
        menuItemArquivo.setText("Arquivo");

        itemAtualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        itemAtualizar.setText("Atualizar Informações");
        itemAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAtualizarActionPerformed(evt);
            }
        });
        menuItemArquivo.add(itemAtualizar);

        menuTelaPrincipal.add(menuItemArquivo);

        menuItemCadastro.setMnemonic('C');
        menuItemCadastro.setText("Cadastros");

        itemCadastroMensagens.setMnemonic('M');
        itemCadastroMensagens.setText("Mensagens Padrão");
        itemCadastroMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroMensagensActionPerformed(evt);
            }
        });
        menuItemCadastro.add(itemCadastroMensagens);

        itemPacientes.setMnemonic('P');
        itemPacientes.setText("Pacientes");
        itemPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacientesActionPerformed(evt);
            }
        });
        menuItemCadastro.add(itemPacientes);

        itemUsuarios.setMnemonic('U');
        itemUsuarios.setText("Usuários");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        menuItemCadastro.add(itemUsuarios);

        menuTelaPrincipal.add(menuItemCadastro);

        menuItemUtilitarios.setMnemonic('U');
        menuItemUtilitarios.setText("Utilitários");

        itemTrocaUsuario.setMnemonic('T');
        itemTrocaUsuario.setText("Trocar Usuário");
        itemTrocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTrocaUsuarioActionPerformed(evt);
            }
        });
        menuItemUtilitarios.add(itemTrocaUsuario);

        menuTelaPrincipal.add(menuItemUtilitarios);

        setJMenuBar(menuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoButtonCpf)
                                    .addComponent(txtTelaPrincipalCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txtTelaPrincipalNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLocalizaPaciente))
                                    .addComponent(rdoButtonNome)))
                            .addComponent(lblTelaPrincipalPaciente))
                        .addGap(18, 18, 18)
                        .addComponent(scrollPaneTelaPrincipalPacientes1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pnlAbasTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneObservacoes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDadosNomePaciente)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtDadosTelefonePaciente)
                                                .addComponent(lblDadosCpfPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbDadosTelefonePaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDadosCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblDadosCelularPaciente)
                                                        .addComponent(txtDadosCelularPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblDadosDataNascimentoPaciente)
                                                        .addComponent(txtDadosDataNascimentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(lbDadoslObservacoesPaciente)
                                        .addComponent(lblDadosNomePaciente))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(toolBarTelaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelaPrincipalPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLocalizaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelaPrincipalNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoButtonNome)
                                    .addComponent(rdoButtonCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelaPrincipalCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scrollPaneTelaPrincipalPacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDadosNomePaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDadosNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDadosCpfPaciente)
                            .addComponent(lblDadosDataNascimentoPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDadosCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDadosDataNascimentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDadosTelefonePaciente)
                            .addComponent(lblDadosCelularPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDadosTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDadosCelularPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDadoslObservacoesPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneObservacoes))
                    .addComponent(pnlAbasTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolBarTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoButtonCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoButtonCpfActionPerformed
        habilitaCamposPesquisaCpf();
    }//GEN-LAST:event_rdoButtonCpfActionPerformed

    private void rdoButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoButtonNomeActionPerformed
        habilitaCamposPesquisaNome();
    }//GEN-LAST:event_rdoButtonNomeActionPerformed

    private void btnLocalizaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizaPacienteActionPerformed
        String nome = "";
        String cpf = "";
        if (rdoButtonCpf.isSelected() && txtTelaPrincipalCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o CPF.", "Atenção.", JOptionPane.OK_OPTION);
        } else if (rdoButtonNome.isSelected() && txtTelaPrincipalNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o Nome.", "Atenção.", JOptionPane.OK_OPTION);
        } else {
            nome = txtTelaPrincipalNome.getText();
            cpf = txtTelaPrincipalCpf.getText();
            if (nome.isEmpty()) {
                populaTabelaPacientes(cpf, "1");
            } else {
                populaTabelaPacientes(nome, "2");
            }
        }
    }//GEN-LAST:event_btnLocalizaPacienteActionPerformed

    private void itemCadastroMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroMensagensActionPerformed
        TelaCadastroMensagens tcm = new TelaCadastroMensagens();
    }//GEN-LAST:event_itemCadastroMensagensActionPerformed

    private void itemPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacientesActionPerformed
        TelaCadastroPacientes tcp = new TelaCadastroPacientes();
    }//GEN-LAST:event_itemPacientesActionPerformed

    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuariosActionPerformed
        TelaCadastroUsuarios tcu = new TelaCadastroUsuarios();
    }//GEN-LAST:event_itemUsuariosActionPerformed

    private void txtTelaPrincipalCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelaPrincipalCpfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String cpf = "";
            cpf = txtTelaPrincipalCpf.getText();
            populaTabelaPacientes(cpf, "1");
        }
    }//GEN-LAST:event_txtTelaPrincipalCpfKeyPressed

    private void txtTelaPrincipalNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelaPrincipalNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String nome = "";
            nome = txtTelaPrincipalNome.getText();
            populaTabelaPacientes(nome, "2");
        }
    }//GEN-LAST:event_txtTelaPrincipalNomeKeyPressed

    private void btnTelaPrincipalEnviaMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPrincipalEnviaMensagemActionPerformed
        if (rdoButtonIndividual.isSelected()) {
            if (txtDadosCpfPaciente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escolha o paciente antes de enviar a mensagem", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                enviaMensagem();
                populaTabelaHistoricoAgendamentos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
                populaTabelaHistoricoMensagensEnviadas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
                populaTabelaHistoricoMensagensRecebidas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
                populaTabelaHistoricoLaudos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            }
        } else if (rdoButtonTodos.isSelected()) {
            enviaMensagemTodosPacientes();
        } else {
            if (txtTelaEnviaMsgDtInicial.getText().isEmpty() || txtTelaEnviaMsgDtFinal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preecha o período corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ConverteData cd = new ConverteData();
                enviaMensagensPeriodo(cd.retornaData(txtTelaEnviaMsgDtInicial.getText()), cd.retornaData(txtTelaEnviaMsgDtFinal.getText()));
            }
        }

    }//GEN-LAST:event_btnTelaPrincipalEnviaMensagemActionPerformed

    private void cbbMsgCadastradasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMsgCadastradasItemStateChanged
        if (cbbMsgCadastradas.getSelectedIndex() != -1) {
            selecionaTextoPadrao(cbbMsgCadastradas.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbbMsgCadastradasItemStateChanged

    private void itemTrocaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTrocaUsuarioActionPerformed
        TelaSenha senha = new TelaSenha();
        this.dispose();
    }//GEN-LAST:event_itemTrocaUsuarioActionPerformed

    private void tblTelaPrincipalAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelaPrincipalAgendamentosMouseClicked
        int linha = 0;
        if (evt.getClickCount() == 2) {
            linha = tblTelaPrincipalAgendamentos.getSelectedRow();
            recuperaDadosPaciente((String) tblTelaPrincipalAgendamentos.getValueAt(linha, 3));
            populaTabelaHistoricoAgendamentos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoMensagensEnviadas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoMensagensRecebidas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoLaudos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));            
        }
    }//GEN-LAST:event_tblTelaPrincipalAgendamentosMouseClicked

    private void btnTelaPrincipalEditaMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPrincipalEditaMensagemActionPerformed
        txtAreaTelaPrincipalMsgLivre.setEditable(true);
    }//GEN-LAST:event_btnTelaPrincipalEditaMensagemActionPerformed

    private void txtTelaLaudosCodigoExameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelaLaudosCodigoExameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String exame = "";
            exame = txtTelaLaudosCodigoExame.getText();
            cbbExames.setSelectedItem(sqlSeleciona.pesquisaNomeExame(exame));
        }
    }//GEN-LAST:event_txtTelaLaudosCodigoExameKeyPressed

    private void txtTelaLaudosCaminhoLaudoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelaLaudosCaminhoLaudoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String caminho = "";
            caminho = txtTelaLaudosCaminhoLaudo.getText();
            txtTelaLaudosCaminhoLaudo.setText(montaCaminho(caminho));
        }
    }//GEN-LAST:event_txtTelaLaudosCaminhoLaudoKeyPressed

    private void txtTelaLaudosCaminhoFotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelaLaudosCaminhoFotoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String caminho = "";
            caminho = txtTelaLaudosCaminhoFoto.getText();
            txtTelaLaudosCaminhoFoto.setText(montaCaminho(caminho));
        }
    }//GEN-LAST:event_txtTelaLaudosCaminhoFotoKeyPressed

    private void btnTelaLaudosGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaLaudosGravarActionPerformed
        if (txtDadosCpfPaciente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escolha o paciente antes de gravar o laudo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (validaCamposLaudo()) {
                insereLaudo();
                populaTabelaTodosLaudosEnviados();
            }
        }
    }//GEN-LAST:event_btnTelaLaudosGravarActionPerformed

    private void itemAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAtualizarActionPerformed
        populaComboBoxMensagens();
        populaTabelaAgendamentos(0);
        populaTabelaTodasMensagensEnviadas(0);
        populaTabelaTodosLaudosEnviados();
        limpaFiltros();
        ocultaBarra();
        desabilitaBotaoExcluirLaudo();
        montaVisualizadorPedidos();
        if (!txtDadosCpfPaciente.getText().equals("")) {
            populaTabelaHistoricoAgendamentos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoMensagensEnviadas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoMensagensRecebidas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoLaudos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
        }
    }//GEN-LAST:event_itemAtualizarActionPerformed

    private void btnTelaLaudosEscolheLaudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaLaudosEscolheLaudoActionPerformed
        txtTelaLaudosCaminhoLaudo.setText(montaCaminho(selecionaArquivo()));
    }//GEN-LAST:event_btnTelaLaudosEscolheLaudoActionPerformed

    private void btnTelaLaudosEscolheFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaLaudosEscolheFotoActionPerformed
        txtTelaLaudosCaminhoFoto.setText(montaCaminho(selecionaArquivo()));
    }//GEN-LAST:event_btnTelaLaudosEscolheFotoActionPerformed

    private void cbbExamesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbExamesItemStateChanged
        if (cbbExames.getSelectedIndex() != -1) {
            txtTelaLaudosCodigoExame.setText(sqlSeleciona.pesquisaCodExame(cbbExames.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_cbbExamesItemStateChanged

    private void cbbAgendamentosSecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbAgendamentosSecaoItemStateChanged
        if (cbbAgendamentosSecao.getSelectedIndex() != -1) {
            atualizaTabelaAgendamentos(cbbAgendamentosSecao.getSelectedItem().toString(), "");
        }
    }//GEN-LAST:event_cbbAgendamentosSecaoItemStateChanged

    private void cbbAgendamentosTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbAgendamentosTurnoItemStateChanged
        if (cbbAgendamentosTurno.getSelectedIndex() != -1) {
            atualizaTabelaAgendamentos(cbbAgendamentosTurno.getSelectedItem().toString(), "");
        }
    }//GEN-LAST:event_cbbAgendamentosTurnoItemStateChanged

    private void btnAgendamentosDataSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentosDataSolicitacaoActionPerformed
        if (txtAgendamentosDataSolicitacao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preecha a data de solicitação.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            atualizaTabelaAgendamentos("data_solicitacao", txtAgendamentosDataSolicitacao.getText());
        }
    }//GEN-LAST:event_btnAgendamentosDataSolicitacaoActionPerformed

    private void btnAgendamentosDataExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentosDataExameActionPerformed
        if (txtAgendamentosDataExame.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preecha a data do exame.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            atualizaTabelaAgendamentos("data_exame", txtAgendamentosDataExame.getText());
        }
    }//GEN-LAST:event_btnAgendamentosDataExameActionPerformed

    private void btnTelaAgendamentosVerificaImagensPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaAgendamentosVerificaImagensPedidosActionPerformed
        qtdAtualArquivos = 0;
        verificaPedidosMedicos();
    }//GEN-LAST:event_btnTelaAgendamentosVerificaImagensPedidosActionPerformed

    private void tblTelaPrincipalTodasMensagensEnviadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelaPrincipalTodasMensagensEnviadasMouseClicked
        int linha = 0;
        int coluna = 0;
        if (evt.getClickCount() == 2) {
            linha = tblTelaPrincipalTodasMensagensEnviadas.getSelectedRow();
            coluna = tblTelaPrincipalTodasMensagensEnviadas.getSelectedColumn();
            if (coluna == 4) {
                alteraStatusLidoMensagem((Integer) tblTelaPrincipalTodasMensagensEnviadas.getValueAt(linha, 0), (Boolean) tblTelaPrincipalTodasMensagensEnviadas.getValueAt(linha, 4));
            } else {
                recuperaDadosPaciente((String) tblTelaPrincipalTodasMensagensEnviadas.getValueAt(linha, 1));
                populaTabelaHistoricoAgendamentos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
                populaTabelaHistoricoMensagensEnviadas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
                populaTabelaHistoricoMensagensRecebidas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
                populaTabelaHistoricoLaudos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            }
        }
    }//GEN-LAST:event_tblTelaPrincipalTodasMensagensEnviadasMouseClicked

    private void btnTelaMensagensRecebidasDataEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaMensagensRecebidasDataEnvioActionPerformed
        if (txtTelaMensagensRecebidasDataEnvio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            atualizaTabelaMensagensRecebidas(txtTelaMensagensRecebidasDataEnvio.getText());
        }

    }//GEN-LAST:event_btnTelaMensagensRecebidasDataEnvioActionPerformed

    private void rdoButtonIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoButtonIndividualActionPerformed
        desabilitaCamposPeriodoEnvioMsg();
    }//GEN-LAST:event_rdoButtonIndividualActionPerformed

    private void rdoButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoButtonTodosActionPerformed
        desabilitaCamposPeriodoEnvioMsg();
    }//GEN-LAST:event_rdoButtonTodosActionPerformed

    private void rdoButtonPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoButtonPeriodoActionPerformed
        habilitaCamposPeriodoEnvioMsg();
    }//GEN-LAST:event_rdoButtonPeriodoActionPerformed

    private void cbbTelaMensagensRecebidasOpcoesVisualizacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTelaMensagensRecebidasOpcoesVisualizacaoItemStateChanged
        populaTabelaTodasMensagensEnviadas(cbbTelaMensagensRecebidasOpcoesVisualizacao.getSelectedIndex());
    }//GEN-LAST:event_cbbTelaMensagensRecebidasOpcoesVisualizacaoItemStateChanged

    private void cbbTelaAgendamentosOpcoesVisualizacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTelaAgendamentosOpcoesVisualizacaoItemStateChanged
        populaTabelaAgendamentos(cbbTelaAgendamentosOpcoesVisualizacao.getSelectedIndex());
    }//GEN-LAST:event_cbbTelaAgendamentosOpcoesVisualizacaoItemStateChanged

    private void tblTelaPrincipalPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelaPrincipalPacientesMouseClicked
        int linha = 0;
        if (evt.getClickCount() == 2) {
            linha = tblTelaPrincipalPacientes.getSelectedRow();
            recuperaDadosPaciente((String) tblTelaPrincipalPacientes.getValueAt(linha, 0));
        }
    }//GEN-LAST:event_tblTelaPrincipalPacientesMouseClicked

    private void tblTelaLaudosEnviadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelaLaudosEnviadosMouseClicked
        int linha = 0;
        if (evt.getClickCount() == 1) {
            linha = tblTelaLaudosEnviados.getSelectedRow();
            recuperaDadosPaciente((String) tblTelaLaudosEnviados.getValueAt(linha, 3));
            populaTabelaHistoricoAgendamentos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoMensagensEnviadas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoMensagensRecebidas(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
            populaTabelaHistoricoLaudos(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
        } else if (evt.getClickCount() == 2) {
            habilitaBotaoExcluirLaudo();
        }
    }//GEN-LAST:event_tblTelaLaudosEnviadosMouseClicked

    private void btnTelaLaudosExcluirLaudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaLaudosExcluirLaudoActionPerformed
        int linha = 0;
        linha = tblTelaLaudosEnviados.getSelectedRow();
        int idLaudo = (Integer) tblTelaLaudosEnviados.getValueAt(linha, 0);
        String mensagem = "Confirma Exclusão do Laudo da Matrícula " + "'" + (String) tblTelaLaudosEnviados.getValueAt(linha, 5) + "' do Paciente '" + (String) tblTelaLaudosEnviados.getValueAt(linha, 4) + "'";
        int resposta = JOptionPane.showConfirmDialog(null, mensagem, "Confirma?", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            deletaLaudoSelecionado(idLaudo);
            desabilitaBotaoExcluirLaudo();
            populaTabelaTodosLaudosEnviados();
        } else {
            desabilitaBotaoExcluirLaudo();
        }
    }//GEN-LAST:event_btnTelaLaudosExcluirLaudoActionPerformed

    private void jListPedidosMedicosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListPedidosMedicosValueChanged
        if (evt.getValueIsAdjusting()) {
            jListPedidosMedicos.clearSelection();
        } else {
            executaArquivo(evt.getFirstIndex());
        }
    }//GEN-LAST:event_jListPedidosMedicosValueChanged

    public void desabilitaCamposPesquisaPaciente() {
        txtTelaPrincipalCpf.setEnabled(false);
        txtTelaPrincipalNome.setEnabled(false);
        btnLocalizaPaciente.setEnabled(false);
    }

    public void habilitaCamposPesquisaPaciente() {
        txtTelaPrincipalCpf.setEnabled(true);
        txtTelaPrincipalNome.setEnabled(true);
        btnLocalizaPaciente.setEnabled(true);
    }

    public void habilitaCamposPesquisaCpf() {
        txtTelaPrincipalCpf.setEnabled(true);
        btnLocalizaPaciente.setEnabled(true);
        txtTelaPrincipalNome.setEnabled(false);
        txtTelaPrincipalNome.setText("");
    }

    public void habilitaCamposPesquisaNome() {
        txtTelaPrincipalCpf.setEnabled(false);
        txtTelaPrincipalCpf.setText("");
        btnLocalizaPaciente.setEnabled(true);
        txtTelaPrincipalNome.setEnabled(true);
    }

    public void limpaFiltros() {
        cbbAgendamentosSecao.setSelectedIndex(-1);
        cbbAgendamentosTurno.setSelectedIndex(-1);
        txtAgendamentosDataExame.setText("");
        txtAgendamentosDataSolicitacao.setText("");
        txtTelaMensagensRecebidasDataEnvio.setText("");
        cbbTelaAgendamentosOpcoesVisualizacao.setSelectedIndex(0);
        cbbTelaMensagensRecebidasOpcoesVisualizacao.setSelectedIndex(0);
    }

    public void populaTabelaPacientes(String parametro, String tipo) {
        Tabela tabela = null;
        try {
            if (tipo == "1") {
                if (sqlSeleciona.validaPesquisaCpf(parametro)) {
                    tabela = new Tabela(sqlSeleciona.getSelecionaDadosPacientesCadastradosCpf(parametro));
                    tblTelaPrincipalPacientes.setModel(tabela);
                    TableColumnModel columnModel = tblTelaPrincipalPacientes.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(50);
                    columnModel.getColumn(1).setPreferredWidth(170);
                    columnModel.getColumn(2).setPreferredWidth(25);
                    columnModel.getColumn(3).setPreferredWidth(25);
                    columnModel.getColumn(4).setPreferredWidth(25);
                    columnModel.getColumn(5).setPreferredWidth(150);
                    habilitaTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (sqlSeleciona.validaPesquisaNome(parametro)) {
                    tabela = new Tabela(sqlSeleciona.getSelecionaDadosPacientesCadastradosNome(parametro));
                    tblTelaPrincipalPacientes.setModel(tabela);
                    TableColumnModel columnModel = tblTelaPrincipalPacientes.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(50);
                    columnModel.getColumn(1).setPreferredWidth(170);
                    columnModel.getColumn(2).setPreferredWidth(25);
                    columnModel.getColumn(3).setPreferredWidth(26);
                    columnModel.getColumn(4).setPreferredWidth(26);
                    columnModel.getColumn(5).setPreferredWidth(150);
                    TableCellRenderer renderer = new ControlaCorLinhaTabela();
                    for (int i = 0; i < tblTelaPrincipalPacientes.getColumnCount(); i++) {
                        tblTelaPrincipalPacientes.setDefaultRenderer(tblTelaPrincipalPacientes.getColumnClass(i), renderer);
                    }

                    habilitaTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void habilitaTabela() {
        tblTelaPrincipalPacientes.setEnabled(true);
    }

    public void desabilitaTabela() {
        tblTelaPrincipalPacientes.setEnabled(false);
    }

    public void populaComboBoxMensagens() {
        ArrayList lista = new ArrayList();
        lista = sqlSeleciona.pesquisaTituloMensagensCadastradas();
        cbbMsgCadastradas.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            cbbMsgCadastradas.addItem((String) lista.get(i));
        }
    }

    public void populaComboBoxExames() {
        ArrayList lista = new ArrayList();
        lista = sqlSeleciona.pesquisaExames();
        cbbExames.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            cbbExames.addItem((String) lista.get(i));
        }
        cbbExames.setSelectedIndex(-1);
        txtTelaLaudosCodigoExame.setText("");
    }

    public void exibeUsuarioLogado() {
        usuario = sqlSeleciona.pesquisaDadosUsuariosCadastrados(usuarioLogado);
        lblTelaPrincipalUsuarioLogado.setText("Usuário logado: " + usuario.getNome());
        lblTelaPrincipalExibeData.setText("Data do Sistema: " + dataHoje);
    }

    public void selecionaTextoPadrao(String titulo) {
        txtAreaTelaPrincipalMsgLivre.setText(sqlSeleciona.pesquisaTextoMensagensCadastradas(titulo));
    }

    public void recuperaDadosPaciente(String cpf) {
        cpf = configuraCpf.desmontaCpf(cpf);
        paciente = sqlSeleciona.pesquisaDadosPacientesCadastrados(configuraCpf.desmontaCpf(cpf));
        txtDadosNomePaciente.setText(paciente.getNome());
        txtDadosCpfPaciente.setText(configuraCpf.montaCpf(paciente.getCpf()));
        txtDadosDataNascimentoPaciente.setText(paciente.getData_nascimento());
        txtDadosTelefonePaciente.setText(paciente.getTelefone());
        txtDadosCelularPaciente.setText(paciente.getCelular());
        txtDadosAreaObservacoesPaciente.setText(paciente.getObservacoes());
        populaTabelaHistoricoAgendamentos(cpf);
        populaTabelaHistoricoMensagensEnviadas(cpf);
        populaTabelaHistoricoMensagensRecebidas(cpf);
        populaTabelaHistoricoLaudos(cpf);
    }

    public void enviaMensagem() {
        usuario = sqlSeleciona.pesquisaDadosUsuariosCadastrados(usuarioLogado);
        chat.setId_mensagem(sqlSeleciona.pesquisaCodigoMensagensCadastradas((String) cbbMsgCadastradas.getSelectedItem()));
        chat.setCpf_paciente(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
        chat.setQuem_enviou(String.valueOf(usuario.getIdusuario()));
        chat.setData_entrega(dataHoje);
        chat.setMensagem(txtAreaTelaPrincipalMsgLivre.getText());
        boolean ok = sqlInsere.insereMensagemChat(chat);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Mensagem Enviada com Sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Enviar Mensagem", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        txtAreaTelaPrincipalMsgLivre.setText("");
        txtAreaTelaPrincipalMsgLivre.setEditable(false);
    }

    public void insereLaudo() {
        Laudo laudo = new Laudo();
        laudo.setDataAdmissao(txtTelaLaudosDataAdmissao.getText());
        laudo.setCaminhoFoto(txtTelaLaudosCaminhoFoto.getText());
        laudo.setCaminhoLaudo(txtTelaLaudosCaminhoLaudo.getText());
        laudo.setCodigoExame(txtTelaLaudosCodigoExame.getText().toUpperCase());
        laudo.setCpf(configuraCpf.desmontaCpf(txtDadosCpfPaciente.getText()));
        laudo.setMatricula(txtTelaLaudosMatricula.getText());
        boolean ok = sqlInsere.insereLaudo(laudo);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Laudo gravado com Sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            limpaCamposLaudos();
            populaTabelaTodosLaudosEnviados();

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao gravar laudo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void pegaDataAtual() {
        dataHoje = converteData.retornaDataHoje();
    }

    public void populaTabelaAgendamentos(int opcao) {
        String dataInicial = "";
        String dataFinal = converteData.retornaData(dataHoje);
        String query = "";
        switch (opcao) {
            case 0: {
                query = sqlSeleciona.getSelecionaAgendamentos();
                break;
            }
            case 1: {
                dataInicial = converteData.retornaData(dataHoje);
                query = sqlSeleciona.getSelecionaAgendamentosPeriodo(dataInicial, dataFinal);
                break;
            }
            case 2: {
                dataInicial = converteData.retornaDataHojeMenosDias(-2);
                dataInicial = converteData.retornaData(dataInicial);
                query = sqlSeleciona.getSelecionaAgendamentosPeriodo(dataInicial, dataFinal);
                break;
            }
            case 3: {
                dataInicial = converteData.retornaDataHojeMenosDias(-7);
                dataInicial = converteData.retornaData(dataInicial);
                query = sqlSeleciona.getSelecionaAgendamentosPeriodo(dataInicial, dataFinal);
                break;
            }
        }
        try {
            Tabela tabela = null;
            tabela = new Tabela(query);
            tblTelaPrincipalAgendamentos.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void atualizaTabelaAgendamentos(String filtro, String data) {
        Tabela tabela = null;
        String query = "";
        try {
            switch (filtro) {
                case "Ultrassonografia": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(1);
                    break;
                }
                case "Densitometria Óssea": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(2);
                    break;
                }
                case "Mapa": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(3);
                    break;
                }
                case "Eletro": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(4);
                    break;
                }
                case "Holter": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(5);
                    break;
                }
                case "Pneumologista": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(6);
                    break;
                }
                case "Dopplerfluxometria": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(7);
                    break;
                }
                case "Ecocardio": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(8);
                    break;
                }
                case "Mamografia Digital": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroSecao(9);
                    break;
                }
                case "Manhã": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroTurno("M");
                    break;
                }
                case "Tarde": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroTurno("T");
                    break;
                }
                case "Ambos": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroTurno("A");
                    break;
                }
                case "data_exame": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroDataExame(data);
                    break;
                }
                case "data_solicitacao": {
                    query = sqlSeleciona.getSelecionaAgendamentosFiltroDataSolicitacao(data);
                    break;
                }
            }
            tabela = new Tabela(query);
            tblTelaPrincipalAgendamentos.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void atualizaTabelaMensagensRecebidas(String data) {
        try {
            Tabela tabela = null;
            tabela = new Tabela(sqlSeleciona.getSelecionaTodasMensagensEnviadasFiltroDataEnvio(data));
            tblTelaPrincipalTodasMensagensEnviadas.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String montaCaminho(String caminho) {
        caminho = caminho.replace("\\", "/");
        return caminho;
    }

    public void limpaCamposLaudos() {
        txtTelaLaudosDataAdmissao.setText("");
        txtTelaLaudosCaminhoFoto.setText("");
        txtTelaLaudosCaminhoLaudo.setText("");
        txtTelaLaudosCodigoExame.setText("");
        txtTelaLaudosMatricula.setText("");
        cbbExames.setSelectedIndex(-1);
    }

    public boolean validaCamposLaudo() {
        if (txtTelaLaudosDataAdmissao.getText().isEmpty() || txtTelaLaudosCaminhoFoto.getText().isEmpty()
                || txtTelaLaudosCaminhoLaudo.getText().isEmpty() || txtTelaLaudosCodigoExame.getText().isEmpty()
                || txtTelaLaudosMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preecha os campos corretamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (txtTelaLaudosDataAdmissao.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "Campo data preenchido incorretamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public String selecionaArquivo() {
        final JFileChooser arquivo = new JFileChooser("E:\\SonusApp\\Fotos");
        int returnVal = arquivo.showOpenDialog(null);
        File file = arquivo.getSelectedFile();
        String caminho = file.getParent();
        return caminho;
    }

    public void populaTabelaHistoricoAgendamentos(String cpf) {
        try {
            Tabela tabela = null;
            tabela = new Tabela(sqlSeleciona.getSelecionaAgendamentosPaciente(cpf));
            tblTelaPrincipalHistoricoAgendamentos.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void populaTabelaHistoricoLaudos(String cpf) {
        try {
            Tabela tabela = null;
            tabela = new Tabela(sqlSeleciona.getSelecionaTodosLaudosGravadosPaciente(cpf));
            tblTelaPrincipalHistoricoLaudos.setModel(tabela);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void populaTabelaHistoricoMensagensRecebidas(String cpf) {
        try {
            Tabela tabela = null;
            tabela = new Tabela(sqlSeleciona.getSelecionaMensagensRecebidasPaciente(cpf));
            tblTelaPrincipalHistoricoMensagensRecebidas.setModel(tabela);
            TableColumnModel columnModel = tblTelaPrincipalHistoricoMensagensRecebidas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(630);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void populaTabelaHistoricoMensagensEnviadas(String cpf) {
        try {
            Tabela tabela = null;
            tabela = new Tabela(sqlSeleciona.getSelecionaMensagensEnviadasPaciente(cpf));
            tblTelaPrincipalHistoricoMensagensEnviadas.setModel(tabela);
            TableColumnModel columnModel = tblTelaPrincipalHistoricoMensagensEnviadas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(630);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void populaTabelaTodosLaudosEnviados() {
        try {
            Tabela tabela = null;
            tabela = new Tabela(sqlSeleciona.getSelecionaTodosLaudosGravados());
            tblTelaLaudosEnviados.setModel(tabela);
            TableColumnModel columnModel = tblTelaLaudosEnviados.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setPreferredWidth(30);
            columnModel.getColumn(2).setPreferredWidth(30);
            columnModel.getColumn(3).setPreferredWidth(50);
            columnModel.getColumn(4).setPreferredWidth(300);
            columnModel.getColumn(5).setPreferredWidth(30);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void populaTabelaTodasMensagensEnviadas(int opcao) {
        String dataInicial = "";
        String dataFinal = converteData.retornaData(dataHoje);
        String query = "";
        switch (opcao) {
            case 0: {
                query = sqlSeleciona.getSelecionaTodasMensagensEnviadasPaciente();
                break;
            }
            case 1: {
                dataInicial = converteData.retornaData(dataHoje);
                query = sqlSeleciona.getSelecionaTodasMensagensEnviadasExibicaoData(dataInicial, dataFinal);
                break;
            }
            case 2: {
                dataInicial = converteData.retornaDataHojeMenosDias(-2);
                dataInicial = converteData.retornaData(dataInicial);
                query = sqlSeleciona.getSelecionaTodasMensagensEnviadasExibicaoData(dataInicial, dataFinal);
                break;
            }
            case 3: {
                dataInicial = converteData.retornaDataHojeMenosDias(-7);
                dataInicial = converteData.retornaData(dataInicial);
                query = sqlSeleciona.getSelecionaTodasMensagensEnviadasExibicaoData(dataInicial, dataFinal);
                break;
            }
            case 4: {
                query = sqlSeleciona.getSelecionaTodasMensagensEnviadasPacienteLidas();
                break;
            }
            case 5: {
                query = sqlSeleciona.getSelecionaTodasMensagensEnviadasPacienteNaoLidas();
                break;
            }
        }
        try {
            Tabela tabela = null;
            tabela = new Tabela(query);
            tblTelaPrincipalTodasMensagensEnviadas.setModel(tabela);
            TableColumnModel columnModel = tblTelaPrincipalTodasMensagensEnviadas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(0);
            columnModel.getColumn(1).setPreferredWidth(50);
            columnModel.getColumn(2).setPreferredWidth(20);
            columnModel.getColumn(3).setPreferredWidth(400);
            columnModel.getColumn(4).setPreferredWidth(10);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void habilitaCamposPeriodoEnvioMsg() {
        txtTelaEnviaMsgDtFinal.setEditable(true);
        txtTelaEnviaMsgDtInicial.setEditable(true);
        txtTelaEnviaMsgDtInicial.requestFocus();
    }

    public void desabilitaCamposPeriodoEnvioMsg() {
        txtTelaEnviaMsgDtFinal.setEditable(false);
        txtTelaEnviaMsgDtInicial.setEditable(false);
    }

    public void enviaMensagemTodosPacientes() {
        new Thread() {
            public void run() {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                mostraBarra();
                ArrayList<String> lista = new ArrayList<String>();
                MensagemChat chat = new MensagemChat();
                lista = sqlSeleciona.pesquisaTodosPacientesEnvioMsg();
                chat.setId_mensagem(sqlSeleciona.pesquisaCodigoMensagensCadastradas((String) cbbMsgCadastradas.getSelectedItem()));
                chat.setQuem_enviou(String.valueOf(usuario.getIdusuario()));
                chat.setData_entrega(dataHoje);
                chat.setMensagem(txtAreaTelaPrincipalMsgLivre.getText());
                lblQuantidadeTotal.setText("Total de Pacientes: " + String.valueOf(lista.size()));
                ProgressBarEnvioMensagens.setMaximum(lista.size());
                ProgressBarEnvioMensagens.setValue(0);
                ProgressBarEnvioMensagens.setStringPainted(true);
                for (int i = 0; i < lista.size(); i++) {
                    ProgressBarEnvioMensagens.setValue(i);
                    lblQuantidadeAtual.setText("Paciente Atual: " + String.valueOf(i));
                    chat.setCpf_paciente(lista.get(i));
                    sqlInsere.insereMensagemChat(chat);
                }
                ProgressBarEnvioMensagens.setValue(lista.size());
                lblQuantidadeAtual.setText("Paciente Atual: " + String.valueOf(lista.size()));
                JOptionPane.showMessageDialog(null, "Mensagens Enviadas com Sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                ocultaBarra();
                setCursor(null);
            }
        }.start();
    }

    public void enviaMensagensPeriodo(String dataInicial, String dataFinal) {
        new Thread() {
            public void run() {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                mostraBarra();
                ArrayList<String> lista = new ArrayList<String>();
                MensagemChat chat = new MensagemChat();
                lista = sqlSeleciona.pesquisaTodosPacientesPeriodoEnvioMsg(dataInicial, dataFinal);
                chat.setId_mensagem(sqlSeleciona.pesquisaCodigoMensagensCadastradas((String) cbbMsgCadastradas.getSelectedItem()));
                chat.setQuem_enviou(String.valueOf(usuario.getIdusuario()));
                chat.setData_entrega(dataHoje);
                chat.setMensagem(txtAreaTelaPrincipalMsgLivre.getText());
                lblQuantidadeTotal.setText("Total de Pacientes: " + String.valueOf(lista.size()));
                ProgressBarEnvioMensagens.setMaximum(lista.size());
                ProgressBarEnvioMensagens.setValue(0);
                ProgressBarEnvioMensagens.setStringPainted(true);
                for (int i = 0; i < lista.size(); i++) {
                    ProgressBarEnvioMensagens.setValue(i);
                    lblQuantidadeAtual.setText("Paciente Atual: " + String.valueOf(i));
                    chat.setCpf_paciente(lista.get(i));
                    sqlInsere.insereMensagemChat(chat);
                }
                ProgressBarEnvioMensagens.setValue(lista.size());
                lblQuantidadeAtual.setText("Paciente Atual: " + String.valueOf(lista.size()));
                JOptionPane.showMessageDialog(null, "Mensagens Enviadas com Sucesso.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                ocultaBarra();
                setCursor(null);
            }
        }.start();

    }

    public void ocultaBarra() {
        ProgressBarEnvioMensagens.setValue(0);
        ProgressBarEnvioMensagens.setVisible(false);
        lblQuantidadeAtual.setVisible(false);
        lblQuantidadeTotal.setVisible(false);
    }

    public void mostraBarra() {
        ProgressBarEnvioMensagens.setValue(0);
        ProgressBarEnvioMensagens.setVisible(true);
        lblQuantidadeAtual.setVisible(true);
        lblQuantidadeTotal.setVisible(true);
    }

    public void verificaPedidosMedicos() {
        caminho = new File(montaCaminho(selecionaArquivo()));
        caminhoPedidos = caminho.getPath();
        txtCaminhoPasta.setText(caminhoPedidos);
        txtCaminhoPasta.setEditable(false);
        montaVisualizadorPedidos();
    }

    public void montaVisualizadorPedidos() {
        DefaultListModel modelo = new DefaultListModel();
        if (caminho.isDirectory()) {
            arrayFiles = new File[caminho.list().length];
            arrayFiles = caminho.listFiles();
            if (qtdAtualArquivos < arrayFiles.length) {
                lblQuantidadeNovosArquivos.setText(String.valueOf(arrayFiles.length - qtdAtualArquivos));
            } else {
                lblQuantidadeNovosArquivos.setText("0");
            }
            qtdAtualArquivos = arrayFiles.length;
            String[] nomesArquivos = new String[arrayFiles.length];
            nomesArquivos = caminho.list();
            for (int i = 0; i < arrayFiles.length; i++) {
                modelo.addElement(nomesArquivos[i]);
            }
            lblQuantidadeArquivos.setText(String.valueOf(arrayFiles.length));
        }
        jListPedidosMedicos.setModel(modelo);

    }

    public void alteraStatusLidoMensagem(int id, boolean valor) {
        int parametro;
        if (valor == false) {
            parametro = 1;
        } else {
            parametro = 0;
        }
        sqlAltera.alteraStatusLidaMensagem(id, parametro);
        populaTabelaTodasMensagensEnviadas(cbbTelaMensagensRecebidasOpcoesVisualizacao.getSelectedIndex());
    }

    public void desabilitaBotaoExcluirLaudo() {
        btnTelaLaudosExcluirLaudo.setEnabled(false);
    }

    public void habilitaBotaoExcluirLaudo() {
        btnTelaLaudosExcluirLaudo.setEnabled(true);
    }

    public void ocultaLabelQuantidadeArquivos() {
        lblQuantidadeArquivos.setVisible(false);
    }

    public void exibeLabelQuantidadeArquivos() {
        lblQuantidadeArquivos.setVisible(true);
    }

    public void deletaLaudoSelecionado(int idLaudo) {
        SQLDeleta sql = new SQLDeleta();
        boolean ok = sql.deletaLaudo(idLaudo);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Laudo Excluído com Sucesso", "Aviso.", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir", "Aviso.", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void executaArquivo(int indice) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(arrayFiles[indice]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBarEnvioMensagens;
    private javax.swing.JButton btnAgendamentosDataExame;
    private javax.swing.JButton btnAgendamentosDataSolicitacao;
    private javax.swing.JButton btnLocalizaPaciente;
    private javax.swing.ButtonGroup btnRadioGroupEnvioMensagens;
    private javax.swing.ButtonGroup btnRadioGroupPesquisaPaciente;
    private javax.swing.JButton btnTelaAgendamentosVerificaImagensPedidos;
    private javax.swing.JButton btnTelaLaudosEscolheFoto;
    private javax.swing.JButton btnTelaLaudosEscolheLaudo;
    private javax.swing.JButton btnTelaLaudosExcluirLaudo;
    private javax.swing.JButton btnTelaLaudosGravar;
    private javax.swing.JButton btnTelaMensagensRecebidasDataEnvio;
    private javax.swing.JButton btnTelaPrincipalEditaMensagem;
    private javax.swing.JButton btnTelaPrincipalEnviaMensagem;
    private javax.swing.JComboBox<String> cbbAgendamentosSecao;
    private javax.swing.JComboBox<String> cbbAgendamentosTurno;
    private javax.swing.JComboBox<String> cbbExames;
    private javax.swing.JComboBox<String> cbbMsgCadastradas;
    private javax.swing.JComboBox<String> cbbTelaAgendamentosOpcoesVisualizacao;
    private javax.swing.JComboBox<String> cbbTelaMensagensRecebidasOpcoesVisualizacao;
    private javax.swing.JMenuItem itemAtualizar;
    private javax.swing.JMenuItem itemCadastroMensagens;
    private javax.swing.JMenuItem itemPacientes;
    private javax.swing.JMenuItem itemTrocaUsuario;
    private javax.swing.JMenuItem itemUsuarios;
    private javax.swing.JList<String> jListPedidosMedicos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JLabel lbDadosTelefonePaciente;
    private javax.swing.JLabel lbDadoslObservacoesPaciente;
    private javax.swing.JLabel lblDadosCelularPaciente;
    private javax.swing.JLabel lblDadosCpfPaciente;
    private javax.swing.JLabel lblDadosDataNascimentoPaciente;
    private javax.swing.JLabel lblDadosNomePaciente;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblQuantidadeArquivos;
    private javax.swing.JLabel lblQuantidadeAtual;
    private javax.swing.JLabel lblQuantidadeNovosArquivos;
    private javax.swing.JLabel lblQuantidadeTotal;
    private javax.swing.JLabel lblTelaAgendamentosDataExame;
    private javax.swing.JLabel lblTelaAgendamentosDataSolicitacao;
    private javax.swing.JLabel lblTelaAgendamentosOpcoesVisualizacao;
    private javax.swing.JLabel lblTelaAgendamentosSecao;
    private javax.swing.JLabel lblTelaAgendamentosTurno;
    private javax.swing.JLabel lblTelaAgendamentosVerificaPedidos;
    private javax.swing.JLabel lblTelaEnviaMsgDtFinal;
    private javax.swing.JLabel lblTelaEnviaMsgDtInicial;
    private javax.swing.JLabel lblTelaEnvioMsgOpcoes;
    private javax.swing.JLabel lblTelaHistoricoAgendamentos;
    private javax.swing.JLabel lblTelaHistoricoLaudos;
    private javax.swing.JLabel lblTelaHistoricoMensagensEnviadas;
    private javax.swing.JLabel lblTelaHistoricoMensagensRecebidas;
    private javax.swing.JLabel lblTelaLaudosCaminhoFoto;
    private javax.swing.JLabel lblTelaLaudosCaminhoLaudo;
    private javax.swing.JLabel lblTelaLaudosCodigoExame;
    private javax.swing.JLabel lblTelaLaudosDataAdmissao;
    private javax.swing.JLabel lblTelaLaudosMatricula;
    private javax.swing.JLabel lblTelaLaudosTitulo;
    private javax.swing.JLabel lblTelaMensagensRecebidasDataEnvio;
    private javax.swing.JLabel lblTelaMensagensRecebidasFiltro;
    private javax.swing.JLabel lblTelaMensagensRecebidasOpcoesVisualizacao;
    private javax.swing.JLabel lblTelaPrincipalExibeData;
    private javax.swing.JLabel lblTelaPrincipalFiltros;
    private javax.swing.JLabel lblTelaPrincipalPaciente;
    private javax.swing.JLabel lblTelaPrincipalTitulo;
    private javax.swing.JLabel lblTelaPrincipalTituloAgendamentos;
    private javax.swing.JLabel lblTelaPrincipalUsuarioLogado;
    private javax.swing.JLabel lblTituloQuantidadeArquivos;
    private javax.swing.JLabel lblTituloQuantidadeNovosArquivos;
    private javax.swing.JLabel lblTituloSelecionaPastaPedidos;
    private javax.swing.JMenu menuItemArquivo;
    private javax.swing.JMenu menuItemCadastro;
    private javax.swing.JMenu menuItemUtilitarios;
    private javax.swing.JMenuBar menuTelaPrincipal;
    private javax.swing.JTabbedPane pnlAbasTelaPrincipal;
    private javax.swing.JPanel pnlTelaPrincipalAgendamentos;
    private javax.swing.JPanel pnlTelaPrincipalHistorico;
    private javax.swing.JPanel pnlTelaPrincipalLaudos;
    private javax.swing.JPanel pnlTelaPrincipalMensagens;
    private javax.swing.JPanel pnlTelaPrincipalMensagensRecebidas;
    private javax.swing.JRadioButton rdoButtonCpf;
    private javax.swing.JRadioButton rdoButtonIndividual;
    private javax.swing.JRadioButton rdoButtonNome;
    private javax.swing.JRadioButton rdoButtonPeriodo;
    private javax.swing.JRadioButton rdoButtonTodos;
    private javax.swing.JScrollPane scrollPaneObservacoes;
    private javax.swing.JScrollPane scrollPaneTelaLaudosEnviados;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalAgendamentos;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalHistoricoAgendamentos;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalHistoricoLaudos;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalHistoricoMensagensEnviadas;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalHistoricoMensagensRecebidas;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalPacientes1;
    private javax.swing.JScrollPane scrollPaneTelaPrincipalTodasMensagensEnviadas;
    private javax.swing.JTable tblTelaLaudosEnviados;
    private javax.swing.JTable tblTelaPrincipalAgendamentos;
    private javax.swing.JTable tblTelaPrincipalHistoricoAgendamentos;
    private javax.swing.JTable tblTelaPrincipalHistoricoLaudos;
    private javax.swing.JTable tblTelaPrincipalHistoricoMensagensEnviadas;
    private javax.swing.JTable tblTelaPrincipalHistoricoMensagensRecebidas;
    private javax.swing.JTable tblTelaPrincipalPacientes;
    private javax.swing.JTable tblTelaPrincipalTodasMensagensEnviadas;
    private javax.swing.JToolBar toolBarTelaPrincipal;
    private javax.swing.JTextField txtAgendamentosDataExame;
    private javax.swing.JTextField txtAgendamentosDataSolicitacao;
    private javax.swing.JTextArea txtAreaTelaPrincipalMsgLivre;
    private javax.swing.JTextField txtCaminhoPasta;
    private javax.swing.JTextArea txtDadosAreaObservacoesPaciente;
    private javax.swing.JTextField txtDadosCelularPaciente;
    private javax.swing.JTextField txtDadosCpfPaciente;
    private javax.swing.JFormattedTextField txtDadosDataNascimentoPaciente;
    private javax.swing.JTextField txtDadosNomePaciente;
    private javax.swing.JTextField txtDadosTelefonePaciente;
    private javax.swing.JTextField txtTelaEnviaMsgDtFinal;
    private javax.swing.JTextField txtTelaEnviaMsgDtInicial;
    private javax.swing.JTextField txtTelaLaudosCaminhoFoto;
    private javax.swing.JTextField txtTelaLaudosCaminhoLaudo;
    private javax.swing.JTextField txtTelaLaudosCodigoExame;
    private javax.swing.JTextField txtTelaLaudosDataAdmissao;
    private javax.swing.JTextField txtTelaLaudosMatricula;
    private javax.swing.JTextField txtTelaMensagensRecebidasDataEnvio;
    private javax.swing.JTextField txtTelaPrincipalCpf;
    private javax.swing.JTextField txtTelaPrincipalNome;
    // End of variables declaration//GEN-END:variables
}
