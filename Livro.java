public class Livro {

    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void abrir() {
        System.out.println("O livro foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro foi fechado.");
    }
}