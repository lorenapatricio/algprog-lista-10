public class Turma {

    String codigo;
    String serie;

    public Turma(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public void adicionarAluno() {
        System.out.println("Aluno adicionado à turma.");
    }

    public void iniciarAula() {
        System.out.println("A aula começou.");
    }
}