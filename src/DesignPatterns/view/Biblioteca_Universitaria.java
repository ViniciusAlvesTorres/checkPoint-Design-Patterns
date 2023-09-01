package DesignPatterns.view;

import DesignPatterns.controller.Biblioteca;
import DesignPatterns.model.*;

public class Biblioteca_Universitaria {
    public static void main(String[] args) {
        // Padrão Observer
        Aluno aluno1 = new Aluno("Alice");
        Aluno aluno2 = new Aluno("Bob");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarObservador(aluno1);
        biblioteca.adicionarObservador(aluno2);

        // Registrando livros
        Livro livro1 = new Livro("Design Patterns com Java", "Autor 1", "ISBN1", 3);
        Livro livro2 = new Livro("Java Programming", "Autor 2", "ISBN2", 5);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.emprestarLivro("Design Patterns com Java", "Alice");
        biblioteca.devolverLivro("Design Patterns com Java");

        // Padrão Strategy
        EstrategiaPrioridadeTarefa estrategiaAltaPrioridade = new EstrategiaAltaPrioridade();
        EstrategiaPrioridadeTarefa estrategiaBaixaPrioridade = new EstrategiaBaixaPrioridade();

        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        gerenciadorTarefas.definirEstrategia(estrategiaAltaPrioridade);
        gerenciadorTarefas.executarTarefa("Tarefa de alta prioridade");

        gerenciadorTarefas.definirEstrategia(estrategiaBaixaPrioridade);
        gerenciadorTarefas.executarTarefa("Tarefa de baixa prioridade");

        // Padrão Singleton
        SistemaTarefas sistemaTarefas = SistemaTarefas.getInstancia();
        sistemaTarefas.inicializar();

        // Padrão Composite
        Tarefa tarefaSimples = new TarefaSimples("Tarefa Simples");
        TarefaComplexa tarefaComplexa = new TarefaComplexa("Tarefa Complexa");
        tarefaComplexa.adicionarSubTarefa(tarefaSimples);

        tarefaComplexa.realizarTarefa();
    }
}
