package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class Tabela extends AbstractTableModel {

    private Connection conexao;
    private Statement statement;
    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private int linhas;
    private String query;
    private static ClasseConstantes c = new ClasseConstantes();

    public Tabela(String query) throws SQLException, ClassNotFoundException {
        Class.forName(c.getDriver());
        conexao = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
        statement = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        setQuery(query);
        System.out.println(query);
    }

    public Class getColumnClass(int column) {
        try {
            String className = metaData.getColumnClassName(column + 1);
            return Class.forName(className);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Object.class;
    }

    public int getColumnCount() {
        try {
            return metaData.getColumnCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String getColumnName(int column) {
        try {
            return metaData.getColumnLabel(column + 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    protected void finalize() {
        try {
            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getRowCount() {
        return linhas;
    }

    public Object getValueAt(int row, int column) {
        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);

        } catch (SQLException e) {
            System.out.println("Erro de SQL na Tabela" + e);
        }
        return "";
    }

    public void refresh() throws SQLException {
        setQuery(query);
    }

    public void setQuery(String qry) throws SQLException {
        query = qry;
        resultSet = statement.executeQuery(qry);
        metaData = resultSet.getMetaData();
        resultSet.last();
        linhas = resultSet.getRow();
        fireTableStructureChanged();
    }   
    
    
            
}


