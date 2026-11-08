public class Professor {

    String disciplina;
    double salario;

    public Professor(String disciplina, double salario) {
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void ensinar() {
        System.out.println("O professor está ensinando.");
    }

    public void corrigirProva() {
        System.out.println("O professor está corrigindo provas.");
    }
}