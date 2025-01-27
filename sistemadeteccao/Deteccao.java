package sistemadeteccao;

import java.util.ArrayList;
import java.util.List;

public class Deteccao implements DetectorDeObjetos {
    private List<ObjetoEscolar> objetosDetectados;

    public Deteccao() {
        objetosDetectados = new ArrayList<>();
    }

    @Override
    public void detectar() {
        System.out.println("Iniciando detecção...");
        objetosDetectados.add(new Caneta("Caneta Preta", "Material de Escrita", "Preta"));
        objetosDetectados.add(new Caderno("Caderno Espiral", "Material de Estudo", 100));
        System.out.println("Objetos detectados com sucesso!");
    }

    public List<ObjetoEscolar> getObjetosDetectados() {
        return objetosDetectados;
    }
}

