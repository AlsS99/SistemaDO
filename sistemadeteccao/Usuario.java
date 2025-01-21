package sistemadeteccao;

public class Usuario {

    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void interagirComSistema(Administrador administrador) {
        System.out.println(nome + " está interagindo com o sistema...");
        administrador.exibirObjetosEscolares();
    }

    public String getNome() {
        return nome;
    }
}


