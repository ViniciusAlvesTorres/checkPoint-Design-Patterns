package DesignPatterns.model;

import DesignPatterns.model.Tarefa;

public class TarefaSimples extends Tarefa {
    public TarefaSimples(String nome) {
        super(nome);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Realizando tarefa simples: " + nome);
    }
}
