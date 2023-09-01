package DesignPatterns.model;

import DesignPatterns.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaComplexa extends Tarefa {
    private List<Tarefa> subTarefas = new ArrayList<>();

    public TarefaComplexa(String nome) {
        super(nome);
    }

    public void adicionarSubTarefa(Tarefa subTarefa) {
        subTarefas.add(subTarefa);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Realizando tarefa complexa: " + nome);
        for (Tarefa subTarefa : subTarefas) {
            subTarefa.realizarTarefa();
        }
    }
}
