package Controller;

import Model.Mensagem;
import Model.Paciente;
import Model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLAltera {

    private static ClasseConstantes c = new ClasseConstantes();

    private String alteraMensagemPadrao = "UPDATE mensagens_padrao SET titulo_texto = ? , texto_padrao = ? WHERE codigo_texto = ?;";
    private String alteraPacienteCadastrado = "UPDATE pacientes set nome = ?, cpf = ?,  data_nascimento = ?, telefone = ?, celular = ?, observacoes = ? WHERE cpf = ?";
    private String zeraSenhaUsuario = "UPDATE usuarios set senha = ? where login = ?";
    private String alteraUsuarioCadastrado = "UPDATE usuarios set nome = ?, login = ?, senha = ? where login = ?";
    private String zeraSenhaPaciente = "UPDATE pacientes set senha = null where cpf = ?";
    private String alteraStatusLidaMensagem = "UPDATE mensagens_enviadas SET mensagem_lida = ? WHERE idmensagens = ?;";

    public boolean alteraMensagemPadrao(Mensagem msg) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(alteraMensagemPadrao);
            ps.setString(1, msg.getTitulo());
            ps.setString(2, msg.getTexto());
            ps.setInt(3, msg.getCodigo_texto());
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                ok = true;
            }
            ps.close();
            db.close();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso a Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        }
        return ok;
    }

    public boolean alteraPacienteCadastrado(Paciente paciente, String cpfTela) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(alteraPacienteCadastrado);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getData_nascimento());
            ps.setString(4, paciente.getTelefone());
            ps.setString(5, paciente.getCelular());
            ps.setString(6, paciente.getObservacoes());
            ps.setString(7, cpfTela);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                ok = true;
            } else {
                System.out.println(resultado);
            }
            ps.close();
            db.close();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso a Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        }
        return ok;
    }

    public boolean alteraUsuarioCadastrado(Usuario usuario, String loginAntigo) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(alteraUsuarioCadastrado);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, loginAntigo);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                ok = true;
            } else {
                System.out.println(resultado);
            }
            ps.close();
            db.close();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso a Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        }
        return ok;
    }

    public boolean zeraSenhaUsuarioCadastrado(String login) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(zeraSenhaUsuario);
            ps.setString(1, "");
            ps.setString(2, login);
            System.out.println(login);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                ok = true;
            } else {
                System.out.println(resultado);
            }
            ps.close();
            db.close();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso a Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        }
        return ok;
    }

    public boolean zeraSenhaPaciente(String cpf) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(zeraSenhaPaciente);
            ps.setString(1, cpf);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                ok = true;
            }
            ps.close();
            db.close();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso a Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        }
        return ok;
    }

    public boolean alteraStatusLidaMensagem(int id, int valor) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(alteraStatusLidaMensagem);
            ps.setInt(1, valor);
            ps.setInt(2, id);
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                ok = true;
            }
            ps.close();
            db.close();
        } catch (SQLException e) {
            System.out.println("Problemas de acesso a Banco de Dados");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        }
        return ok;
    }

}
