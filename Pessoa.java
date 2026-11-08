public class Pessoa {

    String nome;
    int idade;
    String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }
}