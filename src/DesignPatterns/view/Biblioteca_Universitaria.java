package DesignPatterns.view;

import DesignPatterns.controller.Biblioteca;
import DesignPatterns.model.*;

public class Biblioteca_Universitaria {
    public static void main(String[] args) {
        // Padrão Observer
        Aluno aluno1 = new Aluno("Catarina");
        Aluno aluno2 = new Aluno("Pedro");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarObservador(aluno1);
        biblioteca.adicionarObservador(aluno2);

        // Registrando livros
        Livro livro1 = new Livro("Design Patterns", "Erich Gamma", "ISBN 978 – 85 – 333 – 0227 – 3", 1);
        Livro livro2 = new Livro("Spring Boot", "Fernando Boaglio", "ISBN 978 – 85 – 333 – 0227 – 4", 1);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Empréstimo de livros
        biblioteca.emprestarLivro("Design Patterns", "Catarina");
        System.out.println(aluno1.getNome() + " pegou o livro Design Patterns emprestado");
        System.out.println(livro1);

        biblioteca.emprestarLivro("Spring Boot", "Pedro");
        System.out.println(aluno2.getNome() + " pegou o livro Spring Boot emprestado");
        System.out.println(livro2);

        // Devolução de livros
        biblioteca.devolverLivro("Design Patterns");
        System.out.println(aluno1.getNome() + " devolveu o livro Design Patterns");
        System.out.println(livro1);

        biblioteca.devolverLivro("Spring Boot");
        System.out.println(aluno2.getNome() + " devolveu o livro Spring Boot");
        System.out.println(livro2);

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
