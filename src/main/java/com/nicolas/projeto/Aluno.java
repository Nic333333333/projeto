package com.nicolas.projeto;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método para mostrar informações
    public String mostrarInformacoes() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Curso: " + curso;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criação de 3 objetos
        Aluno aluno1 = new Aluno("João Silva", "2023001", "Ciência da Computação");
        Aluno aluno2 = new Aluno("Maria Oliveira", "2023002", "Engenharia Civil");
        Aluno aluno3 = new Aluno("Pedro Santos", "2023003", "Administração");

        // Impressão dos dados
        System.out.println(aluno1.mostrarInformacoes());
        System.out.println(aluno2.mostrarInformacoes());
        System.out.println(aluno3.mostrarInformacoes());
    }    
}
