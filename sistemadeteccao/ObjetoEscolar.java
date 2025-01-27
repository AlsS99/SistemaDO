package sistemadeteccao;

abstract class ObjetoEscolar {
    private String nome;
    private String categoria;

    public ObjetoEscolar(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public abstract void descreverObjeto();
}

// Classe Caneta (extensão de ObjetoEscolar)
class Caneta extends ObjetoEscolar {
    private String cor;

    public Caneta(String nome, String categoria, String cor) {
        super(nome, categoria);
        this.cor = cor;
    }

    @Override
    public void descreverObjeto() {
        System.out.println("Caneta: " + getNome() + ", Categoria: " + getCategoria() + ", Cor: " + cor);
    }
}

// Classe Caderno (extensão de ObjetoEscolar)
class Caderno extends ObjetoEscolar {
    private int numeroDeFolhas;

    public Caderno(String nome, String categoria, int numeroDeFolhas) {
        super(nome, categoria);
        this.numeroDeFolhas = numeroDeFolhas;
    }

    @Override
    public void descreverObjeto() {
        System.out.println("Caderno: " + getNome() + ", Categoria: " + getCategoria() + ", Número de Folhas: " + numeroDeFolhas);
    }
}
