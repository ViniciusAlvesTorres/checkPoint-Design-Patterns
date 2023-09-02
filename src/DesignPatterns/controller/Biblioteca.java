package DesignPatterns.controller;

import DesignPatterns.model.Livro;
import DesignPatterns.model.Observador;

import java.util.ArrayList;
import java.util.List;

// Controller da Aplicação
public class Biblioteca {
    private List<Observador> observadores = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.atualizar(mensagem);
        }
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String tituloLivro, String nomeAluno) {
        Livro livro = encontrarLivro(tituloLivro);
        if (livro != null && livro.getQuantidadeDisponivel() > 0) {
            livro.emprestar();
            notificarObservadores(tituloLivro + " emprestado para " + nomeAluno);
        }
    }

    public void devolverLivro(String tituloLivro) {
        Livro livro = encontrarLivro(tituloLivro);
        if (livro != null) {
            livro.devolver();
            notificarObservadores(tituloLivro + " devolvido");
        }
    }

    private Livro encontrarLivro(String tituloLivro) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(tituloLivro)) {
                return livro;
            }
        }
        return null;
    }
}