package sistemadeteccao;

public abstract class Usuario {

    private String nome;
    private int idade;

    // Construtor que será chamado pelas subclasses para inicializar os atributos.
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato que força as subclasses a implementarem interações específicas com o sistema.
    public abstract void interagirComSistema(Administrador administrador);

    // Métodos getters para acessar os atributos nome e idade.
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class UsuarioComum extends Usuario {

    // Chama o construtor da classe abstrata Usuario para inicializar nome e idade.
    public UsuarioComum(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void interagirComSistema(Administrador administrador) {
        System.out.println(getNome() + " está interagindo com o sistema...");
        administrador.exibirObjetosEscolares();
    }
}

class UsuarioAdministrador extends Usuario {

    // Chama o construtor da classe abstrata Usuario para inicializar nome e idade.
    public UsuarioAdministrador(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void interagirComSistema(Administrador administrador) {
        System.out.println("Administrador " + getNome() + " está gerenciando o sistema...");
        administrador.iniciarDeteccao();
    }
}


