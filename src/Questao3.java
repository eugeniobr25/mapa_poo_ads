import java.util.Scanner;

public class Questao3 {

    // Crie uma classe Pessoa com o atributo nome.
    // Superclasse Pessoa
    static class Pessoa {
        private String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
        }
    }

    // Faça Aluno herdar de Pessoa e adicione o atributo curso.
    // Subclasses Aluno que herda de Pessoa
    static class Aluno extends Pessoa {

        // Criação do atributo curso
        private String curso;

        public Aluno(String nome, String curso) {
            super(nome);
            this.curso = curso;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        @Override
        public void exibirDados() {
            System.out.println("-- Dados do Aluno --");
            System.out.println("Nome: " + getNome());
            System.out.println("Curso: " + curso);
        }
    }

    // Crie a classe Professor com o atributo disciplina.
    // Subclasses Professor que herda de Pessoa
    static class Professor extends Pessoa {
        private String disciplina;

        public Professor(String nome, String disciplina) {
            super(nome);
            this.disciplina = disciplina;
        }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        @Override
        public void exibirDados() {
            System.out.println("-- Dados do Professor --");
            System.out.println("Nome: " + getNome());
            System.out.println("Disciplina: " + disciplina);
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Eugenio Brilhante Moraes Lima", "Análise e Desenvolvimento de Sistemas");
        Professor professor = new Professor("James Gosling", "Programação Orientada a Objetos");

        // Exibindo os dados usando o método exibirDados
        System.out.println("-- Questão 3 – Herança --");
        System.out.println("-------------------------------------------------------------");
        aluno.exibirDados();
        System.out.println("-------------------------------------------------------------");
        professor.exibirDados();
        System.out.print("-------------------------------------------------------------");
    }
}
