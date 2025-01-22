package sistemadeteccao;


import java.util.List;
import java.util.ArrayList;

public class Administrador<MateriaisEscolares> {

    private String nome; 
    private List<MateriaisEscolares> MateriaisEscolares; 
    private Deteccao deteccao; 

    public Administrador(String nome) {
        this.nome = nome; 
        this.MateriaisEscolares = new ArrayList<>(); 
        this.deteccao = new Deteccao();
    }

    public void adicionarMateriaisEscolares(MateriaisEscolares objeto) {
        MateriaisEscolares.add(objeto); 
        System.out.println("Objeto escolar adicionado: " + ((Object) objeto).getNome());
    }

    public void iniciarDeteccao() {
        Deteccao.detectar(); 
    }

    public void exibirObjetosEscolares() {
        System.out.println("Objetos escolares cadastrados:");
        for (MateriaisEscolares objeto : MateriaisEscolares) {
            objeto.descreverObjeto(); 
        }
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
            BancoDeDados banco = new BancoDeDados();
            banco.testarConexao();
        
    
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
