package sistemadeteccao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BancoDeDados {
    private static final String URL = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS;databaseName=banco_sistemadetecta;encrypt=true;trustServerCertificate=true";
    private static final String USER = "LENOVOI5//annel"; // Substitua pelo seu usuário
    private static final String PASSWORD = "12345"; // Substitua pela sua senha

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void salvarObjeto(ObjetoEscolar objeto) {
        String sql = "INSERT INTO materiais_escolares (nome, categoria) VALUES (?, ?)";
        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getCategoria());
            stmt.executeUpdate();
            System.out.println("Objeto salvo no banco de dados com sucesso: " + objeto.getNome());
        } catch (SQLException e) {
            System.err.println("Erro ao salvar objeto no banco de dados: " + e.getMessage());
        }
    }
    
    public void testarConexao() {
        try (Connection conexao = conectar()) {
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

}
