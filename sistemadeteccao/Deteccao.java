package sistemadeteccao;


import java.util.List;
import java.util.ArrayList;

interface DetectorDeObjetos {

    void detectar();
}

public class Deteccao implements DetectorDeObjetos {

    private List<ObjetoEscolar> objetosDetectados;

    public Deteccao() {
        objetosDetectados = new ArrayList<>();
    }

    @Override
    public void detectar() {
        System.out.println("Iniciando detecção...");
        // Simulação da detecção de objetos
        objetosDetectados.add(new Caneta("Caneta Azul", "Material de Escrita", "Azul"));
        objetosDetectados.add(new Caderno("Caderno Universitário", "Material de Estudo", 200));
        System.out.println("Objetos detectados!");
    }

    public List<ObjetoEscolar> getObjetosDetectados() {
        return objetosDetectados;
    }
}
