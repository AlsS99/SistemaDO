package sistemadeteccao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BancoDeDados {
    private static final String URL = "";
    private static final String USER = ""; // Substitua pelo seu usuário
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
            System.out.println("Objeto salvo no banco de dados: " + objeto.getNome());
        } catch (SQLException e) {
            System.err.println("Erro ao salvar objeto no banco de dados: " + e.getMessage());
        }
    }

    public List<ObjetoEscolar> listarObjetos() {
        List<ObjetoEscolar> objetos = new ArrayList<>();
        String sql = "SELECT nome, categoria FROM materiais_escolares";
        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                String categoria = rs.getString("categoria");
                objetos.add(new ObjetoEscolar(nome, categoria) {
                    @Override
                    public void descreverObjeto() {
                        System.out.println("Objeto: " + nome + ", Categoria: " + categoria);
                    }
                });
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar objetos: " + e.getMessage());
        }
        return objetos;
    }

    public void testarConexao() {
        try (Connection conexao = conectar()) {
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
