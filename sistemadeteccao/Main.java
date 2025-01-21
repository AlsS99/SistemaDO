package sistemadeteccao;

public class Main {

    public static void main(String[] args) {
        // Criando o Administrador
        Administrador admin = new Administrador("Carlos");

        // Criando objetos escolares
        ObjetoEscolar caneta = new Caneta("Caneta Azul", "Material de Escrita", "Azul");
        ObjetoEscolar caderno = new Caderno("Caderno Universitário", "Material de Estudo", 200);

        // Adicionando objetos ao sistema
        admin.adicionarObjetoEscolar(caneta);
        admin.adicionarObjetoEscolar(caderno);

        // Criando um usuário
        Usuario usuario = new Usuario("Ana", 25);

        // Usuário interagindo com o sistema
        usuario.interagirComSistema(admin);

        // Iniciando a detecção
        admin.iniciarDeteccao();
    
    
        BancoDeDados bd = new BancoDeDados();
        bd.testarConexao();
    }

}


