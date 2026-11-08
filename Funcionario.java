public class Funcionario {

    String cargo;
    double salario;

    public Funcionario(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println("O funcionário está trabalhando.");
    }

    public void receberSalario() {
        System.out.println("Salário recebido: R$ " + salario);
    }
}