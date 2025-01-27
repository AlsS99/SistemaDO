package sistemadeteccao;


import java.util.List;
import java.util.ArrayList;

public class Administrador {
    private String nome;
    private List<ObjetoEscolar> objetosEscolares;
    private Deteccao deteccao;

    public Administrador(String nome) {
        this.nome = nome;
        this.objetosEscolares = new ArrayList<>();
        this.deteccao = new Deteccao();
    }

    public void adicionarObjetoEscolar(ObjetoEscolar objeto) {
        objetosEscolares.add(objeto);
        System.out.println("Objeto escolar adicionado: " + objeto.getNome());
    }

    public void iniciarDeteccao() {
        deteccao.detectar();
    }

    public void exibirObjetosEscolares() {
        System.out.println("Objetos escolares cadastrados:");
        for (ObjetoEscolar objeto : objetosEscolares) {
            objeto.descreverObjeto();
        }
    }

    public Deteccao getDeteccao() {
        return deteccao;
    }

    public String getNome() {
        return nome;
    }


    
   /* public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        

        // Criar objetos
        ObjetoEscolar caneta = new Caneta("Caneta Azul", "Material de Escrita", "Azul");
        ObjetoEscolar caderno = new Caderno("Caderno Universitário", "Material de Estudo", 200);

        // Salvar no banco
        bancoDeDados.salvarObjeto(caneta);
        bancoDeDados.salvarObjeto(caderno);
    }*/
    

    }
      

}
