package DesignPatterns.model;

public class EstrategiaBaixaPrioridade implements EstrategiaPrioridadeTarefa {
    @Override
    public void executarTarefa(String tarefa) {
        System.out.println("Executando tarefa com baixa prioridade: " + tarefa);
    }
}
