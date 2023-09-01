package DesignPatterns.model;

import DesignPatterns.model.EstrategiaPrioridadeTarefa;

public class GerenciadorTarefas {
    private EstrategiaPrioridadeTarefa estrategia;

    public void definirEstrategia(EstrategiaPrioridadeTarefa estrategia) {
        this.estrategia = estrategia;
    }

    public void executarTarefa(String tarefa) {
        estrategia.executarTarefa(tarefa);
    }
}