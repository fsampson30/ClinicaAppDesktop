package Controller;

import Model.Mensagem;
import Model.Paciente;
import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQLSeleciona {

    private Mensagem msg = new Mensagem();
    private Paciente paciente = new Paciente();
    private Usuario usuario = new Usuario();

    private String selecionaMensagensPadraoCadastradas = "SELECT codigo_texto as CODIGO, titulo_texto TITULO, texto_padrao TEXTO FROM mensagens_padrao where codigo_texto <> '99' ;";
    private String selecionaTituloMensagensCadastradas = "SELECT titulo_texto FROM mensagens_padrao where codigo_texto <> '99' ;";
    private String selecionaTextoMensagensPadrao = "SELECT texto_padrao from mensagens_padrao where titulo_texto = ?";
    private String selecionaCodigoMensagensPadrao = "SELECT codigo_texto from mensagens_padrao where titulo_texto = ?";
    private String selecionaPacientesCadastrados = "SELECT CASE WHEN char_length(p.CPF) = 11 THEN concat(substr(p.cpf,1,3), '.',  substr(p.cpf,4,3),'.', substr(p.cpf,7,3), '-', substr(p.cpf,10,2)) ELSE p.CPF END CPF, p.NOME FROM PACIENTES p ORDER BY p.NOME;";
    private String selecionaPacientesCadastradosCpf = "SELECT CASE WHEN char_length(p.CPF) = 11 THEN concat(substr(p.cpf,1,3), '.',  substr(p.cpf,4,3),'.', substr(p.cpf,7,3), '-', substr(p.cpf,10,2)) ELSE p.CPF END CPF, p.NOME FROM PACIENTES p where p.cpf=";
    private String selecionaPacientesCadastradosNome = "SELECT CASE WHEN char_length(p.CPF) = 11 THEN concat(substr(p.cpf,1,3), '.',  substr(p.cpf,4,3),'.', substr(p.cpf,7,3), '-', substr(p.cpf,10,2)) ELSE p.CPF END CPF, p.NOME FROM PACIENTES p where p.nome like ";
    private String selecionaDadosPacientesCadastrados = "SELECT cpf, nome, telefone, celular, data_nascimento, observacoes from pacientes where cpf = ?;";
    private String selecionaDadosPacientesCadastradosCpf = "SELECT CASE WHEN char_length(p.CPF) = 11 THEN concat(substr(p.cpf,1,3), '.',  substr(p.cpf,4,3),'.', substr(p.cpf,7,3), '-', substr(p.cpf,10,2)) ELSE p.CPF END CPF, p.nome NOME, p.telefone TELEFONE, p.celular CELULAR, p.data_nascimento DT_NASC, p.observacoes OBS from pacientes p where p.cpf = ";
    private String selecionaDadosPacientesCadastradosNome = "SELECT CASE WHEN char_length(p.CPF) = 11 THEN concat(substr(p.cpf,1,3), '.',  substr(p.cpf,4,3),'.', substr(p.cpf,7,3), '-', substr(p.cpf,10,2)) ELSE p.CPF END CPF, p.nome NOME, p.telefone TELEFONE, p.celular CELULAR , p.data_nascimento DT_NASC, p.observacoes OBS from pacientes p where p.nome like ";
    private String selecionaDadosUsuariosCadastrados = "SELECT idusuarios, nome, login, senha FROM usuarios WHERE login = ?;";
    private String selecionaUsuariosCadastrados = "SELECT login LOGIN, nome NOME FROM usuarios where idusuarios <>'99'";
    private String validaLogin = "SELECT login, senha FROM usuarios where login = ?";
    private String selecionaIdUsuario = "SELECT idusuarios, senha FROM usuarios where login = ?";
    private String selecionaAgendamentos = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO, CASE WHEN char_length(ag.cpf_paciente) = 11 THEN concat(substr(ag.cpf_paciente,1,3), '.',  substr(ag.cpf_paciente,4,3),'.', substr(ag.cpf_paciente,7,3), '-', substr(ag.cpf_paciente,10,2)) ELSE ag.cpf_paciente end CPF, ag.data_solicitacao DT_SOLICITACAO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame order by idagendamentos desc;";
    private String selecionaAgendamentosPeriodo = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO, CASE WHEN char_length(ag.cpf_paciente) = 11 THEN concat(substr(ag.cpf_paciente,1,3), '.',  substr(ag.cpf_paciente,4,3),'.', substr(ag.cpf_paciente,7,3), '-', substr(ag.cpf_paciente,10,2)) ELSE ag.cpf_paciente end CPF, ag.data_solicitacao DT_SOLICITACAO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame where";
    private String selecionaNomeExame = "SELECT nome_exame EXAME FROM exame where idexame = ?";
    private String selecionaCodigoExame = "SELECT idexame EXAME FROM exame where nome_exame = ?";
    private String selecionaExame = "SELECT nome_exame FROM exame order by nome_exame";
    private String verificaCpfCadastrado = "SELECT cpf FROM pacientes where cpf=?";
    private String selecionaAgendamentosFiltroSecao = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO, CASE WHEN char_length(ag.cpf_paciente) = 11 THEN concat(substr(ag.cpf_paciente,1,3), '.',  substr(ag.cpf_paciente,4,3),'.', substr(ag.cpf_paciente,7,3), '-', substr(ag.cpf_paciente,10,2)) ELSE ag.cpf_paciente end CPF, ag.data_solicitacao DT_SOLICITACAO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame where ag.codigo_secao = ";
    private String selecionaAgendamentosFiltroTurno = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO, CASE WHEN char_length(ag.cpf_paciente) = 11 THEN concat(substr(ag.cpf_paciente,1,3), '.',  substr(ag.cpf_paciente,4,3),'.', substr(ag.cpf_paciente,7,3), '-', substr(ag.cpf_paciente,10,2)) ELSE ag.cpf_paciente end CPF, ag.data_solicitacao DT_SOLICITACAO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame where ag.turno like";
    private String selecionaAgendamentosFiltroDataExame = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO, CASE WHEN char_length(ag.cpf_paciente) = 11 THEN concat(substr(ag.cpf_paciente,1,3), '.',  substr(ag.cpf_paciente,4,3),'.', substr(ag.cpf_paciente,7,3), '-', substr(ag.cpf_paciente,10,2)) ELSE ag.cpf_paciente end CPF, ag.data_solicitacao DT_SOLICITACAO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame where ag.data_exame like";
    private String selecionaAgendamentosFiltroDataSolicitacao = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO, CASE WHEN char_length(ag.cpf_paciente) = 11 THEN concat(substr(ag.cpf_paciente,1,3), '.',  substr(ag.cpf_paciente,4,3),'.', substr(ag.cpf_paciente,7,3), '-', substr(ag.cpf_paciente,10,2)) ELSE ag.cpf_paciente end CPF, ag.data_solicitacao DT_SOLICITACAO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame where ag.data_solicitacao like";
    private String selecionaMensagensRecebidasPaciente = "select me.data_envio DT_ENVIO, me.texto_mensagem TEXTO from mensagens_enviadas me where me.idusuario <> '99' and me.cpf = ";
    private String selecionaMensagensEnviadasPaciente = "select me.data_envio DT_ENVIO, me.texto_mensagem TEXTO from mensagens_enviadas me where me.idusuario = '99' and me.cpf = ";
    private String selecionaAgendamentosPaciente = "SELECT ag.data_exame DT_EXAME, ag.turno TURNO, sc.nome_secao_exame SEÇÃO FROM agendamentos ag join secao_exame sc on ag.codigo_secao = sc.idsecao_exame where ag.cpf_paciente=";
    private String selecionaTodasMensagensEnviadasPaciente = "select me.idmensagens ID, CASE WHEN char_length(me.cpf) = 11 THEN concat(substr(me.cpf,1,3), '.',  substr(me.cpf,4,3),'.', substr(me.cpf,7,3), '-', substr(me.cpf,10,2)) ELSE me.cpf end CPF, me.data_envio DT_ENVIO, me.texto_mensagem TEXTO, me.mensagem_lida LIDA from mensagens_enviadas me where me.idusuario = '99' order by idmensagens desc";
    private String selecionaTodasMensagensEnviadasFiltroDataEnvio = "select me.idmensagens ID, CASE WHEN char_length(me.cpf) = 11 THEN concat(substr(me.cpf,1,3), '.',  substr(me.cpf,4,3),'.', substr(me.cpf,7,3), '-', substr(me.cpf,10,2)) ELSE me.cpf end CPF, me.data_envio DT_ENVIO, me.texto_mensagem TEXTO, me.mensagem_lida LIDA from mensagens_enviadas me where me.idusuario = '99' and me.data_envio = ";
    private String selecionaTodasMensagensEnviadasExibicaoData = "select me.idmensagens ID, CASE WHEN char_length(me.cpf) = 11 THEN concat(substr(me.cpf,1,3), '.',  substr(me.cpf,4,3),'.', substr(me.cpf,7,3), '-', substr(me.cpf,10,2)) ELSE me.cpf end CPF, me.data_envio DT_ENVIO, me.texto_mensagem TEXTO, me.mensagem_lida LIDA from mensagens_enviadas me where me.idusuario = '99' and";
    private String selecionaTodosPacientesEnvioMsg = "SELECT p.cpf FROM pacientes p order by p.cpf;";
    private String selecionaTodosPacientesPeriodoEnvioMsg = "select ag.cpf_paciente from agendamentos ag where str_to_date(ag.data_solicitacao,'%d/%m/%Y') >= ? and str_to_date(ag.data_solicitacao,'%d/%m/%Y') <= ?";    
    private String selecionaTodasMensagensEnviadasPacienteLidas = "select me.idmensagens ID, CASE WHEN char_length(me.cpf) = 11 THEN concat(substr(me.cpf,1,3), '.',  substr(me.cpf,4,3),'.', substr(me.cpf,7,3), '-', substr(me.cpf,10,2)) ELSE me.cpf end CPF, me.data_envio DT_ENVIO, me.texto_mensagem TEXTO, me.mensagem_lida LIDA from mensagens_enviadas me where me.idusuario = '99' and me.mensagem_lida = 1 order by idmensagens desc";
    private String selecionaTodasMensagensEnviadasPacienteNaoLidas = "select me.idmensagens ID, CASE WHEN char_length(me.cpf) = 11 THEN concat(substr(me.cpf,1,3), '.',  substr(me.cpf,4,3),'.', substr(me.cpf,7,3), '-', substr(me.cpf,10,2)) ELSE me.cpf end CPF, me.data_envio DT_ENVIO, me.texto_mensagem TEXTO, me.mensagem_lida LIDA from mensagens_enviadas me where me.idusuario = '99' and me.mensagem_lida = 0 order by idmensagens desc";
    private String selecionaTodosLaudosGravados = "SELECT l.idLaudos ID , l.data_admissao DT_ADMISSAO , l.codigo_exame EXAME , CASE WHEN char_length(l.CPF) = 11 THEN concat(substr(l.cpf,1,3), '.',  substr(l.cpf,4,3),'.', substr(l.cpf,7,3), '-', substr(l.cpf,10,2)) ELSE l.CPF END CPF , p.nome PACIENTE , l.matricula FROM laudos l JOIN pacientes p ON l.cpf = p.cpf ORDER BY  1 DESC;";
    private String selecionaTodosLaudosGravadosPaciente = "SELECT l.idLaudos ID , l.data_admissao DT_ADMISSAO , l.codigo_exame EXAME , CASE WHEN char_length(l.CPF) = 11 THEN concat(substr(l.cpf,1,3), '.',  substr(l.cpf,4,3),'.', substr(l.cpf,7,3), '-', substr(l.cpf,10,2)) ELSE l.CPF END CPF , p.nome PACIENTE , l.matricula FROM laudos l JOIN pacientes p ON l.cpf = p.cpf where l.cpf =";
    private static ClasseConstantes c = new ClasseConstantes();

    public Paciente pesquisaDadosPacientesCadastrados(String cpf) {
        ResultSet rs = null;
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaDadosPacientesCadastrados);
            ps.setString(1, cpf);
            rs = ps.executeQuery();
            while (rs.next()) {
                paciente.setCpf(rs.getString(1));
                paciente.setNome(rs.getString(2));
                paciente.setTelefone(rs.getString(3));
                paciente.setCelular(rs.getString(4));
                paciente.setData_nascimento(rs.getString(5));
                paciente.setObservacoes(rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return paciente;
    }

    public Paciente pesquisaDadosPacientesCadastradosNome(String nome) {
        ResultSet rs = null;
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaDadosPacientesCadastrados);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            while (rs.next()) {
                paciente.setCpf(rs.getString(1));
                paciente.setNome(rs.getString(2));
                paciente.setTelefone(rs.getString(3));
                paciente.setCelular(rs.getString(4));
                paciente.setData_nascimento(rs.getString(5));
                paciente.setObservacoes(rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return paciente;
    }

    public Usuario pesquisaDadosUsuariosCadastrados(String login) {
        ResultSet rs = null;
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaDadosUsuariosCadastrados);
            ps.setString(1, login);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario.setIdusuario(rs.getInt(1));
                usuario.setNome(rs.getString(2));
                usuario.setLogin(rs.getString(3));
                usuario.setSenha(rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            e.printStackTrace();
        }
        return usuario;
    }

    public boolean validaPesquisaNome(String nome) {
        ResultSet rs = null;
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(getSelecionaDadosPacientesCadastradosNome(nome));
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validaPesquisaCpf(String cpf) {
        ResultSet rs = null;
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(getSelecionaDadosPacientesCadastradosCpf(cpf));
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList pesquisaTituloMensagensCadastradas() {
        ResultSet rs = null;
        ArrayList lista = new ArrayList();
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaTituloMensagensCadastradas);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("titulo_texto"));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public String pesquisaTextoMensagensCadastradas(String titulo) {
        ResultSet rs = null;
        String texto = "";
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaTextoMensagensPadrao);
            ps.setString(1, titulo);
            rs = ps.executeQuery();
            while (rs.next()) {
                texto = (rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return texto;
    }

    public String pesquisaCodigoMensagensCadastradas(String titulo) {
        ResultSet rs = null;
        String codigo = "";
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaCodigoMensagensPadrao);
            ps.setString(1, titulo);
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = (rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return codigo;
    }

    public String pesquisaNomeExame(String codigoExame) {
        ResultSet rs = null;
        String exame = "";
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaNomeExame);
            ps.setString(1, codigoExame);
            rs = ps.executeQuery();
            while (rs.next()) {
                exame = (rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return exame;
    }

    public String pesquisaCodExame(String nomeExame) {
        ResultSet rs = null;
        String exame = "";
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaCodigoExame);
            ps.setString(1, nomeExame);
            rs = ps.executeQuery();
            while (rs.next()) {
                exame = (rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return exame;
    }

    public ArrayList pesquisaExames() {
        ResultSet rs = null;
        ArrayList<String> exame = new ArrayList<String>();
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaExame);
            rs = ps.executeQuery();
            while (rs.next()) {
                exame.add(rs.getString("nome_exame"));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return exame;
    }

    public boolean pesquisaCpfCadastrado(String cpf) {
        ResultSet rs = null;
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(verificaCpfCadastrado);
            ps.setString(1, cpf);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<String> pesquisaTodosPacientesEnvioMsg() {
        ResultSet rs = null;
        ArrayList<String> lista = new ArrayList<String>();
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaTodosPacientesEnvioMsg);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<String> pesquisaTodosPacientesPeriodoEnvioMsg(String dataInicial, String dataFinal) {
        ResultSet rs = null;
        ArrayList<String> lista = new ArrayList<String>();
        Conexao con = new Conexao();
        try {
            Class.forName(c.getDriver());
            PreparedStatement ps = con.obter().prepareStatement(selecionaTodosPacientesPeriodoEnvioMsg);
            ps.setString(1, dataInicial);
            ps.setString(2, dataFinal);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public String getSelecionaMensagensPadraoCadastradas() {
        return selecionaMensagensPadraoCadastradas;
    }

    public String getSelecionaPacientesCadastrados() {
        return selecionaPacientesCadastrados;
    }

    public String getSelecionaUsuariosCadastrados() {
        return selecionaUsuariosCadastrados;
    }

    public String getSelecionaDadosPacientesCadastradosNome(String nome) {
        return selecionaDadosPacientesCadastradosNome + "'%" + nome + "%';";
    }

    public String getSelecionaDadosPacientesCadastradosCpf(String cpf) {
        return selecionaDadosPacientesCadastradosCpf + "'" + cpf + "';";
    }

    public String getSelecionaPacientesCadastradosCpf(String cpf) {
        return selecionaPacientesCadastradosCpf + "'" + cpf + "' ORDER BY p.NOME;";
    }

    public String getSelecionaPacientesCadastradosNome(String nome) {
        return selecionaPacientesCadastradosNome + "'%" + nome + "%' ORDER BY p.NOME ;";
    }

    public String getSelecionaAgendamentos() {
        return selecionaAgendamentos;
    }

    public String getSelecionaAgendamentosFiltroSecao(int codigo_secao) {
        return selecionaAgendamentosFiltroSecao + codigo_secao + " order by idagendamentos desc;";
    }

    public String getSelecionaAgendamentosFiltroTurno(String turno) {
        return selecionaAgendamentosFiltroTurno + "'%" + turno + "%' order by idagendamentos desc;";
    }

    public String getSelecionaAgendamentosFiltroDataExame(String data) {
        return selecionaAgendamentosFiltroDataExame + "'%" + data + "%' order by idagendamentos desc;";
    }

    public String getSelecionaAgendamentosFiltroDataSolicitacao(String data) {
        return selecionaAgendamentosFiltroDataSolicitacao + "'%" + data + "%' order by idagendamentos desc;";
    }

    public String getSelecionaMensagensRecebidasPaciente(String cpf) {
        return selecionaMensagensRecebidasPaciente + "'" + cpf + "' order by idmensagens desc;";
    }

    public String getSelecionaMensagensEnviadasPaciente(String cpf) {
        return selecionaMensagensEnviadasPaciente + "'" + cpf + "' order by idmensagens desc;";
    }

    public String getSelecionaAgendamentosPaciente(String cpf) {
        return selecionaAgendamentosPaciente + "'" + cpf + "'order by idagendamentos desc;";
    }

    public String getSelecionaTodasMensagensEnviadasPaciente() {
        return selecionaTodasMensagensEnviadasPaciente;
    }

    public String getSelecionaTodasMensagensEnviadasFiltroDataEnvio(String data) {
        return selecionaTodasMensagensEnviadasFiltroDataEnvio + "'" + data + "' order by idmensagens desc;";
    }

    public String getSelecionaTodasMensagensEnviadasExibicaoData(String dataInicial, String dataFinal) {
        return selecionaTodasMensagensEnviadasExibicaoData + " str_to_date(me.data_envio,'%d/%m/%Y') >= '"+dataInicial+"' and str_to_date(me.data_envio,'%d/%m/%Y') <= '"+dataFinal+"' order by idmensagens desc";
    }

    public String getSelecionaAgendamentosPeriodo(String dataInicial, String dataFinal) {
        return selecionaAgendamentosPeriodo  + " str_to_date(ag.data_solicitacao,'%d/%m/%Y') >= '"+dataInicial+"' and str_to_date(ag.data_solicitacao,'%d/%m/%Y') <= '"+dataFinal+"' order by idagendamentos desc";
    }

    public String getSelecionaTodasMensagensEnviadasPacienteLidas() {
        return selecionaTodasMensagensEnviadasPacienteLidas;
    }

    public String getSelecionaTodasMensagensEnviadasPacienteNaoLidas() {
        return selecionaTodasMensagensEnviadasPacienteNaoLidas;
    }                        

    public String getSelecionaTodosLaudosGravados() {
        return selecionaTodosLaudosGravados;
    }

    public String getSelecionaTodosLaudosGravadosPaciente(String cpf) {
        return selecionaTodosLaudosGravadosPaciente + "'" + cpf + "'  ORDER BY  1 DESC;";
    }                        
}
