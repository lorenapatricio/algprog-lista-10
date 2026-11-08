public class Aluno {

    String matricula;
    String curso;

    public Aluno(String matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public void estudar() {
        System.out.println("O aluno está estudando.");
    }

    public void fazerProva() {
        System.out.println("O aluno está fazendo a prova.");
    }
}