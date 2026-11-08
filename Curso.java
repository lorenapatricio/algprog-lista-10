public class Curso {

    String nome;
    int duracao;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void iniciarCurso() {
        System.out.println("O curso foi iniciado.");
    }

    public void concluirCurso() {
        System.out.println("O curso foi concluído.");
    }
}