// Questão 5 – Interface

public class Questao5 {

    // Superclasse Pessoa na mesma estrutura da Questão 3
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

        // Mantendo o método apresentar da questão 4
        public void apresentar() {
            System.out.println("Olá, meu nome é " + nome + ".");
        }
    }

    // Crie uma interface Avaliado com o método avaliarDesempenho().
    interface Avaliado {
        void avaliarDesempenho();
    }

    // Classe Aluno herda de Pessoa e implementa Avaliado
    static class Aluno extends Pessoa implements Avaliado {
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
        public void apresentar() {
            System.out.println("Olá, meu nome é " + getNome() + " e sou aluno do curso de " + curso + ".");
        }

        // Faça a classe Aluno implementar a interface, retornando uma mensagem personalizada, por exemplo: "Aluno [seu nome] obteve ótimo desempenho!"
        @Override
        public void avaliarDesempenho() {
            System.out.println("Aluno " + getNome() + " obteve ótimo desempenho!");
        }
    }


    public static void main(String[] args) {

        Aluno meuAluno = new Aluno("Eugenio Brilhante Moraes Lima", "Análise e Desenvolvimento de Sistemas");

        // Mantive o chamando o método apresentar da questão 4
        System.out.println("-- Apresentação do Aluno --");
        meuAluno.apresentar();

        // No main, invoque esse método para o seu objeto Aluno.
        System.out.println("\n-- Avaliação do Aluno --");
        meuAluno.avaliarDesempenho();
    }
}
