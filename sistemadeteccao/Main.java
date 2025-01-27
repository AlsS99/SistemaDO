package sistemadeteccao;

public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Katyellen");
        BancoDeDados bd = new BancoDeDados();

        // Testar conexão com o banco
        bd.testarConexao();

        // Iniciar detecção de objetos
        admin.iniciarDeteccao();

        // Salvar objetos detectados no banco de dados
        for (ObjetoEscolar objeto : admin.getDeteccao().getObjetosDetectados()) {
            bd.salvarObjeto(objeto);
        }

        // Listar objetos armazenados no banco de dados
        System.out.println("\nObjetos armazenados no banco de dados:");
        for (ObjetoEscolar objeto : bd.listarObjetos()) {
            objeto.descreverObjeto();
        }
    }
}
