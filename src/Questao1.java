// Questão 1 – Classe e Objeto
// Criação de uma classe Aluno com atributos nome e matrícula e teste de criação de objeto

public class Questao1 {

    // Classe Aluno representando um aluno
    static class Aluno {
        // Atributos públicos (para simplificação nesta questão)
        String nome;
        String matricula;

        // Construtor da classe Aluno
        public Aluno(String nome, String matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }
    }

    public static void main(String[] args) {
        // Criação de um objeto Aluno com dados próprios
        Aluno meuAluno = new Aluno("Eugenio Brilhante Moraes Lima", "1234567890");

        // Exibindo os dados no console
        System.out.println("-- Questão 1 – Classe e Objeto - Dados do Aluno --");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome: " + meuAluno.nome);
        System.out.println("Matrícula: " + meuAluno.matricula);
        System.out.print("-------------------------------------------------------------");
    }
}

