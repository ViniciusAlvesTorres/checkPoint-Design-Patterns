package DesignPatterns.model;

public abstract class Tarefa {
    protected String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public abstract void realizarTarefa();
}
