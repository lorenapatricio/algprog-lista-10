public class Escola {

    String nome;
    String endereco;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void abrir() {
        System.out.println("A escola está aberta.");
    }

    public void fechar() {
        System.out.println("A escola está fechada.");
    }
}