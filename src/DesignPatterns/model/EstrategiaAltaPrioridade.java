package DesignPatterns.model;

public class EstrategiaAltaPrioridade implements EstrategiaPrioridadeTarefa {
    @Override
    public void executarTarefa(String tarefa) {
        System.out.println("Executando tarefa com alta prioridade: " + tarefa);
    }
}