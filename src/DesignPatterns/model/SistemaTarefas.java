package DesignPatterns.model;

public class SistemaTarefas {
    private static SistemaTarefas instancia;

    private SistemaTarefas() {
        // Construtor privado para evitar instância direta
    }

    public static SistemaTarefas getInstancia() {
        if (instancia == null) {
            instancia = new SistemaTarefas();
        }
        return instancia;
    }

    public void inicializar() {
        // Lógica de inicialização
    }
}
