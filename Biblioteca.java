public class Biblioteca {

    String nome;
    int quantidadeLivros;

    public Biblioteca(String nome, int quantidadeLivros) {
        this.nome = nome;
        this.quantidadeLivros = quantidadeLivros;
    }

    public void emprestarLivro() {
        System.out.println("Livro emprestado.");
    }

    public void devolverLivro() {
        System.out.println("Livro devolvido.");
    }
}