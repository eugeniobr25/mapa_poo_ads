// Questão 4 – Polimorfismo

public class Questao4 {

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

        // Na classe Pessoa, crie o método apresentar().
        public void apresentar() {
            System.out.println("Olá, meu nome é " + nome + ".");
        }
    }

    // Subclasse Aluno
    static class Aluno extends Pessoa {
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

        // Sobrescreva esse método em Aluno, retornando apresentações personalizadas.
        @Override
        public void apresentar() {
            System.out.println("Olá, meu nome é " + getNome() + " e sou aluno do curso de " + curso + ".");
        }
    }

    // Subclasse Professor
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

        // Sobrescreva esse método em Professor, retornando apresentações personalizadas.
        @Override
        public void apresentar() {
            System.out.println("Olá, meu nome é " + getNome() + " e sou professor da disciplina de " + disciplina + ".");
        }
    }
    // No main, chame apresentar() para seu objeto Aluno e para o objeto Professor, demonstrando polimorfismo.
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Eugenio Brilhante Moraes Lima", "Análise e Desenvolvimento de Sistemas");
        Professor professor = new Professor("James Gosling", "Programação Orientada a Objetos");

        System.out.println("-- Questão 4 - Polimorfismo --");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-- Apresentação do Aluno --");
        aluno.apresentar();      // Chama o método sobrescrito de Aluno
        System.out.println("-------------------------------------------------------------");
        System.out.println("-- Apresentação do Professor --");
        professor.apresentar();  // Chama o método sobrescrito de Professor
        System.out.print("-------------------------------------------------------------");
    }
}
