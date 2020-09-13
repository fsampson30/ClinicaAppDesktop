package Controller;

import Model.Mensagem;
import Model.Paciente;
import Model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLDeleta {

    private static ClasseConstantes c = new ClasseConstantes();
    private String deletaMensagemPadrao = "DELETE FROM mensagens_padrao WHERE codigo_texto = ?";
    private String deletaPaciente = "DELETE FROM pacientes WHERE cpf = ?";
    private String deletaUsuario = "DELETE FROM usuarios WHERE login = ?";
    private String deletaLaudo = "DELETE FROM laudos WHERE idlaudos = ?";

    public boolean deletaMensagemPadrao(Mensagem msg) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(deletaMensagemPadrao);
            ps.setInt(1, msg.getCodigo_texto());
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

    public boolean deletaPaciente(Paciente paciente) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(deletaPaciente);
            ps.setString(1, paciente.getCpf());
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

    public boolean deletaUsuario(Usuario usuario) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(deletaUsuario);
            ps.setString(1, usuario.getLogin());
            System.out.println(usuario.getLogin());
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

    public boolean deletaLaudo(int idLaudo) {
        boolean ok = false;
        try {
            Class.forName(c.getDriver());
            Connection db = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
            PreparedStatement ps = db.prepareStatement(deletaLaudo);
            ps.setInt(1, idLaudo);
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
}
