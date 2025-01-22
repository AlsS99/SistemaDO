package sistemadeteccao;

//Classe abstrata representando um objeto escolar

abstract class MateriaisEscolares {

 private String nome;
 private String categoria;

 public MateriaisEscolares(String nome, String categoria) {
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

class Caneta extends ObjetoEscolar {

 private String cor;

 public Caneta(String nome, String categoria, String cor) {
     super(nome, categoria);
     this.cor = cor;
 }

 @Override
 public void descreverObjeto() {
     System.out.println("Caneta: " + getNome() + ", Cor: " + cor);
 }
}

class Caderno extends ObjetoEscolar {

 private int numeroDeFolhas;

 public Caderno(String nome, String categoria, int numeroDeFolhas) {
     super(nome, categoria);
     this.numeroDeFolhas = numeroDeFolhas;
 }

 @Override
 public void descreverObjeto() {
     System.out.println("Caderno: " + getNome() + ", Número de Folhas: " + numeroDeFolhas);
 }
}
