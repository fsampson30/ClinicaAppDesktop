package Controller;

import Model.Laudo;
import Model.Mensagem;
import Model.MensagemChat;
import Model.Paciente;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLInsere {

    private String insereMensagemPadraoSQL = "insert into mensagens_padrao (titulo_texto,texto_padrao) values (?,?);";
    private String inserePacienteSQL = "insert into pacientes (cpf,nome,telefone,celular,data_nascimento,observacoes) values (?,?,?,?,?,?);";
    private String insereUsuarioSQL = "INSERT into usuarios (login, senha, nome) values (?,?,?);";
    private String insereMensagemChatSQL = "INSERT into mensagens_enviadas (codigo_texto, cpf, idusuario, data_envio, texto_mensagem, mensagem_lida) values (?,?,?,?,?,0);";
    private String insereLaudoSQL = "INSERT INTO laudos (data_admissao, caminho_foto, caminho_laudo, codigo_exame, cpf, matricula) VALUES (?,?,?,?,?,?);";

    public boolean insereMensagemPadrao(Mensagem objeto) {
        boolean ok = false;
        try {
            Connection db = Conexao.obter();
            PreparedStatement ps = db.prepareStatement(insereMensagemPadraoSQL);
            ps.setString(1, objeto.getTitulo());
            ps.setString(2, objeto.getTexto());
            int sucesso = ps.executeUpdate();
            if (sucesso == 1) {
                ok = true;
            } else {
                db.rollback();
            }
            ps.close();
            db.close();
            Conexao.fechar();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados" + e);
        }
        return ok;
    }

    public boolean inserePaciente(Paciente objeto) {
        boolean ok = false;
        try {
            Connection db = Conexao.obter();
            PreparedStatement ps = db.prepareStatement(inserePacienteSQL);
            ps.setString(1, objeto.getCpf());
            ps.setString(2, objeto.getNome());
            ps.setString(3, objeto.getTelefone());
            ps.setString(4, objeto.getCelular());
            ps.setString(5, objeto.getData_nascimento());
            ps.setString(6, objeto.getObservacoes());
            int sucesso = ps.executeUpdate();
            if (sucesso == 1) {
                ok = true;
            } else {
                db.rollback();
            }
            ps.close();
            db.close();
            Conexao.fechar();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados" + e);
        }
        return ok;
    }

    public boolean insereUsuario(Usuario objeto) {
        boolean ok = false;
        try {
            Connection db = Conexao.obter();
            PreparedStatement ps = db.prepareStatement(insereUsuarioSQL);
            ps.setString(1, objeto.getLogin());
            ps.setString(2, objeto.getSenha());
            ps.setString(3, objeto.getNome());
            int sucesso = ps.executeUpdate();
            if (sucesso == 1) {
                ok = true;
            } else {
                db.rollback();
            }
            ps.close();
            db.close();
            Conexao.fechar();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados" + e);
        }
        return ok;
    }

    public boolean insereMensagemChat(MensagemChat objeto) {
        boolean ok = false;
        try {
            Connection db = Conexao.obter();
            PreparedStatement ps = db.prepareStatement(insereMensagemChatSQL);
            ps.setString(1, objeto.getId_mensagem());
            ps.setString(2, objeto.getCpf_paciente());
            ps.setString(3, objeto.getQuem_enviou());
            ps.setString(4, objeto.getData_entrega());
            ps.setString(5, objeto.getMensagem());
            int sucesso = ps.executeUpdate();
            if (sucesso == 1) {
                ok = true;
            } else {
                db.rollback();
            }
            ps.close();
            db.close();
            Conexao.fechar();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados" + e);
        }
        return ok;
    }

    public boolean insereLaudo(Laudo objeto) {
        boolean ok = false;
        try {
            Connection db = Conexao.obter();
            PreparedStatement ps = db.prepareStatement(insereLaudoSQL);
            ps.setString(1, objeto.getDataAdmissao());
            ps.setString(2, objeto.getCaminhoFoto());
            ps.setString(3, objeto.getCaminhoLaudo());
            ps.setString(4, objeto.getCodigoExame());
            ps.setString(5, objeto.getCpf());
            ps.setString(6, objeto.getMatricula());
            int sucesso = ps.executeUpdate();
            if (sucesso == 1) {
                ok = true;
            } else {
                db.rollback();
            }
            ps.close();
            db.close();
            Conexao.fechar();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso ao Banco de Dados" + e);
        }
        return ok;
    }

}
