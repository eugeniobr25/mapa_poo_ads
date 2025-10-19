// Questão 2 – Encapsulamento
// Irá permitir entrada de dados via teclado para setar um novo nome e matrícula

import java.util.Scanner;

public class Questao2 {

    // Classe AlunoEncapsulado representando um aluno com encapsulamento
    static class AlunoEncapsulado {
        // Atributos privados (encapsulados)
        private String nome;
        private String matricula;

        // Construtor
        public AlunoEncapsulado(String nome, String matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }

        // Getter e Setter do atributo nome
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter e Setter do atributo matrícula
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    }

    public static void main(String[] args) {
        // Instancia o objeto Scanner para ler dados de entrada que serão inseridos pelo console
        Scanner scanner = new Scanner(System.in);

        // Cria um aluno com dados iniciais
        AlunoEncapsulado meuAluno = new AlunoEncapsulado("Eugenio Brilhante Moraes Lima", "1234567890");

        System.out.println("-- Questão 2 – Encapsulamento --");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Dados anteriores do Aluno:");
        System.out.println("Nome: " + meuAluno.getNome());
        System.out.println("Matrícula: " + meuAluno.getMatricula());
        System.out.print("-------------------------------------------------------------");

        // Solicitando novos dados ao usuário
        System.out.println("\nAltere o nome do aluno:");
        String novoNome = scanner.nextLine();
        meuAluno.setNome(novoNome);

        System.out.println("Altere a matrícula do aluno:");
        String novaMatricula = scanner.nextLine();
        meuAluno.setMatricula(novaMatricula);

        // Exibindo dados atualizados
        System.out.print("-------------------------------------------------------------");
        System.out.println("\n-- Dados Atualizados --");
        System.out.println("Nome: " + meuAluno.getNome());
        System.out.println("Matrícula: " + meuAluno.getMatricula());
        System.out.print("-------------------------------------------------------------");

        // Encerra o Scanner para liberar os recursos de memória associados ao objeto
        scanner.close();
    }
}

