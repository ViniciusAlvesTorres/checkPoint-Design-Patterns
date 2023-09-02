package DesignPatterns.model;

public class Aluno implements Observador {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + ": " + mensagem);
    }

    public String getNome() {
        return nome;
    }
}
